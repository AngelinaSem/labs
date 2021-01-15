import exceptions.ProblemAccException;
import exceptions.FewException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


    public class Data {
        private String path;
        public Data(String path) {
            try {
                this.path = path;
                File file = new File(path);

                if (!file.isFile()) {
                    file.createNewFile();
                    ArrayList<Account> accounts = new ArrayList<Account>();
                    accounts.add(new Account(1, "Сидоров Пётр Игоревич", 1000));
                    accounts.add(new Account(2, "Иванов Иван Иванович", 700000));
                    accounts.add(new Account(3, "Морозов Павер Викторович", 4000));
                    accounts.add(new Account(4, "Кузнецов Александр Иванович", 50000));
                    accounts.add(new Account(5, "Галушко Дарья Александровна", 300000));
                    accounts.add(new Account(6, "Энгельман Филипп Викторович", 6000));
                    accounts.add(new Account(7, "Смехова Валентина Вениаминовна", 300));
                    accounts.add(new Account(8, "Андреев Владислав Сергеевич", 9000));
                    accounts.add(new Account(9, "Сысоева Варвара Павловна", 80000));
                    accounts.add(new Account(10, "Соловьёв Иван Павлович", 100000));

                    FileWriter writer = new FileWriter(path, false);
                    for (Account account : accounts)
                        writer.write(account.getId() + ";" + account.getHolder() + ";" + account.getAmount() + "\n");

                    writer.flush();
                }
            } catch (IOException ex) {
                System.out.println("An error has occurred: " + ex.getMessage());
            }
        }

        private void createNewFile() {
        }

        public Account getAccount(int id) throws ProblemAccException, IOException {
            String text = new String(Files.readAllBytes(Paths.get(path)));
            String[] data = text.split("\n");
            Account result = null;

            for (String account : data) {
                int currentId = Integer.parseInt(account.split(";")[0]);
                if (currentId == id) {
                    String holder = account.split(";")[1];
                    double amount = Double.parseDouble(account.split(";")[2]);
                    result = new Account(id, holder, (int) amount);
                    break;
                }
            }

            if (result == null)
                throw new ProblemAccException("Unknown account");

            return result;
        }

        public void updateAmount(int id, double amount) throws ProblemAccException, IOException {
            String text = new String(Files.readAllBytes(Paths.get(path)));
            String[] data = text.split("\n");
            ArrayList<Account> accounts = new ArrayList<Account>();
            Account currentAccount = null;

            for (String account : data) {
                int currentId = Integer.parseInt(account.split(";")[0]);
                String currentHolder = account.split(";")[1];
                double currentAmount = Double.parseDouble(account.split(";")[2]);
                accounts.add(new Account(currentId, currentHolder, currentAmount));
                if (currentId == id)
                    currentAccount = new Account(currentId, currentHolder, currentAmount);
            }

            if (currentAccount == null)
                throw new ProblemAccException("Unknown account");

            FileWriter writer = new FileWriter(path, false);

            for (Account account : accounts) {
                if (account.getId() == id) {
                    account.setAmount(amount);
                }
                writer.write(account.getId() + ";" + account.getHolder() + ";" + account.getAmount() + "\n");
            }

            writer.flush();
        }

    }


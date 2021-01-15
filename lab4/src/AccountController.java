import exceptions.FewException;
import exceptions.ProblemAccException;


import java.io.IOException;
import java.util.Scanner;

public class AccountController implements AccountService {
    private final Data context = new Data(                   "C:\\Users\\angel\\OneDrive\\Рабочий стол\\Учёба\\Java\\project_java\\lab4\\res\\acc.txt");

    public void Start() throws ProblemAccException, FewException, IOException {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("-> ");
            String input = in.nextLine();
            String choice = input.split(" ")[0];

            switch (choice) {
                case "balance" -> {
                    int id = Integer.parseInt(input.split(" ")[1]);
                    balance(id);
                }
                case "withdraw" -> {
                    int id = Integer.parseInt(input.split(" ")[1]);
                    double amount = Double.parseDouble(input.split(" ")[2]);
                    withdraw(id, amount);
                }
                case "deposit" -> {
                    int id = Integer.parseInt(input.split(" ")[1]);
                    double amount = Double.parseDouble(input.split(" ")[2]);
                    deposit(id, amount);
                }
                case "transfer" -> {
                    int idFrom = Integer.parseInt(input.split(" ")[1]);
                    int idTo = Integer.parseInt(input.split(" ")[2]);
                    double amount = Double.parseDouble(input.split(" ")[3]);
                    transfer(idFrom, idTo, amount);
                }
                default -> System.out.println("Ошибка");
            }
        }

    }

    @Override
    public void balance(int accountId) throws ProblemAccException, IOException {
        //Account acc = context.getAccount(accountId).second;
        Account acc = context.getAccount(accountId);
        System.out.println("Balance: " + acc.getAmount());
    }

    @Override
    public void withdraw(int accountId, double amount) throws FewException, ProblemAccException, IOException {
        Account account = context.getAccount(accountId);
        double currentAmount = account.getAmount();
        if (currentAmount < amount)
            throw new FewException("Недостаточно средств", currentAmount);
        context.updateAmount(accountId, currentAmount - amount);
        System.out.println("Выполнено");

    }



    @Override
    public void deposit(int accountId, double amount) throws FewException, ProblemAccException, IOException {
        Account account = context.getAccount(accountId);
        double currentAmount = account.getAmount();
        if (currentAmount < amount)
            throw new FewException("Недостаточно средств", amount);
        context.updateAmount(accountId, currentAmount + currentAmount);
        System.out.println("Выполнено");
    }

    @Override
    public void transfer(int fromId, int toId, double amount) throws FewException, ProblemAccException, IOException {
        Account accountFrom = context.getAccount(fromId);
        Account accountTo = context.getAccount(toId);
        double currentAmountFrom = accountFrom.getAmount();
        double currentAmountTo = accountTo.getAmount();
        if (currentAmountFrom < amount)
            throw new FewException("Недостаточно средств", currentAmountFrom);
        context.updateAmount(fromId, currentAmountFrom - amount);
        context.updateAmount(toId, currentAmountTo + amount);
        System.out.println("Выполнено");
    }

}

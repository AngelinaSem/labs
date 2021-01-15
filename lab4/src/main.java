import exceptions.FewException;
import exceptions.ProblemAccException;

public class main {

    public static void main(String[] args) {
        try {
            AccountController accountController = new AccountController();
            accountController.Start();
        } catch (ProblemAccException ex) {
            System.out.println("Ошибка" + ex.getMessage() + "," + " id = " + ex.getId());
        } catch (FewException ex) {
            System.out.println("Ошибка: " + ex.getMessage() + "," + " amount = " + ex.getAmount());
        } catch (Exception ex) {
            System.out.println("Ошибка" + ex.getMessage());
        }
    }
}

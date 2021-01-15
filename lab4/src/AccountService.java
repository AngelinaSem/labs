import exceptions.FewException;
import exceptions.ProblemAccException;

import java.io.IOException;

public interface AccountService {
    void balance(int accountId) throws ProblemAccException, IOException;
    void withdraw(int accountId, double amount) throws FewException, ProblemAccException, IOException;
    void deposit(int accountId, double amount) throws FewException, ProblemAccException, IOException;
    void transfer(int from, int to, double amount) throws FewException, ProblemAccException, IOException;
}

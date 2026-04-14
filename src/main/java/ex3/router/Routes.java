package ex3.router;

import ex3.view.*;
import lombok.Getter;

public enum Routes {
    Home(new HomeView()),
    Account(new AccountView()),
    Deposit(new DepositView()),
    Withdrawal(new WithdrawalView());

    @Getter
    private View view;

    Routes(View view) {
        this.view = view;
    }
}

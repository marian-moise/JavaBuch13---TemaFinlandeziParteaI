package week4;

import libs.Account;

public class Exercise72 {
    public static void main(String[] args) {

        Account bartosAccount = new Account("Barto's account",100.00);
        Account bartosSwissAccount = new Account("Barto's account in Switzerland",1000000.00);

        System.out.println("Initial state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);

        bartosAccount.withdrawal(20);
        System.out.println("Barto's account balance is now: "+bartosAccount.balance());
        bartosSwissAccount.deposit(200);
        System.out.println("Barto's Swiss account balance is now: "+bartosSwissAccount.balance());

        System.out.println("Final state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);

        Account mAccount = new Account("Marian's account",100);
        mAccount.deposit(20);
        System.out.println(mAccount);

        Account mattAccount = new Account("Matt's account ",1000);
        Account myAccount = new Account("My account ",0);
        mattAccount.withdrawal(100);
        myAccount.deposit(100);
        System.out.println(mattAccount);
        System.out.println(myAccount);

        Account a = new Account("A",100);
        Account b = new Account("B",0);
        Account c = new Account("C",0);
        transfer(a,b,50);
        System.out.println(a);
        transfer(b,c,25);
        System.out.println(b);
        System.out.println(c);

    }

    public static void transfer(Account from, Account to,double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
}

package bankingApp;

import java.util.Scanner;

public class bankingApp {

    Scanner myScanner = new Scanner(System.in);

    account current = new account(data.user1CurrentAccountBalance, "Current");
    account savings = new account(data.user1CurrentAccountBalance, "Savings");
    account joint = new account(data.user1CurrentAccountBalance, "Joint");


    public static void main(String[] args) {
        bankingApp app = new bankingApp();
        app.login();
    }

    private void login() {
        String userLogin = "";
        String userPassword = "";
        System.out.println("Please enter your username:");
        userLogin = myScanner.nextLine();
        System.out.println("Please enter your password:");
        userPassword = myScanner.nextLine();
        boolean login = checkLogin(userLogin, userPassword);
        if (login == true) {
//            System.out.println("Continue to cash");
            mainMenu();
        } else {
            System.out.println("Username or password incorrect, please try again!");
            login();
        }
    }

    private void mainMenu() {
        System.out.println("What do you want to do(Balance, Operations, Exit)?");
        String option = myScanner.nextLine();
        switch (option) {
            case "Balance":
                checkAccounts();
                mainMenu();
                break;
            case "Operations":
                operations();
                mainMenu();
                break;
            case "Exit":
                System.exit(0);
            default:
                System.out.println("Please try again!");
                mainMenu();
                break;
        }
    }

    private void operations() {
        System.out.println("What operation would you like to do (MoveMoney, Deposit, Withdraw)?");
        String option = myScanner.nextLine();
        switch (option) {
            case "MoveMoney":
                moveMoney();
                operations();
                break;
            case "Deposit":
                deposit();
                operations();
                break;
            case "Withdraw":
                withdraw();
                operations();
                break;
        }

    }

    private void withdraw() {
        System.out.println("How much money do you want to withdraw?");
        double amountToWithdraw = Double.parseDouble(myScanner.nextLine());
        System.out.println("In which account do you want to deposit (Current, Savings, Joint)?");
        String option = myScanner.nextLine();
        switch (option) {
            case "Current":
                current.printBalance();
                current.deposit(amountToWithdraw);
                current.printBalance();
            case "Savings":
                savings.deposit(amountToWithdraw);
            case "Joint":
                joint.deposit(amountToWithdraw);
        }
    }

    private void deposit() {
        System.out.println("How much money do you want to deposit?");
        double amountToDeposit = Double.parseDouble(myScanner.nextLine());
        System.out.println("In which account do you want to deposit (Current, Savings, Joint)?");
        String option = myScanner.nextLine();
        switch (option) {
            case "Current":
                current.deposit(amountToDeposit);
            case "Savings":
                savings.deposit(amountToDeposit);
            case "Joint":
                joint.deposit(amountToDeposit);
        }
    }

    private void moveMoney() {
        System.out.println("Woould you want to ");
        System.out.println("From where to where do you want to move money (Current, Savings, Joint)?");
        System.out.println("First account:");
        String fromAccount = myScanner.nextLine();


    }

    private void checkAccounts() {
        System.out.println("Which account balance do you want to see(Current, Savings, Joint, Go back to main menu(M), Exit)?");
        String option = myScanner.nextLine();
        switch (option) {
            case "Current":
//                account current = new account(data.user1CurrentAccountBalance, option);
                current.printType();
                current.printBalance();
                checkAccounts();
            case "Savings":
//                account savings = new account(data.user1SavingsAccountBalance, option);
                savings.printType();
                savings.printBalance();
                checkAccounts();
                break;
            case "Joint":
//                account joint = new account(data.user1JointAccountBalance, option);
                joint.printType();
                joint.printBalance();
                checkAccounts();
                break;
            case "Exit":
                System.exit(0);
            case "M":
                mainMenu();
            default:
                System.out.println("Something went wrong! Please try again: Current, Savings, Joint");
                checkAccounts();
                break;

        }

    }

    private boolean checkLogin(String userLogin, String userPassword) {
        String user1name = data.user1name;
        String user1password = data.user1password;
        if (userLogin.equals(user1name) & userPassword.equals(user1password)) {
            return true;
        } else {
            return false;
        }

    }

}

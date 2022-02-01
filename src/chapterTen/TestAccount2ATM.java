package chapterTen;

import java.util.Scanner;

public class TestAccount2ATM {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Account2[] accounts = new Account2[10];

        for (int i = 0; i < accounts.length; i++) {
        	
        	int id = i;
        	double balance = 100;
            accounts[i] = new Account2(i, balance);
        }

        int option = 0;
        int id = askForID(accounts);
        while (option != 4) {
            Account2 user = getAccount(accounts, id);
            System.out.print(
                    "Main menu\n" +
                            "1: check balance\n" +
                            "2: withdraw\n" +
                            "3: deposit\n" +
                            "4: exit\n" +
                            "Enter a choice: ");
            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("The balance is $" + user.getbalance() + ".\n");
                    break;
                case 2:
                    System.out.print("Enter an amount to withdraw: ");
                    user.withdraw(input.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter an amount to deposit: ");
                    user.deposit(input.nextDouble());
                    break;
                case 4:
                    System.out.println("Logged out...");
                    System.out.println("");
                    id = askForID(accounts);
                    option = 0;
                    break;
                    default:
                        System.out.println("Invalid input.. Enter a number 1-4");
            }

        }

    }

    public static int askForID(Account2[] accounts) {

        Scanner input = new Scanner(System.in);

        int id = 0;
        boolean isValidID = false;

        while (!isValidID) {
            System.out.print("Enter an ID: ");
            id = input.nextInt();

            if (!hasID(accounts, id)) {
                System.out.println("INVALID ID: Try again.");

            } else {
                isValidID = true;
            }
        }

        return id;
    }

    public static Account2 getAccount(Account2[] accounts, int id) {

        for (Account2 account : accounts) {
            if (id == account.getId()) {
                return account;
            }
        }
        return null;
    }
    public static boolean hasID(Account2[] accounts, int id) {

        for (Account2 account : accounts) {
            if (id == account.getId()) {
                return true;
            }
        }

        return false;
    }
	
}

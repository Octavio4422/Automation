package EggTestAutomation.BankExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import entities.Bank;
import entities.User;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User admin = new User("admin", "admin", true);
		User u1 = new User("user1", "user1", false);
		User u2 = new User("user2", "user2", false);
		Bank b1 = new Bank(admin, new ArrayList<User>(Arrays.asList(u1, u2)));
		User loged = null;

		System.out.println("Bienvenido al sistema bancario mas seguro del mundo");
		do {
			try {
				loged = b1.logIn();
			} catch (Exception e) {
				System.out.println(e.getMessage() + ", intentelo nuevamente");
			}
		} while (loged == null);

		int opc;
		System.out.println("Bienvendo " + loged.getUsername());
		System.out.println("Que queres hacer?");
		System.out.println("1) Depositar");
		System.out.println("2) Retirar");
		System.out.println("3) Transferir");
		opc = sc.nextInt();

		switch (opc) {
		case 1:
			b1.deposit(loged);
			break;
		case 2:
			b1.whitdraw(loged);
			break;
		case 3:
			b1.transfer(loged);
			break;
		default:
			break;
		}
	}

}

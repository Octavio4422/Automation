package entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	Scanner sc = new Scanner(System.in);
	private User admin;
	private ArrayList<User> users = new ArrayList<>();

	public Bank() {}

	public Bank(User admin, ArrayList<User> users) {
		this.admin = admin;
		this.users = users;
	}

	public User getAdmin() {
		return admin;
	}

	public void setAdmin(User admin) {
		this.admin = admin;
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	
	@Override
	public String toString() {
		return "Bank [admin=" + admin + ", users=" + users + "]";
	}
	
	public User logIn() throws Exception {
        System.out.println("Ingrese usuario");
        String nombre = sc.next();
        System.out.println("Ingrese contraseña");
        String contrasenia = sc.next();

		for(User u:users) {
			if(nombre.equals(u.getUsername())) {
				if(contrasenia.equals(u.getPassword())) {
					return u;
				}else {
					throw new Exception("Contraseña Incorrecta");
				}
			}
		}
		throw new Exception("Usuario no encontrado");
	}

	public void deposit (User u) {
		
	}
	
	public void whitdraw (User u) {
		
	}
	
	public void transfer (User u) {
		
	}
	
}

package entities;

public class User {
	private String username;
	private String password;
	private int balance;
	private boolean admin;
	
	public User() {}

	public User(String username, String password, boolean admin) {
		this.username = username;
		this.password = password;
		this.balance = 0;
		this.admin = admin;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", balance=" + balance + ", admin=" + admin
				+ "]";
	}
	
}

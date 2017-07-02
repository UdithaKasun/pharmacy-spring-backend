package pharmacy.model;

public class User {
	private String username;
	private String password;
	private int usertype;
	
	public User(){
		
	}
	
	

	public User(String username, String password, int usertype) {
		super();
		this.username = username;
		this.password = password;
		this.usertype = usertype;
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

	public int getUsertype() {
		return usertype;
	}

	public void setUsertype(int usertype) {
		this.usertype = usertype;
	}
	
	
}

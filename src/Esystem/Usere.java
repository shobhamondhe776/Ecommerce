package Esystem;

abstract class User {
	private int userId;
	private String userName;
	private String password;
	private String email;

	User(int userId, String userName, String password, String email)
	{
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	 // Abstract methods
    public abstract void viewProfile();

    public abstract void updateProfile();

    // Concrete methods
    public void login() 
    {
        System.out.println("User login with " + "UserName : " +userName + "    Password : " +password);
    }

    public void logout()
    {
        System.out.println("User log out.");
    }

}
 


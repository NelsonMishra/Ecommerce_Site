public abstract class User {
	String userId ="";
	String password ="";
	String logInStatus ="";
	abstract Boolean verifyUser();

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogInStatus() {
		return logInStatus;
	}

	public void setLogInStatus(String logInStatus) {
		this.logInStatus = logInStatus;
	}
}

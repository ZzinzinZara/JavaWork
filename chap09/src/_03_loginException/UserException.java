package _03_loginException;

public class UserException extends Exception{
	public UserException() { };
	public UserException(String msg) {
		super(msg);
	}
}

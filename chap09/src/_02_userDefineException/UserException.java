package _02_userDefineException;

public class UserException extends Exception{ // 예외를 만들려면 예외를 상속받아야 됨
	public UserException() { };
	public UserException(String msg) {
		super(msg);
	}
}

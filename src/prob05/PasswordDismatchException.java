package prob05;

public class PasswordDismatchException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public PasswordDismatchException() {
		System.out.println("사용자를 찾을 수 없습니다.");
	}

}

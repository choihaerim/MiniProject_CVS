/** 
 * PROJECT  : 편의점 매장 정보 확인
 * NAME  :  NotExistException.java
 * DESC  :  중복예외 처리용 사용자 정의 예외 클래스
 * 
 * @author  
 * @version 1.0
*/
package cvs.exception;

public class DuplicateException extends Exception{

	// 중복 예외 처리
	public DuplicateException() {}
	public DuplicateException(String message) {
		super(message);
	}
	
}
   
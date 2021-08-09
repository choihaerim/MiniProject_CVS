/** 
 * PROJECT  : 편의점 매장 정보 확인
 * NAME  :  NotExistException.java
 * DESC  :  검색 데이터가 없을 경우 발생시키는 사용자 정의 예외 클래스
 * 
 * @author  
 * @version 1.0
*/
package cvs.exception;

public class NotExistException extends Exception {
	
	// 미존재 예외 처리
	public NotExistException() {}
	public NotExistException(String message) {
		super(message);
	}
	
}
     
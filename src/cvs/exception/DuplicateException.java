/** 
 * PROJECT  : ������ ���� ���� Ȯ��
 * NAME  :  NotExistException.java
 * DESC  :  �ߺ����� ó���� ����� ���� ���� Ŭ����
 * 
 * @author  
 * @version 1.0
*/
package cvs.exception;

public class DuplicateException extends Exception{

	// �ߺ� ���� ó��
	public DuplicateException() {}
	public DuplicateException(String message) {
		super(message);
	}
	
}
   
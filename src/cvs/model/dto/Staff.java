/** 
 * PROJECT  : 편의점 매장 정보 확인
 * NAME  :  Staff.java
 * DESC  :  매장에서 일하는 스태프 정보(Data)
 * 
 * @author  
 * @version 1.0
*/
package cvs.model.dto;

public class Staff {
	
// ========== 멤버변수 ==========
	
	private int empno;
	private String ename;
	private String email;
	private String partTime;
	
// ========== 생성자(수퍼클래스) ==========

	public Staff() {
	}

// ========== 멤버변수(초기화) ==========	

	public Staff(int empno, String ename, String email, String partTime) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.email = email;
		this.partTime = partTime;
	}
	
// ========== get + set ==========	

	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}

	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}

	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getpartTime() {
		return partTime;
	}
	public void setpartTime(String partTime) {
		this.partTime = partTime;
	}

// ========== toString(재정의) ==========	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("사원번호: ");
		builder.append(empno);
		builder.append(" / 사원명: ");
		builder.append(ename);
		builder.append(" / 이메일: ");
		builder.append(email);
		builder.append(" / 근무파트: ");
		builder.append(partTime);
		return builder.toString();
	}
	
}

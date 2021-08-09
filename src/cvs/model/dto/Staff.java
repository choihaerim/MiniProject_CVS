/** 
 * PROJECT  : ������ ���� ���� Ȯ��
 * NAME  :  Staff.java
 * DESC  :  ���忡�� ���ϴ� ������ ����(Data)
 * 
 * @author  
 * @version 1.0
*/
package cvs.model.dto;

public class Staff {
	
// ========== ������� ==========
	
	private int empno;
	private String ename;
	private String email;
	private String partTime;
	
// ========== ������(����Ŭ����) ==========

	public Staff() {
	}

// ========== �������(�ʱ�ȭ) ==========	

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

// ========== toString(������) ==========	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("�����ȣ: ");
		builder.append(empno);
		builder.append(" / �����: ");
		builder.append(ename);
		builder.append(" / �̸���: ");
		builder.append(email);
		builder.append(" / �ٹ���Ʈ: ");
		builder.append(partTime);
		return builder.toString();
	}
	
}

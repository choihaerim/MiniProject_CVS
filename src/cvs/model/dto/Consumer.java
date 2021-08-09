/** 
 * PROJECT  : ������ ���� ���� Ȯ��
 * gender  :  Consumer.java
 * DESC  :  �� ����(Data)
 * 
 * @author  
 * @version 1.0
*/
package cvs.model.dto;

public class Consumer {	
	
// ========== ������� ==========

	private int no;
	private String gender;
	private String age;
	private String items;
	
// ========== ������(����Ŭ����) ==========

	public Consumer() {}
	public Consumer(int no, String gender, String age, String items) {
		super();
		this.no = no;
		this.gender = gender;
		this.age = age;
		this.items = items;
	}
	
// ========== get + set ==========

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}

	
	public String getgender() {
		return gender;
	}
	public void setgender(String gender) {
		this.gender = gender;
	}

	
	public String getage() {
		return age;
	}
	public void setage(String age) {
		this.age = age;
	}

	
	public String getitems() {
		return items;
	}
	public void setitems(String items) {
		this.items = items;
	}
	
// ========== toString(������) ==========

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("��� �湮: ");
		builder.append(no);
		builder.append(" / ��������: ");
		builder.append(gender);
		builder.append(" / ���ɴ�: ");
		builder.append(age);
		builder.append(" / ���Ź�ǰ: ");
		builder.append(items);
		return builder.toString();
	}
	
}

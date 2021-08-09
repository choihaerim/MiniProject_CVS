/** 
 * PROJECT  : 편의점 매장 정보 확인
 * gender  :  Consumer.java
 * DESC  :  고객 정보(Data)
 * 
 * @author  
 * @version 1.0
*/
package cvs.model.dto;

public class Consumer {	
	
// ========== 멤버변수 ==========

	private int no;
	private String gender;
	private String age;
	private String items;
	
// ========== 생성자(수퍼클래스) ==========

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
	
// ========== toString(재정의) ==========

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("평균 방문: ");
		builder.append(no);
		builder.append(" / 성별비율: ");
		builder.append(gender);
		builder.append(" / 연령대: ");
		builder.append(age);
		builder.append(" / 구매물품: ");
		builder.append(items);
		return builder.toString();
	}
	
}

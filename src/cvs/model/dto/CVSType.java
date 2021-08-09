/** 
 * PROJECT  : 편의점 매장 정보 확인
 * NAME  :  CVSType.java
 * DESC  :  매장 타입 확인(Data)
 * 
 * @author  
 * @version 1.0
*/
package cvs.model.dto;

public class CVSType {
	
// ========== 멤버변수 ========== 
	
	private String cvsPoints; 
	private String cvsSales;
	private String cvsMainItems;
	private String cvsEtc;
	
// ========== 생성자(수퍼클래스) ========== 

	public CVSType() {
		super();
	}
	
// ========== 멤버변수(초기화)==========
	
	public CVSType(String cvsPoints, String cvsSales, String cvsMainItems, String cvsEtc) {
		super();
		this.cvsPoints = cvsPoints;
		this.cvsSales = cvsSales;
		this.cvsMainItems = cvsMainItems;
		this.cvsEtc = cvsEtc;
	}
	
// ========== get + set ========== 

	public String getcvsPoints() {
		return cvsPoints;
	}
	public void setcvsPoints(String cvsPoints) {
		this.cvsPoints = cvsPoints;
	}

	
	public String getcvsSales() {
		return cvsSales;
	}
	public void setcvsSales(String cvsSales) {
		this.cvsSales = cvsSales;
	}

	
	public String getcvsMainItems() {
		return cvsMainItems;
	}
	public void setcvsMainItems(String cvsMainItems) {
		this.cvsMainItems = cvsMainItems;
	}
	
	
	public String getcvsEtc() {
		return cvsMainItems;
	}
	public void setcvsEtc(String cvsMainItems) {
		this.cvsMainItems = cvsMainItems;
	}
	
// ========== toString(재정의) ========== 

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("지점: ");
		builder.append(cvsPoints);
		builder.append(" / 연매출액: ");
		builder.append(cvsSales);
		builder.append(" / 주력상품: ");
		builder.append(cvsMainItems);
		builder.append(" / 기타사항: ");
		builder.append(cvsEtc);
		return builder.toString();
	}
	
}

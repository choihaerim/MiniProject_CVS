/** 
 * PROJECT  : ������ ���� ���� Ȯ��
 * NAME  :  CVSType.java
 * DESC  :  ���� Ÿ�� Ȯ��(Data)
 * 
 * @author  
 * @version 1.0
*/
package cvs.model.dto;

public class CVSType {
	
// ========== ������� ========== 
	
	private String cvsPoints; 
	private String cvsSales;
	private String cvsMainItems;
	private String cvsEtc;
	
// ========== ������(����Ŭ����) ========== 

	public CVSType() {
		super();
	}
	
// ========== �������(�ʱ�ȭ)==========
	
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
	
// ========== toString(������) ========== 

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("����: ");
		builder.append(cvsPoints);
		builder.append(" / �������: ");
		builder.append(cvsSales);
		builder.append(" / �ַ»�ǰ: ");
		builder.append(cvsMainItems);
		builder.append(" / ��Ÿ����: ");
		builder.append(cvsEtc);
		return builder.toString();
	}
	
}

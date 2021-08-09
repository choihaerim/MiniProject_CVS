/** 
 * PROJECT  : 편의점 매장 정보 확인

 * NAME  :  CVSProject.java
 * DESC  :  스태프와 고객이 매핑되어 실제 확인되는 정보 확인(Data)
 * 
 * @author  
 * @version 1.0
*/
package cvs.model.dto;

public class CVSProject {
// ========== 멤버변수 ========== 

	private String cvsProjectName;
	private Staff projectStaff;
	private Consumer projectConsumer;
	private CVSType cvsType;

// ========== 생성자(수퍼클래스) ==========

	public CVSProject() {
		super();
	}

// ========== 멤버변수(초기화) ==========
	
	public CVSProject(String cvsProjectName, Staff projectStaff, Consumer projectConsumer, CVSType cvsType) {
		super();
		this.cvsProjectName = cvsProjectName;
		this.projectStaff = projectStaff;
		this.projectConsumer = projectConsumer;
		this.cvsType = cvsType;
	}

// ========== get & set ==========
	
	public String getcvsProjectName() {
		return cvsProjectName;
	}
	public void setcvsProjectName(String cvsProjectName) {
		this.cvsProjectName = cvsProjectName;
	}

	
	public Staff getProjectStaff() {
		return projectStaff;
	}
	public void setProjectStaff(Staff projectStaff) {
		this.projectStaff = projectStaff;
	}

	
	public Consumer getProjectConsumer() {
		return projectConsumer;
	}
	public void setProjectConsumer(Consumer projectConsumer) {
		this.projectConsumer = projectConsumer;
	}

	
	public CVSType getcvsType() {
		return cvsType;
	}
	public void setcvsType(CVSType cvsType) {
		this.cvsType = cvsType;
	}
	
// ========== toString(재정의) ==========

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[매장지역] ");
		builder.append(cvsProjectName);
		builder.append("\n   <매장정보> ");
		builder.append(cvsType);
		builder.append("\n   <스태프> ");
		builder.append(projectStaff);
		builder.append("\n   <고객정보> ");
		builder.append(projectConsumer);
		builder.append("\n");
		
		return builder.toString();
	}
	
}

/** 
 * PROJECT  : ������ ���� ���� Ȯ��

 * NAME  :  CVSProject.java
 * DESC  :  �������� ���� ���εǾ� ���� Ȯ�εǴ� ���� Ȯ��(Data)
 * 
 * @author  
 * @version 1.0
*/
package cvs.model.dto;

public class CVSProject {
// ========== ������� ========== 

	private String cvsProjectName;
	private Staff projectStaff;
	private Consumer projectConsumer;
	private CVSType cvsType;

// ========== ������(����Ŭ����) ==========

	public CVSProject() {
		super();
	}

// ========== �������(�ʱ�ȭ) ==========
	
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
	
// ========== toString(������) ==========

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[��������] ");
		builder.append(cvsProjectName);
		builder.append("\n   <��������> ");
		builder.append(cvsType);
		builder.append("\n   <������> ");
		builder.append(projectStaff);
		builder.append("\n   <������> ");
		builder.append(projectConsumer);
		builder.append("\n");
		
		return builder.toString();
	}
	
}

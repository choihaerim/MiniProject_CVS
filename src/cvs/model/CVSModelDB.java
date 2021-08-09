/** 
 * PROJECT  : 편의점 매장 정보 확인
 * NAME  :  CVSProject.java
 * DESC  :  편의점 정보확인에 사용될 test data 제공 클래스
 * 
 * @author  
 * @version 1.0
*/
package cvs.model;

import java.util.ArrayList;

import cvs.model.dto.CVSProject;
import cvs.model.dto.CVSType;
import cvs.model.dto.Consumer;
import cvs.model.dto.Staff; 

public class CVSModelDB {
	
	private static CVSModelDB instance = new CVSModelDB();
	private ArrayList<CVSProject> projectList = new ArrayList<CVSProject>();
	
	// 리스트에 DB 추가
	private CVSModelDB() {
		projectList.add(new CVSProject("'홍대입구역'", new Staff(17, "이태경", "gaetaegoo@gmail.com", "오전"), 
					    new Consumer(350, "남50%, 여50%", "10~20대", "주류, 과자, 유제품"), 
						new CVSType("홍대정문앞점", "12억", "주류", "외국인 다수 방문")));

		projectList.add(new CVSProject("'보신각역'", new Staff(25, "최해림", "choihaerim@gmail.com", "오후"),
						new Consumer(300, "남60%, 여40%", "30~40대", "담배, 복권, 숙취음료"),
						new CVSType("보신각점", "20억", "담배", "취객 난동 주의")));
		
		projectList.add(new CVSProject("'해운대역'", new Staff(3, "김아라", "nojam36@gmail.com", "새벽"),
						new Consumer(500, "여60%, 남40%", "20~30대", "슬리퍼, 돗자리, 모자"),
						new CVSType("해운대점", "15억", "일회용품", "청결 유지(모래 등)")));		
	}
	
// ==========================================================================================

	public static CVSModelDB getInstance() {
		return instance;
	}

	public ArrayList<CVSProject> getProjectList() {
		return projectList;
	}

	public void insertProject(CVSProject newProject) {
		projectList.add(newProject);
	}
	
}

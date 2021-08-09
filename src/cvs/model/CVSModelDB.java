/** 
 * PROJECT  : ������ ���� ���� Ȯ��
 * NAME  :  CVSProject.java
 * DESC  :  ������ ����Ȯ�ο� ���� test data ���� Ŭ����
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
	
	// ����Ʈ�� DB �߰�
	private CVSModelDB() {
		projectList.add(new CVSProject("'ȫ���Ա���'", new Staff(17, "���°�", "gaetaegoo@gmail.com", "����"), 
					    new Consumer(350, "��50%, ��50%", "10~20��", "�ַ�, ����, ����ǰ"), 
						new CVSType("ȫ����������", "12��", "�ַ�", "�ܱ��� �ټ� �湮")));

		projectList.add(new CVSProject("'���Ű���'", new Staff(25, "���ظ�", "choihaerim@gmail.com", "����"),
						new Consumer(300, "��60%, ��40%", "30~40��", "���, ����, ��������"),
						new CVSType("���Ű���", "20��", "���", "�밴 ���� ����")));
		
		projectList.add(new CVSProject("'�ؿ�뿪'", new Staff(3, "��ƶ�", "nojam36@gmail.com", "����"),
						new Consumer(500, "��60%, ��40%", "20~30��", "������, ���ڸ�, ����"),
						new CVSType("�ؿ����", "15��", "��ȸ��ǰ", "û�� ����(�� ��)")));		
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

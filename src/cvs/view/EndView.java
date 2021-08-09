/** 
 * PROJECT  : ������ ���� ���� Ȯ��
 * NAME  :  RunningEndView.java
 * DESC  : ��� ��� ���� ��� Ŭ����
 * 
 * @author  
 * @version 1.0
*/
package cvs.view;

import java.util.ArrayList;

import cvs.model.dto.CVSProject;

public class EndView {

	// ����� Ư�� ���� ���
	public static void projectView(CVSProject project) {
		if (project != null) {
			System.out.println(project);
		} else {
			System.out.println("�ش� ������ �������� �ʽ��ϴ�.");
		}
	}

	// ����� ��� ���� ���
	public static void projectListView(ArrayList<CVSProject> allProbonoProject) {
		for (CVSProject project : allProbonoProject) {
			System.out.println(project);
		}
	}

	// ���ܰ� �ƴ� �ܼ� �޼��� ���
	public static void messageView(String message) {
		System.out.println(message);
	}

}

/** 
 * PROJECT  : 편의점 매장 정보 확인
 * NAME  :  RunningEndView.java
 * DESC  : 재능 기부 정보 출력 클래스
 * 
 * @author  
 * @version 1.0
*/
package cvs.view;

import java.util.ArrayList;

import cvs.model.dto.CVSProject;

public class EndView {

	// 운영중인 특정 매장 출력
	public static void projectView(CVSProject project) {
		if (project != null) {
			System.out.println(project);
		} else {
			System.out.println("해당 매장은 존재하지 않습니다.");
		}
	}

	// 운영중인 모든 매장 출력
	public static void projectListView(ArrayList<CVSProject> allProbonoProject) {
		for (CVSProject project : allProbonoProject) {
			System.out.println(project);
		}
	}

	// 예외가 아닌 단순 메세지 출력
	public static void messageView(String message) {
		System.out.println(message);
	}

}

package cvs.controller;

import java.util.ArrayList;

import cvs.exception.DuplicateException;
import cvs.exception.NotExistException;
import cvs.model.dto.CVSProject;
import cvs.model.dto.Consumer;
import cvs.model.dto.Staff;
import cvs.service.CVSProjectService;
import cvs.view.EndView;
import cvs.view.FailView;

public class CVSController {
	
	private static CVSController instance = new CVSController();
	private CVSProjectService service = CVSProjectService.getInstance();
	private CVSController() {}
	public static CVSController getInstance() {
		return instance;
	}
	
// ==========================================================================================

// 모든 매장 검색
	public void getProjectList() {
		ArrayList<CVSProject> projectList = service.getProjectsList();

		if (projectList.size() != 0) {
			EndView.projectListView(projectList);
		} else {
			EndView.messageView("(System: 현재 운영중인 매장은 존재하지 않음)");
		}
	}

	/**
	 * 매장이름으로 특정 매장 검색
	 * 
	 * @param projectName
	 */
	public void getProject(String projectName) {
		CVSProject project = service.getProject(projectName);
		if (project != null) {
			EndView.projectView(project);
		} else {
			EndView.messageView("(System: 검색하신 매장은 존재하지 않음)");
		}
	}

	/**
	 * 새로운 매장 저장
	 * 
	 * @param newProject
	 */
	public void insertProject(CVSProject newProject) {
		if (newProject != null) {
			try {
				service.projectInsert(newProject);
				EndView.messageView(newProject + "\n(System: 새로운 매장지역을 성공적으로 저장함)");
			} catch (DuplicateException e) {
				FailView.failMessageView(e.getMessage());
			}
		} else {
			EndView.messageView("(System: 새로 저장하려는 매장지역이 없음, 재확인 요망)");
		}
	}

	/**
	 * 존재하는 매장의 스태프 이름을 검색 후, 해당하는 매장의 스태프 수정
	 * 
	 * @param projectName
	 * @param people
	 */
	public void updateProjectStaff(String projectName, Staff people) {
		if (projectName != null) {
			try {
				service.projectStaffUpdate(projectName, people);
			} catch (NotExistException e) {
				FailView.failMessageView(e.getMessage());
			}
		} else {
			EndView.messageView("(System: 업데이트하려는 staff가 없음, 재확인 요망)");
		}
	}

	/**
	 * 존재하는 매장의 고객정보를 검색 후, 해당하는 매장의 고객정보 수정
	 * 
	 * @param projectName
	 * @param people
	 */
	public void updateProjectConsumer(String projectName, Consumer people) {
		if (people != null) {
			try {
				service.projectConsumerUpdate(projectName, people);
			} catch (NotExistException e) {
				FailView.failMessageView(e.getMessage());
			}
		} else {
			EndView.messageView("(System: 업데이트하려는 고객정보가 없음, 재확인 요망)");
		}
	}

	/**
	 * 프로젝트 명으로 해당하는 프로젝트 삭제
	 * 
	 * @param projectName
	 */
	public void deleteProject(String projectName) {
		if (projectName != null) {
			try {
				service.projectDelete(projectName);
				EndView.messageView("(System:" + projectName + " 매장지역을 성공적으로 삭제함)");
			} catch (NotExistException e) {
				FailView.failMessageView(e.getMessage());
			}
		} else {
			EndView.messageView("삭제하고자 하는 매장명이 무효합니다. 재확인해 주세요");
		}
	}
}

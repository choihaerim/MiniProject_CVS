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

// ��� ���� �˻�
	public void getProjectList() {
		ArrayList<CVSProject> projectList = service.getProjectsList();

		if (projectList.size() != 0) {
			EndView.projectListView(projectList);
		} else {
			EndView.messageView("(System: ���� ����� ������ �������� ����)");
		}
	}

	/**
	 * �����̸����� Ư�� ���� �˻�
	 * 
	 * @param projectName
	 */
	public void getProject(String projectName) {
		CVSProject project = service.getProject(projectName);
		if (project != null) {
			EndView.projectView(project);
		} else {
			EndView.messageView("(System: �˻��Ͻ� ������ �������� ����)");
		}
	}

	/**
	 * ���ο� ���� ����
	 * 
	 * @param newProject
	 */
	public void insertProject(CVSProject newProject) {
		if (newProject != null) {
			try {
				service.projectInsert(newProject);
				EndView.messageView(newProject + "\n(System: ���ο� ���������� ���������� ������)");
			} catch (DuplicateException e) {
				FailView.failMessageView(e.getMessage());
			}
		} else {
			EndView.messageView("(System: ���� �����Ϸ��� ���������� ����, ��Ȯ�� ���)");
		}
	}

	/**
	 * �����ϴ� ������ ������ �̸��� �˻� ��, �ش��ϴ� ������ ������ ����
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
			EndView.messageView("(System: ������Ʈ�Ϸ��� staff�� ����, ��Ȯ�� ���)");
		}
	}

	/**
	 * �����ϴ� ������ �������� �˻� ��, �ش��ϴ� ������ ������ ����
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
			EndView.messageView("(System: ������Ʈ�Ϸ��� �������� ����, ��Ȯ�� ���)");
		}
	}

	/**
	 * ������Ʈ ������ �ش��ϴ� ������Ʈ ����
	 * 
	 * @param projectName
	 */
	public void deleteProject(String projectName) {
		if (projectName != null) {
			try {
				service.projectDelete(projectName);
				EndView.messageView("(System:" + projectName + " ���������� ���������� ������)");
			} catch (NotExistException e) {
				FailView.failMessageView(e.getMessage());
			}
		} else {
			EndView.messageView("�����ϰ��� �ϴ� ������� ��ȿ�մϴ�. ��Ȯ���� �ּ���");
		}
	}
}

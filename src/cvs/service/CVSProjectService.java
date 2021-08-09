package cvs.service;

import java.util.ArrayList;

import cvs.exception.DuplicateException;
import cvs.exception.NotExistException;
import cvs.model.CVSModelDB;
import cvs.model.dto.CVSProject;
import cvs.model.dto.Consumer;
import cvs.model.dto.Staff;

public class CVSProjectService {

		private static CVSProjectService instance = new CVSProjectService();
		private CVSModelDB CVSProjectsData = CVSModelDB.getInstance();
		private CVSProjectService() {}
		public static CVSProjectService getInstance() {
			return instance;
		}
		
// ==========================================================================================

		/**
		 * ��� ���� �˻�(��ȯ)
		 * 
		 * @return ��� Project
		 */
		public ArrayList<CVSProject> getProjectsList() {
			return CVSProjectsData.getProjectList();
		}

		/** 
		 * ���� �̸����� �˻� - ���� ��ȯ
		 * 
		 * @param projectName ������Ʈ �̸�
		 * @return TalentDonationProject �˻��� ������Ʈ, �˻��ϰ��� �ϴ� ������Ʈ�� ���� ��� null ��ȯ
		 */
		public CVSProject getProject(String projectName) {
			ArrayList<CVSProject> CVSProjectList = CVSProjectsData.getProjectList();

			for (CVSProject project : CVSProjectList) {
				if (project.getcvsProjectName().equals(projectName)) {
					return project;
				}
			}
			return null;
		}
		
		/**
		 * ���ο� ���� �߰� 
		 * ���� �����ϰ��� �ϴ� ������ �̹� ������ ��� DuplicateException ���� �߻�
		 * 
		 * @param newProject   �����ϰ��� �ϴ� ���ο� ������Ʈ
		 * @throws DuplicateException
		 */
		public void projectInsert(CVSProject newProject) throws DuplicateException {
			CVSProject project = getProject(newProject.getcvsProjectName());

			if (project != null) {
				throw new DuplicateException("(System: �ش� ������ ������ �̸��� ������ �̹� ������)");
			}
			CVSProjectsData.insertProject(newProject);
		}

		/**
		 * ������ ������ ���� ���� - ��������� �˻��ؼ� �ش� ������Ʈ�� ������ ���� ����
		 * �����ϰ��� �ϴ� �������� �������� ���� ��� NotExistException �߻�
		 * 
		 * @param projectName ������Ʈ �̸�
		 * @param people ����� 
		 * @throws NotExistException
		 */
		public void projectStaffUpdate(String projectName, Staff people) throws NotExistException {
			CVSProject project = getProject(projectName);

			if (project == null) {
				throw new NotExistException("(System: �ش� ���忡 ������Ʈ �Ϸ��� �������� �������� ����)");
			} else {
				project.setProjectStaff(people);
			}
		}

		/**
		 * ������ ������ ���� - ��������� �˻��ؼ� �ش� ���� ������ ����
		 * �����ϰ��� �ϴ� ������ �������� ���� ��� NotExistException �߻�
		 * 
		 * @param projectName ������Ʈ �̸�
		 * @param people ������ 
		 * @throws NotExistException
		 */
		public void projectConsumerUpdate(String projectName, Consumer people) throws NotExistException {
			CVSProject project = getProject(projectName);

			if (project == null) {
				throw new NotExistException("(System: �ش� ���忡 ������Ʈ �Ϸ��� �������� �������� ����)");
			} else {
				project.setProjectConsumer(people);
			}
		}
		
		/**
		 * ���� ���� - ��������� �ش� ���� ����
		 * 
		 * @param projectName �����ϰ��� �ϴ� ������Ʈ �̸�
		 * @throws NotExistException
		 */
		public void projectDelete(String projectName) throws NotExistException {
			CVSProject project = getProject(projectName);
			if (project == null) {
				throw new NotExistException("(System: �����Ϸ��� ������ �������� ����)");
			} else {
				getProjectsList().remove(project);
			}
		}

	}
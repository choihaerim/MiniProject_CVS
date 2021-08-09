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
		 * 모든 매장 검색(반환)
		 * 
		 * @return 모든 Project
		 */
		public ArrayList<CVSProject> getProjectsList() {
			return CVSProjectsData.getProjectList();
		}

		/** 
		 * 매장 이름으로 검색 - 매장 반환
		 * 
		 * @param projectName 프로젝트 이름
		 * @return TalentDonationProject 검색된 프로젝트, 검색하고자 하는 프로젝트가 없을 경우 null 반환
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
		 * 새로운 매장 추가 
		 * 새로 저장하고자 하는 매장이 이미 존재할 경우 DuplicateException 예외 발생
		 * 
		 * @param newProject   저장하고자 하는 새로운 프로젝트
		 * @throws DuplicateException
		 */
		public void projectInsert(CVSProject newProject) throws DuplicateException {
			CVSProject project = getProject(newProject.getcvsProjectName());

			if (project != null) {
				throw new DuplicateException("(System: 해당 매장명과 동일한 이름의 매장이 이미 존재함)");
			}
			CVSProjectsData.insertProject(newProject);
		}

		/**
		 * 매장의 스태프 정보 수정 - 매장명으로 검색해서 해당 프로젝트의 스태프 정보 수정
		 * 수정하고자 하는 스태프가 존재하지 않을 경우 NotExistException 발생
		 * 
		 * @param projectName 프로젝트 이름
		 * @param people 기부자 
		 * @throws NotExistException
		 */
		public void projectStaffUpdate(String projectName, Staff people) throws NotExistException {
			CVSProject project = getProject(projectName);

			if (project == null) {
				throw new NotExistException("(System: 해당 매장에 업데이트 하려는 스태프가 존재하지 않음)");
			} else {
				project.setProjectStaff(people);
			}
		}

		/**
		 * 매장의 고객정보 수정 - 매장명으로 검색해서 해당 매장 고객정보 수정
		 * 수정하고자 하는 매장이 존재하지 않을 경우 NotExistException 발생
		 * 
		 * @param projectName 프로젝트 이름
		 * @param people 수혜자 
		 * @throws NotExistException
		 */
		public void projectConsumerUpdate(String projectName, Consumer people) throws NotExistException {
			CVSProject project = getProject(projectName);

			if (project == null) {
				throw new NotExistException("(System: 해당 매장에 업데이트 하려는 고객정보가 존재하지 않음)");
			} else {
				project.setProjectConsumer(people);
			}
		}
		
		/**
		 * 매장 삭제 - 매장명으로 해당 매장 삭제
		 * 
		 * @param projectName 삭제하고자 하는 프로젝트 이름
		 * @throws NotExistException
		 */
		public void projectDelete(String projectName) throws NotExistException {
			CVSProject project = getProject(projectName);
			if (project == null) {
				throw new NotExistException("(System: 삭제하려는 매장은 존재하지 않음)");
			} else {
				getProjectsList().remove(project);
			}
		}

	}
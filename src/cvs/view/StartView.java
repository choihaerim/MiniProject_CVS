package cvs.view;

import cvs.controller.CVSController;
import cvs.model.dto.CVSProject;
import cvs.model.dto.CVSType;
import cvs.model.dto.Consumer;
import cvs.model.dto.Staff;

public class StartView {

	public static void main(String[] args) {
		
		CVSController controller = CVSController.getInstance();
		
		// 모든 매장 검색
		System.out.println("\n*** 01. 모든 매장 검색 ***\n");
		controller.getProjectList();
		System.out.println("===========================================================================================");
		
		// 특정 매장 검색
		System.out.println("\n*** 02. 특정 매장 검색 ***\n");
		controller.getProject("'홍대입구역'");
		System.out.println("===========================================================================================");
		
		// 저장하지 않은(폐점한) 매장 검색
		System.out.println("\n*** 03. 폐점한 매장 검색 ***");
		controller.getProject("'용산역점'");
		System.out.println("\n===========================================================================================");
		
		// 새로운 매장 추가 저장
		System.out.println("\n*** 04. '남부터미널역' 매장 저장 후, 모든 매장 검색 ***\n");
		CVSProject newProject = new CVSProject("'남부터미널역'", new Staff(23, "진유민", "youmin@gmail.com", "풀타임"),
														      new Consumer(250, "남50%, 여50%", "10~30대", "햇반, 컵라면, 냉동식품"),
														      new CVSType("서초점", "10억", "간편식품", "학생,직장인 위주"));
		// 매장 추가 전 검색	
		System.out.println("04-1. 새로운 매장 저장 전 검색");
		controller.getProjectList();
		
		System.out.println("-------------------------------------------------------------------------------------------\n");

		// 매장 추가 후 검색
		System.out.println("04-2. 새로운 매장 저장 후 검색");
		controller.getProjectList();
		controller.insertProject(newProject);
		
		// 이미 저장된 매장을 재저장 시도
		System.out.println("\n04-3. 이미 저장된 매장을 재저장 시도 후, 적합성 검증");
		controller.insertProject(newProject);
		System.out.println("\n===========================================================================================");

		// 'null'로 매장 정보를 저장 시도후 적합성 검증
		System.out.println("\n*** 05. 'null'로 매장지역 저장 후, 적합성 검증 ***");
		controller.insertProject(null);
		System.out.println("\n===========================================================================================");
		
		// 'null'로 매장 정보를 저장 시도후 적합성 검증
		System.out.println("\n*** 06. 'null'로 매장정보 업데이트 후, 적합성 검증 ***");
		controller.updateProjectConsumer("남부터미널역", null);
		System.out.println("\n===========================================================================================");

		// 기존 매장의 스태프 업데이트
		System.out.println("\n*** 07. '홍대입구역' 스태프 정보 업데이트 후 검색***\n");
		System.out.println("07-1. 스태프 수정 전: \"이태경\"");
		controller.getProject("'홍대입구역'");
		controller.updateProjectStaff("'홍대입구역'", new Staff(14, "유영훈", "youlove99@gmail.com", "풀타임"));
		
		// 업데이트 된 스태프 확인
		System.out.println("07-2. 스태프 수정 후: \"유영훈\"");
		controller.getProject("'홍대입구역'");
		System.out.println("===========================================================================================");

		// '보신각역' 점원 정보 검색 후 삭제
		System.out.println("\n*** 08. '보신각역' 삭제 후, 삭제한 매장지역 검색 **\n");
		System.out.println("08-1. 삭제 전 매장지역 검색");
		controller.getProject("'보신각역'");
		controller.deleteProject("'보신각역'");
		
		// 삭제 후 매장 지역 검색
		System.out.println("\n08-2. 삭제 후 매장지역 검색 ");
		controller.getProject("'보신각역'");

		// 삭제 된 매장을 삭제 재시도
		System.out.println("\n08-3. 삭제된 매장지역 삭제 재시도 후, 적합성 검증");
		controller.deleteProject("보신각역'");
	}
	
}

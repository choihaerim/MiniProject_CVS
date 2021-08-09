package cvs.view;

import cvs.controller.CVSController;
import cvs.model.dto.CVSProject;
import cvs.model.dto.CVSType;
import cvs.model.dto.Consumer;
import cvs.model.dto.Staff;

public class StartView {

	public static void main(String[] args) {
		
		CVSController controller = CVSController.getInstance();
		
		// ��� ���� �˻�
		System.out.println("\n*** 01. ��� ���� �˻� ***\n");
		controller.getProjectList();
		System.out.println("===========================================================================================");
		
		// Ư�� ���� �˻�
		System.out.println("\n*** 02. Ư�� ���� �˻� ***\n");
		controller.getProject("'ȫ���Ա���'");
		System.out.println("===========================================================================================");
		
		// �������� ����(������) ���� �˻�
		System.out.println("\n*** 03. ������ ���� �˻� ***");
		controller.getProject("'��꿪��'");
		System.out.println("\n===========================================================================================");
		
		// ���ο� ���� �߰� ����
		System.out.println("\n*** 04. '�����͹̳ο�' ���� ���� ��, ��� ���� �˻� ***\n");
		CVSProject newProject = new CVSProject("'�����͹̳ο�'", new Staff(23, "������", "youmin@gmail.com", "ǮŸ��"),
														      new Consumer(250, "��50%, ��50%", "10~30��", "�޹�, �Ŷ��, �õ���ǰ"),
														      new CVSType("������", "10��", "�����ǰ", "�л�,������ ����"));
		// ���� �߰� �� �˻�	
		System.out.println("04-1. ���ο� ���� ���� �� �˻�");
		controller.getProjectList();
		
		System.out.println("-------------------------------------------------------------------------------------------\n");

		// ���� �߰� �� �˻�
		System.out.println("04-2. ���ο� ���� ���� �� �˻�");
		controller.getProjectList();
		controller.insertProject(newProject);
		
		// �̹� ����� ������ ������ �õ�
		System.out.println("\n04-3. �̹� ����� ������ ������ �õ� ��, ���ռ� ����");
		controller.insertProject(newProject);
		System.out.println("\n===========================================================================================");

		// 'null'�� ���� ������ ���� �õ��� ���ռ� ����
		System.out.println("\n*** 05. 'null'�� �������� ���� ��, ���ռ� ���� ***");
		controller.insertProject(null);
		System.out.println("\n===========================================================================================");
		
		// 'null'�� ���� ������ ���� �õ��� ���ռ� ����
		System.out.println("\n*** 06. 'null'�� �������� ������Ʈ ��, ���ռ� ���� ***");
		controller.updateProjectConsumer("�����͹̳ο�", null);
		System.out.println("\n===========================================================================================");

		// ���� ������ ������ ������Ʈ
		System.out.println("\n*** 07. 'ȫ���Ա���' ������ ���� ������Ʈ �� �˻�***\n");
		System.out.println("07-1. ������ ���� ��: \"���°�\"");
		controller.getProject("'ȫ���Ա���'");
		controller.updateProjectStaff("'ȫ���Ա���'", new Staff(14, "������", "youlove99@gmail.com", "ǮŸ��"));
		
		// ������Ʈ �� ������ Ȯ��
		System.out.println("07-2. ������ ���� ��: \"������\"");
		controller.getProject("'ȫ���Ա���'");
		System.out.println("===========================================================================================");

		// '���Ű���' ���� ���� �˻� �� ����
		System.out.println("\n*** 08. '���Ű���' ���� ��, ������ �������� �˻� **\n");
		System.out.println("08-1. ���� �� �������� �˻�");
		controller.getProject("'���Ű���'");
		controller.deleteProject("'���Ű���'");
		
		// ���� �� ���� ���� �˻�
		System.out.println("\n08-2. ���� �� �������� �˻� ");
		controller.getProject("'���Ű���'");

		// ���� �� ������ ���� ��õ�
		System.out.println("\n08-3. ������ �������� ���� ��õ� ��, ���ռ� ����");
		controller.deleteProject("���Ű���'");
	}
	
}

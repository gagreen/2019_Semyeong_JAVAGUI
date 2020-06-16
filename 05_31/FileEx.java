import java.io.*;

public class FileEx {
	public static void listDirectory(File dir) {
		System.out.println("-----" + dir.getPath() + "�� ���� ����Ʈ�Դϴ�. -----");
		
		File[] subFiles = dir.listFiles(); // �����͸��� ���Ե� ���ϰ� ���͸� �̸��� ����Ʈ ���
		
		for(int i=0; i<subFiles.length; i++) {
			File f = subFiles[i];
			long t = f.lastModified(); //���������� ������ �ð�
			System.out.println(f.getName());
			System.out.println("\t���� ũ��: " + f.length());
			System.out.printf("\t������ �ð�: %tb %td %ta %tT\n", t, t, t, t);
		}
	}

	public static void main(String[] args) {
		File f1 = new File("C:\\Windows\\system.ini");
		System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());
		// ��ü��� + ��� + ���ϸ�
		
		String res = "";
		if(f1.isFile()) { //�����̶��
			res = "����";
		}else if(f1.isDirectory()) { //���͸����
			res = "���͸�";
		}
		System.out.println(f1.getPath() + "�� " + res + "�Դϴ�.");

		File f2 = new File("C:\\Temp\\java_sample");
		if(!f2.exists()) { //���͸��� �������� �ʴ´ٸ�
			f2.mkdirs();
		}
		
		listDirectory(new File("C:\\Temp"));
		f2.renameTo(new File("C:\\Temp\\javasample"));
		
		listDirectory(new File("C:\\Temp"));
	}

}

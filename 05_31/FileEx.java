import java.io.*;

public class FileEx {
	public static void listDirectory(File dir) {
		System.out.println("-----" + dir.getPath() + "의 서브 리스트입니다. -----");
		
		File[] subFiles = dir.listFiles(); // 리텍터리에 포함된 파일과 디렉터리 이름의 리스트 얻기
		
		for(int i=0; i<subFiles.length; i++) {
			File f = subFiles[i];
			long t = f.lastModified(); //마지막으로 수정된 시간
			System.out.println(f.getName());
			System.out.println("\t파일 크기: " + f.length());
			System.out.printf("\t수정한 시간: %tb %td %ta %tT\n", t, t, t, t);
		}
	}

	public static void main(String[] args) {
		File f1 = new File("C:\\Windows\\system.ini");
		System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());
		// 전체경로 + 경로 + 파일명
		
		String res = "";
		if(f1.isFile()) { //파일이라면
			res = "파일";
		}else if(f1.isDirectory()) { //디렉터리라면
			res = "디렉터리";
		}
		System.out.println(f1.getPath() + "은 " + res + "입니다.");

		File f2 = new File("C:\\Temp\\java_sample");
		if(!f2.exists()) { //디렉터리가 존재하지 않는다면
			f2.mkdirs();
		}
		
		listDirectory(new File("C:\\Temp"));
		f2.renameTo(new File("C:\\Temp\\javasample"));
		
		listDirectory(new File("C:\\Temp"));
	}

}

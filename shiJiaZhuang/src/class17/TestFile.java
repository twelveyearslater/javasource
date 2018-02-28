package class17;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestFile {
	public static void main(String[] args) {
		try{
			new File("E://a.jpg").createNewFile();
			new File("E://temp//").mkdir();
			new File("E://temp//","moved.jpg").createNewFile();
			new File("E://temp//b.txt").createNewFile();
			
		}catch(IOException e){
			e.printStackTrace();
		}
		File f1 =new File("E://a.jpg");
		File f2 =new File("E://temp//","moved.jpg");
		File f3 =new File("E://temp//b,txt");
		File f4 =new File("E://ex//");
		System.out.println("Name: " + f1.getName());
		System.out.println("Path: " + f1.getPath());
		System.out.println("AbslutuePath: "+f1.getAbsolutePath() );
		System.out.println("Parent: "+f1.getParent() );
		System.out.println("LastModified: "+new Date(f1.lastModified()));
		System.out.println("length: "+f1.length());
		System.out.println("exists: "+f1.exists());
		System.out.println("canRead: "+f1.canRead());
		System.out.println("canWrite: "+f1.canWrite());
		System.out.println("isFile: "+f1.isFile());
		System.out.println("isHidden: "+f1.isHidden());
		System.out.println("isDirectory: "+f1.isDirectory());
		System.out.println("isAbsolute: "+f1.isAbsolute());
		System.out.println("length: "+f1.length());
		f3.delete();
		try{
			System.out.println("createNewFile:"+ new File("E://c.txt").createNewFile());
		}catch(java.io.IOException e){
			e.printStackTrace();
		}
		f1.setReadOnly();
		f1.renameTo(f2);
		System.out.println("createNewFile:"+ new File("E://newPath//").mkdir());
		System.out.println("istFiles:");
		for(File f : f4.listFiles()){
			System.out.println("    -"+f.getName());
		}
	}
}

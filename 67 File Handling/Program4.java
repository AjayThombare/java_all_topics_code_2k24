import java.io.*;
class DirList4{
	public static void main(String [] args){
		File fObj = new File("/home/ajaythombare/JAVA/DailyCodes/16 File Handling/67 File Handling");

		String names[] = fObj.list();
		System.out.println(names.length);
	}
}



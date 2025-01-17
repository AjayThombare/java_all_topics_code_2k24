import java.io.*;
class Demo8{
	public static void main(String [] args){
		File fObj = new File("./../67 File Handling");
		String names[] = fObj.list();
		System.out.println(fObj.isDirectory());
		System.out.println(fObj.isFile());
	}

}


/*import java.io.*;
class FileNotFoundDemo8{
	public static void main(String [] args){
		File fobj = new File("abc.txt");
		FileReader fr = new FileReader(fobj);
	}
}*/

import java.io.*;
class FileNotFoundDemo8{
	public static void main(String [] args){
		File fobj = new File("abc.txt");
		FileReader fr = new FileReader(fobj);
		System.out.println(fr.read());
	}
}



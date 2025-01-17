import java.io.*;
class FileNotFoundDemo10{
	public static void main(String [] args)throws FileNotFoundException,IOException{
		File fobj = new File("abc.txt");
		FileReader fr = new FileReader(fobj);
		System.out.println(fr.read());
	}

}


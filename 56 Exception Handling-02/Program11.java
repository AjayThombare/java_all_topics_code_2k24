import java.io.*;
class FileNotFoundDemo11{
	public static void main(String [] args)throws IOException{
		File fobj = new File("abc.txt");
		FileReader fr = new FileReader(fobj);
		System.out.println(fr.read());
	}
}


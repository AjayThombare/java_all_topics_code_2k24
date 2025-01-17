import java.io.*;
class FileNotFoundDemo12{
	public static void main(Strinng [] args)throws IOException{
		File fobj = new File("abc.txt");
		FileReader fr = new FileReader(fobj);
		System.out.println(fr.read());
	}
}


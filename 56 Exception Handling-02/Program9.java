import java.io.*;
class FileNotFoundDemo9{
	public static void main(String [] args)throws FileNotFoundException{
		File fobj = new File("abc.txt");
		FileReader fr = new FileReader(fobj);
		System.out.println(fr.read());
	}
}


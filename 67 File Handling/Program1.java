import java.io.*;
class FileDemo1{
	public static void main(String [] args)throws IOException{
		File fobj = new File("Incubators.txt");
		fobj.createNewFile();
	}
}


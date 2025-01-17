import java.io.*;
class FileRead14{
	public static void main(String [] args)throws IOException{
		FileReader fr = new FileReader("Incubators3.txt");
		int ch ;
		while((ch = fr.read())!=-1){
			System.out.println((char)ch);
		}
		fr.close();
	}
}


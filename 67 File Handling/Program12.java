import java.io.*;
class FileWrite12{
	public static void main(String [] args)throws IOException{
		FileWriter obj = new FileWriter("Incubators.txt",false);
		obj.write("ReactJS\n");
		obj.write("Flutter\n");
		obj.write("SpringBoot\n");
		obj.write("Python\n");
		obj.close();
	}
}


	




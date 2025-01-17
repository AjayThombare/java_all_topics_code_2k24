import java.io.*;
class FileWrite11{
	public static void main(String [] args)throws IOException{
		FileWriter obj = new FileWriter("Incubators.txt",true);
		obj.write("ReactJS\n");
		obj.write("Flutter\n");
		obj.write("SpringBoot\n");
		obj.write("Python\n");
		obj.close();
	}
}


	




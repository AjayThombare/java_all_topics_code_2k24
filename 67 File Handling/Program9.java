import java.io.*;
class FileWrite9{
	public static void main(String [    ] args)throws IOException{
		FileWriter obj = new FileWriter("Incubators.txt");
		obj.write("ReactJS");
		obj.write("Flutter");
		obj.write("SpringBoot");
		obj.write("Python");
		obj.close();
	}
}


	




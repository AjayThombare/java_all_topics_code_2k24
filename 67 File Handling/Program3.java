import java.io.*;
class Demo3{
	public static void main(String [] args)throws IOException{
		File fObj = new File("Incubators3.txt");
		fObj.createNewFile();

		File dirObj = new File("JavaBatch2024");
		dirObj.mkdir();

		File fObj2 = new File(dirObj,"C2W.txt");
		fObj2.createNewFile();
	}
}


import java.io.*;
class Demo2{
	public static void main(String [] args)throws IOException{
		File fObj = new File("Core2Web");
		fObj.createNewFile();
		File dirObj = new File("Java2024");
		dirObj.mkdir();
	}
}


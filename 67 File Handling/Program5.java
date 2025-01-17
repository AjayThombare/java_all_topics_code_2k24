import java.io.*;
class Demo5{
	public static void main(String [] args){
		File fObj = new File("/home/ajaythombare/JAVA/DailyCodes/16 File Handling/67 File Handling");
		String names[] = fObj.list();

		for(int i=0; i<names.length; i++){
			System.out.println(names[i]);
		}
		System.out.println(names.length);
	}
}


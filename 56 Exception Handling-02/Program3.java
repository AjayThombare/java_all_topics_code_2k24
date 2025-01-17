import java.io.*;
class IOExceptionDemo3{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first String");
		String str = br.readLine();
	}
}


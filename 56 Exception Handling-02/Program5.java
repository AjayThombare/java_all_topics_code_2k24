import java.io.*;
class IOExceptionDemo5{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first String");
		String str1 = br.readLine();
		System.out.println(str1);
		br.close();

		System.out.println("Enter second String");
		String str2 = br.readLine();
		System.out.println(str2);
	}
}


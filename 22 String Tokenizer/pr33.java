import java.io.*;
class P33{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter your name : ");
		String name = br.readline();
		
		System.out.print("Enter socName : ");
		String socName = br.readLine();

		System.out.print("Enter wing : ");
		char wing = (char) br.read();

		System.out.print("Enter flatNo : " );
		int flatNo = br.readline();

		System.out.println("name : " + name);
		System.out.println("socName : " + socName);
		System.out.println("wing : "+ wing);
		System.out.println("flatNo : " + flatNo);
	}
}




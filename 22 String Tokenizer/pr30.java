import java.io.*;
class P30{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.print("Enter Name : ");
		String name = br.readLine();

		System.out.print("Enter socName : ");
		String socName = br.readLine();

		System.out.print("Enter wing : ");
		char wing = br.readLine();		// error => Incompatable Type

		System.out.print("Enter flatNo : " );
		int flatNo = br.readLine();		// error => Incompatable Type
	}
}


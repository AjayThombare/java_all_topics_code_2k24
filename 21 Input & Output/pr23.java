import java.io.*;
class P23{
	public static void main(String[] args)throws IOException{
	
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter company name : ");
		String compName = br.readLine();
                System.out.print("Enter Employee name : ");
		String empName = br.readLine();
		System.out.println("Enter compName : " + compName);
		System.out.println("Enter empName : " + empName);
        }
}

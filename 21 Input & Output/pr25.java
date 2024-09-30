import java.io.*;
class P25{
        public static void main(String[] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter company name : ");
                String compName = br.readLine();
                System.out.print("Enter employee name : ");
                String empName = br.readLine();
                System.out.print("Enter emplId : ");
                int empId = Integer.parseInt(br.readLine());
	     	System.out.println("company name : " + compName);	
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee Id : " + empId);

        }
}        

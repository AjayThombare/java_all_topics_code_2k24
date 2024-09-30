import java.io.*;
class P26{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter company name : ");
		String compName = br.readLine();

		System.out.print("Enter employeename : ");
		String empName = br.readLine();

		System.out.print("Enter employee Id : ");
		int empId = Integer.parseInt(br.readLine());

		System.out.print("Enter employee salary : ");
		double empSal = Double.parseDouble(br.readLine());

		System.out.println("Company Name :" + compName);
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee Id : " + empId );
		System.out.println("Employee Salary : " + empSal);
	}
}


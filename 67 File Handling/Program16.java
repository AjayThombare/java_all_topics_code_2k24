import java.io.*;
class Employee implements Serializable{
	int empId;
	String empName;
	Employee(int empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}
}
class SerialDemo16{
	public static void main(String [] args)throws IOException{
		FileOutputStream fos = new FileOutputStream("EmployeeData.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		Employee obj1 = new Employee(1,"Vaibhav");
		Employee obj2 = new Employee(2,"Rushi");

		oos.writeObject(obj1);
		oos.writeObject(obj2);

		oos.close();
		fos.close();
	}
}


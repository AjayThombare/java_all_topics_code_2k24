import java.io.*;
class Employee implements Serializable{
	int empId;
	String empName;
	Employee(int empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}
}
class SerialDemo17{
	public static void main(String [] args){
		FileOutputStream fos = new FileOutputStream(EmployeeData.txt);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		Employee obj1 = new Employee(1,"Vaibj=hav");
		Employee obj2 = new Employee(2,"Rohan");

		oos.close();
		fos.close();
	}
}
class DeserialDemo17{
	public static void main(String [] args)throws IOException{
		FileInputStream fis = new FileInputStream("EmployeeData.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Employee fileObj1 = ois.readObject();
		Employee fileObj2 = ois.readObject();

		Syatem.out.println(fileObj1.empId);
		System.out.println(fileObj1.empNmae);

		System.out.println(fileObj2.empId);
		System.out.println(fileObj2.empNmae);
	}
}



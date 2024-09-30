import java.util.Scanner;
class P11{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter name  : ");
                String name = sc.next();
                System.out.print("Enter College name :");
                String clgName = sc.next();
                System.out.print("Enter Student id : ");
                int studid = sc.nextInt();
                System.out.print("Enter CGPA : ");
                float marks = sc.nextFloat();

		System.out.println("Student name : " + name);
		System.out.println("College name : "+clgName);
		System.out.println("Student id : "+ studid);
		System.out.println("Marks : "+marks);

        }
}
            

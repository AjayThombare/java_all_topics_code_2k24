class Demo1{
	Demo1(){
		System.out.println("Demo1 Constructor");
	}
	public void finalize(){
		System.out.println("Object gheun jatoy");
	}
}
class Client1{
	static void fun(){
		Demo1 Obj1 = new Demo1();
		Demo1 Obj2 = new Demo1();
	}
	public static void main(String [] args){
		System.out.println("Start code");
		fun();
		System.out.println("End main");
	}
}


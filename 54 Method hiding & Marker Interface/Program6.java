class Parent6{
	static void fun(){
		System.out.println("In fun-Parent");
	}
}
class Child6 extends Parent6{
	void fun(){
		System.out.println("In fun-Child");
	}
}
class Client6{
	public static void main(String [] args){
		Parent6 obj = new Child6();
		obj.fun();
	}
}

		

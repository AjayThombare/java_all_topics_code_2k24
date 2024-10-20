class Parent16{
	void fun(){
		System.out.println("In fun - Parent");
	}
}
class Child extends Parent16{
	void fun(){
		System.out.println("In fun - Child");
	}
	void run(){
		System.out.println("In run - Child");
	}
	public static void main(String [] args){
		Parent16 obj = new Child();	// true 
	}
}




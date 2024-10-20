class Parent17{
	void fun(){
		System.out.println("In fun - Parent");
	}
	void run(){
		System.out.println("In run - Parent");
	}
}
class Child extends Parent17{
	void fun(){
		System.out.println("In fun - Child");
	}
	void run(){
		System.out.println("In run - Child");
	}
	void mun(){
		System.out.println("In mun - Child");
	}
}
class Client{
	public static void main(String [] args){
		Parent17 obj = new Parent17();
	        obj.fun();	
	        obj.run();
		Child obj2 = new Child();
	        obj2.fun();	
	        obj2.run();	
	        obj2.mun();	
	}
}




class Parent{
	void fun(){
		System.out.println("in fun Parent");
	}
	void run(){
		System.out.println("in run Parent");
	}
	void gun(){
		System.out.println("in gun Parent");
	}
}
class Child extends Parent{	
	void fun(){
		System.out.println("in fun Child");
	}
	void gun(){
		System.out.println("in gun Child");
	}
}
class Client{
	public static void main(String [] args){
		Parent c = new Child();
		c.fun();
		c.run();
		c.gun();
	}
}




class Parent{
	void fun(){
		System.out.println("in fun Parent");
	}
	void run(){
		System.out.println("in run Parent");
	}
}
class Child extends Parent{	
	/*void fun(){
		System.out.println("in fun Child");
	}
	void run(){
		System.out.println("in run Child");
	}*/
	void mun(){
		System.out.println("in mun Child");
	}
}
class Client{
	public static void main(String [] args){
		Parent p = new Parent();
		p.fun();
		p.run();
		Child c = new Child();
		c.fun();
		c.run();
		c.mun();
	}
}




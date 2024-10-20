class Parent{
	void fun(){
		System.out.println("in fun Parent");
	}
	void run(){
		System.out.println("in run Parent");
	}
}
class Child extends Parent{	
	void mun(){
		System.out.println("in mun Child");
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
		c.mun();
		c.gun();
	}
}




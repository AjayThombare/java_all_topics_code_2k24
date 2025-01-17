class Parent{
	void fun()throws InterruptedException{
		System.out.println("In fun-Parnt");
	}
}
class Chilld extends Parent{
	void fun()throws InterruptedException{
		System.out.println("In fun-Child");
	}
}
class Client21{
	public static void main(String [] args){
		Parent obj = new Child();
		//obj.fun();
	}
}


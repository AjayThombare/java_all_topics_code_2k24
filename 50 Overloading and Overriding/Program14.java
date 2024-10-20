class Parent{
	final Object fun(){
		return new Object();
	}
}
class Child extends Parent{
	String fun(){
		return new String("Shashi");
	}
	public static void main(String [] args){
		Parent p = new Child();
		p.fun();
	}
}


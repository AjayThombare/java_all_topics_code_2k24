class Parent{
	private Object fun(){
		return new Object();
	}
}
class Child extends Parent{
	private String fun(){
		return new String("Shashi");
	}
	public static void main(String [] args){
		Parent p = new Child();
		p.fun();
	}
}


class Parent4{
	void career(){
		System.out.println("software engg");
	}
	void flat();
	abstract void marry();
}
class Child4 extends Parent4{
	void marry(){
		System.out.println("Disha Patni");
	}
}
class Client4{
	public static void main(String [] args){
		Parent4 obj = new Child4();
		obj.career();
		obj.marry();
	}
}


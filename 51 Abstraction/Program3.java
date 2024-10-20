class Parent3{
	void career(){
		System.out.println("Software engg");
	}
	abstract void marry();

}
class Child3 extends Parent3{
	void marry(){
		System.out.println("Disha Patni");
	}
}
class Client3{
	public static void main(String [] args){
		Parent3 obj = new Child3();
		obj.career();
		obj.marry();
	}
}

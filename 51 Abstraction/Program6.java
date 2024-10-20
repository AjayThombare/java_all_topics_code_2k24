abstract class Parent6{
	abstract void career();
	abstract void flat();
	abstract void marry();
}
class Child6 extends Parent6{
	void marry(){
		System.out.println("Disha Patni");
	}
}
class Client6{
	public static void main(String [] args){
		Parent6 obj = new Child6();
		obj.career();
		obj.marry();
	}
}


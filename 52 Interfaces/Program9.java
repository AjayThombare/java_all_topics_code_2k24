interface Parent9{
	void career();
	void marry();
}
class Child9 implements Parent9{

	public void career(){
		System.out.println("Reel-Star");
	}
	public void marry(){
		System.out.println("Mamachi mulgi");
	}
}
class Client9{
	public static void main(String [] args){
		Parent9 obj = new Child9();
		obj.career();
		obj.marry();
	}
}


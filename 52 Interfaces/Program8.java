interface Parent8{
	void career();
	void marry();
}
class Child8 implements Parent8{
	void career(){
		System.out.println("Reel-Star");
	}
	void marry(){
		System.out.println("Mamachi mulgi");
	}
}
class Client{
	public static void main(String [] args){
		Parent8 obj = new Child8();
		obj.career();
		obj.marry();
	}
}


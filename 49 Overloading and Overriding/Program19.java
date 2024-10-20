class Parent19{
	String marry(String str){
		System.out.println(str);
		return str;
	}
}
class Child19 extends Parent19{
	void marry(String str){
		System.out.println(str);
	}
}
class Client19{
	public static void main(String [] args){
		Parent19 p = new Child19();
		p.marry("Alia Bhat");
	}
}



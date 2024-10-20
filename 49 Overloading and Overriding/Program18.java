class Parent18{
	void marry(String str){
		System.out.println(str);
	}
}
class Child18 extends Parent18{
	void marry(String str){
		System.out.println(str);
	}
}
class Client18{
	public static void main(String [] args){
		Parent18 p = new Child18();
		p.marry("Alia Bhat");
	}
}


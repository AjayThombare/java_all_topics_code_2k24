class Outer10 {
	class Inner1{
	}
	class Inner2{
	}
	public static void main(String [] args){
		Outer10 obj1 = new Outer10();
		Outer10 obj2 = new Outer10();
		Inner1 innerObj = obj1.new Inner1();
	}
}



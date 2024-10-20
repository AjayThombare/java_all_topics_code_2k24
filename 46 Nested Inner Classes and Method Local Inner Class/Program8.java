class Outer {
	class Inner1{
		class Inner2{
		}
	}
	public static void main(String [] args){
		Outer obj1 = new Outer();
		Outer obj2 = new Outer();
		Inner1 innerObj = obj1.new Inner1();
	}
}



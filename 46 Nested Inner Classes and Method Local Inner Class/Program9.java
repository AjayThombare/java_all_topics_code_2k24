class Outer9{
	class Inner1{
		class Inner2{
			class Inner3{
			}
		}
	}
	public static void main(String [] args){
		Outer9 obj1 = new Outer9();
		Outer9 obj2 = new Outer9();
		Inner1 innerObj = obj1.new Inner1();
	}
}



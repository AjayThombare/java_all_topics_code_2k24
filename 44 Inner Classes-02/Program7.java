class Outer {
	class Inner{
		Inner(){
			System.out.println("In Inner constructor");
		}
	}
	public static void main(String[] args){
		//Outer outObj = new Outer();
		//Inner obj = outObj.new Inner();
		Inner obj = new Outer().new Inner();
	}
}


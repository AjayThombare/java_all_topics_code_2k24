class Outer {
	class Inner{
		Inner(){
			System.out.println("in Inner Constructor");
		}
	}
	public static void main(String [] args){
		Inner obj = new Inner();
	}
}


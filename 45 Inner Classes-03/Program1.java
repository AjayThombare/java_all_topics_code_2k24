class Outer{
	class Inner{
		Inner(){
			System.out.println("Inner Connstructor");
		}
	}
	public static void main(String [] args){
		Inner obj = new Outer().new Inner();
	}
}


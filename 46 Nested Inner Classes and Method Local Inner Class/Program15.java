class Outer15{
	void fun(){
		System.out.println("In fun");
		class Inner{
			Inner(){
				System.out.println("Constructor Inner");
			}
		}
		Inner obj = new Inner();
	}
	public static void main(String [] args){
		Outer15 obj = new Outer15();
		obj.fun().new Inner();
	}
}



class Outer14{
	void fun(){
		System.out.println("In fun");
		class Inner{
			Inner(){
				System.out.println("Constructoor Inner");
			}
		}
		Inner obj = new Inner();
	}
	public static void main(String [] args){
		Outer14 obj = new Outer14();
		obj.fun();
	}
}


class Outer16{
	void fun(){
		System.out.println("in fun");
		class Inner{
			Inner(){
				System.out.println("Constructor Inner");
			}
		}
		Inner obj = new Inner();
	}
	public static void main(String [] args){
		Outer16 obj = new Outer16();
		obj.fun();
	}
}


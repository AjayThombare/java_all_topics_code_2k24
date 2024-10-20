class Demo6{
	void fun(){
		System.out.println("In fun Demo");
	}
}
class Outer6{
	public static void main(String [] args){
		Demo6 obj3 = new Demo6(){
			void fun(){
				System.out.println("In fun-Outer$1");
			}
		};
		obj3.fun();
	}
}



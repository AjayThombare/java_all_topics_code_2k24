class Demo9{
	void fun(){
		System.out.println("In fun Demo");
	}
}
class Outer9{
	public static void main(String [] args){
		Demo9 obj = new Demo9(){
			void fun(){
				System.out.println("In fun-Outer$1");
			}
		};
		obj.fun();
	}
}


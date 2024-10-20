class Demo22{
	void fun(){
		System.out.println("In fun");
	}
}
class Outer22{
	public static void main(String [] args){
		Demo22 obj = new Demo22(){
		};
		obj.fun();
	}
}


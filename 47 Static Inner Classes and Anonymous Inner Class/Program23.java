class Demo23{
	void fun(){
		System.out.println("In fun");
	}
}
class Outer23{
	public static void main(String [] args){
		Demo23 obj = new Demo23(){
		};
		Demo23 obj2 = new Demo23(){
		};
	}
}




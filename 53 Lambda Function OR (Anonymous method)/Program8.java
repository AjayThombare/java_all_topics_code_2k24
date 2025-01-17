class Demo8{
	void fun(){
		System.out.println("In fun-Demo");
	}
}
class Outer8{
	public static void main(String [] args){
		Demo8 obj = new Demo8(){

		};
		obj.fun();
	}
}


class Demo7{
	void fun(){
		System.out.println("In fun-Demo");
	}
}
class Outer{
	public static void main(String [] args){
		Demo7 obj = new Outer(){

		};
	}
}



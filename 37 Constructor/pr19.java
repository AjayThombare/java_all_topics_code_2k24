class Demo{
	Demo(int x){
		System.out.println("In constructor");
	}
	void fun(){
		System.out.println("In fun method");
	}
}
class ConstrDemo{
	public static void main(String [] args){

		System.out.println("Start main");
                Demo obj = new Demo(10.5f);
                System.out.println("End main");
	}
}


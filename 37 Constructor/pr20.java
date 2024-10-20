class Demo{
	int x = 10;

	Demo(int x){
		System.out.println("In constructor");
		return 10;
	}
	void fun(){
		System.out.println("In fun method");
	}
}
class ConstrDemo{
	public static void main(String [] args){

		System.out.println("Start main");
                Demo obj = new Demo();
                System.out.println("End main");
	}
}


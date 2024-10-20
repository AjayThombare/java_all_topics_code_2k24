class Demo{
	int x = 10;
	Demo(){
		System.out.println("In No-args Constructor");
	}
	Demo(int x){
		System.out.println("in Paremeterized Constructor");
	}
	public static void main(String [] args){
		Demo obj = new Demo(); //Demo(obj1)
	
	}
}


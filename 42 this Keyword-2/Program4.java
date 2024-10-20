class Demo{
	int x = 10;
	int y = 20;
	Demo(){
		System.out.println("Constructor-1");
	}
	Demo(){
		System.out.println("Constructor-2");
	}
	Demo(){
		System.out.println("Constructor-3");
	}
	public static void main(String [] args){
		Demo obj = new Demo();
	}
}




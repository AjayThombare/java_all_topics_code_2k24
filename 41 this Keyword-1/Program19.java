class Demo19{
	int x = 10;
	Demo19(){
		super();
		this(10);
		System.out.println("In no-args Constructor");
	}
	Demo19(int x){	
		System.out.println("In para-1 Constructor");
	}
	Demo19(int x, int y){	
		System.out.println("In para-2 Constructor");
	}
	public static void main(String [] args){
		Demo19 obj = new Demo19();

		}
}




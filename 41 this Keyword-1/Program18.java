class Demo18{
	int x = 10;
	Demo18(){
		this(10);
		super();
		System.out.println("In no-args Constructor");
	}
	Demo18(int x){	
		System.out.println("In para-1 Constructor");
	}
	Demo18(int x, int y){	
		System.out.println("In para-2 Constructor");
	}
	public static void main(String [] args){
		Demo18 obj = new Demo18();

		}
}




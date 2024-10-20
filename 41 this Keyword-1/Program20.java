class Demo20{
	int x = 10;
	Demo20(){
		this(10);
		System.out.println("In no-args Constructor");
	}
	Demo20(int x){
		this(10,20);	
		System.out.println("In para-1 Constructor");
	}
	Demo20(int x, int y){	
		System.out.println("In para-2 Constructor");
	}
	public static void main(String [] args){
		Demo20 obj = new Demo20();

		}
}




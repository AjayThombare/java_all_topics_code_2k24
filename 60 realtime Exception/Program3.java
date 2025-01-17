class OrderDelayedException extends Exception{
	OrderDelayedException(String str){
		super(str);
	}
}
class Zomato{
	boolean rainStatus = true;
	boolean rainCheck(){
		if (rainStatus == true){
			return rainStatus;
		}
		else{
			return rainStatus;
		}
	}
	void order(String food)throws OrderDelayedException{
		boolean val = rainCheck();
		if(val==true){
			throw new OrderDelayedException("Order cancelled due to heavy rainfall");
		}
		System.out.println("Preapirng order " + food);
	}
}
class User3{
	public static void main(String [] args)throws OrderDelayedException{
		Zomato obj = new Zomato();
		obj.order("Biryani");
	}
}



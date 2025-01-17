class OrderDelayedException extends Exception{
	OrderDelayedException(String str){
		super(str);
	}
}
class Zomato{
	boolean rainStatus = true;
	boolean rainCheck(){
		if(rainStatus==true){
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
		System.out.println("Preparing order " + food);
	}
}
class User6{
	public static void main(String [] args){
		Zomato obj = new Zomato();
		try{
			obj.order("Biryani");
		}catch(OrderDelayedException ode){
			System.out.println(ode.getMessage());
		}
	}
}


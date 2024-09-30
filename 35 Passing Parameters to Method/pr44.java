class Demo44{
	Demo44 fun(){
		
		System.out.println("In Fun");
		return new Demo44();
	}
	public static void main(String [] args){
		Demo44 obj = new Demo44();
		System.out.println(obj.fun());
	}
}


class Switch4{
	public static void main(String[] args){
		String friend = "Rohan";
		System.out.println("Before Switch");
	
		switch (friend){
			case "Rahul":
				System.out.println("Army");
				break;
			case "vaibhav":
				System.out.println("Bajaj");
				break;
			case "Rushi":
				System.out.println("Mahindra");
				break;
			case "Rohan":
				System.out.println("Student");
				break;
			default:
				System.out.println("In Default state");
		}
		System.out.println("After Switch");
	}
}


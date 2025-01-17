interface Demo24{
	void m1();
}
class Outer24{
	public static void main(String [] args){
		Demo24 obj = () ->{
			System.out.println("In m1-Outer$1");
		}
	}
}


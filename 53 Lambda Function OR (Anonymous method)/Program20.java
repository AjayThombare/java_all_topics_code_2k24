interface Demo20{
	void m1();
}
class Outer20{
	public static void main(String [] args){
		Demo20 obj = m1(); ->{System.out.println("In m1-Outer$1");}
		obj.m1();
	}
}


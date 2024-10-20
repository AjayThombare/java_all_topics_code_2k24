class Outer17{
	void fun(){
		class Inner{
			Inner(){
				System.out.println("Constructor Inner");
			}
			void run(){
				class Inner2{
				}
				Inner2 obj = new Inner2();
			}
		}
		Inner obj = new Inner();
	}
	public static void main(String[] args){
		Outer17 obj = new Outer17();
		obj.fun();
	}
}


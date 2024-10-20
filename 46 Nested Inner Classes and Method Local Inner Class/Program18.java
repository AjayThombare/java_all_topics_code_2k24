class Outer18{
	void fun(){
		System.out.println("In fun");
		class Inner{
			Inner(){
				System.out.println("Constuctor Inner");
			}
			void run(){
				class Inner2{
				}
				class Inner3{
				}
				Inner2 obj = new Inner2();
			}
		}
		class Inner5{
		}
		Inner obj = new Inner();
		obj.run();
	}
	public static void main(String [] args){
		Outer18 obj = new Outer18();
		obj.fun();
	}
}


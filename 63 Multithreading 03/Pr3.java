class NameDemo extends Thread{
	public void run(){
		System.out.println(getName());
		System.out.println(Thread.currentThread().getName());
	}
}
class Client3{
	public static void main(String [] args){
		System.out.println(Thread.currentThread().getName());
		NameDemo t1 = new NameDemo();
		t1.setName("Ashish");
		t1.start();
		System.out.println(t1.getName());
	}
}


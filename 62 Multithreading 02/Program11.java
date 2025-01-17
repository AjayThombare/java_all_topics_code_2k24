class ThreadName extends Thread{
	public void run(){
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		System.out.println(getName());
	}
}
class Client11{
	public static void main(String [] args){
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
	}
}


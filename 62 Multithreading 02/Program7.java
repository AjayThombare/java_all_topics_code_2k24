class MyThread extends Thread{
	public void run(){
		for(int i=0; i<7; i++){
			System.out.println(Thread.currentThread().getName());
		}
	}
}
class Client7{
	public static void main(String [] args){
		MyThread mt1 = new MyThread();
		mt1.start();
		
		MyThread mt2 = new MyThread();
		mt2.start();
		
		MyThread mt3 = new MyThread();
		mt3.start();
	}
}


class ThreadDemo extends Thread{
        static Thread mainThread = null;
	public void run(){
        	System.out.println("In run");
              	System.out.println(mainThread.getName());
		System.out.println(getName());                                  
        }
        public static void main(String [] args)throws InterruptedException{
        	mainThread = Thread.currentThread();
		System.out.println(mainThread + "1");
		ThreadDemo obj = new ThreadDemo();
		obj.start();

   
        }
}

class ThreadDemo extends Thread{
        public void run(){
                System.out.println(getPriority());
                System.out.println(Thread.currentThread().getPriority());
        }
}
class Client9{
        public static void main(String [] args){
                System.out.println(Thread.currentThread().getPriority());
                ThreadDemo tm = new ThreadDemo();
                System.out.println(tm.getPriority());
              	tm.setPriority(11);
	      	tm.start();
        }
}

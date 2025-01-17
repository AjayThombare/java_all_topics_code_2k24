class ThreadDemo extends Thread{
        public void run()throws InterruptedException{
                for(int i=0; i<10; i++){
                        System.out.println("In run");
                        Thread.sleep(2000);
                }
        }
}
class Client16{
        public static void main(String [] args)throws InterruptedException{
                ThreadDemo td = new ThreadDemo();
                td.start();
                for(int i=0; i<10; i++){
                        System.out.println("In main");
                        Thread.sleep(2000);
                }
        }
}


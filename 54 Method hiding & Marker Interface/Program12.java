class Parent12{
        static int x = 10;
        static void fun(){
                System.out.println("In fun-Parent12");
        }
}
class Child12 extends Parent12{
        static int x  = 20;
        static void fun(){
                System.out.println("In fun-Child12");
        }
}
class Client12{
        public static void main(String [] args){
                Parent12 obj1 = new Parent12();
                obj1.fun();
                System.out.println(obj1.x);

                Child12 obj2 = new Child12();
                obj2.fun();
                System.out.println(obj2.x);

                Parent12 obj3 = new Parent12();
                obj3.fun();
                System.out.println(obj3.x);
        }
}




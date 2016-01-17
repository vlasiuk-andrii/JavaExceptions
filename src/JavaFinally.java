public class JavaFinally {
    public static void main(String arg[]){
        System.out.println(JavaFinally.myMethod());
    }
    public static int myMethod(){
        try{
            System.out.println("Before return");
            return 112;
            //System.out.println("After return");
        }
        finally{
            System.out.println("This is finally block");
            System.out.println("Finally block ran even after return statement");
        }
    }
}
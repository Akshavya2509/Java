package ExceptionHandling;

public class throwsKeyword {
    public static void main(String[] args) {
        func1();
    }
    // throws tells that the function might throw an exception
    static void func1(){
        int a = 5;
        int b = 3;

        int c = a/ b;

        System.out.println(c);

        try{
            fun2();
        }
        catch(Exception e){
            System.out.println(e.getMessage() + " occured, please check your code");
        }
    }
    static void fun2() throws ArithmeticException{
        boolean isDanger = true;
        if(isDanger){
            throw new ArithmeticException("Danger was coming");
        }
    }
}

package ExceptionHandling;

public class sleep {
    // Thread.sleep is used to stop the process for some time

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
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    static void fun2() throws ArithmeticException{
        boolean isDanger = true;
        if(isDanger){
            throw new ArithmeticException("Danger was coming");
        }
    }
}

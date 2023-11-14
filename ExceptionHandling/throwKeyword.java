package ExceptionHandling;

public class throwKeyword {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        if(b == 0){
            try{
                throw new ArithmeticException("Divide by zero");
            }
            catch(ArithmeticException e){
                System.out.println(e.getMessage() + " occured, please check your code");
            }
        }
        else{
            int c = a/b;
            System.out.println(c);
        }
    }
    
    static void fun1(){
        boolean isDanger = true;
        if(isDanger){
            throw new ArrayIndexOutOfBoundsException("Danger was coming");
        }
    }
}

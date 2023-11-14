package ExceptionHandling;

public class MainClass {
    public static void main(String[] args) {
        
        try{
            int a = 5;
            int b = 0;

            int c = a/b;

            System.out.println(c);
        }

        catch(ArithmeticException e){
            System.out.println(e.getMessage() + " occured, please check your code");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index should be in range of 0 to size of array");
        }
        catch(IllegalArgumentException e){
            System.out.println("Check your casting carefully");
        }
        catch(Exception e){
            System.out.println("Some error occured");
        } finally{
            System.out.println("Sorry for the inconvenience");
        }
        // Finally is like default of a switch statement but the difference is that finally will always run.

        func1();
    }

    static void func1(){
        int a = 5;
            int b = 0;

            int c = a/b;

            System.out.println(c);
    }
}

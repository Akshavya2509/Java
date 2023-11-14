package OOPS;

public class Encapsulation {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.ram = 8;
        // l1.price = 1000; // This will give an error as price is private
        l1.setPrince(1000);
    }
    // public means universally accessible in the whole package
    public void doWork(){
        
    }
    // Accessible within its own class
    private void howToWork(){

    }
    // Protected is if u only want the children cxlasses to have its access
    protected void onlyVisibleTochild(){

    }
}

class Laptop{
    int ram;
    private int price;

    public void setPrince(int price){
        boolean isAdmin = false;

        if(isAdmin){
            this.price = price;
        }

        else{
            System.out.println("You are not an admin");
        }
    }

    public int getPrice(){
        return price;
    }
}

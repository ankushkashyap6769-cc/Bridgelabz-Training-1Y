package WrapperClasses;
public class ShoppingCart{
    public static void productsPrice(){
        String[] s = {"250","499","99","GDW"};
        try{
            for(String x: s){
                Integer.parseInt(x);
            }
        } catch (NumberFormatException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
        for(String y: s){
            System.out.println(y);
        }
    }

    static void main(String[] args) {
        productsPrice();
    }
}

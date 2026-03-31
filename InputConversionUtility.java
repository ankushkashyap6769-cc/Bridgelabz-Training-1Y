package WrapperClasses;
public class InputConversionUtility{
    public static int safeParseInt(String s){
        int num;
        try{
            num = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Exception Caught:" + e.getMessage());
            return -1;
        }
        return num;
    }

    static void main(String[] args) {
        System.out.println(safeParseInt("533&"));
    }
}

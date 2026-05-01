package ReGex;
import java.util.Scanner;
import java.util.regex.*;

public class CapitalOnly {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Sentence: ");
            String text= sc.nextLine();

            Pattern p=Pattern.compile("\\b[A-Z][a-zA-Z]*\\b");
            Matcher m=p.matcher(text);
            while(m.find()){
                if(!m.group().equals("The")){
                    System.out.println(m.group());
                }
            }
        }
}

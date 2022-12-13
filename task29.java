import java.util.Scanner;
public class task29 {
    public static void main(String[] args) {

        String Str = new String("automation");
        System.out.print("Input a suffix or prefix: ");
        Scanner console = new Scanner(System.in);
        String name1 = console.nextLine();
        if (name1.endsWith("-")){
            name1 = name1.replace("-","");
            System.out.println("Prefix " + Str.startsWith(name1) );
        }
        else{


            name1 = name1.replace("-","");
            System.out.println("Suffix " + Str.endsWith(name1) );
        } } }
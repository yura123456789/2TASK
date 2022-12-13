import java.util.Scanner;

public class Task27 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);//создание вводы с клавиатуры
      String str= sc.nextLine();//ввыодим с клавиатуры
      boolean bol = true;
      int len = str.length();//все строки
      if(len<6){//если меньше 6
          System.out.println(bol);//вывод
      }
      else//иначе
          System.out.println(bol=false);//False
    }
}

import java.util.Scanner;

public class task26 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);//создание ввода с клавиатуры
        int a = sc.nextInt();//вводим с клавиатуры
        int sum=0;//создание переменной с присвоением значений
        int per= 1;//создание переменной с присвоением значений
        int vtor=1;//создание переменной с присвоением значений
       while (a>=sum){//цикл заданного числа
            sum = per +vtor;
            per=vtor;
            vtor=sum;
            System.out.println(vtor);//вывод
        }
    }
}

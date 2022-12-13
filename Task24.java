public class Task24 {
    public  static void main(String args[]){
        int[] mas = {1,2,3};//Создаем массив
        int b=0;//создаем переменную инт с 0
        int c;//создание переменной
        for(int i = 0;i<mas.length;i++){//цикл
            c = mas[i] +b;//каждый элемент массива складываем с предыдущим
            b=c;//присваиваем b значение c
            System.out.println(c);//Вывод
        }
    }
}

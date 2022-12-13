public class task23 {
    public static void main(String args[])
    {
    int[] numbers = { 1,  3};//создаем массив
    int sum = 0;//присваиваем переменой 0
            for (int i = 0;i != numbers.length; i++){//цикл
        sum += numbers[i];//считаем сумму
    }
			if(sum%numbers.length==0){//если делиться то выводит true
        System.out.println ("True");
    }
		else{//иначе false
        System.out.println ("False");
    }
}
}

public class task21 {
    public static void main(String args[]) {
        String text = "qwerty";//создаем строковую переменную и присваиваем значение
        int n = 2;//создаем числовую переменную и присваиваем значение
        StringBuilder repeat = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {//создаем цикл text
            for (int j = 0; j < n; j++) {//создаем цикл для n
                 repeat.append(text.charAt(i));//возврощает значение через цикл
            }
        }
        System.out.println(repeat);//вывод
    }
}

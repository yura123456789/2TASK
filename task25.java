public class task25 {
    public static void main(String args[])
    {
        String str = "15,00000";
        String[] words = str.split(",");//оставляем все что после запятой
        System.out.println(words[1].length());//вывод
    }
}

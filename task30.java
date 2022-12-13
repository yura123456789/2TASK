public class task30 {
    public static void main(String[] args) {

        String resault = ""; // переменная вывода фигуры
        int number = 37; //вводимое число
        if(((3 + Math.sqrt(12 * number - 3)) / 6) % 1 != 0) // формула валидации прямоугольника
            System.out.println("Invalid");

        else{
            int temp = (int)((3 + Math.sqrt(12 * number - 3)) / 6);
            int heightOfHex = temp + temp - 1; //считаем высоту шестиугольника

            for(int i = 0; i < heightOfHex;){

                int repeatTimes = Math.abs(++i - temp);
                resault += " ".repeat(repeatTimes);
                resault += "o ".repeat(heightOfHex - repeatTimes);
                resault += "\n";

            }
            System.out.println(resault);
        }
    }
}

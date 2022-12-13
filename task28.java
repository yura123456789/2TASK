public class task28 {
    public static void main(String[] args) {

        String fistString = "firsb"; // создаем 2 строки для сравнения
        String secondString = "btecof";

        char[] fArray = fistString.toCharArray();  // помещаем символы строк в массив для удобства сравнения
        char[] sArray = secondString.toCharArray();


        if((fArray[0] == sArray[secondString.length() - 1]) && (sArray[0] == fArray[fistString.length() - 1]))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}

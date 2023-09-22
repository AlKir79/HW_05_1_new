import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        String strLine = new String();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        strLine = in.nextLine();
        String[] strArr = strLine.split(" ");
        int sum = 0;
        for (int i=0;i<strArr.length;i++){
            sum+=strArr[i].length();
        }
        System.out.println("Во введенной строке средняя длина слова "+sum/strArr.length);

    }

}

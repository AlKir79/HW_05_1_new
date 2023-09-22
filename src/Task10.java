import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = in.nextLine();
        String newStr = "";
        for (int i = 0; i < str.length() + 1; i++) {
            newStr = "";
            for (int j = 0; j < str.length() - i; j++) {
                newStr += " ";
            }
            newStr += str.substring(0, i);
            System.out.println(newStr);
        }
        for (int i = 1; i < str.length() + 1; i++) {
            newStr = "";
            newStr += str.substring(i, str.length());
            for (int j = 0; j < 0 + i; j++) {
                newStr += " ";
            }
            System.out.println(newStr);
        }
    }
}

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        String res = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку ");
        String str = in.nextLine();
        for (int i=0;i<str.length();i++){
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                res += String.valueOf((char)(str.charAt(i) + 32));
            } else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                res += String.valueOf((char)(str.charAt(i) - 32));
            } else if (str.charAt(i) >= 48 && str.charAt(i) <= 57){
                res += "_";
            }
        }
        System.out.println(res);
    }
}
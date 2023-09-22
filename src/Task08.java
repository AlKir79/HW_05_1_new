import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        String str = "";
        String res = "";
        String up = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Scanner in = new Scanner(System.in);
        str = in.nextLine();
        if (str.contains("_")) {
            System.out.println("Синтаксис С++ : ");
            for (int i=0;i<str.length();i++){
                if (up.contains(String.valueOf(str.charAt(i)))){
                    System.out.println("Смешанный синтаксис");
                    System.exit(0);
                }
                else {
                    if (str.charAt(i) == '_') {
                        res += String.valueOf((char)(str.charAt(i+1)-32));
                        i++;
                    } else {
                        res += String.valueOf(str.charAt(i));
                    }
                }
            }
        } else {
            System.out.println("Синтаксис Java : ");
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) < 91) {
                    res += "_" + String.valueOf((char)(str.charAt(i) + 32));
                } else {
                    res += String.valueOf(str.charAt(i));
                }
            }
        }
        System.out.println(res);

    }
}

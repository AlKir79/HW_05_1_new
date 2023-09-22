import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        String strLine = "";
        String gl = "aeiouy";
        String sogl = "bcdfghjklmnpqrstvwxyz";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        strLine = in.nextLine();
        String[] strArr = strLine.split(" ");
        for (int i=0;i< strArr.length;i++){
            if (gl.contains(String.valueOf(strArr[i].charAt(0)))&&sogl.contains(String.valueOf(strArr[i].charAt(strArr[i].length()-1)))){
                System.out.println(strArr[i]);
            }
        }
    }
}

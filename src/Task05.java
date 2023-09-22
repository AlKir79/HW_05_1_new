import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        String strLine = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        strLine = in.nextLine();
        String[] strArr = strLine.split("[\\s:]");
        for (int i=0;i< strArr.length;i++){
            if (strArr[i].length()%2==0){
                System.out.println(strArr[i]);
            }
        }
    }

}


import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        String str="";
        StringBuffer strBuf = new StringBuffer(str);
        strBuf.ensureCapacity(1000);
        for (int i=0;i<1000;i++){
            strBuf.append((char)i);
        }
        System.out.println("Введите позицию символа");
        Scanner in = new Scanner(System.in);
        int position = in.nextInt();
        System.out.println((int) strBuf.charAt(position-1));
    }
}

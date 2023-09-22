import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class Task09 {
    public static void main(String[] args) {
        String str1 = "Аз есмь строка, живу я, мерой остр";
        String str2 = "За семь морей ростка я вижу рост";

        str1 = str1.replaceAll("[^а-яА-Яa-zA-Z0-9]","");
        str2 = str2.replaceAll("[^а-яА-Яa-zA-Z0-9]","");
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char charStr1[] = str1.toCharArray();
        char charStr2[] = str2.toCharArray();
        Arrays.sort(charStr1);
        Arrays.sort(charStr2);
        if (Arrays.equals(charStr1,charStr2)){
            System.out.println("YES");
        }
        else System.out.println("NO");

    }
}

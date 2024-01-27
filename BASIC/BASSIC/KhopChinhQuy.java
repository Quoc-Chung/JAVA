import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KhopChinhQuy{
    public static void main(String[] args){
       String chuoi = "apple, banana, orange, grape";
       String regex = "\\b\\w+\\b";
       /* Yao mot doi tuong tu bieu thuc chinh quy  */
       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher(chuoi);

       while(matcher.find()){
        System.out.println("Chuỗi con khớp: " + matcher.group());
       }
    }
}
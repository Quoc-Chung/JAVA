import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class regexx{
    public static void main(String[] args){
        // Chuỗi đầu vào 
        String input = "Hello123 World456";

        // Biểu thức chính quy 
        String regex = "\\w+\\d+";

        // Tạo đối tượng Pattern từ biểu thức chính quy 
        Pattern pattern = Pattern.compile(regex);

        // Tạo đối tượng matcher 
        Matcher matcher = pattern.matcher(input);
       
        // Kiểm tra sự khớp và in thông báo
        if (matcher.matches()) {
            System.out.println("Chuỗi khớp với biểu thức chính quy.");
        } else {
            System.out.println("Chuỗi không khớp với biểu thức chính quy.");
        }

         // Tìm kiếm và in các chuỗi khớp
         while (matcher.find()) {
            System.out.println("Đã tìm thấy: " + matcher.group());
        }

        // Thay thế các chuỗi khớp và in kết quả
        String replacedString = matcher.replaceAll("###");
        System.out.println("Chuỗi sau khi thay thế: " + replacedString);
        
    }
}
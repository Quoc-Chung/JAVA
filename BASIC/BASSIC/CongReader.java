import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CongReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nhap ten cua ban :");
        String name = reader.readLine();
                                                                                    
        System.out.print("Ten cua  ban la " + name);                    
        reader.close();                                                                                                                                                                                                                                                                                                                    
    }                                                                                                       
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
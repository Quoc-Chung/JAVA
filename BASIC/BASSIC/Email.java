import java.util.*;
public class Email{
    public void EmailTheoTen(String s){
        String ss = s.toLowerCase();
        StringBuilder sb = new StringBuilder(); 
        String[] tmp = ss.split("\\s+");
        sb.append(tmp[tmp.length-1]);
        for (int i=0;i<tmp.length-1;i++){
           sb.append(tmp[i].charAt(0));
        }
        sb.append("@gmail.com");
        System.out.println(sb);
    }
    public void EmailTheoTenSau(String s){
        String ss= s.toLowerCase();
        StringBuilder sb = new StringBuilder(); 
        String[] tmp = ss.split("\\s+");
        for (int i=0;i<tmp.length-1;i++){
           sb.append(tmp[i].charAt(0));
        }
        sb.append(tmp[tmp.length-1]);
        sb.append("@gmail.com");
        System.out.println(sb);
        }
    /* - tu1111 **Quo***c&  *^^### CH----UNG-----  ===> Tư Quoc Chung */
    public String LoaiBoDacBiet(String s){
        String tmp = new String();
        for (char x : s.toCharArray()){
            if(Character.isAlphabetic(x)){
               tmp += x; 
            }
        }
        return tmp;
    }
    public void ChuanHoaTen(String TenXau){
        String TenXauThuong = TenXau.toLowerCase();
        String[] TenXauTach = TenXauThuong.split("\\s+");
        StringBuilder TenDep = new StringBuilder();
        for (int i=0;i<TenXauTach.length;i++){
            String tmp = LoaiBoDacBiet(TenXauTach[i]);
            TenXauTach[i] ="";
            if(tmp.length()>0){
                TenXauTach[i] = tmp;
                String tmp1 = Character.toUpperCase(TenXauTach[i].charAt(0)) + TenXauTach[i].substring(1);
                TenDep.append(tmp1).append(" ");
            }
        }
        System.out.println(TenDep);
    }

    public String LoaiBoKhoangTrang(String s){
        String tmp = new String();
        for (char x : s.toCharArray()){
            if(!Character.isWhitespace(x)){
               tmp += x;
            }      
        }
         return tmp;
    }
    public static void main(String[] args){
        Email email = new Email();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        
        // email.EmailTheoTenSau(s);
        // email.ChuanHoaTen(s);
        String tmp = email.LoaiBoKhoangTrang(s);
        System.out.println(tmp);
        scanner.close();
    }

}
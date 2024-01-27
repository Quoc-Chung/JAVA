import java.util.*;
public class Chuoi {
    public int DemKiTuThuong(String s) {
        int dem = 0;
        char[] charArray = s.toCharArray();
        for (char x : charArray) {
            if (Character.isLowerCase(x)) {
                dem++;
            }
        }
        return dem;
    }

    public void ChuyenVeInThuong(String s) {
        char[] charArray = s.toCharArray();
        
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isUpperCase(charArray[i])) {
                charArray[i] = Character.toLowerCase(charArray[i]);
            }
        }
        for (char x : charArray) {
            System.out.print(x);
        }
    }
    public void ChuyenVeDangInHoa(String s){

        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLowerCase(charArray[i])) {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        for (char x : charArray) {
            System.out.print(x);
        }
    }
    public char ChuyenKiTuSangHoa(char c) {
        return Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
    }
    public StringBuilder Dao_Nguoc_Chu_Chuoi(String s){
        String[] tmp = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = tmp.length-1 ;i>=0 ;i--){
           sb.append(tmp[i]).append(" ");
        }
        return sb;
    }


    public boolean Check(ArrayList<Character> special, char kiTu) {
        for (char x : special) {
            if (x == kiTu) {
                return true;
            }
        }
        return false;
    }
    public void PhanLoaiKiTu(String s){
        char[] tmp= s.toCharArray();

        int dem1=0,dem2=0;
        ArrayList<Character> specialList = new ArrayList<>();
        
        for(int i=0;i<tmp.length;i++){
            if(Character.isDigit(tmp[i])){
                 dem1++;
            }
            else if(Character.isAlphabetic(tmp[i])){
                dem2++;
            }
            else{ 
              if(!Check(specialList, tmp[i])){
                 specialList.add(tmp[i]);
              }
            }
         }
        System.out.println(dem1+" "+dem2+" "+specialList.size());
    }
    /* = Dem so tu trong xau thi dung split("\\s+") - */
    public void ChuanHoaTen(String s){
        String tmp = s.toLowerCase();

        String[] words = tmp.split("\\s+");
        StringBuilder sb = new StringBuilder(); 
        for (int i=1;i<words.length;i++){
            words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
           sb.append(words[i]).append(" ");
        }
        words[0] = words[0].toUpperCase();
        sb.append(" , ").append(words[0]);
        System.out.println(sb);

    }
    
    
    public static void main(String[] args){
        Chuoi c = new Chuoi ();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot chuoi : ");
         String s = scanner.nextLine().trim();

        // int dem =c.DemKiTuThuong(s);
        // System.out.println("So luong ki tu thuong trong chuoi : "+ dem);

        // c.ChuyenVeInThuong(s);
        // c.ChuyenVeDangInHoa(s);
        // char a  = scanner.next().charAt(0);
        // a = c.ChuyenKiTuSangHoa(a);
        // System.out.println("Ki tu chuyen  sang hoa la : "+ a);

        // System.out.println("Chuoi dao nguoc la : "+c.Dao_Nguoc_Chu_Chuoi(s));
        // c.PhanLoaiKiTu(s);
        c.ChuanHoaTen(s);
        scanner.close();
    }
}

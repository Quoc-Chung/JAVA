import java.util.*;
public class Mezo {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(x);
        String s = scanner.nextLine();
        
        int vi_tri_dau =0;
        char[] tmp = s.toCharArray();
        for (int i=0;i<tmp.length;i++){
           if(tmp[i] =='L'){
              vi_tri_dau-=1;
           }
           if(tmp[i] =='R'){
            vi_tri_dau +=1;
           }
           if(vi_tri_dau!=0){
           }
        }
        scanner.close();
    }
}

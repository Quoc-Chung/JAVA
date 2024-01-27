package SoPhucFull;
import java.util.*;
public class SoPhuc{
   private float Thuc,Ao;
   
   private static Scanner scanner = new Scanner(System.in);

   public SoPhuc(){
       this.Thuc =1;
       this.Ao =-1;
   }
   public SoPhuc(float Thuc , float Ao){
       this.Thuc = Thuc;
       this.Ao =Ao;
   }
   public float getThuc(){
       return Thuc;
   }
   public float getAo(){
    return Ao;
   }

   public void  setThuc(float thuc){
    this.Thuc = thuc;
   }
   public void setAo(float Ao){
    this.Ao  = Ao;
   }
   public void Nhap(){
    System.out.print("\nNhap phan thuc :");
    Thuc = scanner.nextFloat();
    System.out.print("\nNhap phan ao :");
    Ao = scanner.nextFloat();
   }
   public void Xuat(){
          if(Ao >= 0){
            System.out.println(Thuc+" + " + Ao +"i");
        }
        else{
            System.out.println(Thuc+" " + Ao +"i");
        }
   }
   public SoPhuc Cong(SoPhuc A , SoPhuc B){
        SoPhuc result = new SoPhuc();
        result.Thuc=A.Thuc+B.Thuc;
        result.Ao=A.Ao+B.Ao;
        return result;
     }
    public  SoPhuc Tru(SoPhuc A, SoPhuc B) {
        SoPhuc result=new SoPhuc();
        result.Thuc = A.Thuc - B.Thuc;
        result.Ao = A.Ao - B.Ao;
        return result;
    }

    public  SoPhuc Nhan(SoPhuc A, SoPhuc B) {
        SoPhuc result = new SoPhuc();
        result.Thuc = A.Thuc * B.Thuc - A.Ao * B.Ao;
        result.Ao = A.Thuc * B.Ao + A.Ao * B.Thuc;
        return result;
    }

    public SoPhuc Chia(SoPhuc A, SoPhuc B) {
        SoPhuc result = new SoPhuc();
        float mau = B.Thuc * B.Thuc + B.Ao * B.Ao;
        result.Thuc = (A.Thuc * B.Thuc + A.Ao * B.Ao) / mau;
        result.Ao = (A.Ao * B.Thuc - A.Thuc * B.Ao) / mau;
        return result;
    }

     float TinhModun(){
        return (float)Math.sqrt(Thuc * Thuc + Ao * Ao);
    }
}

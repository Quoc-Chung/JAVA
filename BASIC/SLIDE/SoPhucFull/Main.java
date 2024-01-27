package SoPhucFull;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SoPhuc> arrayList = new ArrayList<>();
        System.out.print("\nNhap so luong so phuc:");
        int n = scanner.nextInt();

        System.out.println("NHAP CAC SO PHUC :");
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap so phuc thu " + (i + 1));
            SoPhuc tmp = new SoPhuc();
            tmp.Nhap();
            arrayList.add(tmp);
        }

        System.out.println("Danh sach cac so phuc :");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("--------");
            arrayList.get(i).Xuat();
        }

        TapSoPhuc ql = new TapSoPhuc();
        ql.TrungBinhCong(arrayList);
        ql.KhongCoPhanAo(arrayList);
        ql.SoPhucCoModunMax(arrayList);

        scanner.close();
    }
}

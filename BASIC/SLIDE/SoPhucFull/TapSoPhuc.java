package SoPhucFull;

import java.util.ArrayList;

public class TapSoPhuc {
    
    public void TrungBinhCong(ArrayList<SoPhuc> SoPhuc) {
        SoPhuc tmp = new SoPhuc(0, 0); // Khởi tạo với giá trị 0
        for (int i = 0; i < SoPhuc.size(); i++) {
            tmp.setThuc(tmp.getThuc() + SoPhuc.get(i).getThuc());
            tmp.setAo(tmp.getAo() + SoPhuc.get(i).getAo());
        }
        int n = SoPhuc.size();
        tmp.setThuc(tmp.getThuc() / n);
        tmp.setAo(tmp.getAo() / n);
    
        System.out.println("Trung binh cong cac so phuc:");
        tmp.Xuat();
    }  

    public void SoPhucCoModunMax(ArrayList<SoPhuc> SoPhuc) {
        float max = 0;
        int index = 0;
        for (int i = 0; i < SoPhuc.size(); i++) {
            if (SoPhuc.get(i).TinhModun() > max) {
                max = SoPhuc.get(i).TinhModun();
                index = i;
            }
        }
        System.out.print("So phuc co modun max : ");
        SoPhuc.get(index).Xuat();

    }

    public void KhongCoPhanAo(ArrayList<SoPhuc> SoPhuc) {
        int dem = 0;
        for (int i = 0; i < SoPhuc.size(); i++) {
            if ((int) SoPhuc.get(i).getAo() == 0) {
                dem++;
            }
        }
        System.out.println("\nSo luong so phuc khong co phan ao : " + dem);
    }

}

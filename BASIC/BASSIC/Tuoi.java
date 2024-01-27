import java.util.Scanner;

public class Tuoi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten cua ban");
        String ten = scanner.nextLine();

        System.out.println("Nhap tuoi cua ban:");
        int age = scanner.nextInt();

        scanner.close();
        System.out.println("Chao mung " + ten);
        System.out.println("Tuoi cua ban la :" + age);

    }

}

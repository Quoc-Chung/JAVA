
public class Test {
    public static void main(String[] args) {
        // Tạo một đối tượng Person
        Person[] a = new Person[2];
        a[0] = new Person();
        a[0].name = "Chung";
        a[0].age = 21;
        a[0].height = 1.7f;

        // In ra thông tin của đối tượng Person
        System.out.println(a[0].name);
        System.out.println(a[0].age);
        System.out.println(a[0].height);


        a[1] = new Person();
        a[1].name = "Duong";
        a[1].age = 21;
        a[1].height = 1.7f;

        // In ra thông tin của đối tượng Person
        System.out.println(a[1].name);
        System.out.println(a[1].age);
        System.out.println(a[1].height);
        System.out.println("Cu bi sai thoi ");

        for (int i=0;i<a.length;i++){
            System.out.println(a[i].name);
            System.out.println(a[i].age);
            System.out.println(a[i].height);
        }
    }
}

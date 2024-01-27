import java.util.*;
 class User{
    private String name;
    private int age;

    public User(String name , int age){
        this.name = name ; 
        this.age = age;
    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name ;
    }

    public void setAge(int age){
        this.age = age;
    }
}
public class DinhNghia {
    public static void main(String[] args){
        List<User> users = new ArrayList<>();
        users.add(new User("Chung", 18));
        users.add(new User("Thao", 17));
        users.add(new User("Ha", 20));
        users.add(new User("Kim", 20));

        for (var x : users){
            System.out.println(x.getName() + "  " +x.getAge());
        }
    }
}

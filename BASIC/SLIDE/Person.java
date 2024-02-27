public class Person {
   private int id;
   private String name; 
   private String adrress; 
   public Person(){
    id  = 5; 
    name ="Chung";
    adrress = "Ha Noi";
   }
   public  String getName (){
     return  name ;
   }
   public  void  name(){
      
   }
    public  void  Printf(){ 
        System.out.println("ID : "+ id  + " name : " + name + "Adrrress : "+ adrress);
    } 
    public static void main(String[] args){
        Person p = new  Person();
        p.Printf();
    }
}

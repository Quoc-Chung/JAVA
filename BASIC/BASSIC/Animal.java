
public class Animal{

        public void getName(String name){
            System.out.println("Name of Animal : "+name);
        }

}
class Dog extends Animal{
     public void getBreed(String breedName)
    {
        System.out.println("Breed Name : "+breedName);
    } 
}
class Program16
{  
    public static void main(String args[])
    {  
        Dog d=new Dog();  
        d.getName("Tommy");
        d.getBreed("Labrador"); 
    }
}
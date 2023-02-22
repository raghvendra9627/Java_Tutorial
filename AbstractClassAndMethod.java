abstract class Car{ 
    /*there is no compulsion for abstract class to contain 
     abstract methods(i.e. abstract class can have only normal methods as well)*/
    //abstract method can only be declared in a abstract class.    
    public abstract void fly();        
    public abstract void drive();
    public void playMusic(){
        System.out.println("Music playing....");
    }
}
abstract class WagonR extends Car{  
    /*It is compulsory to define abstract methods in sub class
      but if for some reason it could not be defined in sub class
      that class is also declare to be abstract class*/
    public void drive(){
        System.out.println("Driving.....");
    }
}
class UpdatedWagonR extends WagonR{
    public void fly(){
        System.out.println("Flying...");
    }
}


public class AbstractClassAndMethod {
    public static void main(String[] args) {
        UpdatedWagonR obj = new UpdatedWagonR(); //we cannot create object of abstract classes.
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}

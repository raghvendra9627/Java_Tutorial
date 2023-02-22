
class Human
{
    private int age;
    private String name;
    
    public void setAge(int age)
    {
        this.age = age;
    }
    public void getAge(){
        System.out.println("age is : "+age);
    } 
    public void setName(String name)
    {
        this.name = name;
    }
    public void getName(){
       System.out.println("name is :"+name);
    } 
}

public class encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setName("Raghvendra");
        obj.getName();
        obj.setAge(30);
        obj.getAge();
    }
}

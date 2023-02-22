enum Status{
    Running , Failed,Success;
}

public class Enum {
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s);

        // to get the index of the enum  elements (constant) we use ordinal() method.
        System.out.println(s.ordinal());

        //to get all values of the enum we use .values while refering to enum.
        Status ss[] = Status.values();  // it will put all the constants in enum in an array
        for(Status n : ss){
            System.out.println(n + " " + n.ordinal());
        } 
    }
}

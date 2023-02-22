class Students{
    String name;
    int marks;
}

public class array_of_object {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "rghvendra";
        s1.marks = 45;

        Students s2 = new Students();
        s2.name = "shreya";
        s2.marks = 56;

        Students s3 = new Students();
        s3.name = "shreyas";
        s3.marks = 53;

        Students students[] = new Students[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0;i<students.length;i++){
            System.out.println(students[i].name + " : " + students[i].marks);
        }
        
    }
}

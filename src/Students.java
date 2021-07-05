import java.util.Arrays;

public class Students{
        String stud_name;
        int stud_age;
        int marks[] = {67,54,88,98,74,70};


    void setDetails(String name,int age,int marks[]){
        stud_name = name;
        stud_age = age;
        this.marks[5] = marks[5];
    }
    void display(){
            System.out.println(stud_name);
            System.out.println(stud_age);
            System.out.println(Arrays.toString(marks));
    }
}

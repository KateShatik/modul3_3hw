/**
 * Created by Катя on 16.11.2016.
 */
public class Solution {
    public static void main(String[] args) {
        Course first = new Course(2701,"Math");//1
        Course second = new Course(30,"Music","Olga");//2
        Course third = new Course(0107,"English");//3
        Course fourth = new Course(90,"Java","Andrey");//4
        Course fifth = new Course(50,"Soft Skills","Petro");//5
        Student student1 = new Student("Oleg","Avdeenko",33);//6
        Course[] courses= {fifth,first};
        Student student2 = new Student("Avdeenko",courses);//7
        CollegeStudent collegeStudent1 = new CollegeStudent("Anna", "Boyko",21);//8
        CollegeStudent collegeStudent2 = new CollegeStudent("Inna", "Boyko",21);//9
        CollegeStudent collegeStudent3 = new CollegeStudent("Harvard", 1,1001);//10
        SpecialStudent specialStudent1= new SpecialStudent("Tolik","Ivanov",13);//11
        Course[] courses1= {fifth,first,second};
        SpecialStudent specialStudent2= new SpecialStudent("Petrovskiy",courses1);//12
        SpecialStudent specialStudent3= new SpecialStudent(131);//13
    }
}

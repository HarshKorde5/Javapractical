import java.util.*;
import student.StudentPer;

class StudentPackage
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name of student : ");
        String name = sc.next();

        System.out.println("Enter rollno of student : ");
        int roll = sc.nextInt();

        System.out.println("Enter class of student : ");
        int classs = sc.nextInt();

        System.out.println("Enter marks of m1 : ");
        int m1 = sc.nextInt();

        System.out.println("Enter marks of m2 : ");
        int m2 = sc.nextInt();

        System.out.println("Enter marks of m3 : ");
        int m3 = sc.nextInt();

        System.out.println("Enter marks of m4 : ");
        int m4 = sc.nextInt();

        System.out.println("Enter marks of m5 : ");
        int m5 = sc.nextInt();

        System.out.println("Enter marks of m6 : ");
        int m6 = sc.nextInt();


        StudentPer s = new StudentPer(name,roll,classs,m1,m2,m3,m4,m5,m6);
        s.calculatePercentage();
        s.display();
    }
}
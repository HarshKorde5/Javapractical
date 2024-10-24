package student;

class StudentInfo
{
    public String name;
    public int rollno,classs,m1,m2,m3,m4,m5,m6;
    public double percentage;

    public void display()
    {
        System.out.println("Name : "+this.name+"\nRoll No : "+this.rollno+"\nClass : "+this.classs+"\nPercentage : "+this.percentage);
    }
    
}


public class StudentPer extends StudentInfo
{
    public StudentPer(String sname,int roll,int c,int m11,int m12,int m13,int m14,int m15,int m16)
    {
        name = sname;
        rollno = roll;
        classs = c;
        m1 = m11;
        m2 = m12;
        m3 = m13;
        m4 = m14;
        m5 = m15;
        m6 = m16;
        
    }
    public void calculatePercentage()
    {
        percentage = (m1+m2+m3+m4+m5+m6)/6;
    }
}
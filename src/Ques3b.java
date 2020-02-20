//Ques 3b: Write a program using synchronization block

import java.util.*;

class Student
{
    String name = "";
    public int count = 0;

    public void StudentName(String student1, List<String> list)
    {
        synchronized(this)
        {
            name = student1;
            count++;
        }

        list.add(student1);
    }
}

public class Ques3b {

public static void main (String[] args)
    {
        Student student = new Student();
        List<String> list = new ArrayList<String>();
        student.StudentName("Aakash Sinha", list);
        System.out.println(student.name);

    }
}

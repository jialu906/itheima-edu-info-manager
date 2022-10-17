package com.itheima.edu.info.manager.collectiontest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;
import com.itheima.edu.info.manager.MyClass.Student;
/**
 *
 */
public class MyTreeSet {
    public static void main(String[] args) {
        Student st1=new Student("sunbin1",27);
        Student st2=new Student("sunbin2",29);
        Student st3=new Student("sunbin3",28);
        Student st4=new Student("sunbin4",27);
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(5);
        ts.add(2);
        ts.add(3);
        System.out.println(ts);
        TreeSet<Student> tstuent=new TreeSet<>();
        tstuent.add(st1);
        tstuent.add(st2);
        tstuent.add(st3);
        tstuent.add(st4);
        System.out.println(tstuent);

        TreeSet<Student> ctstuent=new TreeSet<>(new Comparator<Student>()
        {
            @Override
            public int compare(Student o1, Student o2) {
                int result=o1.getage()- o2.getage();
                result=result==0?o1.getname().compareTo(o2.getname()):result;
                return result;
            }
        }
        );

        Comparator<Student> studentComparator = Comparator.comparing(Student::getage).thenComparing(Student::getage);

        TreeSet<Student> ctstuent1=new TreeSet<>((Student o1, Student o2)->{int result=o1.getage()- o2.getage();
            result=result==0?o1.getname().compareTo(o2.getname()):result;
            return result;});


        ctstuent.add(st1);
        ctstuent.add(st2);
        ctstuent.add(st3);
        ctstuent.add(st4);
        System.out.println(ctstuent);
    }
}

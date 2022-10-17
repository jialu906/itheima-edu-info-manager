package com.itheima.edu.info.manager.treeset;

public class Student implements Comparable<Student>{
    private String name;
    private Integer math;
    private Integer chinese;
    private Integer english;

    public Student(String name, Integer math, Integer chinese, Integer english){
        this.name = name;
        this.math = math;
        this.chinese = chinese;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMath() {
        return math;
    }

    public void setMath(Integer math) {
        this.math = math;
    }

    public Integer getChinese() {
        return chinese;
    }

    public void setChinese(Integer chinese) {
        this.chinese = chinese;
    }

    public Integer getEnglish() {
        return english;
    }

    public void setEnglish(Integer english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", math=" + math +
                ", chinese=" + chinese +
                ", english=" + english +
                ", score=" + this.getscore() +
                '}';
    }
    public int getscore(){
        return this.getChinese()+this.getEnglish()+this.getMath();
    }


    @Override
    public int compareTo(Student o) {
        int re=this.getscore()-o.getscore();
        re=re==0? this.getMath()- o.getMath():re;
        re=re==0? this.getEnglish()-o.getEnglish():re;
        re=re==0? this.getChinese()-o.getChinese():re;
        re=re==0? this.getName().compareTo(o.getName()):re;
        return re;
    }
}
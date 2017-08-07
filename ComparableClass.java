import java.util.*;
class Student implements Comparable<Student> {
  String name;
  int age;
  Student(String s,int a){
    name=s;
    age=a;
  }

  public int compareTo(Student other){
    //For ascending sorting
    return Integer.compare(this.age,other.age);
    //For Decending sorting
    //return Integer.compare(other.age,this.age);
  }
}
class ComparableClass {
  public static void main(String[] args) {
    Student[] arr=new Student[3];
    arr[0]=new Student("Shabbir",21);
    arr[1]=new Student("Hussain",18);
    arr[2]=new Student("Imran",22);

    Arrays.sort(arr);

    for (Student a :arr ) {
      System.out.println(a.name+" : "+a.age);
    }
  }
}

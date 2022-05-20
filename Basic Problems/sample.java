
package abc;

public class Rough {

    public static void main(String[] args) {
        Person p1=new Person();
        p1.nameString="RCB";
        p1.age=31;
        
        System.out.println(p1.nameString+ " "+ p1.age);
        

    }

}

class Person{
    String nameString;
    int age;

}

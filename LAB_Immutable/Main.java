import java.util.Scanner;
class Person {
    String name;
    int age;

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }
}

class Modify {
    public static void formatString(String name){
        name = name.toUpperCase();
    }
    public static void formatPerson(Person p){
        p.name = p.name.toUpperCase();
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine().trim();
        int age = sc.nextInt();
        sc.nextLine();
        Person p = new Person(age, name);
        String method = sc.nextLine().trim();
        if(method.equalsIgnoreCase("fs")){
            Modify.formatString(p.name); 
        }
        else if(method.equalsIgnoreCase("fp")){
            Modify.formatPerson(p);
        }
        System.out.printf("Full name: %s; %d years old.", p.name, p.age);
    }
}

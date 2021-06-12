package Exercise;

import data.Student;
import lists.Listable;
import lists.SinglyLinkedList;
import lists.DoublyLinkedList;

public class App {

    public static void main(String[] args) {
        run(new SinglyLinkedList<Student>());
        run(new DoublyLinkedList<Student>());
    }

    private static void run(Listable<Student> students){
        students.addLast(readStudents());
        students.add(new Student("Amy", "Santiago", 10, 420));
        Student s3=new Student("Gina", "Linetti", 10, 100);
        students.addLast(s3);
        printList(students);
        students.clear();
        students.size();
    }

    private static Student readStudents(){
        Student student=new Student("Jake", "Peralta", 10, 96);
        return student;
    }

    private static void printList(Listable<Student> students){
        System.out.println("Type: "+ students.getClass().getSimpleName());
        System.out.println("Size: "+ students.size());
        System.out.println("is empty: "+ students.isEmpty());
        System.out.println("Students");
        System.out.println("Get: "+students.get(0));
        System.out.println("Get: "+students.get(1));
        System.out.println("Get: "+students.get(2));
        System.out.println("Get: "+students.get(-1));
        System.out.println("Get: "+students.get(3));
        System.out.println("All: ");
        students.printAll();
    }
}

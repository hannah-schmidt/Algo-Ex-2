package Exercise;

import Console.Menu;
import algorithms.Bubblesort;
import algorithms.Selectionsort;
import data.Student;
import lists.Listable;
import lists.SinglyLinkedList;
import lists.DoublyLinkedList;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        Menu menu=new Menu();
        int listart=menu.menu_lists();
        if(listart==1){
            SinglyLinkedList singlyLinkedList=new SinglyLinkedList();
        }else if(listart==2){
            DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
        }else{
            System.out.println("Eingabe wurde nicht akzeptiet.");
            menu.menu_lists();
        }
    }

    private static void run(Listable<Student> students){
        makelist(students);
        students.printAll();
        System.out.println(" ");
        System.out.println("Bubblesort:");
        Bubblesort bubble=new Bubblesort();
        bubble.bubbleSort_m(students).printAll();
        students.clear();
        System.out.println(" ");
        System.out.println("NEW");
        System.out.println(" ");
        makelist(students);
        students.printAll();
        System.out.println(" ");
        System.out.println("Selectionsort: ");
        Selectionsort selectionsort=new Selectionsort();
        selectionsort.selectionSort(students).printAll();
        students.clear();
        students.size();
    }

    private static Listable makelist(Listable list) {
        for (int i = 0; i < 20; i++) {
            String a = "M";
            String b = "M";
            Random rd = new Random();
            int c = rd.nextInt(1000);
            int d = rd.nextInt(1000);
            Student student = new Student(a, b, c, d);
            list.add(student);
        }
        return list;
    }

}

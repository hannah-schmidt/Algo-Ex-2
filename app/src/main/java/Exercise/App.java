package Exercise;

import Console.Console;
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
        Console console=new Console();
        int listart=menu.menu_lists();
        if(listart==1){
            SinglyLinkedList singlyLinkedList=new SinglyLinkedList();
            do {
                int opt=menu.menu_main("You selected SinglyLinkedList:");
                System.out.println(" ");
                switch (opt){
                    case 0: System.exit(0);
                    case 1: singlyLinkedList.add(menu.menu_student());
                    case 2: singlyLinkedList.insert(10);
                    case 3: singlyLinkedList.addFirst(menu.menu_student());
                    case 4: singlyLinkedList.addLast(menu.menu_student());
                    case 5: singlyLinkedList.get(console.readInteger("Please enter index of wanted Element", 0, singlyLinkedList.size()));
                    case 6: singlyLinkedList.printAll();
                    case 7: singlyLinkedList.size();
                    case 8: singlyLinkedList.remove(console.readInteger("Please enter index of Element to be removed.", 0, singlyLinkedList.size()));
                    case 9: singlyLinkedList.clear();
                    case 10: singlyLinkedList.get(menu.menu_search());
                    case 11: if(menu.menu_sort()==1) {
                        Bubblesort bubble = new Bubblesort();
                        if (menu.menu_sortby(1) == 1) {
                            bubble.bubbleSort_c(singlyLinkedList);
                        } else {
                            bubble.bubbleSort_m(singlyLinkedList);
                        }
                    } else{
                        Selectionsort select=new Selectionsort();
                        if(menu.menu_sortby(2)==1){
                            select.selectionSort_c(singlyLinkedList);
                        }else{
                            select.selectionSort_m(singlyLinkedList);
                        }
                    }
                }
            }while(true);
        }else{
            DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
            do {
                int opt=menu.menu_main("You selected DoublyLinkedList:");
                System.out.println(" ");
                switch (opt){
                    case 0: System.exit(0);
                    case 1: doublyLinkedList.add(menu.menu_student());
                    case 2: doublyLinkedList.insert(10);
                    case 3: doublyLinkedList.addFirst(menu.menu_student());
                    case 4: doublyLinkedList.addLast(menu.menu_student());
                    case 5: doublyLinkedList.get(console.readInteger("Please enter index of wanted Element", 0, doublyLinkedList.size()));
                    case 6: doublyLinkedList.printAll();
                    case 7: doublyLinkedList.size();
                    case 8: doublyLinkedList.remove(console.readInteger("Please enter index of Element to be removed.", 0, doublyLinkedList.size()));
                    case 9: doublyLinkedList.clear();
                    case 10: doublyLinkedList.get(menu.menu_search());
                    case 11: if(menu.menu_sort()==1) {
                        Bubblesort bubble = new Bubblesort();
                        if (menu.menu_sortby(1) == 1) {
                            bubble.bubbleSort_c(doublyLinkedList);
                        } else {
                            bubble.bubbleSort_m(doublyLinkedList);
                        }
                    } else{
                        Selectionsort select=new Selectionsort();
                        if(menu.menu_sortby(2)==1){
                            select.selectionSort_c(doublyLinkedList);
                        }else{
                            select.selectionSort_m(doublyLinkedList);
                        }
                    }
                }
            }while(true);
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
        selectionsort.selectionSort_m(students).printAll();
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

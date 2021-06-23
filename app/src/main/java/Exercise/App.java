package Exercise;

import Console.Console;
import Console.Menu;
import algorithms.Bubblesort;
import algorithms.Search;
import algorithms.Selectionsort;
import data.Student;
import lists.Listable;
import lists.SinglyLinkedList;
import lists.DoublyLinkedList;

import java.util.Random;

import static data.Student.Course.*;

public class App {

    public static void main(String[] args) {
        Menu menu=new Menu();
        Console console=new Console();
        int listart=menu.menu_lists();
        if(listart==1){
            SinglyLinkedList singlyLinkedList=new SinglyLinkedList();
            singlyLinkedList.add(new Student("a","a",AI, 12345));
            singlyLinkedList.add(new Student("b","b",AI, 12343));
            singlyLinkedList.add(new Student("c","c",WI, 10000));
            singlyLinkedList.add(new Student("d","d",BWL, 99345));
            do {
                int opt=menu.menu_main("You selected SinglyLinkedList:");
                System.out.println(" ");
                switch (opt){
                    case 0: System.exit(0);
                    case 1: singlyLinkedList.add(menu.menu_student());
                            break;
                    case 2: singlyLinkedList.insert(console.readInteger("Pleaser enter index for new object:",0, singlyLinkedList.size()),menu.menu_student());
                            break;
                    case 3: singlyLinkedList.addFirst(menu.menu_student());
                            break;
                    case 4: singlyLinkedList.addLast(menu.menu_student());
                            break;
                    case 5: System.out.println(singlyLinkedList.get(console.readInteger("Please enter index of wanted Element:", 0, singlyLinkedList.size())));
                            break;
                    case 6: singlyLinkedList.printAll();
                            break;
                    case 7: System.out.println("Size of list: "+singlyLinkedList.size());
                            break;
                    case 8: singlyLinkedList.remove(console.readInteger("Please enter index of Element to be removed:", 0, singlyLinkedList.size()));
                            break;
                    case 9: singlyLinkedList.clear();
                            if(singlyLinkedList.isEmpty()==true){
                                System.out.println("All elements have been removed.");
                            }else{
                                System.out.println("Failed to remove all elements.");
                            }
                            break;
                    case 10: Search search=new Search();
                            int option=menu.menu_search();
                            if(option<3){
                                search.search_name(menu.menu_search_String(option),singlyLinkedList, option);
                            }else if(option==4){
                                search.search_int(menu.menu_search_int(option),singlyLinkedList);
                            }else{
                                search.search_course(menu.menu_course(),singlyLinkedList);
                            }
                            break;
                    case 11: if(menu.menu_sort()==1) {
                        Bubblesort bubble = new Bubblesort();
                        if (menu.menu_sortby(1) == 1) {
                            bubble.bubbleSort_c(singlyLinkedList).printAll();
                        } else {
                            bubble.bubbleSort_m(singlyLinkedList).printAll();
                        }
                    } else{
                        Selectionsort select=new Selectionsort();
                        if(menu.menu_sortby(2)==1){
                            select.selectionSort_c(singlyLinkedList).printAll();
                        }else{
                            select.selectionSort_m(singlyLinkedList).printAll();
                        }
                    }
                    break;
                }
            }while(true);
        }
        else{
            DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
            doublyLinkedList.add(new Student("a","a",AI, 12345));
            doublyLinkedList.add(new Student("b","b",AI, 12343));
            doublyLinkedList.add(new Student("c","c",WI, 10000));
            doublyLinkedList.add(new Student("d","d",BWL, 99345));
            do {
                int opt=menu.menu_main("You selected DoublyLinkedList:");
                System.out.println(" ");
                switch (opt){
                    case 0: System.exit(0);
                        break;
                    case 1: doublyLinkedList.add(menu.menu_student());
                            break;
                    case 2: doublyLinkedList.insert(console.readInteger("Pleaser enter index for new object:",0, doublyLinkedList.size()),menu.menu_student());
                            break;
                    case 3: doublyLinkedList.addFirst(menu.menu_student());
                            break;
                    case 4: doublyLinkedList.addLast(menu.menu_student());
                            break;
                    case 5: System.out.println(doublyLinkedList.get(console.readInteger("Please enter index of wanted Element:", 0, doublyLinkedList.size())));
                            break;
                    case 6: doublyLinkedList.printAll();
                            break;
                    case 7:
                        System.out.println("Size of list: "+doublyLinkedList.size());
                            break;
                    case 8: doublyLinkedList.remove(console.readInteger("Please enter index of Element to be removed:", 1, doublyLinkedList.size()));
                            break;
                    case 9: doublyLinkedList.clear();
                            if(doublyLinkedList.isEmpty()==true){
                                System.out.println("All elements have been removed.");
                            }else{
                                System.out.println("Failed to remove all elements.");
                            }
                            break;
                    case 10: Search search=new Search();
                            int option=menu.menu_search();
                            if(option<3){
                                search.search_name(menu.menu_search_String(option),doublyLinkedList, option);
                            }else if(option==4){
                                search.search_int(menu.menu_search_int(option),doublyLinkedList);
                            }else {
                                search.search_course(menu.menu_course(), doublyLinkedList);
                            }
                            break;
                    case 11: if(menu.menu_sort()==1) {
                        Bubblesort bubble = new Bubblesort();
                        if (menu.menu_sortby(1) == 1) {
                            bubble.bubbleSort_c(doublyLinkedList).printAll();
                        } else {
                            bubble.bubbleSort_m(doublyLinkedList).printAll();
                        }
                    } else{
                        Selectionsort select=new Selectionsort();
                        if(menu.menu_sortby(2)==1){
                            select.selectionSort_c(doublyLinkedList).printAll();
                        }else{
                            select.selectionSort_m(doublyLinkedList).printAll();
                        }
                    }
                    break;
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
            Student.Course c= AI;
            int d = rd.nextInt(1000);
            Student student = new Student(a, b, c, d);
            list.add(student);
        }
        return list;
    }

}

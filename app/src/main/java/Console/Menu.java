package Console;

import data.Student;

public class Menu {
    Console console=new Console();

    public int menu_lists(){
        System.out.println("Select list type before starting the main menu: ");
        System.out.println(" ");
        System.out.println("1. SinglyLinkedList");
        System.out.println("2. DoublyLinkedList");
        System.out.println(" ");
        int a=console.readInteger("Please enter a number for an option");
        return a;
    }

    public int menu_main(String text){
        System.out.println(text);
        System.out.println(" ");
        System.out.println(" 1. Add Student to the end of the list.");
        System.out.println(" 2. Inserts the Student at the specified position in this list.");
        System.out.println(" 3. Inserts Student at the beginning of this list.");
        System.out.println(" 4. Appends the Student to the end of this list." );
        System.out.println(" 5. Returns the Student at the specified position in this list.");
        System.out.println(" 6. Print all Students to console from this list.");
        System.out.println(" 7. Returns the number of Students in this list.");
        System.out.println(" 8. Removes the Student at the specified position in this list.");
        System.out.println(" 9. Removes all of the Students from this list.");
        System.out.println("10. Search for Student(s) by different characteristics.");
        System.out.println("11. Sort list by different properties.");
        System.out.println(" 0. Exit program.");
        System.out.println(" ");
        int a=console.readInteger("Please enter a number for an option: ");
        return a;
    }

    public Student menu_student(String text){
        System.out.println(text);
        System.out.println(" ");
        String prename= console.readString("Please enter prename: ");
        String surname= console.readString("Please enter surname: ");
        int course= console.readInteger("Please enter course number: ");
        int mat= console.readInteger("Please enter matriculation number: ");
        Student student= new Student(prename, surname, course, mat);
        return student;
    }

    public int menu_search(String text){
        System.out.println(text);
        System.out.println(" ");
        System.out.println("1. Search by prename?");
        System.out.println("2. Search by surname?");
        System.out.println("3. Search by course number?");
        System.out.println("4. Search by matriculation number?");
        System.out.println(" ");
        int a=console.readInteger("Please enter a number for an option: ");
        return a;
    }

    public int menu_sort(String text){
        System.out.println(text);
        System.out.println(" ");
        System.out.println("1. Bubblesort?");
        System.out.println("2. Selectionsort?");
        System.out.println(" ");
        int a=console.readInteger("Please enter a number for an option: ");
        return a;
    }

    public int menu_sortby(String text){
        System.out.println(text);
        System.out.println(" ");
        System.out.println("1. Sort by course?");
        System.out.println("2. Sort by matriculation number?");
        System.out.println(" ");
        int a= console.readInteger("Please enter a number for an option: ");
        return a;
    }

}

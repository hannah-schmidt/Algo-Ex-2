package algorithms;
import Console.IConsole;
import data.Student;
import lists.DoublyLinkedList;
import lists.Listable;
import lists.SinglyLinkedList;

public class Bubblesort {
    Listable bubbleSort_c(Listable list) {
        int n = list.size();
        Student student1;
        Student student2;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int a = j + 1;
                student1 = (Student) list.get(j);
                student2 = (Student) list.get(j + 1);
                if (student1.getCourse() > student2.getCourse()) {
                    list.switchnodes(j-1);
                }
            }
        }
        return list;
    }

    Listable bubbleSort_m(Listable list) {
        int n = list.size();
        Student student1;
        Student student2;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int a = j + 1;
                student1 = (Student) list.get(j);
                student2 = (Student) list.get(j + 1);
                if (student1.getMatriculationNumber() > student2.getMatriculationNumber()) {
                    list.switchnodes(j-1);
                }
            }
        }
        return list;
    }

}

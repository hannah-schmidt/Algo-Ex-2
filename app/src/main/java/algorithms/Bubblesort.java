package algorithms;
import Console.IConsole;
import data.Student;
import lists.DoublyLinkedList;
import lists.Listable;
import lists.SinglyLinkedList;

public class Bubblesort {
    void bubbleSort_c(Listable list) {
        int n = list.size();
        Student student1;
        Student student2;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int a = j + 1;
                student1 = (Student) list.get(j);
                student2 = (Student) list.get(j + 1);
                if (student1.getCourse() > student2.getCourse()) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void bubbleSort_c(Listable list) {
        int n = list.size();
        Student student1;
        Student student2;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int a = j + 1;
                student1 = (Student) list.get(j);
                student2 = (Student) list.get(j + 1);
                if (student1.getCourse() > student2.getCourse()) {
                    // swap temp and arr[i]

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /* Prints the array */
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

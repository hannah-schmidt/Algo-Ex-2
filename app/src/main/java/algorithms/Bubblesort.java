package algorithms;

import data.Student;
import lists.DoublyLinkedList;
import lists.Listable;
import lists.SinglyLinkedList;


public class Bubblesort {
    public Listable bubbleSort_c(Listable sortlist) {
        Listable list;
        if(sortlist.toString().contains("DoublyLinkedList")){
            list= (DoublyLinkedList) sortlist;
        }else{
            list= (SinglyLinkedList) sortlist;
        }
        int n = list.size();
        Student student1;
        Student student2;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int a = j + 1;
                student1 = (Student) list.get(j);
                student2 = (Student) list.get(j + 1);
                if (student1.getCourse() > student2.getCourse()) {
                    switchnodes(j,j+1, list);
                }
            }
        }
        return list;
    }

    public Listable bubbleSort_m(Listable sortlist) {
        Listable list;
        if(sortlist.toString().contains("DoublyLinkedList")){
            list= (DoublyLinkedList) sortlist;
        }else{
            list= (SinglyLinkedList) sortlist;
        }
        int n = list.size();
        Student student1;
        Student student2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                student1 = (Student) list.get(j);
                student2 = (Student) list.get(j + 1);
                if(student1==null ||student2==null){
                    System.out.println("break");
                    break;
                }
                if (student1.getMatriculationNumber() > student2.getMatriculationNumber()) {
                    switchnodes(j,j+1, list);
                }
            }
        }
        return list;
    }

    public Listable switchnodes(int index_1, int index_2, Listable list){
        Student student1= (Student) list.get(index_1);
        Student student2= (Student) list.get(index_2);
        list.set(index_1, student2);
        list.set(index_2, student1);
        return list;
    }

}

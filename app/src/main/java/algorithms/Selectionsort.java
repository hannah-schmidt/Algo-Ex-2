package algorithms;

import data.Student;
import lists.DoublyLinkedList;
import lists.Listable;
import lists.SinglyLinkedList;

public class Selectionsort {
    public Listable selectionSort_m(Listable sortlist){
        Listable list;
        if(sortlist.toString().contains("DoublyLinkedList")){
            list= (DoublyLinkedList) sortlist;
        }else{
            list= (SinglyLinkedList) sortlist;
        }
        for (int i = 0; i < list.size() - 1; i++) {
            int index = i;
            Student student1= (Student) list.get(i);
            int wert= student1.getMatriculationNumber();
            for (int j = i + 1; j < list.size(); j++){
                Student student_i= (Student) list.get(j);
                if (student_i.getMatriculationNumber() < wert){
                    index = j;
                    wert= student_i.getMatriculationNumber();
                }
            }
            switchnodes(i, index, list);
        }
        return list;
    }

    public Listable selectionSort_c(Listable sortlist){
        Listable list;
        if(sortlist.toString().contains("DoublyLinkedList")){
            list= (DoublyLinkedList) sortlist;
        }else{
            list= (SinglyLinkedList) sortlist;
        }
        for (int i = 0; i < list.size() ; i++) {
            Student student1= (Student) list.get(i);
            int index = i;
            int wert = student1.getCourse();
            for (int j = i + 1; j < list.size(); j++){
                Student student_j= (Student) list.get(j);
                if (student_j.getCourse() < wert){
                    wert= student_j.getCourse();
                    index = j;
                }
            }
            switchnodes(i, index, list);
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

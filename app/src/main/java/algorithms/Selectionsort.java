package algorithms;

import data.Student;
import lists.Listable;

public class Selectionsort {
    public Listable selectionSort(Listable list){
        for (int i = 0; i < list.size() - 1; i++)
        {
            int index = i;
            Student student1= (Student) list.get(i);
            for (int j = i + 1; j < list.size(); j++){
                Student student_i= (Student) list.get(j);
                if (student_i.getMatriculationNumber() < student1.getMatriculationNumber()){
                    index = j;//searching for lowest index
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

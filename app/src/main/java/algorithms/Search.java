package algorithms;

import data.Student;
import lists.Listable;

public class Search {
    public Student search_name(String name, Listable list, int opt){
        switch (opt){
            case 1: for(int i=0; i< list.size();i++){
                        Student student= (Student) list.get(i);
                        if(name.equals(student.getPrename())){
                            return student;
                        }
                    }
                    break;
            case 2: for(int i=0; i< list.size();i++){
                        Student student= (Student) list.get(i);
                        if(name.equals(student.getSurname())){
                            return student;
                        }
                    }
        }
        return null;
    }
    public Student search_int(int number, Listable list, int opt){
        switch (opt){
            case 1: for(int i=0; i< list.size();i++){
                        Student student= (Student) list.get(i);
                        if(number==(student.getCourse())){
                            return student;
                        }
                    }
                    break;
            case 2: for(int i=0; i< list.size();i++){
                        Student student= (Student) list.get(i);
                        if(number==(student.getMatriculationNumber())){
                            return student;
                        }
                    }
                    break;
        }
        return null;
    }
}

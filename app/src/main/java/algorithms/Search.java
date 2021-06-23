package algorithms;

import data.Student;
import lists.Listable;

public class Search {
    public void search_name(String name, Listable list, int opt){
        switch (opt){
            case 1: for(int i=0; i< list.size();i++){
                        Student student= (Student) list.get(i);
                        if(name.equals(student.getPrename())){
                            System.out.println(student);
                        }
                    }
                    break;
            case 2: for(int i=0; i< list.size();i++){
                        Student student= (Student) list.get(i);
                        if(name.equals(student.getSurname())){
                            System.out.println(student);
                        }
                    }
        }
    }
    public void search_int( int number, Listable list){
        for(int i=0; i< list.size();i++) {
            Student student = (Student) list.get(i);
            if (number == (student.getMatriculationNumber())) {
                System.out.println(student);
            }
        }

    }

    public void search_course(Student.Course course, Listable list){
        for(int i=0; i< list.size();i++){
            Student student= (Student) list.get(i);
            if(course.ordinal()==(student.getCourse().ordinal())){
                System.out.println(student);
            }
        }
    }
}

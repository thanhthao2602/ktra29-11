
package kiemtra;

import java.util.*;


public class StudentServiceImpl implements StudentService {
   public static ArrayList<Student> std = new ArrayList<>();
    @Override
    public void addStudent(Student t) {
        std.add(t);
    }

    @Override
    public void deleteStudent(int id) {
        for (Student st: std) {
            if(st.getId() == id){
                std.remove(st);
            }
        }
    }

    @Override
    public void searchStudent(String name) {
        for (Student st: std) {
            if(st.getName().contains(name)){
                System.out.println(st.toString());
            }
        }
    }

    @Override
    public void sortedStudent() {
       std.sort((o1, o2) -> {
            return (int) (o2.getScore() - o1.getScore());
        });
    }

    @Override
    public void showAllStudent() {
         for (Student st: std) {
            System.out.println(st.toString());
        }
    }
    
    
}

  

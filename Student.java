
package kiemtra;


public class Student extends Person{
    private double score;

    public Student() {
    }

    public Student(double score) {
        this.score = score;
    }

    public Student(double score, int id, String name, short age, Address address) {
        super(id, name, age, address);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" + "score=" + score + '}';
    }

   

   

    @Override
    public String getCapacity() {
       if( score>= 9.0) return "Hoc luc xuat sac" ;
        if(8<= score && score< 9.0) return "Hoc luc gioi" ;
         if(6.5<= score && score< 8.0) return "Hoc luc kha" ;
          if( score < 6.5) return "Hoc luc tb yeu " ;
          return null;
    }    
    
}


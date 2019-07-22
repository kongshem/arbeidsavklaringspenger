import java.util.*;

public class Adult extends Person{
    Map<Integer, Float> salaries;
    List<Kid> kids;

    Adult(String firstName, String lastName){
        super(firstName, lastName);
        this.salaries = new HashMap<>();
        this.kids = new ArrayList<>();
    }

    //TODO
    public void addSalary(int year, float salary){
    }
    //TODO
    public void updateSalary(int year, float salary){
    }
    //TODO
    public void addKid(){
    }

    public Map<Integer, Float> getSalaries() {
        return salaries;
    }
}

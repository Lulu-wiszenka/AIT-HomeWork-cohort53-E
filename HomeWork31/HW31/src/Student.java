import java.util.ArrayList;
import java.util.List;

public class Student implements  Comparable<Student>{
    private String name;
    private List<Integer> rates;
    private double average;

    public Student(String name, List<Integer> rates) {
        this.name = name;
        this.rates = new ArrayList<>(rates);
        this.average = addAverage();
    }

    @Override
    public String toString() {
        return name + '\'' +
                ", rates=" + rates + " (" + average +")";
    }

    public void addRate(int rate){
        rates.add(rate);
        average = addAverage();
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(average, o.getAverage());
        /*
        if (average > otherStudent.average){
            return 1;
        } else if (average < otherStudent.average{
            return -1;
        } else {
            return 0;
        }
         */
    }

    private double addAverage(){
        if (rates.size()==0 || rates==null){
            return 0;
        }
        double sum = 0.0;
        for(Integer rate: rates) {
            sum+=rate;
        }
        return sum/rates.size();
    }

    public String getName() {
        return name;
    }

    public List<Integer> getRates() {
        return rates;
    }

    public double getAverage() {
        return average;
    }

}
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        //10,44,7,6,12,89
        //List<Integer> numbers = new ArrayList<>();
        List<Integer> numbers = List.of(10,44,7,6,12,89);
        System.out.println(NewArray(numbers, 33));
        System.out.println(NewArray2(numbers, 33));

    }
    //1
    public static List<Integer> NewArray(List<Integer> list, int value){
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i)>value){
                array.add(list.get(i));
            }
        }
        return array;
    }
    //2
    public static List<Integer> NewArray2 (List<Integer> list, int value){
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i)>value){
                array.add(i);
            }
        }
        return array;
    }

}
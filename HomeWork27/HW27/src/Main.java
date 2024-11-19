import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Давайте создадим класс программист (Programmer) у него будут следующие поля:

-имя String name
-список задач List tasks
-список технологий, которыми владеет List technologies, например
( "Java","Git", "JavaScript")
  Как вы понимаете, задача (Task) - класс, у него будут следующие поля:
номер (number), заголовок(title), описание( description) У программиста
должны быть методы, которые позволят

добавить ему задачу,
получить список задач,
проверить, есть ли у программиста задача с заданным номером
         */

        List<String> technologies1 = List.of("java","go", "mysql");
        List<String> technologies2 = List.of("java","c++", "mysql","go");

        List<Programmer> programmers = List.of(
                new Programmer("Jack",technologies1),
                new Programmer("Lena",technologies2),
                new Programmer("Nick",List.of("java","go", "mysql"))
        );

        List<Task> taskList1 = new ArrayList<>();  // Создаем пустой лист для Task
        taskList1.add(new Task(1,"задача №1","Реализовать задачу #1")); // добавляем задачу в лист
        taskList1.add(new Task(2,"задача №2","Реализовать задачу #2"));
        taskList1.add(new Task(3,"задача №3","Реализовать задачу #3"));

        printList(programmers);
        for (int i = 0; i < programmers.size(); i++) {
            programmers.get(i).addTask(taskList1.get(0));
        }
        System.out.println("----------");
        printList(programmers);
        System.out.println("есть ли у Лены task №2");
        System.out.println(programmers.get(1).checkTaskByNumber(1));


    }
    public static void printList(List<Programmer> people){
        for (Programmer element: people){
            System.out.println(element);
        }
    }

}
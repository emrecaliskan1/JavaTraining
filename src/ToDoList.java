import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Task> tasks;
    private int nextId;

    public ToDoList(){
        tasks = new ArrayList<>();
        nextId = 1;
    }

    public void addTask(String aciklama){
        Task newTask = new Task(nextId++ , aciklama);
        tasks.add(newTask);
        System.out.println("Task eklendi: " + newTask);
    }

    public void listele(){
        if(tasks.isEmpty())
            System.out.println("Task yok.");
        else{
            //foreach kullanımı
            for(Task task : tasks)
                System.out.println(task);
        }
    }

    public void delete(int id){
        Task taskToRemove = null;
        for(Task task : tasks){
            if(task.getId()==id){
                taskToRemove = task;
                break;
            }
        }
        if(taskToRemove != null){
            tasks.remove(taskToRemove);
            System.out.println("Task silindi: " + taskToRemove);

            }
        else{
            System.out.println("Id'si belirtilen task bulunamadı.");
        }
    }
}

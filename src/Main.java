import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("To-Do List App:");
            System.out.println("1-Add task");
            System.out.println("2-List task");
            System.out.println("3-Delete task");
            System.out.println("4-Exit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();
            input.nextLine();

            switch(choice){
                case 1:
                    System.out.println("Enter task description: ");
                    String description = input.nextLine();
                    toDoList.addTask(description);
                    break;
                case 2:
                    toDoList.listele();
                    break;
                case 3:
                    System.out.print("Enter id to delete: ");
                    int id = input.nextInt();
                    toDoList.delete(id);
                    break;
                case 4:
                    System.out.println("Exit..");
                    input.close();
                    break;
                default:
                    System.out.println("Try again.");
            }

        }
    }
}
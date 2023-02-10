import Controller.Controller;
import Database.MyDatabase;

public class App {

    public static void main(String[] args) {
        MyDatabase db = new MyDatabase();
        Controller.mainMenuController(db);
    }

}
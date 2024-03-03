public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Menu menu = new Menu(db);
        menu.displayMenu();
    }
}
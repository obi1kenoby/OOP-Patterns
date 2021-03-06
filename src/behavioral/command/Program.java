package behavioral.command;


public class Program {
    public static void main(String[] args) {
        Database database = new Database();

        Developer developer = new Developer(new InsertCommand(database), new UpdateCommand(database),
                new ReadCommand(database),  new DeleteCommand(database));

        developer.insert();
        developer.update();
        developer.load();
        developer.delete();
    }
}

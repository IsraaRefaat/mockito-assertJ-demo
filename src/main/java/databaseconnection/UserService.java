package databaseconnection;

public class UserService {

    Database database;

    public UserService(Database database) {
        this.database = database;
    }

    public boolean saveUser(User user) {
        this.database.save(user);
        return true;
    }

}

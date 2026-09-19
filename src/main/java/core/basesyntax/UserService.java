package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        if (!validate(user)) {
            throw PasswordValidationException("Your passwords are incorrect. Try again.");
        }
        saveUser(user);
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}

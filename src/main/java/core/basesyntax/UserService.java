package core.basesyntax;

public class UserService {
    public void registerUser(User user) throws PasswordValidationException {
        try {
            PasswordValidator passwordValidate = new PasswordValidator();
            passwordValidate.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            throw new PasswordValidationExceptiong("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}

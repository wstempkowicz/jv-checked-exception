package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) {
        if (!password.equals(repeatPassword)) {
            throw PasswordValidationException("Wrong passwords");
        } else if (password.length < 10) {
            throw PasswordValidationException("Wrong passwords");
        }
    }
}

package user_registration;

public class UC5PasswordValidation {

    boolean validatePassword(String password) {
        return password != null
                && password.matches("(?=.*[A-Z])(?=.*[0-9])(?=.*[^A-Za-z0-9\\s])"
                + "(?!.*[^A-Za-z0-9\\s].*[^A-Za-z0-9\\s])(?=\\S{8,}$).*");
    }
}

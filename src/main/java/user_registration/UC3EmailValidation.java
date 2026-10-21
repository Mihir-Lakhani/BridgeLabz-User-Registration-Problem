package user_registration;

public class UC3EmailValidation {

    public boolean validateEmail(String email) {
        return email != null
                && email.matches("[A-Za-z0-9]+([._+-][A-Za-z0-9]+)*@[A-Za-z0-9]+\\.[A-Za-z]{2,}(\\.[A-Za-z]{2,})?");
    }
}

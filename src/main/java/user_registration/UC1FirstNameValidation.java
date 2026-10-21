package user_registration;

public class UC1FirstNameValidation {

    public boolean validateFirstName(String firstName) {
        return firstName != null && firstName.matches("[A-Z][a-z]{2,}");
    }
}

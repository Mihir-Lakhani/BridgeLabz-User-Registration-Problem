package user_registration;

public class UC2LastNameValidation {

    public boolean validateLastName(String lastName) {
        return lastName != null && lastName.matches("[A-Z][a-z]{2,}");
    }
}

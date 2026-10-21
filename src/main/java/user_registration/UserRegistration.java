package user_registration;

import java.util.*;


public class UserRegistration {


    boolean validateFirstName(String firstName){
        return firstName!=null &&
                firstName.matches("[A-Z][a-z]{2,}");
    }

    boolean validateLastName(String lastName){
        return lastName!=null &&
                lastName.matches("[A-Z][a-z]{2,}");
    }

    boolean validateEmail(String email){
        return email!=null &&
                email.matches("[A-Za-z0-9]+([._+-][A-Za-z0-9]+)*@[A-Za-z0-9]+\\.[A-Za-z]{2,}(\\.[A-Za-z]{2,})?");
    }

}

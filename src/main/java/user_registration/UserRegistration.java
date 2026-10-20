package user_registration;

import java.util.*;


public class UserRegistration {


    boolean validateFirstName(String firstName){
        return firstName!=null &&
                firstName.matches("[A-Z][a-z]{2,}");
    }
}
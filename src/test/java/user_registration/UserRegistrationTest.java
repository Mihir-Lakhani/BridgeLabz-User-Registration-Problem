package user_registration;

import java.util.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.provider.CsvSource;

public class UserRegistrationTest {

    UserRegistration ur;

    @BeforeEach
    void setup(){
        ur = new UserRegistration();
    }

    @Test
    void FirstnameWithCapitalFirstLetterAndMin3LetterIsTure(){
        assertTrue(ur.validateFirstName("Mihir"));
        assertTrue(ur.validateFirstName("Raj"));
        assertTrue(ur.validateFirstName("Riya"));
    }

    @ParameterizedTest
    @CsvSource({
            "mihir",
            "raj",
            "riya",
    })
    void FirstLowerCaseLetterInFirstNameIsFalse(String firstName){

        assertFalse(ur.validateFirstName(firstName));
    }

    @Test
    void NullFirstNameShouldReturnFalse(){
        assertFalse(ur.validateFirstName(null));
    }

    @ParameterizedTest
    @CsvSource({
            "Mihir, true",
            "Raj, true",
            "Mi, false",
            "Ra, false",
    })
    void firstNameValidationShouldMatchExpectedResultOfMin3Char(String firstName, boolean expected){
        assertEquals(expected, ur.validateFirstName(firstName));
    }

    @Test
    void emptyFirstNameShouldReturnFalse() {
        assertFalse(ur.validateFirstName(""));
    }

    @Test
    void lastNameWithCapitalFirstLetterAndMin3LettersShouldReturnTrue(){
        assertTrue(ur.validateLastName("Lakhani"));
        assertTrue(ur.validateLastName("Shah"));
        assertTrue(ur.validateLastName("Rao"));
    }

    @ParameterizedTest
    @CsvSource({
            "lakhani",
            "shah",
            "rao",
    })
    void lastNameWithLowercaseFirstLetterShouldReturnFalse(String lastName){
        assertFalse(ur.validateLastName(lastName));
    }

    @Test
    void nullLastNameShouldReturnFalse(){
        assertFalse(ur.validateLastName(null));
    }

    @ParameterizedTest
    @CsvSource({
            "Lakhani, true",
            "Rao, true",
            "Ra, false",
            "R, false",
            "Lakhani1, false",
            "La-khani, false",
    })
    void lastNameValidationShouldMatchExpectedResult(String lastName, boolean expected){
        assertEquals(expected, ur.validateLastName(lastName));
    }

    @Test
    void emptyLastNameShouldReturnFalse(){
        assertFalse(ur.validateLastName(""));
    }


}

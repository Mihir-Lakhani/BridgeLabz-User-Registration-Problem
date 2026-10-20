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

    void FirstLetterInFirstNameIsFalse(String firstName){
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


}
package user_registration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UC2LastNameValidationTest {

    private UC2LastNameValidation validator;

    @BeforeEach
    void setUp() {
        validator = new UC2LastNameValidation();
    }

    @Test
    void validLastNamesShouldReturnTrue() {
        assertTrue(validator.validateLastName("Lakhani"));
        assertTrue(validator.validateLastName("Shah"));
        assertTrue(validator.validateLastName("Rao"));
    }

    @ParameterizedTest
    @CsvSource({
            "lakhani",
            "shah",
            "rao",
            "Ra",
            "R",
            "Lakhani1",
            "La-khani",
            "''"
    })
    void invalidLastNamesShouldReturnFalse(String lastName) {
        assertFalse(validator.validateLastName(lastName));
    }

    @Test
    void nullLastNameShouldReturnFalse() {
        assertFalse(validator.validateLastName(null));
    }

    @ParameterizedTest
    @CsvSource({
            "Lakhani, true",
            "Rao, true",
            "Ra, false",
            "R, false",
            "Lakhani1, false",
            "La-khani, false"
    })
    void lastNameValidationShouldMatchExpectedResult(String lastName, boolean expected) {
        assertEquals(expected, validator.validateLastName(lastName));
    }
}

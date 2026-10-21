package user_registration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UC1FirstNameValidationTest {

    private UC1FirstNameValidation validator;

    @BeforeEach
    void setUp() {
        validator = new UC1FirstNameValidation();
    }

    @Test
    void validFirstNamesShouldReturnTrue() {
        assertTrue(validator.validateFirstName("Mihir"));
        assertTrue(validator.validateFirstName("Raj"));
        assertTrue(validator.validateFirstName("Riya"));
    }

    @ParameterizedTest
    @CsvSource({
            "mihir",
            "raj",
            "riya",
            "Mi",
            "R",
            "Mihir1",
            "Mi-hir",
            "''"
    })
    void invalidFirstNamesShouldReturnFalse(String firstName) {
        assertFalse(validator.validateFirstName(firstName));
    }

    @Test
    void nullFirstNameShouldReturnFalse() {
        assertFalse(validator.validateFirstName(null));
    }

    @ParameterizedTest
    @CsvSource({
            "Mihir, true",
            "Raj, true",
            "Mi, false",
            "Ra, false",
            "mihir, false"
    })
    void firstNameValidationShouldMatchExpectedResult(String firstName, boolean expected) {
        assertEquals(expected, validator.validateFirstName(firstName));
    }
}

package user_registration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class UC4MobileNumberValidationTest {

    private UC4MobileNumberValidation validator;

    @BeforeEach
    void setUp() {
        validator = new UC4MobileNumberValidation();
    }

    @ParameterizedTest
    @CsvSource({
            "true, '91 6123456789'",
            "true, '91 9876543210'",
            "false, '91 5123456789'",
            "false, '91 612345678'",
            "false, '91 61234567890'",
            "false, '9123456789'",
            "false, '91 61A3456789'",
            "false, ''"
    })
    void phoneValidationShouldMatchExpectedResult(boolean expected, String phone) {
        assertEquals(expected, validator.UC3MobileNumberValidation(phone));
    }

    @Test
    void nullPhoneShouldReturnFalse() {
        assertFalse(validator.UC3MobileNumberValidation(null));
    }
}

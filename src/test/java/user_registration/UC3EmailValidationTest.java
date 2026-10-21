package user_registration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class UC3EmailValidationTest {

    private UC3EmailValidation validator;

    @BeforeEach
    void setUp() {
        validator = new UC3EmailValidation();
    }

    @ParameterizedTest
    @CsvSource({
            "true, 'abc@yahoo.com'",
            "true, 'abc-100@yahoo.com'",
            "true, 'abc.100@yahoo.com'",
            "true, 'abc+100@gmail.com'",
            "true, 'abc111@abc.com'",
            "true, 'abc-100@abc.net'",
            "true, 'abc.100@abc.com.au'",
            "true, 'abc@1.com'",
            "true, 'abc@gmail.com.com'",
            "true, 'abc.xyz@bl.co.in'",
            "false, 'abc'",
            "false, 'abc@'",
            "false, '@abc.com'",
            "false, 'abc@.com.my'",
            "false, 'abc123@gmail.a'",
            "false, 'abc123@.com'",
            "false, 'abc123@.com.com'",
            "false, '.abc@abc.com'",
            "false, 'abc()*@gmail.com'",
            "false, 'abc@%.com'",
            "false, 'abc..def@yahoo.com'",
            "false, 'abc@yahoo..com'",
            "false, 'abc..2002@gmail.com'",
            "false, 'abc.@gmail.com'",
            "false, 'abc@abc@gmail.com'",
            "false, 'abc@gmail.com.1a'",
            "false, 'abc@gmail.com.aa.au'",
            "false, ''"
    })
    void emailValidationShouldMatchExpectedResult(boolean expected, String email) {
        assertEquals(expected, validator.validateEmail(email));
    }

    @Test
    void nullEmailShouldReturnFalse() {
        assertFalse(validator.validateEmail(null));
    }
}

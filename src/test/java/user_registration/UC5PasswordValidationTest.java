package user_registration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class UC5PasswordValidationTest {

    private UC5PasswordValidation validator;

    @BeforeEach
    void setUp() {
        validator = new UC5PasswordValidation();
    }

    @ParameterizedTest
    @CsvSource({
            "true, 'Pass@word1'",
            "true, 'Abcdef1!'",
            "true, 'Password1.'",
            "false, 'Password1'",
            "false, 'Pass@@word1'",
            "false, 'Pass@word!1'",
            "false, 'password1@'",
            "false, 'Password@'",
            "false, 'Abc1!'",
            "false, 'Pass word1!'",
            "false, ''"
    })
    void passwordValidationShouldMatchExpectedResult(boolean expected, String password) {
        assertEquals(expected, validator.validatePassword(password));
    }

    @Test
    void nullPasswordShouldReturnFalse() {
        assertFalse(validator.validatePassword(null));
    }
}

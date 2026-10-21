package user_registration;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        UC1FirstNameValidationTest.class,
        UC2LastNameValidationTest.class,
        UC3EmailValidationTest.class,
        UC4MobileNumberValidationTest.class,
        UC5PasswordValidationTest.class
})
class UserRegistrationTestSuite {
}

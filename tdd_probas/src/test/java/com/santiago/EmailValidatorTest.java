package com.santiago;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class EmailValidatorTest {

    @Test
    public void testValidEmails() {
        EmailValidator validator = new EmailValidator();
        assertTrue(validator.isValid("user@example.com"));
        assertTrue(validator.isValid("user123@example.co.uk"));
        assertTrue(validator.isValid("user.name@example-domain.com"));
    }

    @Test
    public void testInvalidEmails() {
        EmailValidator validator = new EmailValidator();
        assertFalse(validator.isValid("user@.com"));
        assertFalse(validator.isValid("user@example"));
        assertFalse(validator.isValid("user@example."));
        assertFalse(validator.isValid("@example.com"));
        assertFalse(validator.isValid("user.example.com"));
        assertFalse(validator.isValid(null));
        assertFalse(validator.isValid("useremail.com"));
        assertFalse(validator.isValid("user@emailcom"));
        
    }
}

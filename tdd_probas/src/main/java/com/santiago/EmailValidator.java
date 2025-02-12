package com.santiago;

public class EmailValidator {

    // Method to check if the email is valid
    public boolean isValid(String email) {
        if (email == null) {
            return false;
        }

        // Check if the email contains exactly one '@' symbol
        int atIndex = email.indexOf('@');
        if (atIndex == -1) {
            return false;
        }

        // Check that the local part (before '@') and domain part (after '@') are not empty
        String localPart = email.substring(0, atIndex);
        String domainPart = email.substring(atIndex + 1);

        if (localPart.isEmpty()) {
            return false;
        }
 
        // Check that the domain part contains at least one dot ('.')
        int dotIndex = domainPart.indexOf('.');
        if (dotIndex == -1 || dotIndex == 0 || dotIndex == domainPart.length() - 1) {
            return false;
        }

        return true;
    }
}

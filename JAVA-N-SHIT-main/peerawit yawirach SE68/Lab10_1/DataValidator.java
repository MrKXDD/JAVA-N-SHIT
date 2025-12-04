package Lab10_1;

public class DataValidator {
    public static void main(String[] args) {
        DataValidator validator = new DataValidator();
        // Test string validation
        System.out.println("String 'Hello': " + validator.isValid("Hello")); // true
        System.out.println("Empty string: " + validator.isValid("")); // false
        System.out.println("Null string: " + validator.isValid((String) null)); // false
        // Test age validation
        System.out.println("Age 25: " + validator.isValid(25)); // true
        System.out.println("Age 17: " + validator.isValid(17)); // false
        System.out.println("Age 121: " + validator.isValid(121)); // false
        // Test password validation
        System.out.println("Password 'secret', min 6: " + validator.isValid("secret", 6)); // true
        System.out.println("Password 'abc', min 6: " + validator.isValid("abc", 6)); // false
        System.out.println("Password null, min 6: " + validator.isValid(null, 6)); // false
    }

    public static boolean isValid(String string) {
        boolean check;
        if (string == null || string.isEmpty() || string.isBlank()) {
            check = false;
        } else {
            check = true;
        }
        return check;
    }

    public static boolean isValid(int age) {
        boolean check;
        if (age >= 18 && age <= 120) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    public static boolean isValid(String string, int minlength) {
        boolean check;
        if (string == null || string.length() < minlength) {
            check = false;
        } else {
            check = true;
        }
        return check;
    }
}

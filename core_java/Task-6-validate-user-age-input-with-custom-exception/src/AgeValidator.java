public class AgeValidator {
 
    public void validateAge(int age) throws UnderAgeException {
 
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
 
        if (age < 18) {
            throw new UnderAgeException("You must be at least 18 years old.");
        }
 
        if (age > 150) {
            throw new IllegalArgumentException("Please enter a valid age.");
        }
    }
}
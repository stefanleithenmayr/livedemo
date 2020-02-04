package at.htl.junit5.test.livecoding;

public class Examples {

    public int add(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public boolean canAccess(int age) throws InvalidAgeException {

        if(age < 0 || age > 100){
            throw new InvalidAgeException();
        }
        return age >= 16 && age <= 45;
    }
}

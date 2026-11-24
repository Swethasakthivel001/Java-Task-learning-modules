
public class DivisionCalculator {

    private final int numerator;
    private final int denominator;

    public DivisionCalculator(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public int divide() {
        return numerator / denominator;
    }
}

public class Fraction {
    double numerator,denominator;
    Fraction(int a, int b) {
        numerator = a;
        denominator = b;
    }

    void display() {
        double fraction=numerator/denominator;
        System.out.println ("Результат деления дроби = " + fraction);
    }
    public static void main(String[] args) {
        Fraction frac = new Fraction(10,18);
        frac.display();
    }
}
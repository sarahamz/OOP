public class Fraction {

        public int numerator;
        public int denominator;

        public static void main(String[] args) {
            // Bruch A
            Fraction a = new Fraction();
            a.numerator = 2;
            a.denominator = 3;

            // Bruch B
            Fraction b = new Fraction();
            b.numerator = 1;
            b.denominator = 2;

            Fraction c = a.add(b);
            System.out.println(c.toDecimal());
        }

        public float toDecimal() {
            return ((float) numerator) / ((float) denominator);
        }

        public Fraction inverse () {
            Fraction f = new Fraction();
            f.numerator = this.denominator;
            f.denominator = this.numerator;

            return f;
        }

        public Fraction multiply(Fraction a) {
            Fraction f = new Fraction();
            f.numerator = this.numerator * a.numerator;
            f.denominator = this.denominator * a.denominator;

            return f;
        }

        public Fraction divide(Fraction a) {
            return multiply(a.inverse());
        }

        public Fraction add(Fraction a) {
            int lcm = MathHelper.lcm(this.denominator, a.denominator);

            Fraction f = new Fraction();
            f.numerator = (this.numerator * (lcm / this.denominator)) + (a.numerator * (lcm / a.denominator));
            f.denominator = lcm;

            return f;
        }

        public Fraction subtract(Fraction a) {
            int lcm = MathHelper.lcm(this.denominator, a.denominator);

            Fraction f = new Fraction();
            f.numerator = (this.numerator * (lcm / this.denominator)) - (a.numerator * (lcm / a.denominator));
            f.denominator = lcm;

            return f;
        }
}
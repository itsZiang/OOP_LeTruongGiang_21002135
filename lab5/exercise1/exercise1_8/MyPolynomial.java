package exercise1.exercise1_8;

public class MyPolynomial {

    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    private int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        for (int i = this.getDegree(); i >= 0; i--) {
            description.append(this.coeffs[i])
                    .append("x")
                    .append("^")
                    .append(i)
                    .append(" + ");
        }
        description = description.delete(description.length() - 3, description.length());
        return description.toString();
    }

    public double evaluate(double x) {
        double polyValue = 0.0;
        for (int i = this.getDegree(); i >= 0; i--) {
            polyValue *= polyValue * x + this.coeffs[i];
        }
        return polyValue;
    }

    public MyPolynomial add(MyPolynomial right) {
        int maxDegree = Math.max(this.coeffs.length, right.coeffs.length);
        double[] addPolyData = new double[maxDegree];

        for (int i = 0; i < this.coeffs.length; i++) {
            addPolyData[i] += this.coeffs[i];
        }

        for (int i = 0; i < right.coeffs.length; i++) {
            addPolyData[i] += right.coeffs[i];
        }
        return new MyPolynomial(addPolyData);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int multiPolyDegree = this.getDegree() + right.getDegree() + 1;
        double[] multiPolyData = new double[multiPolyDegree];
        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                multiPolyData[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        return new MyPolynomial(multiPolyData);
    }
}

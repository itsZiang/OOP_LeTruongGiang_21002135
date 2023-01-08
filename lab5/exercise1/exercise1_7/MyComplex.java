package exercise1.exercise1_7;

public class MyComplex {

    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        if (imag < 0) return real + " - " + -imag + "i";
        return real + " + " + imag + "i";
    }

    public boolean isReal(){
        return imag == 0;
    }

    public boolean isImaginary(){
        return real == 0;
    }

    public boolean equals(double real, double imag){
        return this.real == real && this.imag == imag;
    }

    public boolean equals(MyComplex another){
        return this.imag == another.imag && this.real == another.real;
    }

    public double magnitude(){
        double result = real * real + imag * imag;
        return Math.sqrt(result);
    }

    public MyComplex addInto(MyComplex right){
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right){
        double a = this.real + right.real;
        double b = this.imag + right.imag;
        return new MyComplex(a,b);
    }
}

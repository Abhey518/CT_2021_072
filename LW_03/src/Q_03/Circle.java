package Q_03;

public class Circle {
    private double ri;
    private double ro;

    //NO-Arg Constructor
    public Circle() {

        this.ri = 0.0;
        this.ro = 0.0;
    }

    //setter for set the circle's radius
    public void setRadius(double ro, double ri) {

        this.ro = ro;
        this.ri = ri;
    }

    public double computeArea () {

        return ( (Math.PI * Math.pow(ro, 2)) - (Math.PI * Math.pow(ri, 2)) );
    }

    public void computeCircumference() {

        double C_ro = 2 * Math.PI * ro;
        double C_ri = 2 * Math.PI * ri;
        System.out.printf("Circumference of the outer circle: %.2f units\n", C_ro);
        System.out.printf("Circumference of the inner circle: %.2f units", C_ri);
    }
}

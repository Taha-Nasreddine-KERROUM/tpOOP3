package p2;

import p1.*;

public class Complexe implements IOperation {
    private double re;
    private double im;

    public Complexe() {
        this(0, 0);
    }

    public Complexe(double x) {
        this(x, 0);
    }

    public Complexe(double x, double y) {
        this.re = x;
        this.im = y;
    }

    public Complexe(Complexe c) {
        this(c.re, c.im);
    }

    public double getRe() {
        return re;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        Complexe c = (Complexe) o;
        return Double.compare(c.re, re) == 0 && Double.compare(c.im, im) == 0;
    }

    public Complexe add(Complexe c) {
        return new Complexe(this.re + c.re, this.im + c.im);
    }

    public Complexe sub(Complexe c) {
        return new Complexe(this.re - c.re, this.im - c.im);
    }
    
    public Complexe produit(Complexe c) {
        double re = this.re * c.re - this.im * c.im;
        double im = this.re * c.im + this.im * c.re;
        return new Complexe(re, im);
    }

    public double module() {
        return Math.sqrt(re * re + im * im);
    }


    public Complexe conjugate() {
        return new Complexe(this.re, -this.im);
    }

    @Override
    public String toString() {
        if (im >= 0) return re + " + " + im + "i";
        else return re + " " + im + "i";
    }
}

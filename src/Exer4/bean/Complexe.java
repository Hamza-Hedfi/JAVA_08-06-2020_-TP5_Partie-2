package Exer4.bean;


import Exer4.Abstract.Affichage;
import Exer4.inter.IOperation;

public class Complexe extends Affichage implements IOperation {

    private double im;
    private double re;

    public Complexe(double im, double re) {
        this.im = im;
        this.re = re;
    }


    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public void setRe(double re) {
        this.re = re;
    }

    @Override
    public String toString() {
        return "Complexe{" +
                "im=" + im +
                ", re=" + re +
                '}';
    }

    @Override
    public String affiche() {
        return toString();
    }

    @Override
    public Object plus(Object obj) {
        Complexe cmx = (Complexe) obj;
        this.im += cmx.im;
        this.re += cmx.re;

        return this;
    }

    @Override
    public Object moins(Object obj) {
        Complexe cmx = (Complexe) obj;
        this.im -= cmx.im;
        this.re -= cmx.re;

        return this;
    }
}

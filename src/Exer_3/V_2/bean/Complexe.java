package Exer_3.V_2.bean;


import Exer_3.V_2.inter.IAffichage;
import Exer_3.V_2.inter.IOperation;

public class Complexe implements IOperation <Complexe>, IAffichage {

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
    public Complexe plus(Complexe obj) {
        this.im += obj.im;
        this.re += obj.re;
        return this;
    }

    @Override
    public Complexe moins(Complexe obj) {
        this.im -= obj.im;
        this.re -= obj.re;
        return this;
    }
}

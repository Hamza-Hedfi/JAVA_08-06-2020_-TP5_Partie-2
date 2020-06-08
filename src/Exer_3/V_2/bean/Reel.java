package Exer_3.V_2.bean;

import Exer_3.V_2.inter.IAffichage;
import Exer_3.V_2.inter.IOperation;

public class Reel implements IOperation<Reel>, IAffichage {

    private double x;

    public Reel(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Reel{" +
                "x=" + x +
                '}';
    }

    @Override
    public String affiche() {
        return toString();
    }

    @Override
    public Reel plus(Reel obj) {
        this.x += obj.x;
        return this;
    }

    @Override
    public Reel moins(Reel obj) {
        this.x -= obj.x;
        return this;
    }
}

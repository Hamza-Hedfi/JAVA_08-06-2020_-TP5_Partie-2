package Exer4.bean;

import Exer4.Abstract.Affichage;
import Exer4.inter.IOperation;

public class Reel extends Affichage implements IOperation {

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
    public Object plus(Object obj) {
        Reel re = (Reel) obj;
        this.x += re.x;
        return this;
    }

    @Override
    public Object moins(Object obj) {
        Reel re = (Reel) obj;
        this.x -= re.x;
        return this;
    }
}

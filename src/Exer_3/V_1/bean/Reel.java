package Exer_3.V_1.bean;

import Exer_3.V_1.inter.IAffichage;
import Exer_3.V_1.inter.IOperation;

public class Reel implements IOperation, IAffichage {

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

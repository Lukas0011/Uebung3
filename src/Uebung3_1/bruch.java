package Uebung3_1;

import java.util.Objects;

public class bruch {
    private int nenner;
    private int zeahler;

    public bruch(int zeahler, int nenner) {
        this.nenner = nenner;
        this.zeahler = zeahler;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        bruch bruch = (bruch) o;
        return nenner == bruch.nenner && zeahler == bruch.zeahler;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nenner, zeahler);
    }

    public int getNenner() {
        return nenner;
    }

    public void setNenner(int nenner) {
        this.nenner = nenner;
    }

    public int getZeahler() {
        return zeahler;
    }

    public void setZeahler(int zeahler) {
        this.zeahler = zeahler;
    }

    @Override
    public String toString() {
        return "Bruch{" +
                "nenner=" + nenner +
                ", zeahler=" + zeahler +
                '}';
    }
}

package p1;

import p2.*;

public interface IOperation {
    @Override
    boolean equals(Object o);

    default void display(Complexe c) {
        System.out.println(c);
    }

    static Complexe sum(Complexe c1, Complexe c2) {
        return new Complexe(c1.getRe() + c2.getRe(), c1.getIm() + c2.getIm());
    }
}

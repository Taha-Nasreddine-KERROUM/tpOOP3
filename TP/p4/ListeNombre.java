package p4;

import p1.*;
import p2.*;

import java.util.ArrayList;

public class ListeNombre implements IOperation {
    private ArrayList<IOperation> nombres;

    public ListeNombre() {
        this.nombres = new ArrayList<IOperation>();
    }

    public void ajouter(IOperation nombre) {
        nombres.add(nombre);
    }

    public boolean contains(IOperation nombre) {
        return nombres.contains(nombre);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ListeNombre)) return false;

        ListeNombre other = (ListeNombre) obj;
        return this.nombres.equals(other.nombres);
    }

    public void afficher() {
        for (IOperation nombre : nombres) {
            if (nombre instanceof Complexe) {
                System.out.println((Complexe) nombre);
            }
        }
    }
}
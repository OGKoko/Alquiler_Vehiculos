package com.company;

/**
 * Created by e-imb on 23/05/2017.
 */
public class furgo extends carga {

    boolean isotermica;

    public furgo(String matricula, double PMA, boolean isotermica) {
        super(matricula, PMA);
        this.isotermica = isotermica;
    }

    @Override
    public double calcularPrecio(int dias) {
         double precioFur = super.calcularPrecio(dias);
         if(isotermica){
             precioFur= precioFur+200;
         }
         return precioFur;
    }

    @Override
    public String toString() {
        return "furgo{" +
                "matricula='" + matricula + '\'' +
                ", PMA=" + PMA +
                '}';
    }
}

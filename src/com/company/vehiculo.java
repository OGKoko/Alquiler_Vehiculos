package com.company;

/**
 * Created by e-imb on 23/05/2017.
 */
public abstract class vehiculo {

  protected String matricula;

    public vehiculo(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double calcularPrecio(int dias){
        return 50*dias;
    }

    @Override
    public String toString() {
        return "vehiculo{" +
                "Matricula='" + matricula + '\'' +
                '}';
    }
}

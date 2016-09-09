/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author amoreno15
 */
public class Carros {

    private String Marca;
    private String Color;
    private double Precio;
    private String Placa;
    private String Ciudad_De_Registro;
    private String Tipo;

    public Carros(String Marca, String Color, double Precio, String Placa, String Ciudad_De_Registro, String Tipo) {
        this.Marca = Marca;
        this.Color = Color;
        this.Precio = Precio;
        this.Placa = Placa;
        this.Ciudad_De_Registro = Ciudad_De_Registro;
        this.Tipo = Tipo;

    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getCiudad_De_Registro() {
        return Ciudad_De_Registro;
    }

    public void setCiudad_De_Registro(String Ciudad_De_Registro) {
        this.Ciudad_De_Registro = Ciudad_De_Registro;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

}

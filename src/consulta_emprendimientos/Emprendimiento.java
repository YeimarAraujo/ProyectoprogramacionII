/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consulta_emprendimientos;

/**
 *
 * @author USUARIO
 */
public class Emprendimiento {
    private String nombreEmprendedor;
    private String nombreEmprendimiento;
    private String productos;

    public Emprendimiento(String nombreEmprendedor, String nombreEmprendimiento, String productos) {
        this.nombreEmprendedor = nombreEmprendedor;
        this.nombreEmprendimiento = nombreEmprendimiento;
        this.productos = productos;
    }

    public String getNombreEmprendedor() {
        return nombreEmprendedor;
    }

    public String getNombreEmprendimiento() {
        return nombreEmprendimiento;
    }

    public String getProductos() {
        return productos;
    }

    public static Emprendimiento registrarEmprendimiento(String nombreEmprendedor, String nombreEmprendimiento, String productos) {
        return new Emprendimiento(nombreEmprendedor, nombreEmprendimiento, productos);
    }
}
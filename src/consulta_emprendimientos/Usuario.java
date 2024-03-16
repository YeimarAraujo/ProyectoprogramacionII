/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consulta_emprendimientos;

/**
 *
 * @author USUARIO
 */
import java.util.HashMap;
import java.util.Map;
public class Usuario {
    private String nombre;
    private int edad;
    private String correoElectronico;
    private String contraseña;
    private static Map<String, Usuario> usuariosRegistrados = new HashMap<>();

    public Usuario(String nombre, int edad, String correoElectronico, String contraseña) {
        this.nombre = nombre;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public static Usuario registrarUsuario(String nombre, int edad, String correoElectronico, String contraseña) {
        Usuario nuevoUsuario = new Usuario(nombre, edad, correoElectronico, contraseña);
        usuariosRegistrados.put(correoElectronico, nuevoUsuario);
        return nuevoUsuario;
    }

    public static Usuario iniciarSesion(String correoElectronico, String contraseña) {
        return usuariosRegistrados.getOrDefault(correoElectronico, null);
    }
    
}

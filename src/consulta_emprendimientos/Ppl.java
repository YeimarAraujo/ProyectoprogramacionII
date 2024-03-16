/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consulta_emprendimientos;

/**
 *
 * @author USUARIO
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Ppl {

  private static ArrayList<Usuario> usuariosRegistrados = new ArrayList<>();
    private static ArrayList<Emprendimiento> emprendimientos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("1. Registrarse como usuario");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Registrar emprendimiento");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opción:");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarUsuario(scanner);
                    break;
                case 2:
                    iniciarSesion(scanner);
                    break;
                case 3:
                    registrarEmprendimiento(scanner);
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    private static void registrarUsuario(Scanner scanner) {
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner
        System.out.println("Ingrese su correo electrónico:");
        String correoElectronico = scanner.nextLine();
        System.out.println("Ingrese su contraseña:");
        String contraseña = scanner.nextLine();

        Usuario nuevoUsuario = Usuario.registrarUsuario(nombre, edad, correoElectronico, contraseña);
        usuariosRegistrados.add(nuevoUsuario);
        System.out.println("¡Usuario registrado correctamente!");
    }

    private static void iniciarSesion(Scanner scanner) {
        System.out.println("Ingrese su correo electrónico:");
        String correoElectronico = scanner.nextLine();
        System.out.println("Ingrese su contraseña:");
        String contraseña = scanner.nextLine();

        Usuario usuario = Usuario.iniciarSesion(correoElectronico, contraseña);
        if (usuario != null) {
            System.out.println("¡Inicio de sesión exitoso! Bienvenido, " + usuario.getNombre() + "!");
        } else {
            System.out.println("Correo electrónico o contraseña incorrectos. Por favor, inténtelo de nuevo.");
        }
    }

    private static void registrarEmprendimiento(Scanner scanner) {
        System.out.println("Ingrese su nombre:");
        String nombreEmprendedor = scanner.nextLine();
        System.out.println("Ingrese el nombre de su emprendimiento:");
        String nombreEmprendimiento = scanner.nextLine();
        System.out.println("Ingrese los productos que ofrece su emprendimiento:");
        String productos = scanner.nextLine();

        Emprendimiento nuevoEmprendimiento = Emprendimiento.registrarEmprendimiento(nombreEmprendedor, nombreEmprendimiento, productos);
        emprendimientos.add(nuevoEmprendimiento);
        System.out.println("¡Emprendimiento registrado correctamente!");
    
    }
    
}

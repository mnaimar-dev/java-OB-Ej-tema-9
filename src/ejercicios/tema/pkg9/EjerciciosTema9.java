/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.tema.pkg9;

/**
 *
 * @author Nicoaimar
 */

/* 
    1- Crea una clase Persona con las siguientes variables: ✅
        - La edad 
        - El nombre 
        - El teléfono 
    2- Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, 
       esta nueva clase tendrá la variable credito solo para esa clase. ✅
    3- Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, 
    el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla. ✅
    4- Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, 
       y con una variable salario que solo tenga la clase Trabajador. ✅
*/
public class EjerciciosTema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        
        cliente.edad = 27;
        cliente.nombre = "Nicolás";
        cliente.telefono = 35166666;
        cliente.credito = "€ 50.000";
        
        System.out.println("Nombre: " + cliente.nombre);
        System.out.println("Edad: " + cliente.edad);
        System.out.println("Teléfono: " + cliente.telefono);
        System.out.println("Cédito: " + cliente.credito);
        
        Trabajador trabajador = new Trabajador();
        
        trabajador.edad = 30;
        trabajador.nombre = "Mario";
        trabajador.telefono = 35155555;
        trabajador.salario = "€ 30.000";
        
        System.out.println("Nombre: " + trabajador.nombre);
        System.out.println("Edad: " + trabajador.edad);
        System.out.println("Teléfono: " + trabajador.telefono);
        System.out.println("Salario: " + trabajador.salario);
        
    }
    
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    String credito;
}

class Trabajador extends Persona {
    String salario;
}
package actividad.pkg12;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;

/**
 * @author LyrisseC
 */
public class AddressBook {
    public static void main(String[]args){
    HashMap<String, String> lista_contactos = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    int op;
    System.out.println("--------------------------------------------------------------");
    System.out.println("Bienvenido");
    System.out.println("Seleccionar una opcion.");
    System.out.println("1. Mostrar los contactos de la agenda.");
    System.out.println("2. Crear un nuevo contacto");
    System.out.println("3. Borrar un contacto");
    op = sc.nextInt();
    System.out.println("--------------------------------------------------------------");
    String numero;
    String nombre;
        switch (op) {
                case 1:
                    list(lista_contactos);
                break;

                case 2:
                    System.out.println("Dame el nombre del contacto");
                    nombre=sc.next();
                    System.out.println("Dame el numero del contacto");
                    numero=sc.next();
                    create(nombre, numero, lista_contactos);
                break;

                case 3:
                    System.out.println("Dame el numero que quieres eliminar");
                    numero = sc.next();
                    delete(numero, lista_contactos);
                break;            
        }

    private static void list(HashMap<String, String> listaContacto) {
    Scanner sc = new Scanner(System.in);
    String num = null;
        Set<String> contacto;
        contacto = listaContacto.keySet();
    System.out.println("Lista de contactos ");
    while(contacto.next()){
        num=sc.next();
        System.out.println(num+" - "+listaContacto.get(num));
    }
    }

    private static void create(String nombre, String numero, HashMap<String, String> listaContacto) {
        if (listaContacto.containsKey(numero)){
        System.out.println("Contacto existente");
        }else{
            listaContacto.put(numero, nombre);
        }
    }

    private static void delete(String numero, HashMap<String, String> lista_contactos) {
        if(lista_contactos.containsKey(numero)){
            lista_contactos.remove(numero);
        }else{
            System.out.println("Alumnos no existe");
        }
    }
    
    public static void load(){
        return null;   
    }
    public String save(){
        return null; 
    }
    
    
}


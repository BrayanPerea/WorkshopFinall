import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Capitan {
    private String nombre;
    private String apellido;
    private int matricula_navegacion;
    private Embarcacion embarcacion;
    Scanner sc = new Scanner(System.in);
    public Capitan(String nombre, String apellido, int matricula_navegacion, Embarcacion embarcacion){
        this.nombre=nombre;
        this.apellido=apellido;
        this.matricula_navegacion=matricula_navegacion;
    }
    public void set_crear_capitan(){
        System.out.println("Digite el nombre del capitan");
        nombre= sc.nextLine();
        System.out.println("Digite el apellido");
        apellido= sc.nextLine();
        System.out.println("Digite el numero de matricula de navegación");
        matricula_navegacion= sc.nextInt();

    }
    public String get_datos_capitan(){
        return "Nombre de capitan: " +nombre+ " "+ apellido +"\nNumero de matricula: " + matricula_navegacion;
    }

}

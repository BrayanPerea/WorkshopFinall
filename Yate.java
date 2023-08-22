import java.util.Scanner;

public class Yate extends Embarcacion {
   private int cantidad_camarotes;
   private int comprar_alquilar;
    Scanner sc =new Scanner(System.in);
    public Yate(double precio_base, int anio_fabricacion, int eslora, int cantidad_camarotes) {
        super(precio_base, anio_fabricacion, eslora);
        this.cantidad_camarotes = cantidad_camarotes;
    }

    public void validar_compra_o_alquiler() {
        System.out.println("1.Alquilar 2.Comprar");
        comprar_alquilar = sc.nextInt();
        Scanner AoC = sc;
        if (comprar_alquilar == 1){
            System.out.println("\nHas alquilado el Yate con exito");
        }else {
            System.out.println("\nHas comprado el Yate con exito");
        }
        System.out.println();
    }

    public int getCantidad_camarotes() {
        System.out.println("Digite la cantidad de camarotes");
        cantidad_camarotes = sc.nextInt();

        if (cantidad_camarotes > 7){
            System.out.println("\nEl Yate es de lujo, con "+cantidad_camarotes+" Camarotes");
        }else{
            System.out.println("\nYate corriente con " +cantidad_camarotes+" Camarotes");
        }
        return cantidad_camarotes;
    }
}

import java.util.Scanner;

public class Veleros extends Embarcacion{
     private int cantidad_mastiles;
     Scanner sc= new Scanner(System.in);
    public Veleros( double precio_base,
                   int anio_fabricacion, int eslora, int cantidad_mastiles) {
        super(precio_base, anio_fabricacion, eslora);
        this.cantidad_mastiles=cantidad_mastiles;
    }
    public void velero_grande_o_normal(){
        System.out.println("Digite la cantidad de mastiles");
        cantidad_mastiles = sc.nextInt();
        if (cantidad_mastiles>4){
            System.out.println("El velero es grande");
        }else {
            System.out.println("El velero es normal");
        }
    }
}

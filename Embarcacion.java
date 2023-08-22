public class Embarcacion implements Calculo{

    private double precio_base;
    private double valor_adicional = 20000;
    private int anio_fabricacion;
    private int eslora;

    public Embarcacion(double precio_base, int anio_fabricacion, int eslora){

    this.precio_base= precio_base;
    this.valor_adicional=calcular_monto_alquiler();
    this.anio_fabricacion=anio_fabricacion;
    this.eslora=eslora;
    }

    @Override
    public double calcular_monto_alquiler() {
        if (anio_fabricacion > 2020){
            precio_base += 20000;
            valor_adicional = 20000;
            System.out.println();
        }else{
           valor_adicional= 0;
        }
        return 0;
    }
    public String get_datos_embarcacion() {
        System.out.println("\nAño de fabricación: "+ this.anio_fabricacion +"\nEsloras: " +this.eslora+
                "\nValor adicional: " +this.valor_adicional + "\nPrecio final: "+ this.precio_base);
        return "";
    }
}

public class Main {
    public static void main(String[] args) {
        Yate yate1 = new Yate(20000, 2022, 3, 8);

        System.out.println("Para Juan");
        Capitan juan = new Capitan(" "," ", 0, yate1);
        juan.set_crear_capitan();

        yate1.validar_compra_o_alquiler();
        yate1.calcular_monto_alquiler();
        yate1.getCantidad_camarotes();
        yate1.get_datos_embarcacion();
        System.out.println(juan.get_datos_capitan());


        Veleros velero1 = new Veleros(2000, 2019, 2, 5);

        Capitan andres = new Capitan(" ", " ", 0, velero1);
        System.out.println("Para Andres");
        andres.set_crear_capitan();

        velero1.velero_grande_o_normal();
        velero1.calcular_monto_alquiler();
        velero1.get_datos_embarcacion();
        System.out.println(andres.get_datos_capitan());
    }
}
public class Vendedor {

    private String nombre;
    private double ventas;
    private double comision;
    private boolean activo;

    public Vendedor(String nombre, double ventas, double comision, boolean activo) {
        setNombre(nombre);
        setVentas(ventas);
        setComision(comision);
        setActivo(activo);
    }

    public void mostrarInformacion(){
        System.out.println("El nombre es: " + getNombre());
        System.out.println("Las ventas son: " + getVentas());
        System.out.println("Su comision es: " + getComision());
        System.out.println("Activo: " + isActivo());
    }


    public void registrarVenta(double cantidad){
        if (cantidad > 0){
            System.out.println("Venta registrada correctamente");
        }else{
            System.out.println("La cantidad no debe ser negativa");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null  || nombre.isBlank());
        nombre = "indef";
        this.nombre = nombre;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        if (ventas <= 0)
            ventas = 0;

        this.ventas = ventas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision_) {
        if (comision_ <= 0 || comision_ > 100)
            comision_ = 0;
        this.comision = comision_;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}






















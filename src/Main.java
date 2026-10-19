void main() {

    Vendedor v1 = new Vendedor("Carlos", 5, 3.50, true);
    Vendedor v2 = new Vendedor("Lucia", 2, 0.50, false);


    System.out.println("--Vendedor 1---");
    v1.mostrarInformacion();

    System.out.println("--Registrar Venta---");
    v1.registrarVenta(10);  
    v1.registrarVenta(-5);
    v1.registrarVenta(0);

    System.out.println("--InfoActualizada--");
    v1.mostrarInformacion();

    System.out.println("--Vendedor 2---");
    v2.mostrarInformacion();



}
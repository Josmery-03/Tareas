import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Cuenta Bancaria");
            System.out.println("2. Polimorfismo con Empleados");
            System.out.println("3. Ocultamiento de Atributos");
            System.out.println("4. Arrays y Referencias");
            System.out.println("5. Figuras geometricas");
            System.out.println("6. Gestion de productos");
            System.out.println("7. Inventario con arrays");
            System.out.println("8. Copia de arrays");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    ejecutarCuentaBancaria();
                    break;

                case 2:
                    ejecutarEmpleados();
                    break;

                case 3:
                    ejecutarOcultamiento();
                    break;

                case 4:
                    ejecutarArrays();
                    break;
                case 5:
                    ejecutarArea();
                    break;
                case 6:
                    ejecutarGestionDeProductos();
                    break;
                case 7:
                    ejecutarArraysDeObjetos();
                    break;
                case 8: 
                     ejecutarCopiaDeArray();
                     break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 0);

        sc.close();
    }


    // EJERCICIO 1

    public static void ejecutarCuentaBancaria() {

        CuentaBancaria cuenta =
                new CuentaBancaria("358-JOS", 1000);

        cuenta.depositar(600);
        cuenta.retirar(200);

        System.out.println("Saldo final: " + cuenta.getSaldo());
    }


    // EJERCICIO 2

    public static void ejecutarEmpleados() {

        Empleado emp1 = new EmpleadoFijo(30000);
        Empleado emp2 = new EmpleadoPorHora(80, 200);

        System.out.println(
                "Salario Empleado Fijo: " +
                emp1.calcularSalario()
        );

        System.out.println(
                "Salario Empleado por Hora: " +
                emp2.calcularSalario()
        );
    }

 
    // EJERCICIO 3

    public static void ejecutarOcultamiento() {

        A obj = new B();

        System.out.println("Valor de x: " + obj.x);


    }

  
    // EJERCICIO 4

    public static void ejecutarArrays() {

        int[] arreglo1 = {10, 20, 30};

        int[] arreglo2 = arreglo1;

        arreglo2[1] = 999;

        System.out.println("Contenido de arreglo1:");

        for (int n : arreglo1) {
            System.out.println(n);
        }
    }

    // EJERCICIO 5

    public static void ejecutarArea(){

    Figura [] misFiguras = new Figura[3];
  
  misFiguras [0] = new Cuadrado(5);
  misFiguras [1] = new Rectangulo(3, 7);
  misFiguras [2] = new Circulo(8);

  for (int i = 0; i < misFiguras.length; i++) {

    double resultado = misFiguras[i].area();

    System.out.println(
        "Area de la figura " + (i + 1) +
        ": " + resultado
    );
}


    }

    // EJERCICIO 6
    public static void ejecutarGestionDeProductos() {
        Producto producto = new Producto(
            "Laptop Dell",
            21000,
            3
        );
    System.out.println("Producto: " + producto.getNombre());
    System.out.println("Precio: " + producto.getPrecio());
    System.out.println("Cantidad de stock: " + producto.getStock());

    // Vender con sufiennte stock
    System.out.println("Venta de 2 unidades...");
    producto.vender(2);

    System.out.println("Cantidad de stock despues de la venta: " + producto.getStock());

    // Vender con stock insuficiente
    System.out.println("Intentar vender 6 unidades...");
    producto.vender(6);

}

   // EJERCICIO 7

public static void ejecutarArraysDeObjetos() {

    Producto[] Inventario = new Producto[3];

    Inventario[0] = new Producto(
        "Iphone 12 Pro Max",
        20000,
        8
    );

    Inventario[1] = new Producto(
        "Laptop Gateway",
        31500,
        0
    );

    Inventario[2] = new Producto(
        "Memoria USB",
        750,
        9
    );

    double valorTotal = 0;

    for (int i = 0; i < Inventario.length; i++) {
        valorTotal += Inventario[i].calcularValorTotal();
    }

    System.out.println("Valor total del inventario: " + valorTotal);

    System.out.println("\nProductos con stock disponible:");

    for (int i = 0; i < Inventario.length; i++) {
        if (Inventario[i].hayStock()) {
            System.out.println(
                Inventario[i].getNombre() +
                "  Precio: " + Inventario[i].getPrecio() +
                "  Stock: " + Inventario[i].getStock()
            );
        }
    }
}

// EJERCICIO 8

public static void ejecutarCopiaDeArray(){

        int[] arregloOriginal = {15, 20, 25, 30};

        int [] copia = arregloOriginal.clone();

        // Modificar la copia 
        copia [0] = 233;

        // Mostrar el areglo original y la copia 
           System.out.println("Array Original:");
    for (int i = 0; i < arregloOriginal.length; i++) {
        System.out.print(arregloOriginal[i] + " ");
    }

    System.out.println("\nArray Copia:");
    for (int i = 0; i < copia.length; i++) {
        System.out.print(copia[i] + " ");
    }

    }

    /*

  DIFERENCIA:
  - La copia superficial solo copia la direccion de los datos, si cambias uno, 
  cambian ambos porque apuntan al mismo lugar. Mientras que, la copia profunda crea un objeto nuevo con sus propios datos.
  
  Aquí, clone() sobre un array de enteros genera una copia profunda: 
  se reserva un nuevo espacio en memoria, haciendo que el array original 
  sea independiente del copiado.

*/

}



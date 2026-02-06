

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        setPrecio(precio); 
        setStock(stock);
    }

    public Producto(Producto nuevoProducto){
        this.nombre = nuevoProducto.nombre;
        this.precio = nuevoProducto.precio;
        this.stock = nuevoProducto.stock;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    // Validar que precio no sea negativo

    public void setPrecio (double precio) {
        if (precio < 0){
            this.precio = 0.0;
        }

        else {
            this.precio = precio;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0 ){
            this.stock = 0;
        }
        else {
            this.stock = stock;
        }
    }


    // Metodo vender

    public void vender(int cantidad) {
    if (cantidad > 0 && cantidad <= this.stock) {
        this.stock -= cantidad; 
        double total = cantidad * this.precio;
        System.out.println("Venta exitosa. Total a pagar: $" + total);
    } else {
        System.out.println("Error: No hay suficiente stock o cantidad no válida.");
    }
}

      // Aplicar descuento

    public void aplicarDescuento(double porcentaje){
        if (porcentaje > 0 && porcentaje <= 100) {
        precio = precio - (precio * porcentaje / 100);
    }
}

// Hay stock

public boolean hayStock(){
        return stock > 0;

}

// Agregar stock
public void agregarStock(int cantidad) {
    if (cantidad > 0) {
        stock = cantidad + stock;
    }
}

// Retirar stock

public boolean retirarStock(int cantidad) {
    if (cantidad > 0 && this.stock >= cantidad) {
        this.stock -= cantidad;
        return true;
    } else {
        return false;
    }
}

// Calcular valor total
public double calcularValorTotal() {
    return precio * stock;
}


}


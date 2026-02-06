public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado){
        this.lado = lado;

        }

// Area del cuadrado
     @Override
    public double area(){
    return lado * lado;

}

}
    


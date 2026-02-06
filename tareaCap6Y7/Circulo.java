public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
     
    }

    // Area del circulo
    @Override
    public double area(){
        return Math.PI * radio * radio;
    }
}

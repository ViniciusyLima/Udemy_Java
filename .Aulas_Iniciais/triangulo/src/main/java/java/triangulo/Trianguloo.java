package java.triangulo;

public class Trianguloo {
        
    public float base;
    public float altura;
    public float area;
    
    public Trianguloo() {
    }

    public Trianguloo(float b, float a) {
        this.base = b;
        this.altura = a;
    }
    
    public float calcularArea(){
    float area;
   return area=((this.base * this.altura)/2);
    }
    
    public void imprimirDados(){
        System.out.println("O valor da área é: " + this.area);
    }

    
    public static void main(String[] args) {
        
        Trianguloo tri = new Trianguloo(15, 20);
        tri.calcularArea();
        tri.imprimirDados();

    }
}

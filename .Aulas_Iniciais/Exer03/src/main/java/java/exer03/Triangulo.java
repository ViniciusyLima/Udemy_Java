package java.exer03;

public class Triangulo {
    
    float base;
    float altura;
    float area = (base * altura)/2;
    
    public Triangulo() {
    }

    public Triangulo(float b, float a) {
        this.base = b;
        this.altura = a;
    }
   
    void imprimirDados(){
        System.out.println("A Base é: " + this.base);
        System.out.println("A Altura é: " + this.altura);
        System.out.println("A Área é: " + this.area);
    };


}

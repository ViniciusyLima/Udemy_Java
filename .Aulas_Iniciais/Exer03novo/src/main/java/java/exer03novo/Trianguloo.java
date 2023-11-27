package java.exer03novo;

public class Trianguloo {
    
    float base;
    float altura;
    float area;
    
    public Trianguloo() {
    }

    public Trianguloo(float b, float a) {
        this.base = b;
        this.altura = a;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
    
    
    float calcularArea(float base,float altura){
    float area;
    area = base * altura/2;
    return area;
    }
    
    void imprimirDados(){
        System.out.println("O valor da área é: " + area);
    };
    
    public static void main(String[] args) {
     
        Trianguloo tri = new Trianguloo();
        tri.base = 15f;
        tri.altura = 30f;
        tri.calcularArea(30, 30);
        tri.imprimirDados();
        
    }
    
}

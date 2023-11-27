package escola.teste;

public class Professor extends Aluno {
    
    String nome;
    String universidade;
    float salario;
    boolean presente;
    
    void ensinar(){
        if (this.presente == false){
            System.out.println("Professor faltou!");
        } else {
            System.out.println("Ensinando os alunos...");
        }
    }
    void darFalta(){
        this.presente = false;
    }
    void darPresenca(){
        this.presente = true;
    }
            
    
    
}

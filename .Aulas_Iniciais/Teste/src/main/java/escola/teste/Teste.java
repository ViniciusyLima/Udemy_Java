
package escola.teste;

public class Teste {

    public static void main(String[] args) {
        
        //DADOS ALUNO
        Aluno pedro = new Aluno();
        pedro.nome = ("Pedro");
        pedro.periodo =("Manhã");
        pedro.ra = 123456789;
        pedro.mensalidade = 700.00f;
        pedro.presente = true;
        
        
        //PRINTAR
        System.out.println("Dados do Aluno:");

        //MÉTODO
        pedro.status();
        pedro.estudar();
        
        
        
        System.out.println("----------------------------------");
        
        
        
        // DADOS PROFESSOR
        Professor danilo = new Professor();
        danilo.nome = ("Danilo");
        danilo.salario = 1700.50f;
        danilo.universidade = ("Cruzeiro do Sul");
        danilo.presente = true;
        
        //PRINTAR
        System.out.println("Professor está presente? " + danilo.presente);
        System.out.println("Universidade do professor: " + danilo.universidade);
        
        
        //MÉTODO
        danilo.ensinar();
        
       
    }
        
}
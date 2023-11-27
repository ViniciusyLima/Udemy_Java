package escola.teste;

public class Aluno {
    
   public String nome;
   public String periodo;
   public int ra;
   public float mensalidade;
   public boolean presente;
   

   void estudar(){
       if (this.presente == false){
           System.out.println("Aluno faltou!");
       } else {
           System.out.println("Estudando...");
       }
   }
   
   void status(){
       System.out.println("Nome: " + this.nome);
       System.out.println("Está presente? " + this.presente);
       System.out.println("Período: " + this.periodo);
       System.out.println("RA: " + this.ra);
       System.out.println("Mensalidade: " + this.mensalidade);
   }        
}

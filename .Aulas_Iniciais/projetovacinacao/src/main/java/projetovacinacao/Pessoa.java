package projetovacinacao;

class Pessoa {
    
    CartaoVacina cartao;  
    private String nome;   
    private String cidade;  
    private String endereco;// trocar endereço por cidade  
    private int idade;  

    public Pessoa(String cidade, int idade) {  
        this.cidade = cidade;  
        this.idade = idade;  
    }  
 
    public String getNome() {  
        return nome;  
    }  

    public String getEndereco() {  
        return endereco;  
    }  
 
    public int getIdade() {
        return idade;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    void recebeVacina(CartaoVacina vacina){
        cartao= vacina;
    }

}
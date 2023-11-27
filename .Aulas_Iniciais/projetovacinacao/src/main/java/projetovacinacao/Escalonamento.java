package projetovacinacao;

import java.util.ArrayList;

class Escalonamento {
    
    
Pessoa pessoa;
    private ArrayList cadastrarVacina;
    private ArrayList vacinados;// é isso mesmo?
    private int faixaIdade;
    private int quantidadeVacina;// levar em consideração que todas serão aplicadas como primeira dose

    public Escalonamento(int faixaIdade) {
        this.faixaIdade=faixaIdade;
        cadastrarVacina= new ArrayList<>();
        vacinados= new ArrayList<>();
    }
    
    void verificarIdade() {// quem recebeu a vacina?
        if (pessoa.getIdade() >=faixaIdade) {
            //não poderá se vacinar
            // contar quantas vacinas foram aplicadas, com isso calcula-se a sobra
        }

    }

    void cadastroParaVacina(Vacina vacina) {
        cadastrarVacina.add(vacina);
    }

}

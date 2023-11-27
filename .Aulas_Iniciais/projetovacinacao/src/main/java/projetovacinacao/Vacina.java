package projetovacinacao;

class Vacina {
    
    private int quantidadeDose;// dose única, duas doses
    private int intervaloDose;
    private int lote;
    private String fabricante;

    public Vacina(int quantidadeDose, int lote, String fabricante) {
        this.quantidadeDose = quantidadeDose;
        this.lote = lote;
        this.fabricante = fabricante;
    }
   // se for dose única o intervalo de dose pode ser ignorado       
    public int getQuantidadeDose() {
        return quantidadeDose;
    }

    public int getIntervaloDose() {
        return intervaloDose;
    }

    public String getFabricante() {
        return fabricante;
    }    
    // a quantidade de dias deve ser acrescido na data
    
}

package entidades;

public class Inscritos {

    private Integer numInsc;
    private String RG;
    private String nome;
    private String sobrenome;
    private Integer idade;
    private String cel;
    private String celEmg;
    private String tpSng;
    private String categoria;

    public Inscritos(){

    }

    public Inscritos(Integer numInsc, String RG, String nome, String sobrenome, Integer idade, String cel, String celEmg, String tpSng, String categoria) {
        this.numInsc = numInsc;
        this.RG = RG;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cel = cel;
        this.celEmg = celEmg;
        this.tpSng = tpSng;
        this.categoria = categoria;
    }

    public Integer getNumInsc() {
        return numInsc;
    }

    public void setNumInsc(Integer numInsc) {
        this.numInsc = numInsc;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getCelEmg() {
        return celEmg;
    }

    public void setCelEmg(String celEmg) {
        this.celEmg = celEmg;
    }

    public String getTpSng() {
        return tpSng;
    }

    public void setTpSng(String tpSng) {
        this.tpSng = tpSng;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean maioridade(){
        return this.idade >= 18;
    }

    public double valorInsc(){

        double valor = 0;

        switch (this.categoria){
            case "pequeno":
                if(maioridade()){
                    valor  = 1500;
                }
                else{
                    valor = 1300;

                }
                break;
            case "medio":
                if(maioridade()){
                    valor  = 2300;
                }
                else{
                    valor = 2000;
                }
                break;

            case "avancado":
                    if(maioridade()){
                        valor  = 2800;
                    }
                    break;
         }
        return valor;
        }

    @Override
    public String toString() {
        return "Inscrição: " + numInsc + "| RG: " + RG + "| Nome: " + nome + "| Sobrenome: " + sobrenome + "| Idade: " + idade + "| Cel: " + cel +
                "| Cel Emg: " + celEmg + "| Tipo Sanguineo: " + tpSng + "| Categoria: " + categoria + "| Valor da Inscricao: " + valorInsc();
    }
}



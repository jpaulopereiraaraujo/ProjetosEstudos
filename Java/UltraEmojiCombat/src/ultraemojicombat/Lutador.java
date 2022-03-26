package ultraemojicombat;

public class Lutador implements LutadorInterface {

	private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int  derrotas;
    private int empates;
    
    public Lutador(String nom, String nac, int ide, float alt, float pes,
                     int vit, int der, int emp){
        this.setNome(nom);
        this.setNacionalidade(nac);
        this.setIdade(ide);
        this.setAltura(alt);
        this.setPeso(pes);                 
        this.setVitorias(vit);
        this.setDerrotas(der);
        this.setEmpates(emp);
    }

    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private float getAltura() {
        return altura;
    }

    private void setAltura(float altura) {
        this.altura = altura;
    }

    private float getPeso() {
        return peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria(categoria);
    }

    protected String getCategoria() {
        return categoria;
    }

    private void setCategoria(String categoria) {
        if (this.peso < 52.2){
            this.categoria = "Inválido";
        }else if (this.peso <= 70.3){
            this.categoria = "Leve";
        }else if (this.peso <= 83.9 ){
            this.categoria = "Médio";
        }else if (this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    @Override
    public void apresentar() {
        System.out.println("Apresentando o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("com + " + this.getIdade() + " anos e medindo " + this.getAltura());
        System.out.println("pesando " + this.getPeso() + " kg");
        System.out.println("Com " + this.getVitorias() + " Vitórias.");
        System.out.println(this.getDerrotas() + " derrotas.");
        System.out.println("e " + this.getEmpates() + " empates.");
    }

    @Override
    public void Status() {
        System.out.println(this.getNome() +" é um peso " + this.getCategoria());
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    

	
}

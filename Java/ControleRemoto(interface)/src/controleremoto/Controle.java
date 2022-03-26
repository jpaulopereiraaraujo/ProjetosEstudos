package controleremoto;

public class Controle implements ControleInterface {
	private int volume;
    private int muteVolume;
    private boolean ligado;
    private boolean tocando;
    
    public Controle(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public int getMuteVolume(){
        return muteVolume;
    }
    
    public void setMuteVolume(int mvolume){
        this.muteVolume = mvolume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        System.out.println("Ligando");
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("=====Menu=====");
        System.out.println("Volume: " + getVolume());
        for (int i = 0; i<= this.getVolume(); i += 10){
            System.out.print("[]");
        }
        if (isLigado() == true){
            System.out.println("Ligado");
        }
        else{
            System.out.println("Desligado");
        }
        if (isTocando() == true){
            System.out.println("Tocando");
        }
        else{
            System.out.println("Pausado");
        }
    
    }

    @Override
    public void fecharMenu() {
    System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado() == true && this.getVolume() <= 100) {
            this.setVolume(this.getVolume() + 5);
        }else{
            System.out.println("Não foi posível aumentar o volume.");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado() == true && this.getVolume() >= 0){
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume() > 0){
            this.setMuteVolume(this.getVolume());
            this.setVolume(0);
            
        }else{
            System.out.println("Erro, não foi possível ligar o mudo.");
        }
              
        
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0){
            this.setVolume(this.getMuteVolume());
        }else{
            System.out.println("Erro, o mudo já está desligado.");
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && !(this.isTocando()));
           this.setTocando(true);
    }

    @Override
    public void pause() {
        if(this.isLigado() && (this.isTocando())){
           this.setTocando(true);
        }
    }

}

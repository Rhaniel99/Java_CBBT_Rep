// estacao, volume, estado
// Métodos: ligar, desligar, aumentar volume, diminuir volume, mudar estação
public class Radio {
    int station = 1;
    int volume = 2;
    boolean ligado = false;
    
    public void ligar(){
        if (ligado == true){
            System.out.println("A radio ja está ligada");
        }else{
            ligado = true;
            System.out.println("A radio está ligada");
        }
    }
    public void desligar(){
        if (ligado == false){
            System.out.println("A radio ja está desligada");
        }else{
            ligado = false;
            System.out.println("A radio está desligada");
        }
      
    }
    public void aumentarVolume(){
        if (volume >= 100){
            System.out.println("Volume máximo atingido, plebeu.");
        }else{
            ++ volume;
            System.out.println("Volume atual: " + volume);
        }
        
    }
    public void diminuirVolume(){
        if (volume <= 0){
            System.out.println("Já está no minimo, plebeu.");
        }else{
            -- volume;
            System.out.println("Volume atual: " + volume);
        }
    }
    public void mudarEstacao(int novaEstacao){  
        System.out.println("A estação atual é: " + station + " | A nova estação é: " + (station = novaEstacao));
    }
}


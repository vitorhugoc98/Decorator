package decorator;
public class Cliente {
    public static void main(String[] args) {
        Carro carro00 = new ArCondicionado(new VidrosEletricos(new CarroComponenteConcreto())); 
        carro00.montarCarro();
        
        Carro carro01 = new CarroComponenteConcreto(); 
        carro01 = new ArCondicionado(carro01);
        carro01.montarCarro();
    }
    
}

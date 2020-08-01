package decorator;
//concrete decorator
public class VidrosEletricos extends CarroDecorator{
    
    public VidrosEletricos(Carro carro) {
        super(carro);
    }
    
    @Override
    public void montarCarro(){
        super.montarCarro();
        System.out.println("Adicinados os vidros eletricos.");
    }
    
}

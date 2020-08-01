package decorator;
////concrete decorator
public class ArCondicionado extends CarroDecorator{
    
    public ArCondicionado(Carro carro) {
        super(carro);
    }
    
    @Override
    public void montarCarro(){
        super.montarCarro();
        System.out.println("Adicionado o ar-condicionado.");
    }
    
}

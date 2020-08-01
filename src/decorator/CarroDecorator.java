package decorator;
public abstract class CarroDecorator implements Carro{
    protected Carro carro;
    
    CarroDecorator(Carro carro){
        this.carro = carro;
    }
    
    @Override
    public void montarCarro() {
        this.carro.montarCarro();
    }
    
}

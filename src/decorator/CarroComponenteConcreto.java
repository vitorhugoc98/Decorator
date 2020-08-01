package decorator;

//componente concreto
public class CarroComponenteConcreto implements Carro{

    @Override
    public void montarCarro() {
        System.out.println("Montando carro básico. ");
    }
    
}

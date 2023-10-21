import facade.Facade;
import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.Comportamento;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.ComportamentoOfensivo;
import strategy.Robo;

public class Test {
    public static void main(String[] args) throws Exception {
        //Singleton
        SingletonEager eager = new SingletonEager();    
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = new SingletonLazyHolder();
        System.out.println(lazyHolder);

        SingletonLazy lazy = new SingletonLazy();
        System.out.println(lazy);

        //Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento ofensivo = new ComportamentoOfensivo();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.setComportamento(ofensivo);
        robo.setComportamento(defensivo);

        robo.mover();
        
        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("João", "38078799");

    }
}

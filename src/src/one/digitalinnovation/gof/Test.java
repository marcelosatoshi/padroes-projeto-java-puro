package src.one.digitalinnovation.gof;

import src.one.digitalinnovation.gof.facade.Facade;
import src.one.digitalinnovation.gof.singleton.SingletonEager;
import src.one.digitalinnovation.gof.singleton.SingletonLazy;
import src.one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import src.one.digitalinnovation.gof.strategy.Comportamento;
import src.one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import src.one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import src.one.digitalinnovation.gof.strategy.ComportamentoNormal;
import src.one.digitalinnovation.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		// Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Marcelo", "14801788");
	}

}

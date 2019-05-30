package br.com.caelum.ingresso.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class Carrinho {

	private List<Ingresso> ingressos = new ArrayList<>();

	public void add(Ingresso ingresso) {
		System.out.print("passou aqui");
		ingressos.add(ingresso);
	}

	public boolean isSelecionado(Lugar lugar) {
		return ingressos.stream().map(Ingresso::getLugar).anyMatch(lugarDoIngresso -> lugarDoIngresso.equals(lugar));
	}
	
	
	public List<Ingresso> getIngresso() {
		return ingressos;
	}

	public void setIngresso(List<Ingresso> ingresso) {
		this.ingressos = ingresso;
	}

}

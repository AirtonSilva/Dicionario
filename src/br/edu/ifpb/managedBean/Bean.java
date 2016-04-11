package br.edu.ifpb.managedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.edu.ifpb.entidade.Palavre;

@RequestScoped
@ManagedBean
public class Bean {
	
	private Palavre palavra;
	
	public Palavre getPalavre() {
		return palavra;
	}
	
	public String buscar(){
		
		String definicao = null;
		palavra.setDefinicao(definicao);
		
		System.out.println(palavra.getDefinicao());
		return null;
		
	}

	public Palavre getPalavra() {
		return palavra;
	}

	public void setPalavra(Palavre palavra) {
		this.palavra = palavra;
	}
	
}
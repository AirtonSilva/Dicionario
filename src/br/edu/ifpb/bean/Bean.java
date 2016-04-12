package br.edu.ifpb.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.edu.ifpb.entidade.Palavre;

@RequestScoped
@ManagedBean
public class Bean {
	
	private Palavre palavra;
	private String auxiliar;

	public Palavre getPalavra() {
		return palavra;
	}

	public void setPalavra(Palavre palavra) {
		this.palavra = palavra;
	}

	public String buscar(){
		
		auxiliar = palavra.getDefinicao();
		palavra.setDefinicao(auxiliar);

		System.out.println(palavra.getDefinicao());
		System.out.println(auxiliar);
		return null;
		
	}
	
	public Bean(){
		this.palavra = new Palavre();
	}
	
}
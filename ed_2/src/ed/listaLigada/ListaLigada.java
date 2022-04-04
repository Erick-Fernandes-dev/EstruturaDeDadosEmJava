package ed.listaLigada;

public class ListaLigada {
	
	private Celula primeiro = null;
	private Celula ultima = null;
	private int totalDeElementos = 0;
	
// =========================================================================================================================	
	public void adicionaNocomeco(Object elemento) {
		
		Celula nova = new Celula(elemento, primeiro);
		this.primeiro = nova;
		
		if (this.totalDeElementos == 0) {
			this.ultima = this.primeiro;
		}
		
		this.totalDeElementos++;
	}
// =========================================================================================================================	
	@Override
	public String toString() {
	
		if (this.totalDeElementos == 0) {
			return "[]";
		}
		
		Celula atual = primeiro;
		
		StringBuilder builder = new StringBuilder("[");
		
		for (int i = 0; i < totalDeElementos;  i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			
			atual = atual.getProximo();
		}
		
		builder.append("]");
		
		return builder.toString();
		
	}
	// =========================================================================================================================
	public void adiciona(Object elemento) {
		
		if (this.totalDeElementos == 0) {
			adicionaNocomeco(elemento);
			
		} else {
			Celula nova = new Celula(elemento, null);
			this.ultima.setProximo(nova);
			this.ultima = nova;
			this.totalDeElementos++;
		}
		
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}
// =========================================================================================================================	
	private Celula pegaCelula(int posicao) {
		
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao inexistente");
			 
		}
		
		Celula atual = primeiro;
		
		for (int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}
		
		return atual;
		
	}

// =========================================================================================================================	

	public void adiciona(int posicao, Object elemento) {
		
		if (posicao == 0) {
			adicionaNocomeco(elemento);
		} else if (posicao == this.totalDeElementos) {
			adiciona(elemento);
		} else {
			
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula nova = new Celula(elemento, anterior.getProximo());
			anterior.setProximo(nova);
			this.totalDeElementos++;
			
		}	
	}
// =========================================================================================================================	
	public Object pega(int posicao) {
		return this.pegaCelula(posicao);
	}
// =========================================================================================================================	
	public void removeDoComeco() {
		
		if (this.totalDeElementos == 0) {
			throw new IllegalArgumentException("lista vazia");
		}
		
		this.primeiro = this.primeiro.getProximo();
		this.totalDeElementos--;
		
		if (this.totalDeElementos == 0) {
			this.ultima = null;
		}
		
		
	}
// =========================================================================================================================	
	public void remove(int posicao) {
		
	}
// =========================================================================================================================	
	public int tamanho() {
		return this.totalDeElementos;
	}
// =========================================================================================================================	
	public boolean contem(Object o) {
		return false;
	}

}

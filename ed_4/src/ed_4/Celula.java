package ed_4;


public class Celula {
	
	private Object elemento;
	
	private Celula proxima;
	private Celula anterior;
	
	public Celula(Object elemento) {
		this(null, elemento);
	}

	public Celula(Celula proxima, Object elemento) {
		
		this.elemento = elemento;
		this.proxima = proxima;
	}


	public Celula getProxima() {
		return proxima;
	}

	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}
	
	
	public Object getElemento() {
		return elemento;
	}
	public Celula getAnterior() {
		return anterior;
	}
	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}
	
	

}

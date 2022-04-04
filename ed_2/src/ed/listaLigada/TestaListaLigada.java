package ed.listaLigada;

public class TestaListaLigada {
	
	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		
		lista.adicionaNocomeco("mauricio");
		System.out.println(lista);
		
		lista.adicionaNocomeco("paulo");
		System.out.println(lista);
		
		lista.adicionaNocomeco("guilherme");
		System.out.println(lista);
		
		lista.adiciona("Marcelo");//ADICIONAR NO FIM
		System.out.println(lista);
		
		lista.adiciona(2, "Gabriel");
		System.out.println(lista);
		
		System.out.println(lista.tamanho());
		
		lista.removeDoComeco();
		
		System.out.println(lista);
		System.out.println(lista.tamanho());
		
		
	}

}

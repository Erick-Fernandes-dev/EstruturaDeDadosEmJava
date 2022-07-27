package ed.conjunto;

import java.util.LinkedList;
import java.util.List;

import javax.print.DocFlavor.STRING;

public class Conjunto {

    private LinkedList<LinkedList<String>> tabela = new LinkedList<LinkedList<String>>();

    public Conjunto() {
        for (int i = 0; i < 26; i++) {
            tabela.add(new LinkedList<String>());
        }
    }
    public void adiciona(String palavra) {

        if (!contem(palavra)) {
            int indice = calculaIndeceDaTabela(palavra);
            List<String> lista = tabela.get(indice);
            tabela.add(lista);
        }

    }

    private boolean contem(String palavra) {
        int indice = calculaIndeceDaTabela(palavra);

        return tabela.get(indice).contains(palavra);
    }

    private int calculaIndeceDaTabela(String palavra) {

        return palavra.toLowerCase().charAt(0) % 26;

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return tabela.toString();
    }
    
}

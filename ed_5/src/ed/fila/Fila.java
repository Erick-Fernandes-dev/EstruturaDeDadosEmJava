package ed.fila;

import java.util.LinkedList;

public class Fila {

    private LinkedList<String> alunos = new LinkedList<>();


    public void adiciona(String aluno) {
        alunos.add(aluno);

    }

    public String remove() {
        return alunos.remove(0);
    }

    public boolean vazia() {
        return alunos.isEmpty();
    }

    @Override
    public String toString() {
        return alunos.toString();
    }
}

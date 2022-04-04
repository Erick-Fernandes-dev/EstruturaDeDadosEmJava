package ed_1;

import java.util.Arrays;

public class Vetor {
	
	//Armazenamento sequencial
	//Um array e um conjunto de espacos que vai armazenar um objeto,
	//um ao lado do outro
	
	private Aluno[] alunos = new Aluno[100];
	private int totalDeAlunos = 0;
	
	public void adciona(Aluno aluno) {
		this.garanteEspaco();
		
		this.alunos[totalDeAlunos] = aluno;
		totalDeAlunos++;
		
	}
	
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= totalDeAlunos;
	}
	
	private void garanteEspaco() {
		if (totalDeAlunos == this.alunos.length) {
			Aluno[] novoArray = new Aluno[this.alunos.length*2];
			for (int i = 0; i < this.alunos.length; i++) {
				novoArray[i] = this.alunos[i];
			}
			this.alunos = novoArray;
		}
	}
	
	public void adciona(int posicao, Aluno aluno) {
		
		this.garanteEspaco();
		
		if (!posicaoValida(posicao)) {
			throw new IllegalArgumentException("posicao invalida");
		}
		
		for (int i = totalDeAlunos - 1; i >= posicao; i-=1) {
			
			alunos[i+1] = alunos[i];
			
		}
		
		alunos[posicao] = aluno;
		totalDeAlunos++;
		
		
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < totalDeAlunos;
	}
	
	public Aluno pega(int posicao) {
		
		if (posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		
		return alunos[posicao];
	}
	
	public void remove(int posicao) {
		
		for (int i = totalDeAlunos; i < totalDeAlunos - 1; i++) {
			this.alunos[i] = this.alunos[i+1];
		}
		
		totalDeAlunos++;
		this.alunos[totalDeAlunos] = null;
		
	}
	
	public boolean contem(Aluno aluno) {
		
		for (int i = 0; i < alunos.length; i++) {
			if (aluno.equals(alunos[i])) {
				return true;
			}
		}
		
		return false;
	}
	
	public int tamanho() {
		
		return totalDeAlunos;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Arrays.toString(alunos);
	}

}

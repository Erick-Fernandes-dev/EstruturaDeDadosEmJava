package ed.pilha;

import java.util.Stack;

public class TesteDaPilha {
    
    public static void main(String[] args) {
        
        // Pilha pilha = new Pilha();

        // pilha.push("Mauricio");

        // System.out.println(pilha);

        // pilha.push("Guilherme");

        // System.out.println(pilha);

        // String r1 = pilha.pop();

        // System.out.println(r1);

        // String r2 = pilha.pop();

        // System.out.println(r2);

        // System.out.println(pilha.vazio());
        // pilha.push("Marcelo");
        // System.out.println(pilha.vazio());

        // System.out.println(pilha);

        Stack<String> stack = new Stack<>();
        stack.push("Mauricio");
        stack.push("Marclo");

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        //o peek é como se fosse um pop, só que, ele n remove de verdade da nossa pilha
        String nome = stack.peek();
        System.out.println(nome);

        // push -> inceri
        // pop -> remove
        // peek -> indica; mas não remove da pilha, só vai indicar o ultimo elemento da pilha

    }

}

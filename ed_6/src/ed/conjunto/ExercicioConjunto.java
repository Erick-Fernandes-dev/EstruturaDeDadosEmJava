package ed.conjunto;

public class ExercicioConjunto {

    public static void main(String[] args) {
        
        // Insira "Mauricio"
        // Insira "Mauricio"
        // Insira "Guilherme"
        // Insira "Paulo"
        // Remova "Guilherme"

        Conjunto conjunto = new Conjunto();

        conjunto.adiciona("Mauricio");
        conjunto.adiciona("Mauricio");
        conjunto.adiciona("Guilherme");
        conjunto.adiciona("Paulo");

        conjunto.remove("Guilherme");

        System.out.println(conjunto);

    }

}
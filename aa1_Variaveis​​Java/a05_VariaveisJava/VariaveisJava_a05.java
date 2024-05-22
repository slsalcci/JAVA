/*
Se você não quiser que outras pessoas (ou você mesmo) substituam os valores 
existentes, use a palavra reservada "final" (isso declarará a variável como 
"final" ou "constante", o que significa imutável e somente leitura).

Observação:
O programa abaixo irá gerar um erro: não é possível atribuir um valor a 
uma variável final. Portanto, não será possivel compilar.
*/

public class VariaveisJava_a05 {

	public static void main(String[] args) {

		final int numero = 99;
		numero = 53; 	// O programa irá gerar um erro: não é possível atribuir um valor a uma variável final. 
				          // Portanto, não será possivel compilar.

	}
}

/*
Mensagem do erro ao tentar compilar o programa:

C:\Users\Pichau\Documents\Java-Basico\a2_VariaveisJava\a05_VariaveisJava>javac VariaveisJava_a05.java
VariaveisJava_a05.java:16: error: cannot assign a value to final variable numero
                numero = 53;    // O programa irá gerar um erro: não é possível atribuir um valor a uma variável final.
                ^
1 error

C:\Users\Pichau\Documents\Java-Basico\a2_VariaveisJava\a05_VariaveisJava>
*/

public class VariaveisJava_a00 {

	public static void main(String[] args) {

		System.out.println("");

		System.out.println("\n\nA) Variáveis Java - a00");
		System.out.println("-------------------------------------------------------------");

		System.out.println("Variáveis são contêineres para armazenar valores de dados.");
		System.out.println("\nEm Java, existem diferentes tipos de variáveis, por exemplo: ");

		System.out.println("A1) String - armazena texto, como \"Olá\". Os valores da string estão entre aspas duplas");
		System.out.println("A2) int - armazena inteiros (números inteiros), sem decimais, como 123 ou -123");
		System.out.println("A3) float - armazena números de ponto flutuante, com decimais, como 19,99 ou -19,99");
		System.out.println("A4) char - armazena caracteres únicos, como \'a\' ou \'B\'. Os valores de caracteres estão entre aspas simples");
		System.out.println("A5) boolean - armazena valores com dois estados: verdadeiro ou falso");
		System.out.println("----------------------------------------------------------------------------------------------------------------------\n");


		System.out.println("\n\nB) Declarando (criando) variáveis");
		System.out.println("-------------------------------------------------------------");
		System.out.println("Para criar uma variável, você deve especificar o tipo e atribuir um valor a ela: ");
		System.out.println("\nB1) Sintaxe: type variableName = value;");
		System.out.println("\nOnde type é um dos tipos Java (como int ou String) e variableName é o nome da variável (como x ou name).");
		System.out.println("O sinal de igual é usado para atribuir valores à variável.");
		System.out.println("----------------------------------------------------------------------------------------------------------------------\n");

		
		System.out.println("\n\nC) Para criar uma variável que deve armazenar texto, observe o exemplo a seguir:");
		System.out.println("-------------------------------------------------------------");
		System.out.println("Exemplo: Crie uma variável chamada nome do tipo String e atribua a ela o valor \"Luiza\": \n");
		System.out.println("String nome = \"Luiza\";");
		System.out.println("System.out.println(nome);\n");

		String nome = "Luiza";
		System.out.println(nome);


	}
}

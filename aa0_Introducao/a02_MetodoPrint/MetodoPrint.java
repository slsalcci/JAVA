public class MetodoPrint {

	public static void main(String[] args) {
      		System.out.print("Existe também um print() método semelhante ao println(). ");
      		System.out.print("A única diferença é que não insere uma nova linha no final da saída.");
	}
}

/*
Observação(1): 	em Java o nome da classe deve ser igual ao nome do arquivo: 
            		MetodoPrint.java --> public class MetodoPrint {...}
  
Observação(2): 	o nome da classe deve sempre iniciar com a primeira letra maiúscula

Observação(3): 	Java segue o padrão CamelCase

Observação(4):
a) public class: Declaração da Classe --> ( public class MetodoPrint {...} )
b) MetodoPrint: Nome da Classe --> ( public class MetodoPrint {...} )

c) Método main():
                  public static void main(String[] args) {
                  		System.out.print("......");
                    	System.out.print("......");
                  	}

d) public static: Modificadores de Acesso do Método.
e) void: Tipo de Retorno do Método. Significa que não tem retorno (ou retorno vazio). 
f) main(): Nome do Método.
g) (String[] args): Parâmetros/Argumentos do Método (Array de String).
h) System. out. print(); : é o nome de uma função que serve para escrever informações na tela.
l) (".........."); : String deve ser escrita entre aspas duplas.
j) {}: Blocos estão entre {} (chaves)
*/

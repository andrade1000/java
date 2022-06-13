/**
 * 
 */
package carros;

/**
 * @author jhuly velasquez andrade
 *
 */
public class objetos {
	/**
	 * @param args
	 * Método Principal
	 */
	public static void main(String[] args) {
		Carro chevroletspin = new Carro();
		chevroletspin.ano=2022;
		chevroletspin.cor = "Cinza";
		System.out.println("Ano: " + chevroletspin.ano);
		System.out.println("Cor do Carro: " + chevroletspin.cor);
		chevroletspin.ligar();
		chevroletspin.acelerar();
		chevroletspin.desligar();
		Carro fusca = new Carro();
		fusca.ano = 1958;
		fusca.cor = "Preta";
		System.out.println("Ano: " + fusca.ano);
		System.out.println("Cor do Carro: " + fusca.cor);
		fusca.ligar();
		fusca.acelerar();
		fusca.desligar();
	}

}

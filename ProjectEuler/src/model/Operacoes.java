package model;

import java.util.ArrayList;

/**
 * @author Douglas Telles
 * @since 2016/10/06
 * Conjunto de operacoes comuns
 */
public class Operacoes {
	public Operacoes(){}

	/**
	 * @param int val
	 * @return int[], Números naturais abaixo do valor informado.
	 * @since 2016/10/06
	 */
	public int[] naturaisAbaixoDe(int val){
		int	x = 0;
		int[] naturais = new int[val];
		ArrayList<Integer> acumulador = new ArrayList<Integer>();

		for (x = 0; x < val; x++){
			acumulador.add(x);
		}

		naturais = new int[acumulador.size()];
		x = 0;
		for (int y : acumulador) {
			naturais[x++] = y;
		}

		return naturais;
	}

	/**
	 * @param int val
	 * @param int limite
	 * @return int[], Múltiplos de um valor.
	 */
	public int[] multiplosDe(int val, int[] intervalo){
		int x = 0;
		ArrayList<Integer> acumulador = new ArrayList<Integer>();
		int[] multiplos = new int[0];

		for (x = 0; x < intervalo.length; x++) {
			if (intervalo[x] > 0 && intervalo[x] % val == 0){
				acumulador.add(intervalo[x]);
			}
		}

		multiplos = new int[acumulador.size()];
		x = 0;
		for (int y : acumulador) {
			multiplos[x++] = y;
		}

		return multiplos;
	}

	/**
	 * @param int[], valores
	 * @return int, Resultado da soma do intervalo
	 */
	public int soma(int[] valores){
		int x = 0;
		int soma = 0;

		for (x = 0; x < valores.length; x++){
			soma += valores[x];
		}

		return soma;
	}
}
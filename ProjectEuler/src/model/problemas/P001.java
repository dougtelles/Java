package model.problemas;

/**
 * @author Douglas Telles
 * @since 2016/10/06
 * Se listar todos os números naturais abaixo de 10 que são múltiplos de 3 ou 5, ficamos com 3, 5, 6 e 9.
 * A soma desses múltiplos é de 23.
 * Localizar a soma de todos os múltiplos de 3 ou 5 abaixo de 1000 
 */
public class P001 {
	private int[]	naturais;
	private int[]	multiplos;
	private int		soma;

	public P001(){
		naturais	= new int[0];
		multiplos	= new int[0];
		soma		= 0;
	}

	public void setNaturais(int[] naturais){
		this.naturais = naturais;
	}

	public void setMultiplos(int[] multiplos){
		this.multiplos = multiplos;
	}

	public void setSoma(int soma){
		this.soma = soma;
	}

	public int[] getNaturais(){
		return naturais;
	}

	public int[] getMultiplos(){
		return multiplos;
	}

	public int getSoma(){
		return soma;
	}
}
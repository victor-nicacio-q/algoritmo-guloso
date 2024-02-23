package src;

/**
	COMENTARIOS GERAIS

	Seguindo os criterios de selecao, um objeto só poderá ser colocado na
	mochila caso ela suporte o total de peso.

	O total de peso ao se colocar um objeto (do tipo Objeto) é dado por
	mochila.getPesoUsado() + objeto.getPeso()

	Colocar um objeto na mochila significa alterar os seguintes campos da mochila:

	pesoUsado,

	valorDentroDaMochila, e

	numObjetosNaMochila.
*/

public abstract class MetodosGulosos {

	/**
	*	Este método deve implementar um algoritmo guloso que selecione objetos
	*	da listaDeObjetosDisponiveis a serem colocados na mochila, de acordo
	*	com o critério 'objetos de menor peso primeiro'. Caso dois objetos
	*	tenham o mesmo peso, o critério de desempate será 'objetos de maior
	*	valor primeiro' (apenas para os empates em peso).
	*
	*	@param pesoMaximoDaMochila Peso máximo suportado pela mochila
	*	@param listaDeObjetosDisponiveis Arranjo de objetos considerados no problema
	*
	*	@return Mochila carregada conforme essa estratégia
	*/
	public static Mochila utilizaMenorPeso(double pesoMaximoDaMochila, Objeto[] listaDeObjetosDisponiveis) {
		Mochila mochila = new Mochila(pesoMaximoDaMochila);

		Objeto aux = new Objeto(0,0);	//Objeto auxilar para a ordenação

		/* Variaveis para armazenar os valores que serão adicionados na mochila no final */
		int pesoFinal = 0;
		int valorFinal = 0;
		int numObj = 0;

		/* Ordenar os valores do array de objetos */
		for(int i = 0; i < listaDeObjetosDisponiveis.length -1; i++){
			for(int j = 0; j < listaDeObjetosDisponiveis.length - i -1; j++){
				if(listaDeObjetosDisponiveis[j].getPeso() > listaDeObjetosDisponiveis[j + 1].getPeso()){
					aux = listaDeObjetosDisponiveis[j];
					listaDeObjetosDisponiveis[j] = listaDeObjetosDisponiveis[j + 1];
					listaDeObjetosDisponiveis[j + 1] = aux;
				}
			}
		}

		/* Faz os teste para adicionar os objetos na mochila */
		for(int i = 0; i <= listaDeObjetosDisponiveis.length -1; i++){
			if(pesoFinal + listaDeObjetosDisponiveis[i].getPeso() <= pesoMaximoDaMochila){
				System.out.println(listaDeObjetosDisponiveis[i].getValor() + " | " + listaDeObjetosDisponiveis[i].getPeso());
				pesoFinal += listaDeObjetosDisponiveis[i].getPeso();
				valorFinal += listaDeObjetosDisponiveis[i].getValor();
				numObj++;
			}
		}

		/* Adiciona propriamente os valores no objeto Mochila */
		mochila.setPesoUsado(pesoFinal);
		mochila.setValorDentroDaMochila(valorFinal);
		mochila.setNumObjetosNaMochila(numObj);

		return mochila;
	}


	/**
	*	Este método deve implementar um algoritmo guloso que selecione objetos
	*	da listaDeObjetosDisponiveis a serem colocados na mochila, de acordo
	*	com o critério 'objetos de maior valor primeiro'. Caso dois objetos
	*	tenham o mesmo valor, o critério de desempate sera 'objetos de menor peso
	*	primeiro' (apenas para os empates em valor).
	*
	*	@param pesoMaximoDaMochila Peso máximo suportado pela mochila
	*	@param listaDeObjetosDisponiveis Arranjo de objetos considerados no problema
	*
	*	@return Mochila carregada conforme essa estratégia
	 */
	public static Mochila utilizaMaiorValor(double pesoMaximoDaMochila,	Objeto[] listaDeObjetosDisponiveis) {
		Mochila mochila = new Mochila(pesoMaximoDaMochila);

		Objeto aux = new Objeto(0,0);	//Objeto auxilar para a ordenação

		/* Variaveis para armazenar os valores que serão adicionados na mochila no final */
		int pesoFinal = 0;
		int valorFinal = 0;
		int numObj = 0;

		/* Ordenar os valores do array de objetos */
		for(int i = 0; i < listaDeObjetosDisponiveis.length -1; i++){
			for(int j = 0; j < listaDeObjetosDisponiveis.length - i -1; j++){
				if(listaDeObjetosDisponiveis[j].getValor() > listaDeObjetosDisponiveis[j + 1].getValor()){
					aux = listaDeObjetosDisponiveis[j];
					listaDeObjetosDisponiveis[j] = listaDeObjetosDisponiveis[j + 1];
					listaDeObjetosDisponiveis[j + 1] = aux;
				}
			}
		}

		/* Faz os teste para adicionar os objetos na mochila */
		for(int i = listaDeObjetosDisponiveis.length -1; i >= 0; i--){
			if(pesoFinal + listaDeObjetosDisponiveis[i].getPeso() <= pesoMaximoDaMochila){
				System.out.println(listaDeObjetosDisponiveis[i].getValor() + " | " + listaDeObjetosDisponiveis[i].getPeso());
				pesoFinal += listaDeObjetosDisponiveis[i].getPeso();
				valorFinal += listaDeObjetosDisponiveis[i].getValor();
				numObj++;
			}
		}

		/* Adiciona propriamente os valores no objeto Mochila */
		mochila.setPesoUsado(pesoFinal);
		mochila.setValorDentroDaMochila(valorFinal);
		mochila.setNumObjetosNaMochila(numObj);

		return mochila;
	}


	/**
	*	Este método deve implementar um algoritmo guloso que selecione objetos
	*	da listaDeObjetosDisponiveis a serem colocados na mochila, de acordo
	*	com o critério 'objetos de maior valor/peso primeiro (valor dividido por
	*	peso primeiro)'. Caso dois objetos tenham o mesmo valor/peso, o critério
	*	de desempate sera 'objetos de maior peso primeiro' (apenas para os empates).
	*
	*		@param pesoMaximoDaMochila Peso máximo suportado pela mochila
	*		@param listaDeObjetosDisponiveis Arranjo de objetos considerados no problema
	*
	*		@return Mochila carregada conforme essa estratégia
	*/
	public static Mochila utilizaMaiorValorDivididoPorPeso(double pesoMaximoDaMochila, Objeto[] listaDeObjetosDisponiveis) {
		Mochila mochila = new Mochila(pesoMaximoDaMochila);

		Objeto temp = new Objeto(0,0);	//Objeto auxilar para a ordenação

		/* Variaveis para armazenar os valores que serão adicionados na mochila no final */
		int pesoFinal = 0;
		int valorFinal = 0;
		int numObj = 0;
		double aux = 0;
		double aux2 = 0;

		/* Ordenar os valores do array de objetos */
		for(int i = 0; i < listaDeObjetosDisponiveis.length -1; i++){
			for(int j = 0; j < listaDeObjetosDisponiveis.length - i -1; j++){
				aux = listaDeObjetosDisponiveis[j].getValor() / listaDeObjetosDisponiveis[j].getPeso();
				aux2 = listaDeObjetosDisponiveis[j + 1].getValor() / listaDeObjetosDisponiveis[j + 1].getPeso();
				if(aux > aux2){
					temp = listaDeObjetosDisponiveis[j];
					listaDeObjetosDisponiveis[j] = listaDeObjetosDisponiveis[j + 1];
					listaDeObjetosDisponiveis[j + 1] = temp;
				}
			}
		}

		/* Faz os teste para adicionar os objetos na mochila */
		for(int i = listaDeObjetosDisponiveis.length -1; i >= 0; i--){
			if(pesoFinal + listaDeObjetosDisponiveis[i].getPeso() <= pesoMaximoDaMochila){
				System.out.println(listaDeObjetosDisponiveis[i].getValor() + " | " + listaDeObjetosDisponiveis[i].getPeso());
				pesoFinal += listaDeObjetosDisponiveis[i].getPeso();
				valorFinal += listaDeObjetosDisponiveis[i].getValor();
				numObj++;
			}
		}

		/* Adiciona propriamente os valores no objeto Mochila */
		mochila.setPesoUsado(pesoFinal);
		mochila.setValorDentroDaMochila(valorFinal);
		mochila.setNumObjetosNaMochila(numObj);

		return mochila;
	}

}

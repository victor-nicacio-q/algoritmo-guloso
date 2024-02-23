* **COdigo em Java que implementa um Método Guloso**

Algoritmo guloso ou míope é técnica de projeto de algoritmos que tenta resolver o problema fazendo a escolha localmente ótima em cada fase com a esperança de encontrar um ótimo global.

Seguindo os criterios de selecao, um objeto só poderá ser colocado na mochila caso ela suporte o total de peso.

O total de peso ao se colocar um objeto (do tipo Objeto) é dado por mochila.getPesoUsado() + objeto.getPeso()

Colocar um objeto na mochila significa alterar os seguintes campos da mochila:
	* pesoUsado
	* valorDentroDaMochila
	* numObjetosNaMochila
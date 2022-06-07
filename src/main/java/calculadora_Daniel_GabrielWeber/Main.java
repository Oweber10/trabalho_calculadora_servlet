package calculadora_Daniel_GabrielWeber;

public class Main {

	public static void main(String[] args) {
		
		
		//FUNCAO CONVERTE NUMERO	
		//dentro do input text do htmolh
		/*<!-- permitindo apenas numeros -->
		<input type="text" 
	 	onkeypress="return event.charCode >= 48 && event.charCode <= 57">*/
		
		//FUNCAO CONVERTE OPERACAO
		//CASO + = 1
		//CASO - = 2
		//CASO * = 3
		//CASO / = 4
		//ISSO OU O FORM ENVIA NUMERO JA E SO CONVERTE
		
		
		//funcao faz o carculo (abaixo)
		
		
		int n1, n2,op,result;
		n1 = n2 = op = result = 0;
		String s1, s2, sOp, sResult;
		
		switch(op) {
			case 1:  result = n1 + n2;
			break;
			case 2:  result = n1 - n2;
			break;
			case 3:  result = n1 * n2;
			break;
		
		
			case 4:  try {
				result = n1/n2;
			}	catch(Exception $e) {
				System.out.println("VAI TOMAR NO CU TAMBNMEABINFA DFKLAJSHDGFKASDHF");
			}
			break;
		}
		
		//funcao devolve valor pro html (converte de numero pra texto?)
	}
}

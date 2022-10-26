package calcDev;

import java.util.Scanner;

public class Calculadora {
	
	// v1 + v2
	boolean novoCalculo = true;
	int qtdCalc = 0;
	
	
	Scanner scan = new Scanner(System.in);
	public void init() {
		
		
		do {
			this.fluxo();
		} while (this.novoCalculo);
		
	}
	
	public void fluxo() {
		String mensagem = (this.qtdCalc == 0) ? "Expressao: " : "Nova Expressao: ";
		System.out.print(mensagem);
		String txt = scan.nextLine();
		String operacao[] = new String[3];
		
		
		if(txt.equalsIgnoreCase("sair")) {
			this.novoCalculo = false;
			
			String msgFim = (this.qtdCalc == 0) ? "Nenhuma operacao executada." : this.qtdCalc+" operacoes executadas.";
			System.out.println(msgFim);
			
			System.out.println("FIM");
		}else {

			operacao = txt.split(" ");
			float valor1 = Float.parseFloat(operacao[0]);
			float valor2 = Float.parseFloat(operacao[2]);

			switch (operacao[1]) {
			case "+":
				System.out.println(txt + " = " + this.adicao(valor1, valor2));
				break;
			case "-":
				System.out.println(txt + " = " + this.subtracao(valor1, valor2));
				break;
			case "*":
				System.out.println(txt + " = " + this.multiplicacao(valor1, valor2));
				break;
			case "/":
				System.out.println(txt + " = " + this.divisao(valor1, valor2));
				break;
			default:
				System.out.println("Operador de ferias");
				break;
			}		
			this.qtdCalc++;
			this.novoCalculo = true;
			
		}
		
	}
	
	
	public float adicao(float v1, float v2) {
		return v1 + v2;
	}
	
	public float subtracao(float v1, float v2) {
		return v1 - v2;
	}
	
	public float multiplicacao(float v1, float v2) {
		return v1 * v2;
	}
	
	public float divisao(float v1, float v2) {
		return v1 / v2;
	}
}

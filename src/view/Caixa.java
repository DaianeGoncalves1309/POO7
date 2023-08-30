package view;

import controller.CaixaController;

public class Caixa {
	public static void main(String[] args) {

		CaixaController cc = new CaixaController();
		System.out.println("o total da compra é: " + cc.adicionarVenda());

	}
}
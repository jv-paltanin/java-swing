package view;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Classe respons�vel por demonstrar a utiliza��o de janela (JFrame) e bot�o
 * (JButton)
 * 
 * @author Jo�o Victor
 * @since 01/03/2021
 */
public class Exemplo01 {

	// m�todo para exibir uma janela swing com o componente bot�o
	public void iniciaGui() {// in�cio do m�todo

		// criando o componente JFrame = janela e adicionando seu t�tulo
		JFrame janela = new JFrame("Exemplo tela e bot�o");

		// criando o componente JButton = bot�o e adicionando o seu t�tulo
		JButton botao = new JButton("Clique aqui");

		// configurar o tamanho do objeto janela
		// primeiro par�metro - largura da tela
		// segundo par�metro - altura da tela
		janela.setSize(500, 300);

		// adicionando o bot�o no objeto janela (dentro do seu content pane)
		janela.getContentPane().add(botao);

		// configurando a visibilidade da tela
		janela.setVisible(true);

		// informando que a tela n�o tem layout pr�-definido
		janela.getContentPane().setLayout(null);
	} // fim do m�todo

	// m�todo principal para executar a classe
	public static void main(String[] args) {
		new Exemplo01().iniciaGui();
	}

} // fim da classe
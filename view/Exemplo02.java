package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Classe respons�vel por demonstrar a utiliza��o de janela (JFrame), bot�es,
 * r�tulo e campo de texto
 * 
 * @author Jo�o Victor
 * @since 01/03/2021
 */
public class Exemplo02 {

	// respons�vel por criar a tela e adicionar seus componentes
	public void iniciaGui() {

		/*
		 * definindo a tela e suas configura��es
		 */
		JFrame janela = new JFrame();
		// configurando o t�tulo da tela
		janela.setTitle("Exemplo de campo de texto");
		// configurando o tamanho da tela
		janela.setSize(300, 200);
		// definir o layout como nulo da janela
		janela.getContentPane().setLayout(null);
		// configurando a centraliza��o do objeto janela
		janela.setLocationRelativeTo(null);

		/*
		 * definindo o r�tulo e suas configura��es JLabel
		 */
		JLabel lbNome = new JLabel();
		// configurando um texto a ser exibido na Label
		lbNome.setText("Nome:");
		// configurando o tamanho e local da label
		// primeiro argumento - posi��o x - do ponto zero para a direita
		// segundo argumento - posi��o y - do ponto zero para a baixo
		// terceiro argumento - largura
		// quarto argumento - altura
		lbNome.setBounds(10, 10, 40, 20);

		/*
		 * definindo o campo de texto (digita��o para o usu�rio)
		 */
		JTextField tfNome = new JTextField();
		// configurando o tamanho e local do campo de texto
		tfNome.setBounds(60, 10, 150, 20);

		/*
		 * definindo o bot�o e suas configura��es
		 */
		JButton botao = new JButton();
		// configurando o t�tulo do bot�o
		botao.setText("Clique aqui");
		// configurando o tamanho e local do bot�o
		botao.setBounds(10, 60, 100, 20);

		/*
		 * adicionando os componentes na tela
		 */
		janela.getContentPane().add(lbNome);
		janela.getContentPane().add(tfNome);
		janela.getContentPane().add(botao);

		/*
		 * configurando a visibilidade da tela
		 */
		janela.setVisible(true);

	} // fim do m�todo

	/*
	 * 
	 */
	public static void main(String[] args) {
		new Exemplo02().iniciaGui();
	}

} // fim da classe
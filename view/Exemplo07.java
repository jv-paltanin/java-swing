package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 * Classe respons�vel por demonstrar a utiliza��o de campo de senha
 * 
 * @author Jo�o Victor
 * @since 02/03/2021
 */
public class Exemplo07 {

	// declarando os atributos da tela
	private JFrame janela;
	// label para exibir r�tulo Senha na tela
	private JLabel lbSenha;
	// campo para digitar a senha e n�o exibir o conte�do
	private JPasswordField pfSenha;
	// painel para organiza��o dos componentes
	private JPanel painel;

	/*
	 * m�todo para criar a tela
	 */
	public void iniciaGui() {

		/*
		 * configura��es do JFrame - tela
		 */
		janela = new JFrame();
		// configurando o t�tulo da tela
		janela.setTitle("Exemplo de PasswordField");
		// configurando o tamanho da tela - largura/altura
		janela.setSize(300, 150);
		// configurando a posi��o inicial da tela - centralizada
		janela.setLocationRelativeTo(null);

		/*
		 * configura��es do JLabel
		 */
		lbSenha = new JLabel();
		// configurando tezto inicial
		lbSenha.setText("Senha");
		// configurando a posi��o e tmaanho do componente
		lbSenha.setBounds(10, 40, 40, 20);

		/*
		 * configura��es do JPasswordField
		 */
		pfSenha = new JPasswordField();
		// configurando a posi�� e tamanho
		pfSenha.setBounds(60, 40, 200, 20);

		/*
		 * configura��es do painel da janela
		 */
		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		painel.add(lbSenha);
		painel.add(pfSenha);

		// configurando a visibilidade da tela
		janela.setVisible(true);

	} // fim do m�todo

	/*
	 * m�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		new Exemplo07().iniciaGui();
	}
} // fim da classe
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Classe para demonstrar a utiliza��o de janela (JFrame), textArea, textField,
 * bot�es e suas a��es.
 * 
 * @author Jo�o Victor
 * @since 01/03/2021
 */
public class Exemplo03 {

	/*
	 * declarando os componentes utilizados na tela
	 */
	private JFrame janela;
	private JTextField campo;
	private JTextArea area;
	private JButton botao1;
	private JButton botao2;

	/*
	 * m�todo para criar a inst�ncia dos objetos e componentes da tela e suas
	 * configura��es
	 */
	public void iniciaGui() { // in�cio do m�todo

		/*
		 * configurando a tela
		 */
		janela = new JFrame();
		// definindo o tamanho da tela
		janela.setSize(300, 300);
		// definindo o t�tulo da tela
		janela.setTitle("Exemplo de a��es");

		/*
		 * configurando o campo de texto
		 */
		campo = new JTextField();

		/*
		 * configurando a �rea de texto
		 */
		area = new JTextArea();

		/*
		 * configurando o primeiro botao
		 */
		botao1 = new JButton();
		// configurando o texto a ser exibido
		botao1.setText("Clique aqui");
		// adicionando uma evento de clique no componente
		botao1.addActionListener(new AcaoBotao1());

		/*
		 * configurando o segundo botao
		 */
		botao2 = new JButton();
		// configurando o texto a ser exibido
		botao2.setText("Troca cor");
		// adicionando uma evento de clique no componente
		botao2.addActionListener(new AcaoBotao2());

		/*
		 * adicionando os componentes na tela passando par�metros de localiza��o
		 */
		janela.getContentPane().add(BorderLayout.EAST, botao2);
		janela.getContentPane().add(BorderLayout.SOUTH, botao1);
		janela.getContentPane().add(BorderLayout.CENTER, area);
		janela.getContentPane().add(BorderLayout.NORTH, campo);

		/*
		 * configurando os par�metros de exibi��o da tela
		 */
		janela.setVisible(true);
	} // fim do m�todo

	/*
	 * classe interna auxiliar para controlar a a��o do primeiro bot�o
	 */
	public class AcaoBotao1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String aux = campo.getText();
			// atribuindo o valor digitado no componente area
			area.append(aux + "\n");
			// apagando co conte�do digitado pelo usu�rio
			campo.setText("");
		}

	} // fim da classe interna

	/*
	 * classe interna auxiliar para controlar a a��o do segundo bot�o
	 */
	public class AcaoBotao2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// verificando se a cor j� foi trocada
			if (area.getBackground().equals(Color.BLACK)) {
				// definindo a cor de fundo como branco
				area.setBackground(Color.WHITE);
				// definindo a cor do texto
				area.setForeground(Color.BLACK);
			} else {
				// definindo a cor de fundo como branco
				area.setBackground(Color.BLACK);
				// definindo a cor do texto
				area.setForeground(Color.WHITE);
			}

		}

	} // fim da classe interna

	// m�todo principal para executar a classe
	public static void main(String[] args) {
		new Exemplo03().iniciaGui();
	}

}// fim da classe
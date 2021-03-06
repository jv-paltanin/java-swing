package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 * Classe respons�vel por representar a utiliza��o do componente JPanel com abas
 * 
 * @author Jo�o Victor
 * @since 03/03/2021
 * @version 1.0
 */
public class Exemplo10 {

	// declarando os atributos da tela
	private JFrame janela;
	// declarando as labels auxiliares
	private JLabel lbAux1;
	private JLabel lbAux2;
	private JLabel lbAux3;
	// declarando os pain�is
	private JPanel aba1;
	private JPanel aba2;
	private JPanel aba3;
	// declarando o componente para controle de abas
	private JTabbedPane painelAbas;
	// declarando o painel para organizar os componentes
	private JPanel painelPrincipal;

	/*
	 * m�todo para criar a tela
	 */
	public void iniciaGui() {

		/*
		 * configura��es do JFrame - tela
		 */
		janela = new JFrame();
		// configurando o t�tulo da tela
		janela.setTitle("Exemplo de Abas");
		// configurando o tamanho da tela - largura/altura
		janela.setSize(390, 300);
		// configurando a posi��o inicial da tela - centralizada
		janela.setLocationRelativeTo(null);

		/*
		 * configura��es da primeira JLabel
		 */
		lbAux1 = new JLabel();
		lbAux1.setText("Primeira aba");

		/*
		 * configura��es da segunda JLabel
		 */
		lbAux2 = new JLabel();
		lbAux2.setText("Segunda aba");

		/*
		 * configura��es da terceira JLabel
		 */
		lbAux3 = new JLabel();
		lbAux3.setText("Terceira aba");

		/*
		 * configura��es da primeira aba
		 */
		aba1 = new JPanel();
		aba1.add(lbAux1);

		/*
		 * configura��es da segunda aba
		 */
		aba2 = new JPanel();
		aba2.add(lbAux2);

		/*
		 * configura��es da terceira aba
		 */
		aba3 = new JPanel();
		aba3.add(lbAux3);

		/*
		 * configura��es do controlador de abas - componente JTabbedPane
		 */
		painelAbas = new JTabbedPane();
		// adicionar as abas(pain�is) com o t�tulo
		painelAbas.add("Aba 1", aba1);
		painelAbas.add("Aba 2", aba2);
		painelAbas.add("Aba 3", aba3);
		// configurar a posi��o e tamanho
		painelAbas.setBounds(14, 21, 342, 200);
		/*
		 * configura��es do painel principal da tela
		 */
		painelPrincipal = (JPanel) janela.getContentPane();
		// configurar o layout inicial
		painelPrincipal.setLayout(null);
		painelPrincipal.add(painelAbas);

		// configurando a visibilidade da tela
		janela.setVisible(true);

	} // fim do m�todo

	/*
	 * m�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		new Exemplo10().iniciaGui();
	}

} // fim da classe
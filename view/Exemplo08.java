package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * Classe respons�vel por demonstrar a utiliza��o do componente JList e o
 * JScrollPane
 * 
 * @author Jo�o Victor
 * @since 03/03/2021
 */
public class Exemplo08 {

	// declarando os atributos da tela
	private JFrame janela;

	// label auxiliar para exibir a sele��o do usu�rio
	private JLabel lbAuxiliar;

	// atributo JLista para armazenar uma lista de op��es
	private JList ltDiaSemana;

	// atributo auxiliar ScrollPane
	private JScrollPane scroll;

	// painel para organizar os componentes
	private JPanel painel;

	// vetor auxiliar para armazenar os dias da semana
	private String diasSemana[] = { "Domingo", "Segunda", "Ter�a", "Quarta", "Quinta", "Sexta", "S�bado" };

	/*
	 * m�todo para criar a tela
	 */
	public void iniciaGui() {

		/*
		 * configura��es do JFrame - tela
		 */
		janela = new JFrame();
		// configurando o t�tulo da tela
		janela.setTitle("Exemplo de JList e JScrollPnae");
		// configurando o tamanho da tela - largura/altura
		janela.setSize(330, 330);
		// configurando a posi��o inicial da tela - centralizada
		janela.setLocationRelativeTo(null);

		/*
		 * configura��es do JLabel
		 */
		lbAuxiliar = new JLabel();
		// configurando o texto a ser exibido
		lbAuxiliar.setText("CTRL para multi-sele��es");
		// configura��es de estilos
		lbAuxiliar.setOpaque(true);
		lbAuxiliar.setBackground(Color.LIGHT_GRAY);
		lbAuxiliar.setForeground(Color.BLACK);
		// configurando a posi��o e tamanho do componente
		lbAuxiliar.setBounds(10, 10, 300, 30);

		/*
		 * configura��es do JList - lista de op��es
		 */
		ltDiaSemana = new JList(diasSemana);
		// configurando como o componente permitir� a sele��o dos seus dados - �nico ou
		// m�ltiplo
		ltDiaSemana.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		ltDiaSemana.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				// atribuindo o texto selecionado na label auxiliar
				lbAuxiliar.setText((String) ltDiaSemana.getSelectedValue());
			}
		});

		/*
		 * configura��es do JScrollPane
		 */
		scroll = new JScrollPane(ltDiaSemana);
		// configurando a posi��o e tamanho
		scroll.setBounds(10, 60, 300, 90);

		/*
		 * configura��es do painel da janela
		 */
		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		painel.add(lbAuxiliar);
		painel.add(scroll);

		// configurando a visibilidade da tela
		janela.setVisible(true);

	} // fim do m�todo

	/*
	 * m�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		new Exemplo08().iniciaGui();
	}

} // fim da classe
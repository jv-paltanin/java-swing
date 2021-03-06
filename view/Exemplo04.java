package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

/**
 * Classe respons�vel por demonstrar a utiliza��o do componente JRadioButton
 * 
 * @author Jo�o Victor
 * @since 02/02/2021
 */

public class Exemplo04 {

	// declarando os atributos
	private JFrame janela;
	// label auxiliar para exibir o que foi selecionado no radio button
	private JLabel lbAuxiliar;
	// declarando o componente radio button
	private JRadioButton rbSolteiro;
	private JRadioButton rbCasado;
	private JRadioButton rbViuvo;
	private JRadioButton rbDivorciado;
	// componente ButtonGroup respons�vel por gerenciar os componentes radio button
	private ButtonGroup grpRadio;
	// componente JButton para executar a��o de clique
	private JButton btVerificar;
	// componente JPanel para organiza��o
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
		janela.setTitle("Exemplo de Radio Button");
		// configurando o tamanho da tela
		janela.setSize(340, 275);
		// configurando a posi��o inicial da tela - centralizada
		janela.setLocationRelativeTo(null);

		/*
		 * configura��es do JLabel - r�tulo auxiliar
		 */
		lbAuxiliar = new JLabel();
		// configurando o texto inicial
		lbAuxiliar.setText("");
		// configurando a posi��o do texto
		lbAuxiliar.setHorizontalTextPosition(SwingConstants.CENTER);
		// configurando a posi��o e tamanho
		lbAuxiliar.setBounds(50, 20, 230, 20);

		/*
		 * configura��es do radio button
		 */
		rbSolteiro = new JRadioButton();
		rbCasado = new JRadioButton();
		rbViuvo = new JRadioButton();
		rbDivorciado = new JRadioButton();
		// configurando o texto do componente
		rbSolteiro.setText("Solteiro");
		rbCasado.setText("Casado");
		rbViuvo.setText("Vi�vo");
		rbDivorciado.setText("Divorciado");
		// configurando a posi��o e o tamanho
		rbSolteiro.setBounds(80, 50, 100, 25);
		rbCasado.setBounds(80, 75, 100, 25);
		rbViuvo.setBounds(80, 100, 100, 25);
		rbDivorciado.setBounds(80, 125, 100, 25);

		/*
		 * configura��es do ButtonGroup
		 */
		grpRadio = new ButtonGroup();
		grpRadio.add(rbSolteiro);
		grpRadio.add(rbCasado);
		grpRadio.add(rbViuvo);
		grpRadio.add(rbDivorciado);

		/*
		 * configura��es do JButton
		 */
		btVerificar = new JButton();
		// configurando o texto a ser exibido
		btVerificar.setText("Verificar");
		// configurando a posi��o e tamanho
		btVerificar.setBounds(126, 176, 84, 28);
		// configurando a a��o d bot�o
		btVerificar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				verificaRadioButton();
			}
		});

		/*
		 * configura��es do painel da tela - JPanel
		 */
		painel = (JPanel) janela.getContentPane();
		// configurar o layout inicial
		painel.setLayout(null);
		// adicionando os componentes no painel
		painel.add(lbAuxiliar);
		painel.add(rbSolteiro);
		painel.add(rbCasado);
		painel.add(rbViuvo);
		painel.add(rbDivorciado);
		painel.add(btVerificar);

		// configurando a visibilidade da tela
		janela.setVisible(true);
	} // fim do m�todo

	/*
	 * m�todo auxi�iar para verificar escolha do usu�rio no componente radio button
	 */
	private void verificaRadioButton() {

		// vari�vel auxiliar para armazenar o texto da op��o que foi selecionada
		String aux = "";
		// verificando se a op��o solteiro est� selecionada
		if (rbSolteiro.isSelected()) {
			aux = "Selecione o estado civil: " + rbSolteiro.getText();
		}
		// verificando se a op��o casado est� selecionada
		if (rbCasado.isSelected()) {
			aux = "Selecione o estado civil: " + rbCasado.getText();
		}
		// verificando se a op��o vi�vo est� selecionada
		if (rbViuvo.isSelected()) {
			aux = "Selecione o estado civil: " + rbViuvo.getText();
		}
		// verificando se a op��o divorciado est� selecionada
		if (rbDivorciado.isSelected()) {
			aux = "Selecione o estado civil: " + rbDivorciado.getText();
		}

		// atribuindo a sele��o do usu�rio na label auxiliar
		if (!aux.equals("")) {
			lbAuxiliar.setText(aux);
		}
	} // fim do m�todo

	/*
	 * m�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		new Exemplo04().iniciaGui();
	}
} // fim da classe
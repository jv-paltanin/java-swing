package view;

import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

/**
 * Classe respons�vel por representar a utiliza��o do componente
 * JFormattedTextField
 * 
 * @author Jo�o Victor
 * @since 04/03/2021
 * @version 1.0
 */
public class Exemplo12 {

	// declarando os atributos da tela
	private JFrame janela;
	// labels auxiliares
	private JLabel lbCpf;
	private JLabel lbRg;
	private JLabel lbDataNascimento;
	private JLabel lbTelefone;
	// declarando os campos formatados
	private JFormattedTextField tfCpf;
	private JFormattedTextField tfRg;
	private JFormattedTextField tfDataNascimento;
	private JFormattedTextField tfTelefone;
	// declarando os atributos de formata��o
	private MaskFormatter fmtCpf;
	private MaskFormatter fmtRg;
	private MaskFormatter fmtDataNascimento;
	private MaskFormatter fmtTelefone;
	// declarando o painel para organizar os componentes
	private JPanel painel;

	/*
	 * m�todo para criar a tela
	 */
	public void iniciaGui() throws ParseException {

		/*
		 * configura��es dos campos de formata��o
		 */
		fmtCpf = new MaskFormatter("###.###.###-##");
		fmtRg = new MaskFormatter("##.###.###-#");
		fmtDataNascimento = new MaskFormatter("##/##/####");
		fmtTelefone = new MaskFormatter("(##) ####-####");

		/*
		 * configura��es do JFrame - tela
		 */
		janela = new JFrame();
		// configurando o t�tulo da tela
		janela.setTitle("Exemplo de Campos Formatados");
		// configurando o tamanho da tela - largura/altura
		janela.setSize(400, 300);
		// configurando a posi��o inicial da tela - centralizada
		janela.setLocationRelativeTo(null);

		/*
		 * configura��es da JLabel CPF
		 */
		lbCpf = new JLabel();
		lbCpf.setText("CPF:");
		// configurando a posi��o e tamanho
		lbCpf.setBounds(10, 10, 50, 20);

		/*
		 * configura��es da JLabel RG
		 */
		lbRg = new JLabel();
		lbRg.setText("RG:");
		// configurando a posi��o e tamanho
		lbRg.setBounds(10, 40, 50, 20);

		/*
		 * configura��es da JLabel Data de Nascimento
		 */
		lbDataNascimento = new JLabel();
		lbDataNascimento.setText("Data de Nascimento:");
		// configurando a posi��o e tamanho
		lbDataNascimento.setBounds(10, 70, 120, 20);

		/*
		 * configura��es da JLabel Telefone
		 */
		lbTelefone = new JLabel();
		lbTelefone.setText("Telefone:");
		// configurando a posi��o e tamanho
		lbTelefone.setBounds(10, 100, 110, 20);

		/*
		 * configura��es do JFormattedTextField Cpf
		 */
		tfCpf = new JFormattedTextField(fmtCpf);
		// configurando a posi��o e o tamanho
		tfCpf.setBounds(130, 10, 100, 20);

		/*
		 * configura��es do JFormattedTextField Rg
		 */
		tfRg = new JFormattedTextField(fmtRg);
		// configurando a posi��o e o tamanho
		tfRg.setBounds(130, 40, 100, 20);

		/*
		 * configura��es do JFormattedTextField Data de Nascimento
		 */
		tfDataNascimento = new JFormattedTextField(fmtDataNascimento);
		// configurando a posi��o e o tamanho
		tfDataNascimento.setBounds(130, 70, 100, 20);

		/*
		 * configura��es do JFormattedTextField Telefone
		 */
		tfTelefone = new JFormattedTextField(fmtTelefone);
		// configurando a posi��o e o tamanho
		tfTelefone.setBounds(130, 100, 100, 20);

		/*
		 * configura��es do painel da janela
		 */
		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		painel.add(lbCpf);
		painel.add(lbRg);
		painel.add(lbDataNascimento);
		painel.add(lbTelefone);
		painel.add(tfCpf);
		painel.add(tfRg);
		painel.add(tfDataNascimento);
		painel.add(tfTelefone);

		// configurando a visibilidade da tela
		janela.setVisible(true);

	} // fim do m�todo

	/*
	 * m�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		try {
			new Exemplo12().iniciaGui();
		} catch (ParseException e) {

			e.printStackTrace();
		}
	}

} // fim da classe
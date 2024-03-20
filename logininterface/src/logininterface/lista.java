package logininterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class lista {

	private JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lista window = new lista();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public lista() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 192));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblListaDeTarefas = new JLabel("Lista de tarefas ");
		lblListaDeTarefas.setForeground(new Color(255, 255, 255));
		lblListaDeTarefas.setBackground(new Color(255, 255, 255));
		lblListaDeTarefas.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblListaDeTarefas.setBounds(143, 11, 128, 14);
		frame.getContentPane().add(lblListaDeTarefas);
		
		JCheckBox txtTarefa1 = new JCheckBox("Lavar a Louça");
		txtTarefa1.setBounds(18, 36, 115, 20);
		frame.getContentPane().add(txtTarefa1);
		
		JCheckBox txtTarefa2 = new JCheckBox("Fazer o Café");
		txtTarefa2.setBounds(18, 68, 108, 20);
		frame.getContentPane().add(txtTarefa2);
		
		JCheckBox txtTarefa3 = new JCheckBox("Lavar o Banheiro");
		txtTarefa3.setBounds(18, 103, 115, 20);
		frame.getContentPane().add(txtTarefa3);
		
		JCheckBox txtTarefa4 = new JCheckBox("Arrumar a Casa");
		txtTarefa4.setBounds(18, 135, 115, 20);
		frame.getContentPane().add(txtTarefa4);
		
		JButton txtButton = new JButton("Botão");
		txtButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtTarefa1.isSelected()||txtTarefa2.isSelected()) {
					JOptionPane.showMessageDialog(null, "Ñ fez mais q sua obrigação", "Lista de Tarefas", JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "INUTIL", "Lista de Tarefas", JOptionPane.ERROR_MESSAGE);				
				}
			}
		});
		txtButton.setBounds(154, 181, 89, 23);
		frame.getContentPane().add(txtButton);
	}
}

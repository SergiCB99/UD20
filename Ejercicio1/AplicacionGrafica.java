import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AplicacionGrafica extends JFrame {
	
	JTextField textField = new JTextField();
	
	private JPanel contentPane;
	public AplicacionGrafica() {
			
			setVisible(true);
			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		
			setTitle("Saludador");
			
			setBounds(400,20,370,300);
		
			contentPane = new JPanel();
			
			contentPane.setLayout(null);
			
			setContentPane(contentPane);
			
			JLabel etiqueta = new JLabel ("Escribe tu nombre para ser saludado");
			etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
			etiqueta.setBounds(10, 0, 344, 70);
			contentPane.add(etiqueta);
		
			textField.setBounds(86, 101, 185, 29);
			contentPane.add(textField);
			
			JButton btnSaludar = new JButton ();
			btnSaludar.setText("Saludar");
			btnSaludar.setBounds(86, 221, 185, 29);
			contentPane.add(btnSaludar);
			
			ActionListener al = new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String textFieldValue = textField.getText();
					JOptionPane.showMessageDialog(null,"Hola "+ textFieldValue);
				}
			};
			
			btnSaludar.addActionListener(al);
		
		}
	
}

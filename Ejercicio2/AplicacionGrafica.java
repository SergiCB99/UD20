import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AplicacionGrafica extends JFrame {
	
	JTextField textField = new JTextField();
	
	private JPanel contentPane;
	public AplicacionGrafica() {
			
			setVisible(true);
			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		
			setTitle("Peliculas");
			
			setBounds(400,20,370,300);
		
			contentPane = new JPanel();
			
			contentPane.setLayout(null);
			
			setContentPane(contentPane);
			
			JLabel etiqueta = new JLabel ("Nombre Pelicula");
			etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
			etiqueta.setBounds(20, 27, 115, 41);
			contentPane.add(etiqueta);
		
			textField.setBounds(33, 104, 102, 29);
			contentPane.add(textField);
			
			JButton btnAñadir = new JButton ();
			btnAñadir.setText("Añadir");
			btnAñadir.setBounds(20, 177, 121, 29);
			contentPane.add(btnAñadir);
			
			JComboBox<String> comboBox = new JComboBox<String>();
			comboBox.setBounds(145, 27, 199, 41);
			contentPane.add(comboBox);
			
			ActionListener al = new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String textFieldValue = textField.getText();
					comboBox.addItem(textFieldValue);
				}
			};
			
			btnAñadir.addActionListener(al);
			
			
		
		}
	
}
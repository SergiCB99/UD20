import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AplicacionGrafica extends JFrame {
	
	private JPanel contentPane;
	public AplicacionGrafica() {
			
			setVisible(true);
			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		
			setTitle("MiniCalculadora");
			
			setBounds(400,20,370,300);
		
			contentPane = new JPanel();
			
			contentPane.setLayout(null);
			
			setContentPane(contentPane);
			
			JLabel etiqueta = new JLabel ("MiniCalculadora");
			etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
			etiqueta.setBounds(10, 0, 344, 35);
			contentPane.add(etiqueta);
		
			JTextField TF1 = new JTextField();
			TF1.setBounds(10, 54, 92, 29);
			contentPane.add(TF1);
			
			JTextField TF2 = new JTextField();
			TF2.setBounds(130, 54, 92, 29);
			contentPane.add(TF2);
			
			JTextField TF3 = new JTextField();
			TF3.setBounds(252, 54, 92, 29);
			contentPane.add(TF3);
			
			JButton BS1 = new JButton ();
			BS1.setText("Suma");
			BS1.setBounds(10, 109, 92, 29);
			contentPane.add(BS1);
			
			JButton BS2 = new JButton ();
			BS2.setText("Resta");
			BS2.setBounds(130, 109, 92, 29);
			contentPane.add(BS2);
			
			JButton BS3 = new JButton ();
			BS3.setText("Multiplicacion");
			BS3.setBounds(232, 109, 112, 29);
			contentPane.add(BS3);
			
			JButton BS4 = new JButton ();
			BS4.setText("Division");
			BS4.setBounds(10, 160, 92, 29);
			contentPane.add(BS4);
			
			JButton BS5 = new JButton ();
			BS5.setText("Salir");
			BS5.setBounds(130, 160, 92, 29);
			contentPane.add(BS5);
			
			
			
			ActionListener al1 = new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String TF1V = TF1.getText();
					String TF2V = TF2.getText();
					int V1 = Integer.parseInt(TF1V);
					int V2 = Integer.parseInt(TF2V);
					int suma = V1+V2;		
					TF3.setText(Integer.toString(suma));
				}
			};
			
			ActionListener al2 = new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String TF1V = TF1.getText();
					String TF2V = TF2.getText();
					int V1 = Integer.parseInt(TF1V);
					int V2 = Integer.parseInt(TF2V);
					int resta = V1-V2;
					TF3.setText(Integer.toString(resta));
				}
			};
			
			ActionListener al3 = new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String TF1V = TF1.getText();
					String TF2V = TF2.getText();
					int V1 = Integer.parseInt(TF1V);
					int V2 = Integer.parseInt(TF2V);
					int multiplicacion = V1*V2;
					TF3.setText(Integer.toString(multiplicacion));
				}
			};
			
			ActionListener al4 = new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String TF1V = TF1.getText();
					String TF2V = TF2.getText();
					int V1 = Integer.parseInt(TF1V);
					int V2 = Integer.parseInt(TF2V);
					int division = V1/V2;
					TF3.setText(Integer.toString(division));
				}
			};
			
			ActionListener al5 = new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			};
			
			BS1.addActionListener(al1);
			BS2.addActionListener(al2);
			BS3.addActionListener(al3);
			BS4.addActionListener(al4);
			BS5.addActionListener(al5);
		
		}
	
}
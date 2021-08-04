import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AplicacionGrafica extends JFrame {
	
	private JPanel contentPane;
	public AplicacionGrafica() {
			
			setVisible(true);
			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		
			setTitle("MiniEncuesta");
			
			setBounds(400,20,370,300);
		
			contentPane = new JPanel();
			
			contentPane.setLayout(null);
			
			setContentPane(contentPane);
			
			JLabel etiqueta = new JLabel ("Minuencuesta");
			etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
			etiqueta.setBounds(10, 0, 344, 70);
			contentPane.add(etiqueta);
			
			JRadioButton RB1 = new JRadioButton("Windows",false);
			RB1.setBounds(10, 100, 73, 65);
			contentPane.add(RB1);
			
			JRadioButton RB2 = new JRadioButton("MAC",false);
			RB2.setBounds(10, 158, 73, 40);
			contentPane.add(RB2);
			
			JRadioButton RB3 = new JRadioButton("Linux",true);
			RB3.setBounds(10, 50, 57, 70);
			contentPane.add(RB3);
			
			ButtonGroup BG = new ButtonGroup();
			BG.add(RB1);
			BG.add(RB2);
			BG.add(RB3);
			
			JCheckBox CB1 = new JCheckBox("Programacion",false);
			CB1.setBounds(245, 53, 91, 65);
			contentPane.add(CB1);
			
			JCheckBox CB2 = new JCheckBox("Diseño Grafico",false);
			CB2.setBounds(245, 100, 100, 65);
			contentPane.add(CB2);
			
			JCheckBox CB3 = new JCheckBox("Administracion",false);
			CB3.setBounds(245, 146, 100, 65);
			contentPane.add(CB3);
			
			JSlider Slider = new JSlider(JSlider.HORIZONTAL,0, 10, 0);
			Slider.setBounds(123, 100, 100, 65);
			contentPane.add(Slider);
			
			JButton btnSaludar = new JButton ();
			btnSaludar.setText("Enviar");
			btnSaludar.setBounds(86, 221, 185, 29);
			contentPane.add(btnSaludar);
			
			ActionListener al = new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String so = "";
					String especialidad = "";
					if(RB1.isSelected()) {
						so = "Windows";
					}else if(RB2.isSelected()){
						so = "MAC";
					}else if(RB3.isSelected()) {
						so = "Linux";
					}
					
					if(CB1.isSelected()) {
						especialidad += "Programacion ";
					}
					if(CB2.isSelected()){
						especialidad += "Diseño Grafico ";
					}
					if(CB3.isSelected()) {
						especialidad += "Administracion";
					}
					
					JOptionPane.showMessageDialog(null,"Sistema Operativo "+ so +"\nEspecialidad "+ especialidad +"\nHoras "+Slider.getValue() );
				}
			};
			
			btnSaludar.addActionListener(al);
		
		}
	
}
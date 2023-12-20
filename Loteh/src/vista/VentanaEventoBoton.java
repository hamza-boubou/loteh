package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class VentanaEventoBoton extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton bBoton;
	private JPanel panel;
    public JButton boton;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public VentanaEventoBoton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 537);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.setTitle("Loteh"); // Estableciendo el título como "Loteh"
        contentPane.setBackground(Color.BLUE); // Estableciendo el color de fondo como azul
		
		bBoton = new JButton("New button");
		bBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		bBoton.setBounds(292, 337, 116, 42);
		contentPane.add(bBoton);
		
		JPanel Loteh = new JPanel();
		Loteh.setToolTipText("Loteh");
		Loteh.setBounds(85, 53, 502, 139);
		contentPane.add(Loteh);
		Loteh.setLayout(null);
	}
}

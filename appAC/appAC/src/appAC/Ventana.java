package appAC;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana implements ActionListener  {

	private JFrame frame;
	private JTextField idProfesor_tf;
	private JTextField NIF_tf;
	private JTextField Nombre_tf;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
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
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 412, 271);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		idProfesor_tf = new JTextField();
		idProfesor_tf.setBounds(10, 31, 96, 19);
		frame.getContentPane().add(idProfesor_tf);
		idProfesor_tf.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Id Profesor");
		lblNewLabel.setBounds(10, 10, 56, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNifProfesor = new JLabel("NIF Profesor");
		lblNifProfesor.setBounds(10, 60, 70, 13);
		frame.getContentPane().add(lblNifProfesor);
		
		NIF_tf = new JTextField();
		NIF_tf.setBounds(10, 83, 96, 19);
		frame.getContentPane().add(NIF_tf);
		NIF_tf.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 119, 70, 13);
		frame.getContentPane().add(lblNombre);
		
		Nombre_tf = new JTextField();
		Nombre_tf.setColumns(10);
		Nombre_tf.setBounds(10, 137, 96, 19);
		frame.getContentPane().add(Nombre_tf);
		
		JLabel lblEspecialodad = new JLabel("Especialidad");
		lblEspecialodad.setBounds(150, 10, 70, 13);
		frame.getContentPane().add(lblEspecialodad);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(136, 31, 96, 19);
		frame.getContentPane().add(textField);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(150, 60, 70, 13);
		frame.getContentPane().add(lblTelefono);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(136, 83, 96, 19);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("Primero");
		btnNewButton.setBounds(10, 194, 85, 21);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(this);
		btnSiguiente.setBounds(105, 194, 85, 21);
		frame.getContentPane().add(btnSiguiente);
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.setBounds(200, 194, 85, 21);
		frame.getContentPane().add(btnAnterior);
		btnAnterior.addActionListener(this);
		
		
		JButton btnUltimo = new JButton("Ultimo");
		btnUltimo.setBounds(295, 194, 85, 21);
		frame.getContentPane().add(btnUltimo);
		btnUltimo.addActionListener(this);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(this);
		btnNuevo.setBounds(295, 30, 85, 21);
		frame.getContentPane().add(btnNuevo);
		btnNuevo.addActionListener(this);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(295, 82, 85, 21);
		frame.getContentPane().add(btnGuardar);
		btnGuardar.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 switch(e.getSource().toString()){
			 
		 	case "Primero":
		 		
		 
		 
		 }
	}
}

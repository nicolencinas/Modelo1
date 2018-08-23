package progra3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JCheckBoxMenuItem;

public class Example {

	private JFrame frame;
	private JFrame ventana2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JLabel lblErrorDeFormato = new JLabel("Error de Formato");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Example window = new Example();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @return 
	 */
	void MainForm()
	{
		
	}
	public Example() 
	{
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	static void Error(JFrame v1,JFrame v2, JButton acept,JTextField tf,JTextField tf1,JTextField tf2) 
	{
		 
		acept.addActionListener(new ActionListener() {
 		   public void actionPerformed(ActionEvent i) 
 		   {
 			   v2.setVisible(false);
 			   tf.setText("");
 			   tf1.setText("");
 			   tf2.setText("");
 			   v1.setEnabled(true);
 		   }
 	   });
 	  
 	   v2.setBounds(v1.getX()+135,v1.getY()+75,200,150);
 	   v2.setVisible(true);
 	   tf2.setText("Error de formato");
 	    
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ventana2= new JFrame();
		ventana2.setBounds(200,150,200,150);
		ventana2.setVisible(false);
		//ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana2.getContentPane().setLayout(null);
		
		lblErrorDeFormato=new JLabel("Error de formato");
 	   lblErrorDeFormato.setBounds(30,-20, 100, 100);
 	   
 	   JButton acept=new JButton ("Aceptar");
 	   acept.setBounds(70, 60, 100, 40);
 	   ventana2.getContentPane().add(lblErrorDeFormato);
 	   ventana2.getContentPane().add(acept);
 	   ventana2.setResizable(false);
 	   ventana2.setDefaultCloseOperation(0);
		
		
		
		textField = new JTextField();
		textField.setBounds(204, 77, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(204, 121, 86, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(204, 169, 212, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblPrimerNumero = new JLabel("Primer Numero");
		lblPrimerNumero.setBounds(44, 80, 150, 14);
		frame.getContentPane().add(lblPrimerNumero);
		
		JLabel lblSegundoNumero = new JLabel("Segundo Numero");
		lblSegundoNumero.setBounds(44, 124, 150, 14);
		frame.getContentPane().add(lblSegundoNumero);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(44, 172, 150, 14);
		frame.getContentPane().add(lblResultado);
		
		btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				boolean repetir=true;
				double res=1;				
				
						try
				{
				double n1=Double.parseDouble(textField.getText());
				double n2=Double.parseDouble(textField_1.getText());
				res=n1+n2;
			    
				
				}catch (Exception ex)
				{
					
					repetir=false;
				}
				
               if (repetir)
				textField_2.setText(Double.toString(res));
               else 
               {
            	   frame.setEnabled(false);
            	   Error(frame,ventana2, acept, textField, textField_1, textField_2);
            	   
               }
               
				}
			
				
				
			
		});
		btnNewButton.setBounds(314, 76, 46, 23);
		frame.getContentPane().add(btnNewButton);
		
		button = new JButton("*");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				boolean repetir=true;
				double res=1;				
				
						try
				{
				double n1=Double.parseDouble(textField.getText());
				double n2=Double.parseDouble(textField_1.getText());
				res=n1*n2;
			    
				
				}catch (Exception ex)
				{
					
					repetir=false;
				}
				
               if (repetir)
				textField_2.setText(Double.toString(res));
               else 
               {
            	   frame.setEnabled(false);

            	   Error(frame, ventana2, acept, textField, textField_1, textField_2);
            	   
               }
               
				}
			
				
				
			
		});
		
		button.setBounds(314, 120, 46, 23);
		frame.getContentPane().add(button);
		
		button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				boolean repetir=true;
				double res=1;				
				
						try
				{
				double n1=Double.parseDouble(textField.getText());
				double n2=Double.parseDouble(textField_1.getText());
				res=n1-n2;
			    
				
				}catch (Exception ex)
				{
					
					repetir=false;
				}
				
               if (repetir)
				textField_2.setText(Double.toString(res));
               else 
               {
            	   frame.setEnabled(false);

            	   Error(frame, ventana2, acept, textField, textField_1, textField_2);
            	   
               }
               
				}
			
				
				
			
		});
		
		button_1.setBounds(370, 76, 46, 23);
		frame.getContentPane().add(button_1);
		
		button_2 = new JButton("/\r\n");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				boolean repetir=true;
				double res=1;				
				
						try
				{
				double n1=Double.parseDouble(textField.getText());
				double n2=Double.parseDouble(textField_1.getText());
				res=n1/n2;
			    
				
				}catch (Exception ex)
				{
					frame.setEnabled(false);
					repetir=false;
				}
				
               if (repetir)
				textField_2.setText(Double.toString(res));
               else 
               {
            	   

            	   Error(frame, ventana2, acept, textField, textField_1, textField_2);
            	   
               }
               
				}
			
				
				
			
		});
		button_2.setBounds(370, 120, 46, 23);
		frame.getContentPane().add(button_2);
		
	//	frame.getContentPane().add(lblErrorDeFormato);
	}
}

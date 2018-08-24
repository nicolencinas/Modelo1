package progra3;

import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Programa1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Programa1 window = new Programa1();
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
	public Programa1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(182, 54, 84, 20);
		frame.getContentPane().add(textArea);
		
		textArea.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e)
			{
				
				if (38==e.getKeyCode())
				{
					textArea.setText("Presiono arriba");
				}
				
				else if (39==e.getKeyCode())
					textArea.setText("");
				
				
					
			}
			
			
		
			
		});
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(182, 190, 84, 20);
		frame.getContentPane().add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(274, 123, 84, 20);
		frame.getContentPane().add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(99, 123, 84, 20);
		frame.getContentPane().add(textArea_3);
	}
}

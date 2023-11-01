
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ImportChequeDetails {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImportChequeDetails window = new ImportChequeDetails();
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
	public ImportChequeDetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 998, 802);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cheque Image:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(27, 37, 100, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Browse Image");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(261, 87, 154, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnProcessImage = new JButton("Process Image");
		btnProcessImage.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnProcessImage.setBounds(479, 87, 140, 29);
		frame.getContentPane().add(btnProcessImage);
		
		JLabel lblNewLabel_1 = new JLabel("Account Number: ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(27, 182, 87, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cheque Number:");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(27, 203, 87, 13);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Amount in Words:");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(27, 226, 100, 13);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Amount in Number: ");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(27, 249, 100, 13);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Date: ");
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_4.setBounds(27, 272, 70, 13);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("MICR Code:");
		lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_5.setBounds(27, 295, 70, 13);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Account Type: ");
		lblNewLabel_1_6.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_6.setBounds(27, 318, 87, 13);
		frame.getContentPane().add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("SAN Number: ");
		lblNewLabel_1_7.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_7.setBounds(27, 341, 100, 13);
		frame.getContentPane().add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("Beneficiary Name:");
		lblNewLabel_1_8.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_8.setBounds(27, 364, 100, 13);
		frame.getContentPane().add(lblNewLabel_1_8);
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame frame=new MainFrame();
				MainFrame.main(null);;
			}
		});
		btnMainMenu.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnMainMenu.setBounds(834, 10, 140, 29);
		frame.getContentPane().add(btnMainMenu);
	}

}

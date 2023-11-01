import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ManualEntry {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManualEntry window = new ManualEntry();
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
	public ManualEntry() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1347, 782);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cheque Number:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel.setBounds(259, 47, 161, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblAmountInWords = new JLabel("Amount in Words:");
		lblAmountInWords.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblAmountInWords.setBounds(259, 110, 171, 18);
		frame.getContentPane().add(lblAmountInWords);
		
		JLabel lblAmountInNumbers = new JLabel("Amount in Numbers:");
		lblAmountInNumbers.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblAmountInNumbers.setBounds(259, 160, 204, 18);
		frame.getContentPane().add(lblAmountInNumbers);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblDate.setBounds(259, 210, 161, 18);
		frame.getContentPane().add(lblDate);
		
		JLabel lblMicrCode = new JLabel("MICR Code:");
		lblMicrCode.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblMicrCode.setBounds(259, 260, 161, 18);
		frame.getContentPane().add(lblMicrCode);
		
		JLabel lblAccountType = new JLabel("Account Type:");
		lblAccountType.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblAccountType.setBounds(259, 340, 161, 40);
		frame.getContentPane().add(lblAccountType);
		
		JLabel lblSan = new JLabel("SAN Number:");
		lblSan.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblSan.setBounds(259, 310, 161, 18);
		frame.getContentPane().add(lblSan);
		
		JLabel lblBeneficiaryName = new JLabel("Beneficiary Name:");
		lblBeneficiaryName.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblBeneficiaryName.setBounds(259, 397, 183, 30);
		frame.getContentPane().add(lblBeneficiaryName);
		
		JLabel lblPayeeAccountNumber = new JLabel("Payee Account Number:");
		lblPayeeAccountNumber.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblPayeeAccountNumber.setBounds(259, 450, 236, 27);
		frame.getContentPane().add(lblPayeeAccountNumber);
		
		JLabel lblChequeImage = new JLabel("Cheque Image:");
		lblChequeImage.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblChequeImage.setBounds(259, 497, 161, 31);
		frame.getContentPane().add(lblChequeImage);
		
		textField = new JTextField();
		textField.setBounds(528, 47, 313, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(528, 97, 313, 31);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(528, 147, 313, 31);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(528, 197, 313, 31);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(528, 247, 313, 31);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(528, 297, 313, 31);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(528, 347, 313, 31);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(528, 397, 313, 31);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(528, 447, 313, 31);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(528, 497, 313, 31);
		frame.getContentPane().add(textField_9);
		
		JButton btnNewButton = new JButton("Browse");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.setBounds(866, 498, 104, 27);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnSubmit.setBounds(610, 582, 144, 46);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnMainMenu.setBounds(1156, 21, 144, 46);
		frame.getContentPane().add(btnMainMenu);
	}

}

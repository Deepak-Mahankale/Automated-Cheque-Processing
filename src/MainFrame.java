import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
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
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 800, 529);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Automated Cheque Processing");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(187, 43, 442, 41);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Team ID: GID 20");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(342, 94, 174, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Import Cheque Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImportChequeDetails.main(null);;
				frame.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 12));
		btnNewButton.setBounds(302, 158, 202, 47);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnViewChequeImage = new JButton("View Cheque Image");
		btnViewChequeImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewChequeImage.main(null);;
				frame.setVisible(false);
			}
		});
		btnViewChequeImage.setFont(new Font("Calibri", Font.BOLD, 12));
		btnViewChequeImage.setBounds(302, 215, 202, 47);
		frame.getContentPane().add(btnViewChequeImage);
		
		JButton btnManualEntry = new JButton("Manual Entry");
		btnManualEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManualEntry.main(null);;
				frame.setVisible(false);
			}
		});
		btnManualEntry.setFont(new Font("Calibri", Font.BOLD, 12));
		btnManualEntry.setBounds(302, 272, 202, 47);
		frame.getContentPane().add(btnManualEntry);
		
		JButton btnViewChequeDetails = new JButton("View Cheque Details");
		btnViewChequeDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewChequeDeatils.main(null);;
				frame.setVisible(false);
			}
		});
		btnViewChequeDetails.setFont(new Font("Calibri", Font.BOLD, 12));
		btnViewChequeDetails.setBounds(302, 329, 202, 47);
		frame.getContentPane().add(btnViewChequeDetails);
		
		JButton btnDeleteCheque = new JButton("Delete Cheque");
		btnDeleteCheque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteCheque.main(null);;
				frame.setVisible(false);
			}
		});
		btnDeleteCheque.setFont(new Font("Calibri", Font.BOLD, 12));
		btnDeleteCheque.setBounds(302, 386, 202, 47);
		frame.getContentPane().add(btnDeleteCheque);
	}

}

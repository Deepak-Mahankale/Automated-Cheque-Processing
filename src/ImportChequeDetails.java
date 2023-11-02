
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;

public class ImportChequeDetails {

	private JFrame frame;
	private JTextField textField;

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


	public ImportChequeDetails() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 998, 802);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Cheque Image:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(27, 37, 100, 29);
		frame.getContentPane().add(lblNewLabel);
		
		final JLabel lblNewLabel_2 = new JLabel("File Selected: ");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(546, 91, 348, 21);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Browse Image");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				 JFileChooser fileChooser = new JFileChooser();
		           fileChooser.addChoosableFileFilter(new ImportChequeDetails.ImageFilter());
		           fileChooser.setAcceptAllFileFilterUsed(false);

		           int option = fileChooser.showOpenDialog(frame);
		           if(option == JFileChooser.APPROVE_OPTION){
		              File file = fileChooser.getSelectedFile();
		              lblNewLabel_2.setText("File Selected: " + file.getName());
		           }else{
		        	  lblNewLabel_2.setText("None");
		           }
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(154, 87, 154, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnProcessImage = new JButton("Process Image");
		btnProcessImage.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnProcessImage.setBounds(359, 87, 140, 29);
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
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.main(null);;
				frame.setVisible(false);
			}
		});
		btnMainMenu.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnMainMenu.setBounds(834, 10, 140, 29);
		frame.getContentPane().add(btnMainMenu);
		
		textField = new JTextField();
		textField.setBounds(137, 38, 537, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
	}
	class ImageFilter extends FileFilter {
		   public final static String JPEG = "jpeg";
		   public final static String JPG = "jpg";
		   public final static String GIF = "gif";
		   public final static String TIFF = "tiff";
		   public final static String TIF = "tif";
		   public final static String PNG = "png";
		   
		   public boolean accept(File f) {
		      if (f.isDirectory()) {
		         return true;
		      }

		      String extension = getExtension(f);
		      if (extension != null) {
		         if (extension.equals(TIFF) ||
		            extension.equals(TIF) ||
		            extension.equals(GIF) ||
		            extension.equals(JPEG) ||
		            extension.equals(JPG) ||
		            extension.equals(PNG)) {
		            return true;
		         } else {
		            return false;
		         }
		      }
		      return false;
		   }

		   public String getDescription() {
		      return "Image Only";
		   }

		   String getExtension(File f) {
		      String ext = null;
		      String s = f.getName();
		      int i = s.lastIndexOf('.');
		   
		      if (i > 0 &&  i < s.length() - 1) {
		         ext = s.substring(i+1).toLowerCase();
		      }
		      return ext;
		   }
	}
} 


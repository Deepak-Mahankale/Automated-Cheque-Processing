

import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.awt.image.ImageFilter;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ImageOpener {
	   public static void main(String[] args) {
		   JFileChooser fileChooser = new JFileChooser();
           fileChooser.addChoosableFileFilter(new ImageFilter());
           fileChooser.setAcceptAllFileFilterUsed(false);

           int option = fileChooser.showOpenDialog(frame);
           if(option == JFileChooser.APPROVE_OPTION){
              File file = fileChooser.getSelectedFile();
              label.setText("File Selected: " + file.getName());
           }else{
              label.setText("Open command canceled");
           }
	   }

	} 

	class ImageFilter extends FileFilter {
	   public final static String JPEG = "jpeg";
	   public final static String JPG = "jpg";
	   public final static String GIF = "gif";
	   public final static String TIFF = "tiff";
	   public final static String TIF = "tif";
	   public final static String PNG = "png";
	   
	   @Override
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

	   @Override
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



import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ImageOpener {

	JFileChooser file= new JFileChooser();
	int returnValue=file.showOpenDialog(null);
	if(returnValue==0) {
		File f=file.getSelectedFile();
		System.out.println()
	}
	
}

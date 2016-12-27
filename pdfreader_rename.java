
import java.io.File;
import java.nio.file.CopyOption;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class pdfreader2 {

	private static final CopyOption REPLACE_EXISTING = null;

	public static void main(String[] args) {
		try {
			int i = 0;
			int k= 0;
			//String invoice = "Invoice Number:";
			String filefolder = "C:/Documents and Settings/vvishwanathan/Desktop/PDFs Originals/";
			//String filefolder2 = "C:/Documents and Settings/vvishwanathan/Desktop/pdfs_rename/";
			File folder = new File(filefolder);
			File[] listOfFiles = folder.listFiles();

			for (File file : listOfFiles) {
				if (file.isFile()) {
					String filename = file.getName();
					System.out.println(filename);
				}
			}
		/*			i = i + 1;
					System.out.print("reading file " + i + " " + filename);

					PDDocument document = null;
					document = PDDocument.load(new File(file.getPath()));
					document.getClass();
					String st = "";
					if (!document.isEncrypted()) {
						PDFTextStripperByArea stripper = new PDFTextStripperByArea();
						stripper.setSortByPosition(true);
						PDFTextStripper Tstripper = new PDFTextStripper();
						st = Tstripper.getText(document);
						document.close();
											}
					
					
					String stA[] = st.split("\\R");
					
					k=0;
					for(int j=0; j<stA.length; j++){
			              if (stA[j].equals(invoice)){
			            	  k=j;
			            	  break;
			              }
			            
			         }
					
					
					
					
					
					//if (isNumeric(stA[k-2]))			
					if (k>0)	{
						System.out.print("; Invoice Number:" + stA[k-2] + " ; ");
					File newFile = new File(filefolder2, stA[k-2] + ".pdf");
					if (file.renameTo(newFile)) {
						System.out.println("Rename succesful");
					} else {
						System.out.println("Rename failed");
					}
					}
					
					
				}
			}
*/
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static boolean isNumeric(String str)
	{
	  return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
	}
	
}

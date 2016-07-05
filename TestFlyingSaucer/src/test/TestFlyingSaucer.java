package test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.xhtmlrenderer.pdf.ITextRenderer;

import com.lowagie.text.DocumentException;



public class TestFlyingSaucer {

	public static void main(String[] args) throws DocumentException, IOException {
		
		File inputFile=new File("D:/Mon_May_16_2016_18_00_53.html");
		//Document document = (Document) XMLResource.load( new ByteArrayInputStream( yourXhtmlContentAsString.getBytes() ) ).getDocument();
		
		ITextRenderer renderer = new ITextRenderer();
		renderer.setDocument(inputFile);

		renderer.layout();
		
		String fileNameWithPath = "D:/" + "PDF-XhtmlRendered.pdf";
		FileOutputStream fos = new FileOutputStream( fileNameWithPath );
		renderer.createPDF( fos);
		fos.close();
		System.out.println( "File 1: '" + fileNameWithPath + "' created." );

	}

}

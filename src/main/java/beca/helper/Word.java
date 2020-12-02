package beca.helper;

import java.io.*;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;

public class Word {

	public static void transferToDoc() throws InvalidFormatException, IOException {
		CustomXWPFDocument document = new CustomXWPFDocument(new FileInputStream(new File("C:\\Users\\Mauricio\\eclipse-workspace\\beca\\evidencias\\suporte.doc")));
        FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\Mauricio\\eclipse-workspace\\beca\\evidencias\\evidencias.doc"));
        String id = document.addPictureData(new FileInputStream(new File("C:\\Users\\Mauricio\\eclipse-workspace\\beca\\evidencias\\evidenciaNome.png")), Document.ATTRIBUTE_NODE);
        document.createPicture(id,document.getNextPicNameNumber(Document.ATTRIBUTE_NODE), 600, 400);
        document.write(fos);
        fos.flush();
        fos.close();

	}

}

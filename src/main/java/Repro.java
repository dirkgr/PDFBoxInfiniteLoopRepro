import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.IOException;

public class Repro {
  public static void main(String[] args) throws IOException {
    final PDDocument pdDoc =
        PDDocument.load(
            Repro.class.getClassLoader().getResourceAsStream(
                "2095e3df01fc32e0bff982a1e79600d5bcf10b81.pdf"));
    final PDFTextStripper stripper = new PDFTextStripper();
    stripper.getText(pdDoc);
  }
}

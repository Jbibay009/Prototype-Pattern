public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        Document doc1 = registry.createPdfDocument();
        doc1.open();
        System.out.println(doc1.getType());

        Document doc2 = registry.createTextDocument();
        doc2.open();
        System.out.println(doc2.getType());

        Document doc3 = registry.createSpreadsheetDocument();
        doc3.open();
        System.out.println(doc3.getType());
    }
}

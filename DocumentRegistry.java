public class DocumentRegistry {
    private final PdfDocument pdfPrototype;
    private final TextDocument textDocumentPrototype;
    private final SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        pdfPrototype = new PdfDocument("example.pdf", "Author Name", 12, "Example PDF");
        textDocumentPrototype = new TextDocument(101, "UTF-8", 850);
        spreadsheetPrototype = new SpreadsheetDocument("Budget 2026", 20, 8);
    }

    public PdfDocument createPdfDocument() {
        return (PdfDocument) pdfPrototype.clone();
    }

    public TextDocument createTextDocument() {
        return (TextDocument) textDocumentPrototype.clone();
    }

    public SpreadsheetDocument createSpreadsheetDocument() {
        return (SpreadsheetDocument) spreadsheetPrototype.clone();
    }
}

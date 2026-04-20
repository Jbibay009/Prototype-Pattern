public class TextDocument implements Document {
    private Integer filePath;
    private String encoding;
    private int wordCount;

    public TextDocument(Integer filePath, String encoding, int wordCount) {
        this.filePath = filePath;
        this.encoding = encoding;
        this.wordCount = wordCount;
    }

    @Override
    public Document clone() {
        return new TextDocument(filePath, encoding, wordCount);
    }

    @Override
    public void open() {
        System.out.println("Opening Text Document at: " + filePath);
    }

    @Override
    public String getType() {
        return "TEXT";
    }
}

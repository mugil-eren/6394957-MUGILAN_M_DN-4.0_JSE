package FactoryMethodPatternExample;

// Factory Class
public abstract class DocumentFactory {
    public abstract Document createDocument();
}

// Concrete Factories
class WordFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}

class ExcelFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}

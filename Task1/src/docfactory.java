public class docfactory {
    public static doc createDocument(String type) {
        switch (type.toLowerCase()) {
            case "text":
                return new textdoc();
            case "spreadsheet":
                return new spreaddoc();
            case "presentation":
                return new presentdoc();
            default:
                throw new IllegalArgumentException("Неизвестный тип документа: " + type);
        }
    }
}

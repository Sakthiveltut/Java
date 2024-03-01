// Outer class representing a library
class Library {
    private String libraryName;

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    // Static nested class representing a book
    static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public void displayInfo() {
            System.out.println("Book Title: " + title);
            System.out.println("Author: " + author);
        }
    }

    public static void main(String[] args) {
        Library myLibrary = new Library("City Library");

        Library.Book javaBook = new Library.Book("Java Programming", "Jon");
        javaBook.displayInfo();
    }
}

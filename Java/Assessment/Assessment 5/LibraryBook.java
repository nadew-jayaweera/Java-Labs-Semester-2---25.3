class LibraryBook {
    int bookId;
    String title;
    String author;
    int totalCopies;
    int borrowedCopies;

    LibraryBook() {
        bookId = 0;
        title = "Unknown Title";
        author = "Unknown Author";
        totalCopies = 5;
        borrowedCopies = 0;
    }

    LibraryBook(int bookId, String title, String author, int totalCopies) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.totalCopies = totalCopies;
        this.borrowedCopies = 0;
    }

    String borrowBook(int count) {
        int available = totalCopies - borrowedCopies;

        if (count <= available) {
            borrowedCopies += count;
            available = totalCopies - borrowedCopies;

            return "Successfully borrowed " + count +
                   " copy/copies. Remaining: " + available;
        } else {
            return "Only " + available + " copy/copies available.";
        }
    }

    void returnBook(int count) {
        if (count <= borrowedCopies) {
            borrowedCopies -= count;

            System.out.println(count +
                    " copy/copies returned successfully.");
        } else {
            System.out.println("Return count exceeds borrowed copies.");
        }
    }

    int getAvailableCopies() {
        return totalCopies - borrowedCopies;
    }

    String getBookInfo(String shelf) {
        return "Book ID: " + bookId +
               "\nTitle: " + title +
               "\nAuthor: " + author +
               "\nTotal Copies: " + totalCopies +
               "\nBorrowed Copies: " + borrowedCopies +
               "\nAvailable Copies: " + getAvailableCopies() +
               "\nShelf Location: " + shelf;
    }

     public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook();

        LibraryBook book2 = new LibraryBook(101, "Java Programming", "James Gosling", 10);

        System.out.println("----- Book 1 Info -----");
        System.out.println(book1.getBookInfo("A1"));

        System.out.println("\n----- Book 2 Info -----");
        System.out.println(book2.getBookInfo("B2"));

        System.out.println("\n--- Borrowing Books ---");
        System.out.println(book2.borrowBook(4));

        System.out.println("\nBook Info After Borrowing:");
        System.out.println(book2.getBookInfo("B2"));

        System.out.println("\n--- Borrowing More Than Available ---");
        System.out.println(book2.borrowBook(7));

        System.out.println("\n--- Returning Books ---");
        book2.returnBook(2);

        System.out.println("\nBook Info After Returning:");
        System.out.println(book2.getBookInfo("B2"));

        System.out.println("\n--- Borrowing Again ---");
        System.out.println(book2.borrowBook(3));

        System.out.println("\nFinal Book Info:");
        System.out.println(book2.getBookInfo("B2"));
    }
}
package oop;
import java.util.*;
public class BookManagement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Library library = new Library(10);

        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book ID: ");
                    int bookID = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(bookID, title, author));
                    break;
                case 2:
                    System.out.print("Enter book ID to remove: ");
                    int idToRemove = scanner.nextInt();
                    library.removeBook(idToRemove);
                    break;
                case 3:
                    System.out.print("Enter book ID to search: ");
                    int idToSearch = scanner.nextInt();
                    library.searchBook(idToSearch);
                    break;
                case 4:
                    library.displayBooks();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

	}

}
/*1. Add Book
2. Remove Book
3. Search Book
4. Display Books
5. Exit
Enter your choice: 1
Enter book ID: 1
Enter title: Maths
Enter author: Ram
Book added successfully.
1. Add Book
2. Remove Book
3. Search Book
4. Display Books
5. Exit
Enter your choice: 3
Enter book ID to search: 1
Book found:
Title: Maths
Author: Ram
Availability: Available
1. Add Book
2. Remove Book
3. Search Book
4. Display Books
5. Exit
Enter your choice: 4
Books in the library:
Book ID: 1
Title: Maths
Author: Ram
Availability: Available

1. Add Book
2. Remove Book
3. Search Book
4. Display Books
5. Exit
Enter your choice: 1
Enter book ID: 2
Enter title: English
Enter author: Stipen
Book added successfully.
1. Add Book
2. Remove Book
3. Search Book
4. Display Books
5. Exit
Enter your choice: 2
Enter book ID to remove: 2
Book removed successfully.
1. Add Book
2. Remove Book
3. Search Book
4. Display Books
5. Exit
Enter your choice: 5
Exiting program.
*/

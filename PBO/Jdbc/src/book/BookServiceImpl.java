/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;


import config.Database;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author LAB CV-00
 */
public class BookServiceImpl implements BookService {
    
    private Connection connection = Database.DBConnection();
    private PreparedStatement statement;
    
    @Override
    public void addBook(Book book) {
        try {
            String query = "INSERT INTO book VALUES (0, ?, ?)";
            statement = (PreparedStatement) connection.prepareStatement(query);
            statement.setString(1, book.getTitle());
            statement.setString(2, book.getAuthorName());
            statement.executeUpdate();
            
            System.out.println("Book has been added!!n");
            statement.close();
        } catch (SQLException exc) {
            System.out.println("FAILDE TO ADD BOOK " + exc.getMessage());
        }
    }
    
    @Override
    public List<Book> findBookList() {
        List<Book> books = new ArrayList<>();
        
        try {
            String query = "SELECT * FROM book";
            statement = (PreparedStatement) connection.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            
            while (result.next()) {
                Book book = new Book();
                int id = result.getInt("id");
                String title = result.getString("title");
                String authorName = result.getString("author_name");
                book.setId(id);
                book.setTitle(title);
                book.setAuthorName(authorName);
                books.add(book);
            }
            statement.close();
            return books;
        } catch (SQLException exc) {
            System.out.println("FAILED TO GET BOOK LIST : " + exc.getMessage());
        }
        return books;
    }
    
    
 
    public Book findBookById(int bookId) {
        Book book = new Book();
        try {
            String query = "SELECT * FROM book WHERE id = ?";
            statement = (PreparedStatement) connection.prepareStatement(query);
            statement.setInt(1, bookId);
            
            ResultSet result = statement.executeQuery();
            if (result.next()) {
            int id = result.getInt("id");
            String title = result.getString("title");
            String authorName = result.getString("author_name");
            
            book.setId(id);
            book.setTitle(title);
            book.setAuthorName(authorName);
        }
        statement.close();
        return book;
        }catch (SQLException exc) {
            System.out.println("FAILDE TO GET BOOK : " + exc.getMessage());
        }
        return book;
    }
    
    
    @Override
    public void updateBook(Book book) {
        try {
            String query = "UPDATE book SET title = ?, author_name = ? WHERE id = ?";
            
            statement = (PreparedStatement) connection.prepareStatement(query);
            statement.setString(1, book.getTitle());
            statement.setString(2, book.getAuthorName());
            statement.setInt(3, book.getId());
            statement.executeUpdate();
            
            System.out.println("Sukses update the book with id = " + book.getId());
            System.out.println("\n");
            statement.close();
        }catch (SQLException exc) {
            System.out.println("FAILED TO UPDATE BOOK DATA : " + exc.getMessage());
        }
    }
    
    
   
    @Override
    public void removeBook(int id) {
        try {
            
            String query = "DELETE FROM book WHERE id = ?";
            statement = (PreparedStatement) connection.prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();
            
            System.out.println("Sukses delete book!\n");
            statement.close();
        }catch (SQLException exc) {
            System.out.println("FAILED TO DELETE BOOK DATA : " + exc.getMessage());
        }
    }

}

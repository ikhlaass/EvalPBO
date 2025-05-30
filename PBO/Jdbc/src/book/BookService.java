/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

import java.util.List;
/**
 *
 * @author LAB CV-00
 */
public interface BookService {
    public void addBook(Book book);
    public List<Book> findBookList();
    public Book findBookById(int id);
    public void updateBook(Book book);
    public void removeBook(int id);
}

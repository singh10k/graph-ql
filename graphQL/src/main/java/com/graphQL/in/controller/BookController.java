package com.graphQL.in.controller;

import com.graphQL.in.dto.BookInput;
import com.graphQL.in.model.Book;
import com.graphQL.in.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import java.util.List;

@AllArgsConstructor
@Controller
public class BookController {
    public final BookService bookService;
    @MutationMapping("createBook")
    public Book create(@Argument BookInput book){
        Book b = new Book();
        b.setTitle(book.getTitle());
        b.setDescription(book.getDescription());
        b.setAuthor(book.getAuthor());
        b.setPrice(book.getPrice());
        b.setPages(book.getPages());
        return this.bookService.create(b);
    }

    @QueryMapping("allBooks")
    public List<Book> getAll(){
        return this.bookService.getALL();
    }

    @QueryMapping("getBook")
    public Book getBook(@Argument int bookId){
        return this.bookService.get(bookId);
    }
}

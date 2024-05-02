package com.graphQL.in.serviceImp;

import com.graphQL.in.model.Book;
import com.graphQL.in.repository.BookRepository;
import com.graphQL.in.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class BookServiceImp implements BookService {
    private final BookRepository bookRepository;
    @Override
    public Book create(Book book) {
        return this.bookRepository.save(book);
    }

    @Override
    public List<Book> getALL() {
        return this.bookRepository.findAll();
    }

    @Override
    public Book get(int BookId) {
        return this.bookRepository.findById(BookId).orElseThrow(()->new RuntimeException("Book you are looking for not found for server !!"));
    }
}

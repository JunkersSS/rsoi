package ru.bmstu.rsoi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.bmstu.rsoi.dao.AuthorRepository;
import ru.bmstu.rsoi.dao.BookRepository;
import ru.bmstu.rsoi.entity.Author;
import ru.bmstu.rsoi.entity.Book;

import javax.annotation.PostConstruct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by ali on 22.11.16.
 */
@Component
@Scope
@Transactional
public class InitDataLoader {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    @PostConstruct
    public void initAuthor() throws ParseException {
    }

    public static Date toDate(String date) throws ParseException {
        return new SimpleDateFormat("yyyy-MM-dd").parse(date);
    }
}

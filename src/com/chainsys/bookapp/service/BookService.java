package com.chainsys.bookapp.service;

import java.util.Set;

import com.chainsys.bookapp.model.Book;

public interface BookService {

	Set<Book> findAll();
}

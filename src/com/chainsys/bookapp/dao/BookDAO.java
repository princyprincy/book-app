package com.chainsys.bookapp.dao;

import java.util.Set;

import com.chainsys.bookapp.model.Book;

public interface BookDAO {
	Set<Book> findAll();

}

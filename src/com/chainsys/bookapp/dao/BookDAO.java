package com.chainsys.bookapp.dao;

import java.util.List;
import java.util.Set;

import com.chainsys.bookapp.exception.BookNotFoundException;
import com.chainsys.bookapp.model.Book;

public interface BookDAO {
	Set<Book> findAll();
	List<Integer> findAllId();
	List<String> findAllName() ;
	Book findById(int id) throws BookNotFoundException;
	Book findByName(String name) throws BookNotFoundException;

}

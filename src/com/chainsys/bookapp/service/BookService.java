package com.chainsys.bookapp.service;

import java.sql.Date;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import com.chainsys.bookapp.exception.BookNotFoundException;
import com.chainsys.bookapp.model.Book;

public interface BookService {

	Set<Book> findAll();
	List<Integer> findAllId();
	List<String> findAllName();
	List<Date> findAllDate();

	Book findById(int id) throws BookNotFoundException;
	Book findByName(String name) throws BookNotFoundException;
	Book findByDate(LocalDate date) throws BookNotFoundException;

}

package com.chainsys.bookapp.service;

import java.util.List;

import java.util.Set;

import com.chainsys.bookapp.dao.BookDAO;
import com.chainsys.bookapp.dao.BookDAOImpl;
import com.chainsys.bookapp.exception.BookNotFoundException;
import com.chainsys.bookapp.model.Book;


public class BookServiceImpl implements BookService{
	private static BookDAO dao;

	public BookServiceImpl() {
		dao = new BookDAOImpl();
	}

	@Override
	public Set<Book> findAll() {
		return dao.findAll();

	}

	@Override
	public List<Integer> findAllId() {
		return dao.findAllId();
	}

	@Override
	public List<String> findAllName() {
		return dao.findAllName();
	}

	@Override
	public Book findById(int id) throws BookNotFoundException{
		Book book=dao.findById(id);
		if (book == null) {
			throw new BookNotFoundException("Book Id Not Found");
		} else {
			return book;
		}

	}
	

}

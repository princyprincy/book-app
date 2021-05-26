package com.chainsys.bookapp.service;

import java.util.Set;

import com.chainsys.bookapp.dao.BookDAO;
import com.chainsys.bookapp.dao.BookDAOImpl;
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



}

package com.chainsys.bookapp.test;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.chainsys.bookapp.model.Book;
import com.chainsys.bookapp.service.BookService;
import com.chainsys.bookapp.service.BookServiceImpl;

public class BookClient {
	public static void main(String[] args) {

	Set<Book> bookSet;
	BookService service = new BookServiceImpl();
	System.out.println(" 1. Find All Products");
	System.out.println("Enter the choice");
	Scanner scanner = new Scanner(System.in);
	int choice = scanner.nextInt();
	switch (choice) {
	case 1:
		System.out.println("Find All Products");
		bookSet = service.findAll();
		System.out.println(bookSet);
		break;
	default:
		break;
	}
	scanner.close();


}
}
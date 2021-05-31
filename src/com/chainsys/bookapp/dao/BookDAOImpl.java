package com.chainsys.bookapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.chainsys.bookapp.model.Book;

public class BookDAOImpl implements BookDAO {
	private static Connection con;
	private static PreparedStatement pstmt;
	private static ResultSet rs;
	private static Set<Book> bookSet;
	private static ArrayList<Integer> idlist;

	public BookDAOImpl() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@fserver.chainsys.com:1521:DBEBS12", "apps", "apps");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Set<Book> findAll() {
		try {
			pstmt = con.prepareStatement("select * from book_2611");
			rs = pstmt.executeQuery();
			bookSet = new HashSet<>();
			while (rs.next()) {
				Book book = new Book(rs.getInt("book_id"), rs.getString("book_title"),
						rs.getDate("publish_date").toLocalDate());
				bookSet.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bookSet;
	}

	@Override
	public List<Integer> findAllId() {
		try {
			pstmt = con.prepareStatement("select book_id from book_2611");
			rs = pstmt.executeQuery();
			idlist = new ArrayList<>();
			while (rs.next()) {
				idlist.add(rs.getInt("book_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return idlist;
		
	}

}

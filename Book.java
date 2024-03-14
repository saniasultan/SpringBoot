package com.api.book.entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Book {
	@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="stud_id")
private int id;
	@Column(name="stud_role")
private String title;
	@Column(name="stud_adress")
private String author;
@Override
public String toString() {
	return "Book [id=" + id + ", title=" + title + ", author=" + author + "]";
}
public Book() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public Book(int id, String title, String author) {
	super();
	this.id = id;
	this.title = title;
	this.author = author;
}
}

package com.zhao.pojo;


public class Books {

  private int bookid;
  private String bookName;
  private int bookCounts;
  private String detail;

  public Books() {
  }

  public Books( String bookName,  String detail) {
    this.bookid = bookid;
    this.bookName = bookName;
    this.bookCounts = bookCounts;
    this.detail = detail;
  }

  public int getBookid() {
    return bookid;
  }

  public void setBookid(int bookid) {
    this.bookid = bookid;
  }


  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }


  public int getBookCounts() {
    return bookCounts;
  }

  public void setBookCounts(int bookCounts) {
    this.bookCounts = bookCounts;
  }


  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

}

package bookcont;

import java.sql.Date;

public class BookDto {
//	ISBN         NOT NULL VARCHAR2(32)  
//	NAME         NOT NULL VARCHAR2(32)  
//	WRITER                VARCHAR2(32)  
//	IMAGE_PATH            VARCHAR2(100) 
//	GENRE                 VARCHAR2(32)  
//	PUBLISHER             VARCHAR2(32)  
//	POSITION     NOT NULL VARCHAR2(32)  
//	PUBLISH_DATE          DATE  
	private String isbn;
	private String name;
	private String writer;
	private String imgPath;
	private String genre;
	private String publisher;
	private String position;
	private Date pubDate;
	
	
	public BookDto(String isbn, String name, String writer, String imgPath, String genre, String publisher,
			String position, Date pubDate) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.writer = writer;
		this.imgPath = imgPath;
		this.genre = genre;
		this.publisher = publisher;
		this.position = position;
		this.pubDate = pubDate;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Date getPubDate() {
		return pubDate;
	}
	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}
}

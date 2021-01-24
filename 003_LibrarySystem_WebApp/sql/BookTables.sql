CREATE TABLE books (
	id SERIAL NOT NULL,
	booktitle VARCHAR(60),
	bookauthor VARCHAR(60),
	
	PRIMARY KEY(id)
);
SELECT *FROM books;

INSERT INTO books (booktitle, bookauthor) VALUES
    ('TO', 'Stephen King'),
    ('Pani Jeziora', 'Andrzej Sapkowski');
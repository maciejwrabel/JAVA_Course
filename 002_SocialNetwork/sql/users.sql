CREATE TABLE users (
	id SERIAL NOT NULL,
	username VARCHAR(45),
	passwowrd VARCHAR(45),
	
	PRIMARY KEY(id)
);

SELECT *FROM users;
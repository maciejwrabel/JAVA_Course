CREATE TABLE users (
	id SERIAL NOT NULL,
	username VARCHAR(45),
	password VARCHAR(45),
	
	PRIMARY KEY(id)
);

SELECT *FROM users;

INSERT INTO users (username, password) VALUES
    ('maciek', 'kot'),
    ('agata', 'pies');
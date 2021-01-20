CREATE TABLE users (
	id SERIAL NOT NULL,
	username VARCHAR(45),
	password VARCHAR(45),
	
	PRIMARY KEY(id)
);

CREATE TABLE posts (
	id SERIAL NOT NULL,
	user_id INTEGER,
	body TEXT,
		
	PRIMARY KEY(id),
	FOREIGN KEY (user_id) REFERENCES users (id)
);

SELECT *FROM users;

INSERT INTO users (username, password) VALUES
    ('maciek', 'kot'),
    ('agata', 'pies');
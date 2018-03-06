CREATE TABLE roles (
    id SERIAL NOT NULL,
    name VARCHAR(50),
    active BOOLEAN,
    PRIMARY kEY(id)
);

INSERT INTO roles (name,active) VALUES ('Administrador',true);

CREATE TABLE users(
    id SERIAL NOT NULL,
    login VARCHAR(100),
    password VARCHAR(200),
    firstName VARCHAR(200),
    lastName VARCHAR(200),
    description TEXT,
    role_id INT,
    PRIMARY KEY(id),
    FOREIGN KEY (role_id) REFERENCES roles(id)
);

INSERT INTO users (login,password,firstName,lastName,description,role_id) VALUES ('admin','admin','Administrador','','',1);



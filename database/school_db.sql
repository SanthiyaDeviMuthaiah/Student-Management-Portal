CREATE DATABASE school_db;
USE school_db;

CREATE TABLE students (
    student_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email VARCHAR(100),
    phone VARCHAR(15),
    course VARCHAR(50),
    dob DATE,
    gender VARCHAR(10)
);


INSERT INTO students VALUES
(1,'John','Doe','john@mail.com','1234567890','Science','2002-05-10','Male');

USE school_db;

INSERT INTO students 
(student_id, first_name, last_name, email, phone, course, dob, gender)
VALUES
(3, 'Amit', 'Shah', 'amit@gmail.com', '9999999999', 'Science', '2001-08-12', 'Male');


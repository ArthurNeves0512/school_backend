SET search_path TO school;

CREATE TABLE STUDENT (
    id uuid PRIMARY KEY,
    registration_number varchar(10),
    name text,
    cpf char(11)
);

CREATE TABLE CLASSROOM (
    id uuid PRIMARY KEY,
    class_name text,
    room varchar(8)
);

CREATE TABLE TEACHER (
    id uuid PRIMARY KEY,
    name text,
    cpf char(11),
    birth_date date
);
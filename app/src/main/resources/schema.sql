crate table employee(
id serial primary key,
fname text not null,
surname text not null,
age int,
constraint employee_fname_surname_unique (fname, surname)
);

create table circleApp(
id serial primary key,
radius double PRECISION,
area double PRECISION,
diameter double PRECISION,
circumferences double PRECISION
);
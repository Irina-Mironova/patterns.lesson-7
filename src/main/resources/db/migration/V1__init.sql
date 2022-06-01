create table users
(
    id          bigserial primary key,
    lastname    varchar(255),
    firstname   varchar(255),
    nikname     varchar(255),
    age         int,
    email       varchar(255)
);


insert into users (id, lastname, firstname, nikname, age, email)
values (1, 'Иванов', 'Иван', 'iva', 25, 'iva@mail.ru'),
       (2, 'Петров', 'Петр', 'petr', 15, 'petr@mail.ru'),
       (3, 'Сидоров', 'Семен', 'sima', 20, 'sima@mail.ru');




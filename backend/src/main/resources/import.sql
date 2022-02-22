insert into category(name) values('Informática');
insert into category(name) values('Redes');
insert into category(name) values('Energia');
insert into category(name) values('CANETAS');
insert into category(name) values('BRINDES');
insert into category(name) values('IMPRESSÃO DIGITAL');
insert into category(name) values('CORTE LASER');
insert into category(name) values('WEBCAN');
insert into category(name) values('JOGOS');
insert into category(name) values('MONITORES');
insert into category(name) values('TELEFONE');
insert into category(name) values('ALIMENTACAO');

insert into product(name, price) values('ROTEADOR D-LINK DIR-615', 59.9);
insert into product(name, price) values('ROTEADOR HUAWEI GIGA', 259.9);
insert into product(name, price) values('ROTEADOR INTELBRAS W5', 135.70);
insert into product(name, price) values('BATERIA FREEDOM 12V/45A', 345.89);
insert into product(name, price) values('ROTEADOR D-LINK DIR-615', 59.9);
insert into product(name, price) values('ROTEADOR D-LINK DIR-615', 59.9);
insert into product(name, price) values('ROTEADOR D-LINK DIR-615', 59.9);
insert into product(name, price) values('BATERIA FREEDOM 12V/70A', 470.9);
insert into product(name, price) values('ROTEADOR D-LINK DIR-615', 59.9);
insert into product(name, price) values('ROTEADOR D-LINK DIR-615', 59.9);
insert into product(name, price) values('ROTEADOR D-LINK DIR-615', 59.9);
insert into product(name, price) values('BATERIA FREEDOM 12V/100A', 699.19);

insert into product_category values(1,1);
insert into product_category values(1,2);
insert into product_category values(2,1);
insert into product_category values(2,2);
insert into product_category values(3,3);

insert into client(name, email, cpf_cnpj, type) values('Maria Silva', 'maria@gmail.com', '70272123515', 1);
insert into client(name, email, cpf_cnpj, type) values('Francisco Antonio', 'francisco@gmail.com', '64578978972', 1);
insert into client(name, email, cpf_cnpj, type) values('Patronato São Jose', 'psj@gmail.com', '887769789000132', 2);
insert into client(name, email, cpf_cnpj, type) values('Ronaldo Nazario', 'ronaldo@gmail.com', '99972123551', 1);
insert into client(name, email, cpf_cnpj, type) values('Don Sushi', 'sushi@gmail.com', '702769789000116', 2);

insert into phone(client_id, phones) values(1,'88889999');
insert into phone(client_id, phones) values(2,'99997777');
insert into phone(client_id, phones) values(2,'77779999');
insert into phone(client_id, phones) values(3,'55559999');
insert into phone(client_id, phones) values(3,'44449999');
insert into phone(client_id, phones) values(4,'99994444');

insert into state(name) values('Ceará');
insert into state(name) values('Maranhão');
insert into state(name) values('Piauí');

insert into city(name, state_id) values('Itapajé', 1);
insert into city(name, state_id) values('Umirim', 1);
insert into city(name, state_id) values('Tejucuoca', 1);
insert into city(name, state_id) values('Imperatriz', 2);

insert into address(publicplace, number, complement, neighborhood, postcode, city_id, client_id) values('Rua das Flores', '22', null, 'Alto da Boa Vista','62600000', 1, 1);
insert into address(publicplace, number, complement, neighborhood, postcode, city_id, client_id) values('Av. Washighton Soares', '255', null, 'Centro', '62600000', 1, 2);
insert into address(publicplace, number, complement, neighborhood, postcode, city_id, client_id) values('Rua São Francisco', '89', null, 'Cruzeiro', '62600000', 1, 3);
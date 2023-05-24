drop schema if EXISTS anotacao;

create schema if not EXISTS anotacao;

use anotacao;

create user 'dba'@localhost identified by 'pass123';

grant select, insert, delete, update on anotacao.* to dba@'localhost';

create table tra_trabalho(
    tra_id bigint primary key auto_increment,
    tra_titulo varchar(100) not null unique,
    tra_data_hora_entrega datetime not null,
    tra_descricao varchar(200),
    tra_grupo varchar(20) not null,
    tra_nota int,
    tra_justificativa varchar(200)
);

insert into tra_trabalho (tra_titulo, tra_data_hora_entrega, tra_grupo, tra_nota, tra_justificativa) values
('Teste 1', current_timestamp(), 'Alpha', 6, 'Bom, mas falta conteúdo'),
('Teste 2', current_timestamp(), 'Beta', 3, 'Incompleto');

create table lnc_lancamento (
  lnc_id bigint unsigned not null auto_increment,
  lnc_justificativa varchar(256) not null,
  lnc_data_hora_inicio datetime not null,
  lnc_data_hora_fim datetime not null,
  lnc_tipo char(1) not null,
  primary key (lnc_id)
);

insert into lnc_lancamento(lnc_justificativa, lnc_data_hora_inicio, lnc_data_hora_fim, lnc_tipo)
  values('Prova', '2023-05-23 19:10', '2023-05-23 21:15', 'N');
insert into lnc_lancamento(lnc_justificativa, lnc_data_hora_inicio, lnc_data_hora_fim, lnc_tipo)
  values('Trabalho 1', '2023-05-23 23:30', '2023-05-24 03:00', 'E');
insert into lnc_lancamento(lnc_justificativa, lnc_data_hora_inicio, lnc_data_hora_fim, lnc_tipo)
  values('Trabalho 2', '2023-05-24 22:00', '2023-05-24 23:00', 'E');
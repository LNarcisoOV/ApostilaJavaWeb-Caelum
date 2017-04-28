create table tb_tarefa (
  id BIGINT NOT NULL AUTO_INCREMENT,
  descricao VARCHAR(255),
  finalizado TINYINT(1),
  dataFinalizacao DATE,
  primary key (id)
);
create table tb_tarefa (
  id BIGINT NOT NULL AUTO_INCREMENT,
  descricao VARCHAR(255),
  finalizado VARCHAR(255),
  dataFinalizacao DATE,
  primary key (id)
);
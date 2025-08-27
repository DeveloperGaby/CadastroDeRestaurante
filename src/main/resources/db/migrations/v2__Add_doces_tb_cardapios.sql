-- V2: Migrations para adicionar a coluna DOCES na tabela de cardápios

ALTER TABLE tb_cardápios
ADD COLUMN doces VARCHAR(255)
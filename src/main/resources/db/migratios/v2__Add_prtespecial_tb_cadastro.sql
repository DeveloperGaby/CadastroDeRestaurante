-- V2: Migrations para adicionar a coluna DOCES na tabela de  cardapios

ALTER TABLE tb_cardapios
ADD COLUMN doces VARCHAR(255)
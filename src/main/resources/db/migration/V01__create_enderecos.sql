CREATE TABLE ENDERECOS (
    ID BIGINT(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    LOGRADOURO VARCHAR(100) NOT NULL,
    BAIRRO VARCHAR(50) NOT NULL,
    CEP CHAR(8) NOT NULL,
    CIDADE VARCHAR(50) NOT NULL,
    UF CHAR(2) NOT NULL,
    IS_ENDERECO_PRINCIPAL BIT
);
CREATE TABLE CLIENTES_EMPRESAS_REPRESENTADAS (
    CLIENTE_ID BIGINT(20),
    EMPRESA_REPRESENTADA_ID BIGINT(20),
    PRIMARY KEY (CLIENTE_ID, EMPRESA_REPRESENTADA_ID)
);
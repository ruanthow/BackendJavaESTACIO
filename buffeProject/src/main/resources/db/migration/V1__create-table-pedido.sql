CREATE TABLE pedido (
    id TEXT NOT NULL PRIMARY KEY UNIQUE,
    nome TEXT NOT NULL,
    qtd_pessoas int NOT NULL,
    data_evento date NOT NULL,
    tipo_evento TEXT NOT NULL,
    telefone TEXT NOT NULL,
    pedido_aceito TEXT NOT NULL
);
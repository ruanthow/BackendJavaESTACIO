CREATE TABLE pedido (
    id INT NOT NULL PRIMARY KEY UNIQUE,
    qtdPessoas int NOT NULL,
    data date NOT NULL,
    hora TIME NOT NULL,
    endereco TEXT NOT NULL,
    mensagem TEXT NOT NULL,
    telefone TEXT NOT NULL,
    pedidoAceito TEXT NOT NULL
);
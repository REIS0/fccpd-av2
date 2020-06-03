# fppcd-av2
Segunda avaliação da disciplina de computação paralela, concorrente e distribuida. Implementação com RabbitMQ e Spring.


- Implemente os 4 componentes de um sistema hipotético de e-commerce:
    - Carrinho de Compras
    - Cobrança
    - Expedição
    - Estoque

- A implementação deve contemplar uma única operação que é a conclusão de compra e que deve conter:
    - E-mail (texto)
    - CEP (texto)
    - Lista dos SKUs dos produtos (texto)
    - Valor (numérico)

- O Componente do carrinho de compras deve notificar os componentes de Cobrança, Estoque e Expedição a respeito da conclusão da compra.

```mermaid
classDiagram
    Anotacao {
        Long id
        String titulo
        String conteudo
        LocalDate dataCriacao
        TipoAnotacao tipoAnotacao
    }

    AreaAtuacao {
        Long id
        String nome
    }

    Tarefa {
        Long id
        String titulo
        String descricao
        LocalDate dataCriacao
        LocalDateTime agendamento
        LocalDate dataConclusao
        LocalDate dataVencimento
        Double custo
        boolean recorrencia
        Status status
        Prioridade prioridade
    }

    Usuario {
        Long id
        String nome
        String email
        String senha
        NivelAcesso nivelAcesso
    }

    Financa {
        Long id
        BigDecimal totalReceita
        BigDecimal totalGasto
    }

    Receita {
        Long id
        String descricao
        BigDecimal valor
        LocalDate dataRecebimento
    }

    Gasto {
        Long id
        String descricao
        BigDecimal valor
        LocalDate dataGasto
    }

    Card {
        Long id
        String conteudo
        LocalDateTime criadoEm
        LocalDateTime atualizadoEm
    }

    Arquivo {
        Long id
        String nome
        String tipo
        byte[] conteudo
    }

    Cartao {
        Long id
        String nome
        BigDecimal limite
        TipoCartao tipoCartao
        BigDecimal saldoUsado
    }

    Cronograma {
        Long id
        String titulo
        String descricao
        LocalDate dataAcao
        LocalTime horIni
        LocalTime horFim
        Categoria categoria
    }

    AreaAtuacao ||--o{ Tarefa : "tarefas"
    Tarefa ||--o{ Card : "cards"
    Tarefa ||--o{ Cronograma : "cronogramas"
    Usuario ||--o{ Tarefa : "tarefas"
    Financa ||--o{ Receita : "receitas"
    Financa ||--o{ Gasto : "gastos"
    Card ||--o{ Arquivo : "arquivos"
    Tarefa }o--|| AreaAtuacao : "areaAtuacao"
    Tarefa }o--|| Usuario : "usuario"
    Receita }o--|| Financa : "financa"
    Gasto }o--|| Financa : "financa"
    Arquivo }o--|| Card : "card"
    Cronograma }o--|| Tarefa : "tarefa"
```

# Entidades do Sistema

## Veículo

Entidade principal do sistema.

### Atributos

- id
- marca
- modelo
- versão
- anoFabricacao
- anoModelo
- placa
- chassi (opcional)
- renavam (opcional)
- cor
- combustível
- quilometragemAtual
- dataCadastro

---

## Manutenção

Representa qualquer serviço realizado no veículo.

### Atributos

- id
- veículo
- categoria
- descrição
- data
- quilometragem
- valor
- oficina
- garantiaMeses
- próximaTrocaKm
- próximaTrocaData
- observações

---

## Abastecimento

### Atributos

- id
- veículo
- data
- posto
- combustível
- litros
- valorLitro
- valorTotal
- quilometragem

---

## Oficina

### Atributos

- id
- nome
- telefone
- endereço
- cidade
- observações

---

## Documento

### Atributos

- id
- veículo
- tipo
- número
- emissão
- vencimento
- observações
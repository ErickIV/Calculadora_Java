[![Github Actions Status for erickvieira/calculadora](https://github.com/erickvieira/calculadora/workflows/Integra%C3%A7%C3%A3o%20continua%20de%20Java%20com%20Maven/badge.svg)](https://github.com/erickvieira/calculadora/actions) 
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=erickvieira_calculadora&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=erickvieira_calculadora)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=erickvieira_calculadora&metric=coverage)](https://sonarcloud.io/component_measures?id=erickvieira_calculadora&metric=coverage)

# Calculadora com CI.

Utiliza 3 ambientes:
- dev - Desenvolvimento
- hmg - Homologação
- prd - Produção

Pipeline de CI:
- dev - Compilação e testes.
- hmg - Análise e cobertura do código.
- prd - Empacotamento.

<br>
- Utiliza o Apache Maven para a automatização da construção.<br>
- A pasta test contém os testes unitários do projeto utilizando JUnit 4.<br>
- A cobertura do código é realizada através do JaCoCo.<br>

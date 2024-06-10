[![Github Actions Status for ErickIV/Calculadora_Java](https://github.com/ErickIV/Calculadora_Java/workflows/Maven%20Package/badge.svg)](https://github.com/ErickIV/Calculadora_Java/actions)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=ErickIV_Calculadora_Java&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=ErickIV_Calculadora_Java)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=ErickIV_Calculadora_Java&metric=coverage)](https://sonarcloud.io/component_measures?id=ErickIV_Calculadora_Java&metric=coverage)

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

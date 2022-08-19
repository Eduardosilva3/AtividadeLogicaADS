# AtividadeLogicaADS

* Atividades Disciplina Lógica de Programação.
* Aluno: Eduardo José da Silva


## Descrição da atividade Avaliativa Final

  Considere o seguinte problema:
*Um professor precisa de um programa para gerenciar as notas de seus alunos.
•Cada aluno terá três notas para compor a sua média da unidade, calculada através de média
aritmética.
*A situação do aluno poderá ser APROVADO (média igual ou superior a 6,0), EXAME FINAL
(média maior ou igual a 3,0 e menor que 6,0) ou REPROVADO (média menor que 3,0).
*O professor deseja premiar com medalha de ouro, prata e bronze para os alunos com as 3
maiores médias.
Faça um programa que faça as seguintes funções:
1. Função obterSituacaoAluno: calcular a média e retornar a situação do aluno
◦ Parâmetros: 3 notas do aluno
◦ Retorno: a situação do aluno (APROVADO, EXAME FINAL, REPROVADO)
2. Função criarColecao: inicializar a coleção de alunos
◦ Parâmetros: nenhum
◦ Retorno: array criado
3. Função adicionarAluno: receber os dados do aluno e armazenar nome e situação do
aluno na coleção (array)
◦ Parâmetros: colecao, nome, nota 1, nota 2, nota 3 do aluno
◦ Retorno: nenhum
4. Função exibirListagem: imprimir lista dos alunos cadastrados com nome e situação do
aluno
◦ Parâmetros: colecao
◦ Retorno: nenhum
Exemplo:
Gustavo Pedro: APROVADO
Bruna Meire: REPROVADO
Eliana Lomena: EXAME FINAL
5. Função exibirTotais: imprimir a quantidade de alunos em cada uma das situações:
APROVADO, REPROVADO, EXAME FINAL
◦ Parâmetros: colecao
◦ Retorno: nenhum
Exemplo:
APROVADO - 10
REPROVADO - 5
EXAME FINAL - 3
6. Função exibirPremiacao: imprimir o nome dos alunos com as 3 maiores médias
◦ Parâmetros: colecao
◦ Retorno: nenhum
Exemplo:
Gustavo Pedro: OURO
Edinaldo Jorge: PRATA
Olivio Hugo: BRONZE

7. Método principal (main):
◦ Criar a coleção dos alunos
◦ Informar a quantidade de alunos
◦ Informar o nome e as 3 notas de cada alunos e armazenar na coleção
◦ Imprimir a listagem dos alunos
◦ Imprimir a premiação
◦ Adicionar mais 3 alunos e suas notas
◦ Imprimir a premiação
◦ Adicionar mais 4 alunos e suas notas
◦ Imprimir a listagem dos alunos
◦ Imprimir o quantitativo por situação
◦ Imprimir a premiação

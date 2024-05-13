Cenário 7: Controle acadêmico

Em uma instituição de ensino, devem ser registradas informações sobre professores, alunos e seus
relacionamentos entre disciplinas.

Todas as pessoas representadas no sistema possuem nome, rg e
matrícula.

O software deve ser desenvolvido no padrão arquitetural Model-View-Controller (MVC).

Os professores possuem número de identificação do seu currículo Lattes 
e titulação, 
envolvendo nome da instituição, ano de conclusão, nome do título obtido e título do trabalho de conclusão. 

Os alunos, por sua vez, possuem o ano de ingresso na instituição, nome do curso e turno.

Todas as disciplinas possuem um nome, identificador, (currículo a que pertencem e um conjunto de competências), classificadas como Necessárias e Complementares. 

Na disciplina também estão registrados o professor que a ministra e os alunos nela matriculados.

Para cada aluno é registrada a situação acerca de suas competências, sendo ela Atingida ou Não-Atingida.

A partir da sua situação, pode-se avaliar a situação do aluno como:

 Aprovado: 100% das competências Necessárias, pelo menos 50% das competências
complementares;

 Reprovado: menos de 50% das competências Necessárias ou menos de 50% das
competências complementares;

 Pendente: nenhuma das duas situações anteriores.
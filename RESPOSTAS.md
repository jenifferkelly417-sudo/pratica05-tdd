1. No Ciclo 1 usamos return 70. Por que isso é aceitável no TDD? O que obrigou a escrever a soma de verdade?
Isso é aceitável porque, no TDD, começamos com o código mais simples possível para fazer o teste passar. Depois, criamos novos testes com valores diferentes, e isso nos obrigou a implementar a soma de verdade, pois o return 70 não funcionava para todos os casos.

2. No Ciclo 3, por que testar com 69 e 70, e não com 50 e 90?
Porque 69 e 70 são valores próximos do limite de aprovação. Assim, conseguimos verificar se o sistema reprova quem tira 69 e aprova quem tira 70, evitando erros na comparação.

3. No Ciclo 4, o que mudou na refatoração? Como você teve certeza de que não quebrou nada?
Na refatoração, organizamos e melhoramos o código sem mudar seu funcionamento. Para ter certeza de que nada foi quebrado, executamos os testes novamente e verificamos se todos continuavam passando.

4. No Ciclo 8, por que alteramos os testes antes de mudar o código?
Porque primeiro precisamos definir o comportamento esperado nos testes. Depois, modificamos o código para atender ao novo requisito. Dessa forma, conseguimos verificar se a implementação está funcionando corretamente.

5. Qual ciclo foi o mais difícil para você, e por quê?
O ciclo mais difícil foi o da AI, porque precisava considerar várias condições, como a nota final, a frequência e a substituição da menor nota. Foi necessário pensar em diferentes situações para garantir que o resultado estivesse correto.
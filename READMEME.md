# Explicações passo a passo do exercício
------ 
## Etapa 1: criação do menu
* A ideia é que o menu tenha toda a lógica dentro dele, não sei a que ponto isso pode ser prejudicial às boas práticas
do java, mas foi a melhor ideia que tive no momento. 
* Primeiro, criei um objeto do tipo *registerNewPet* para poder fazer as chamadas da classe, além do scanner.
* A criação de um construtor para as classes aparentemente é necessária para evitar dependência extrema, como criar 
instâncias da classe a própria classe InitialMenu.
* O método menu é o encarregado de toda a execução do código final. Nele há duas variáveis que servirão especialmente
para o processo de validação.
* Fiz um do-while com um if em primeiro lugar, para poder escapar dos possíveis erros que não vão de encontro com o que 
se pede no algoritmo. É interessante o fato do input.nextLine ser posto no do, porque dessa forma sempre que houver um
erro, o usuário pode digitar novamente. O if se concilia com o while no caso da invalidação acontecer.
* No switch haverá uma case para cada classe correspondente à opção selecionada, nessas classes serão criados métodos e
eles irão apenas ser chamados no case.
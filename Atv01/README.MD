# Crie uma classe em Java que seja capaz de apresentar a soma de todos os argumentos inteiros ou reais recebidos. Argumentos inválidos devem ser desconsiderados sem provocar a exibição de erros ou exceções.

# 1 - Primeiro é utilizado a classe Scanner para ler a entrada
# 2 - um laço de While para ficar pegando os numeros do input
# 3 - se a entrada for igual(equals('s')) a 's' ele sai do laço while e faz a conta final
# 4 - caso o usuario queira continuar adicionando numeros ele entra no trycatch e faz uma verificação para ver se o numero é do tipo Double(Double.parseDouble(value)) esse metodo serve para verificar se o numero é do tipo double, se for ele retorna um true e continua o código, caso seja um false ele cai no catch e só continua o código
# 5 - caso o usuario finalize o código digitando 's', ele sai do loop com um break e logo após faz a soma total num laço de foreach lendo o array "nums", transformando em valores do tipo Double e armazenando a soma na var do tipo double "total"
# 6 - no fim só retorna o total em um println
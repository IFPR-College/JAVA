# Crie uma classe em Java que seja capaz de apresentar a soma de todos os argumentos inteiros ou reais recebidos. Argumentos inválidos devem ser desconsiderados sem provocar a exibição de erros ou exceções.

Para resolução do problema eu fiz com base nesses passos:<br>
 1 - Primeiro é utilizado a **classe Scanner para ler a entrada** <br>
 2 - um **laço de While** para ficar pegando os numeros do input <br>
 3 - **se a entrada for igual(equals('s'))** a 's' ele sai do **laço while** e faz a conta final **(5)** <br>
 4 - caso o usuario queira continuar adicionando numeros ele entra no trycatch e faz uma verificação para ver se o numero é do tipo **Double(Double.parseDouble(value))** esse metodo serve para verificar se o numero é do tipo double, se for ele retorna um true e continua o código, caso seja um false ele cai no catch e só continua o código <br>
 5 - caso o usuario finalize o código digitando 's', ele sai do loop com um break e logo após faz a soma total num laço de **foreach** lendo o array **"nums"**, transformando em valores do tipo Double e armazenando a soma na var do tipo double **"total"** <br>
 6 - no fim só retorna o total em um **System.out.println()** <br>

~~~java
import java.util.ArrayList;
import java.util.Scanner;

        Scanner input = new Scanner(System.in);
        ArrayList<Number> nums = new ArrayList<Number>();
        while (true) {
            System.out.print("Digite um número ou 's' para sair: ");
            String value = input.next();
            if (value.equals("s")) {
                break;
            }
            try {
                Number num = Double.parseDouble(value);
                nums.add(num);
            } catch (NumberFormatException e) {
                continue;
            }
        }
        double total = 0.0;
        for (Number num : nums) {
            total += num.doubleValue();
        }
        System.out.println("A soma total é: " + total);
~~~
package Meli;

import java.io.Console;
import java.util.List;

public class Exercicio {

    static void Main(string[] args)
            {
                int maxDigit = 6;

                List<Integer> numeros = calculation(maxDigit);
                numeros.ForEach(f => { Console.WriteLine(f); });
                Console.Read();
            }

        /*
        Complete a seguinte função para que a mesma devolva todos os possíveis números de 4 dígitos,
        onde cada um seja menor ou igual a<maxDigit>, e a soma dos dígitos de cada número gerado seja 21
        Exemplo maxDigit=6: 3666, 4566...
        */

            private static List<Integer> calculation(int maxDigit)
            {
                List<int> lista = new(1);

                //numeroGerado <= 7770 aqui já filtra na for 7+7+7+0 = 21
                for (int numeroGerado = 1000; numeroGerado <= 7770; numeroGerado++)
                {
                    string numeroGeradoString = numeroGerado.ToString();
                    List<int> digitosDoNumeroGerado = new(4);

                    for (int y = 0; y < numeroGerado.ToString().Length; y++)
                        digitosDoNumeroGerado.Add(Convert.ToInt32(numeroGeradoString.Substring(y, 1)));

                    if (digitosDoNumeroGerado.Max() > maxDigit)
                        continue;

                    int soma = 0;
                    for (int n = 0; n < numeroGerado.ToString().Length; n++)
                        soma += Convert.ToInt32(numeroGeradoString.Substring(n, 1));

                    if (soma == 21)
                        lista.Add(numeroGerado);
                }

                return lista.Any() ? lista : null;
            }

    }

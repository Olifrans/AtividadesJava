//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) {

        //Média de Três Números
        int num01 = 77;
        int num02 = 11;
        int num03 = 27;
        int media = (num01 + num02 + num03) / 3;
        double media01 = (num01 + num02 + num03) / 3.0;
        float media02 = (num01 + num02 + num03) / 3.0f;
        long media03 = (num01 + num02 + num03) / 3L;

        System.out.println("A média do inteiro é: " + media);
        System.out.println("A média do número real é: " + media01);
        System.out.println("A média do número float é: " + media02);
        System.out.println("A média do número long é: " + media03);


        System.out.println();
        System.out.println("---------------------------------------------------------------------");
        //Declaração de Long
        long distancia = 149600000L;
        System.out.println("A distância da Terra ao Sol é: " + distancia + " km.");


        System.out.println();
        System.out.println("---------------------------------------------------------------------");
        //Valor Unicode de um Caractere

        char letra = 'A';

        char letra1 = 'F';
        char letra2 = 'H';
        char letra3 = 'O';
        char letra4 = 'S';

        int valorUnicode = letra;
        System.out.println("O valor Unicode de '" + letra + "' é: " + valorUnicode);


        int valorUnicode1 = letra1;
        System.out.println("O valor Unicode de '" + letra1 + "' é: " + valorUnicode1);

        int valorUnicode2 = letra2;
        System.out.println("O valor Unicode de '" + letra2 + "' é: " + valorUnicode2);

        int valorUnicode3 = letra3;
        System.out.println("O valor Unicode de '" + letra3 + "' é: " + valorUnicode3);

        int valorUnicode4 = letra4;
        System.out.println("O valor Unicode de '" + letra4 + "' é: " + valorUnicode4);




        //Tipos binário
        System.out.println();
        System.out.println("---------------------------------------------------------------------");
        char letrad = 'A';

        // Obter o valor Unicode do caractere
        int valorUnicodef = letra;

        // Converter o valor Unicode para binário
        String valorBinario = Integer.toBinaryString(valorUnicode);

        // Exibir o valor Decimal, Binário e Unicode
        System.out.println("O valor Decimal de '" + letrad + "' é: " + valorUnicode);
        System.out.println("O valor Binário de '" + letrad + "' é: " + valorBinario);
        System.out.println("O valor Unicode de '" + letrad + "' é: \\u" + String.format("%04X", valorUnicodef));


        //Tipos Booleanos
        System.out.println();
        System.out.println("---------------------------------------------------------------------");

        int numero = 5;

        boolean maiorQueDez = numero < 10;
        System.out.println("O número " + numero + " é maior que 10? " + maiorQueDez);


        //Usando Arrays
        System.out.println();
        System.out.println("---------------------------------------------------------------------");

        int[] numeros = {17770, 20, 30, 467676760, 50, 70, 68, 99};
        System.out.println("Primeiro número: " + numeros[0]);
        System.out.println("Primeiro número: " + numeros[2]);
        System.out.println("Primeiro número: " + numeros[2]);
        System.out.println("Primeiro número: " + numeros[3]);
        System.out.println("Último número: " + numeros[numeros.length - 1]);

        //Área de um Retângulo
        System.out.println();
        System.out.println("---------------------------------------------------------------------");

        double altura = 15.7;
        double largura = 5.7;
        double area = altura * largura;
        System.out.println("A área do retângulo é: " + area);


        //Trabalhando com Strings e dados multivalorados
        System.out.println();
        System.out.println("---------------------------------------------------------------------");
        String nome = "Francisco";
        int idade = 46;
        double peso = 72.7;
        System.out.println("Olá meu nome é " + nome + " ,minha idade é "+idade+ " e o meu peso é " +peso);


        //Verificando Par ou Ímpar
        System.out.println();
        System.out.println("---------------------------------------------------------------------");

        int num = 117;
        if (num % 2 ==0){
            System.out.println("O número " + num + " é par.");
        }else {
            System.out.println("O número " + num + " é ímpar.");
        }

        //DeclarandoVariaveis
        System.out.println();
        System.out.println("---------------------------------------------------------------------");
        int novaIdade = 25;
        double NovaAltura = 1.75;
        char inicial = 'J';
        boolean estudante = true;

        System.out.println("Sua idade é " + novaIdade);
        System.out.println("Sua altura é " + NovaAltura);
        System.out.println("A inicial do seu nome é '" + inicial + "'");
        System.out.println("Você é estudante? " + estudante);



//        //  Pré-incremento e Pós-incremento**
//        System.out.println();
//        System.out.println("---------------------------------------------------------------------");
//        int a = 5;
//        int b = a-- ;
//        int c = --a;
//
//        System.out.println("Valor de a: " + a);
//        System.out.println("Valor de b: " + b);
//        System.out.println("Valor de c: " + c);

//
//         int count=15;
//         int a, b, c, d;
//         a = count++;
//         b = count;
//         c = ++count;
//         d = count;
//
//         System.out.println(a + ", " + b + ", " + c + ", " + d);
//
//
////
//        // Operadores Abreviados
//        System.out.println();
//        System.out.println("---------------------------------------------------------------------");
//
//        int valor = 20;
//
//        valor = valor + 5;
//        valor = valor * 2;
//        valor = valor - 3;
//        valor = valor / 2;
//        valor = valor % 4;
//        System.out.println("Resultado final: " + valor);



        int senai = 10;
        int senai1 = 210;
        System.out.println("O valor da \n"+"soma esta errado: " +senai+senai1);
        System.out.println("O valor da \"soma é\": " +(senai+senai1));


        System.out.println("O gato fez \"Miau!\" para mim.");


        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("Esta é a primeira linha."
                + "Esta ainda é a primeira linha."
                + "É apenas uma linha muito longa "
                + "e eu não posso ver isso tudo no NetBeans."
                + "\n" + "Esta é a segunda linha."
                + "\n" + "Esta é a terceira linha.");






        double x = 9/2; //Deve ser 4.5
        System.out.println(x); //imprime 4.0




//        int myInt;
//        double myPercent = 51.9;
//        myInt = (int)myPrecent; // O número é "cortado"



        int myInt;
        long myLong = 123987654321L;
        myInt = (int)myLong; //O número é "cortado"




        int ageYears = 46;
        int ageDays = ageYears * 365;
        long ageSeconds = ageYears * 365 * 24L * 60 * 60;
        System.out.println("Você já tem " + ageDays
                + " dias de idade.");

        System.out.println("Você já tem " + ageSeconds
                + " segundos de idade.");



    }
}
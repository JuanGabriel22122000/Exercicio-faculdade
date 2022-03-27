
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/*Construa uma classe que calcule a área de um triângulo. Lembre-se de que 
para realizar esse cálculo é necessário utilizar a fórmula: (base*altura)/2*/ 

public class App {

    public static void Exercicio1(){

        double base = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da base!"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da altura!"));

        String area = Double.toString((base*altura)/2);

        JOptionPane.showMessageDialog(null, "Área do trinâgulo: " + area );
        
    }

    public static void Exercicio2(){

        int num = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor da base!"));
        int ant = num - 1;
        int suc = num + 1;

        String Ant = Integer.toString(ant);
        String Sucessor = Integer.toString(suc);


        JOptionPane.showMessageDialog(null, "Numero antecessor: " + Ant + "\nNumero sucessor: " + Sucessor);
    }

    public static void Exercicio3(){

        int num = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número: "));

        while(num < 0){
            JOptionPane.showMessageDialog(
                null,
                "O valor e negativo.\nInsira um valor maior que 0.",  
                "Exercício 3", 
                JOptionPane.WARNING_MESSAGE
                );

            num = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número: "));
        }

        String quadrado = Double.toString(Math.pow(num,2));
        String raiz = Double.toString(Math.sqrt(num));
        String cubo = Double.toString(Math.pow(num, 3));

        JOptionPane.showMessageDialog(null, "Numero ao quadrado: " + quadrado + "\nNumero ao cubo: " + cubo + "\nRaiz do Numero: " + raiz);
    }

    public static void Exercicio4(){

        double salario = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor do seu Salário!"));

        double agua = Double.parseDouble(JOptionPane.showInputDialog("Coloque o valor da conta de água"));
        double luz = Double.parseDouble(JOptionPane.showInputDialog("Coloque o valor da conta de luz"));
        double telefone = Double.parseDouble(JOptionPane.showInputDialog("Coloque o valor da conta de telefone"));
        

        double sobra = salario - agua - luz - telefone;

        JOptionPane.showMessageDialog(null, "O restante do Sálario e :  " + sobra);
    }

    public static void Exercicio5(){

        double x = Double.parseDouble(JOptionPane.showInputDialog("Polinomio P(x) = x³ - 7x² + 3x -4 \nInforme o valor de x:"));

        String resposta = Double.toString((Math.pow(x, 3)) - (7*Math.pow(x, 2)) + (3*x) - 4); 

        JOptionPane.showMessageDialog(null, "O resultado e:  " + resposta);
    }

    public static void Exercicio6(){
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int num;
        int maior = 0;
        int menor ;
        int par = 0;
        int impar = 0;
        double media = 0;


        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite 0 para Sair\nColoque um numero na lista"));
            numeros.add(num);
            menor = num;

            if(num == 0){
                break;
            }

            if((num % 2) != 0){
                impar++;
            }

            if((num % 2) == 0){
                par++;
            }

            for(int valor : numeros){
                if(valor > maior){
                    maior = valor;
                }

                media = valor/numeros.size();

            }


            for(int val : numeros){
                if(val < menor){
                    menor = val;
                }
            }
            
            
            JOptionPane.showMessageDialog(null, "O Maior valor:  " + maior +"\nO Menor valor: " + menor
            +"\nA Media valor: " + media +"\nNumeros pares: " + par +"\nNumero de impares: " + impar);

        }while(true);
    }

    public static void Exercicio7(){

        int x = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da tabuáda :"));
        String str = "";

        str += "\nLaço com for\n";

        for(int i=1;i<11;i++){
            str += x + "X" + i + "=" + x*i + "\n";
        }

        str += "\nLaço com While\n";

        int i=1;
        while(i<11){
            str += x + "X" + i + "=" + x*i + "\n";
            i++;
        }

        i=1;
        str += "\nLaço com do While\n";
        do{
            str += x + "X" + i + "=" + x*i + "\n";
            i++;
        }while(i<11);

        JOptionPane.showMessageDialog(null, str);
    }

    

    public static void Exercicio8(){

        String resposta;

        //Cliando uma lista de objetos
        double altura ;
        double peso ;
        int cond1 = 0;
        int cond2 = 0;
        int cond3 = 0;
        int cond4 = 0;


        do{

            altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura do aluno:"));
            peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do aluno:"));
            
            if(altura < 1.50){
                cond1++;
            }

            if(peso > 90){
                cond2++;
            }

            if(peso < 50 || altura>1.80){
                cond3++;
            }

            if(peso > 100 || altura < 1.50){
                cond4++;
            }

            JOptionPane.showMessageDialog(null,
            "Alunos com altura inferior a 1.50m:  " + cond1
            +"\nAlunos com peso superior a 90kg: " + cond2
            +"\nAlunos com peso inferior a 50kg e altura superior a 1.80m: " + cond3
            +"\nAlunos com peso superior a 100kg e altura inferior a 1.50m: " + cond4 );

            resposta = JOptionPane.showInputDialog("Quer continuar(S/N): ");

        }while(resposta.intern() == "S");
    }

    public static void Exercicio9(){
        String Resposta = "";
    
        char[] letras = JOptionPane.showInputDialog("Digite uma sequencia de letras").toCharArray();

        int cont = letras.length-1;
        
        for(int i = 0; i <= cont; i++){
            Resposta += Character.toString(letras[cont - i]);
        }
        JOptionPane.showMessageDialog(null,Resposta);
    }

    public static void Exercicio10(){

        LocalDate DataAtual = LocalDate.now();

        int diaAtual = DataAtual.getDayOfMonth();
        int mesAtual = DataAtual.getMonthValue();
        int anoAtual = DataAtual.getYear();

        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano em que você nasceu"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o Mes em que você nasceu"));
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o Dia em que você nasceu"));

        int resultado = ((anoAtual - ano)*365) + ((mesAtual - mes)*30) + (diaAtual - dia);

        JOptionPane.showMessageDialog(null, "Sua idade em dias: "+ resultado);

    }

    public static void main(String[] args) {

        Exercicio1();
        Exercicio2();
        Exercicio3();
        Exercicio4();
        Exercicio5();
        Exercicio6();
        Exercicio7();
        Exercicio8();
        Exercicio9();
        Exercicio10();       
    }
}

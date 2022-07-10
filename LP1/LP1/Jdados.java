import java.util.*;//Disponibiliza em determinada classe o acesso a demais classes que estejam em pacotes distindos.
//Ex: "Main" --> "Jdados".

/*
Danilo Silva
Julia Clara Cordeiro Buscarini
Leonardo Moreira de Oliveira
Luis Felipe de Sousa Ferreira
Ruth Maria do Nascimento Teixeira
*/

//Criação da classe inicial (Jdados) , onde serão declarados os componentes e propriedades que irão constituir a classe.

public class Jdados {

    //Criação de uma classe responsável por gerar números de modo randômico 
    
    public Random randomNum = new Random();

    //Criação de um dado específico responsável por armazenar "Continue", "WON" e "LOST", que são os dados invariaveis do programa.
    
public enum Status {Continue, WON, LOST};
public final static int SNAKE_EYES = 2; //Criação de uma várivel do tipo inteiro com o valor fixo.
public final static int TREY = 3; //Criação de uma várivel do tipo inteiro com o valor fixo.
public final static int SEVEN = 7; //Criação de uma várivel do tipo inteiro com o valor fixo.
public final static int YO_LEVEN = 11; //Criação de uma várivel do tipo inteiro com o valor fixo.
public final static int BOX_CARS = 12; //Criação de uma várivel do tipo inteiro com o valor fixo.

    //Criada a função "void", que tem a característica peculiar de não retornar qualquer tipo de informação; utilizada apenas na execução.   
    
    public void play(){
        int myPoint = 0; //Criação de uma várivel do tipo inteiro.
        Status gameStatus;  
        int sumDice = rollDice(); //Variável que recebe  valor aleatório retornado pelo método rollDice.

            switch (sumDice){//Criação do condicional "sumDice".

                case SEVEN://Condição para suprir o condicional.

                case YO_LEVEN://Condição para suprir o condicional.

                    gameStatus=Status.WON;//gameStatus recebe o valor de Status.WON caso  satisfaça a condição.

                case SNAKE_EYES://Condição para suprir o condicional.

                case BOX_CARS://Condição para suprir o condicional.

                    gameStatus=Status.LOST;//gameStatus receberá o  de valor Status.LOST caso  satisfaça a condição.

                case TREY://Condição para suprir o condicional.

                default://Condição para suprir o condicional.

                    gameStatus=Status.Continue;//gameStatus receberá o de valor Status.Continue caso satisfaça a condição.

                    myPoint=sumDice;//Atribuindo sumDice ao myPoint.

                    System.out.printf("Point is %d\n", myPoint);//Exibição do dado que se adequou a um condicional.

                    break;//Fim do condicional.
            }
        while(gameStatus==Status.Continue){//Equanto gameStatus for igual à Status.Continue será cumprido o que está abaixo.
            sumDice = rollDice();//Atribuição de outro nome à função.

            if (sumDice == myPoint)//Se sumDice for igual à myPoint, será cumprido o que está abaixo.
                gameStatus = Status.WON;//game.Status será igual à Status.WON.
            else
                if (sumDice==SEVEN)//Se sumDice for igual à SEVEN, será cumprido o que está abaixo.
                    gameStatus = Status.LOST;//game.Status será igual à Status.LOST.
        }
        if (gameStatus == Status.WON)//Se game.Status for igual à Status.WON, será cumprido o que está abaixo.
            System.out.println("Player Wins!");//Será exibido "Player Wins!".
        else//Caso game.Stauts não seja igual à Status.WON, será cumprido o que está abaixo.
            System.out.println("Player Loses!");//Será exibido "Player Loses!".
    }
    
    //É uma função na qual "rollDice" retorna somente valores inteiros.
    
    public int rollDice(){
        int die1 = 1+ randomNum.nextInt(6);//A variável die1 terá o valor de 1 + o número randômico entre 0 a 6.
        int die2 = 1+ randomNum.nextInt(6);//A variável die2 terá o valor de 1 + o número randômico entre 0 a 6.
        int sum = die1 + die2;//A variável sum terá o valor de die1 +  die2.
        System.out.printf("Player rolled %d = %d\n", die1, die2, sum);//Será exibido os números aleatórios gerados pelo programa e a soma deles.
        return sum;
    }

}
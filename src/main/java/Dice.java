import java.util.Random;

public class Dice {
        int numSides;
        int numDice;

        public Dice(int numDice, int numSides)
        {
                this.numDice = numDice;
                this.numSides = numSides;

        }

        public int toss()
        {
                int dice1 = 1 + (int) (Math.random() * 6);
                int dice2 = 1 + (int) (Math.random() * 6);


                return dice1 + dice2;
        }

}






            





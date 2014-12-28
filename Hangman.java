public class Hangman {
    
    public static void main(String[] args) {
        // Enter amazing code here:
        if (args.length == 0) {
          System.out.println("Please enter a word");
          System.exit(0);
        }
        Game game = new Game(args[0]);
        Prompter prompter = new Prompter(game);
        prompter.play();
    }
}
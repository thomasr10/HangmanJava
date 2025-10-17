      // String word = "test";

        // Scanner scanner = new Scanner(System.in);
        // ArrayList<Character> wordState = new ArrayList<>();
        // int wrongGuesses = 0;

        // for (int i = 0; i < word.length(); i++) {
        //     wordState.add('_');
        // }
        // System.out.println("*************************");
        // System.out.println("Welcome to Java Hangman !");
        // System.out.println("*************************");

        // System.out.print("Word : ");

        // while (wrongGuesses < 6) {

        //     System.out.print(getHangmanArt(wrongGuesses));

        //     for (char c : wordState) {
        //         System.out.print(c + " ");
        //     }
        //     System.out.println();

        //     System.out.print("Guess a letter : ");
        //     char guess = scanner.next().toLowerCase().charAt(0);

        //     if (word.indexOf(guess) >= 0) {

        //         System.out.println("Correct guess ! \n");

        //         for (int i = 0; i < word.length(); i++) {
        //             if (word.charAt(i) == guess) {
        //                 wordState.set(i, guess);

        //             }
        //         }

        //         if (!wordState.contains('_')) {
        //             System.out.print(getHangmanArt(wrongGuesses));
        //             System.out.println("You Win !");
        //             System.out.println("The word was : " + word);
        //             break;
        //         }

        //     } else {
        //         wrongGuesses++;
        //         System.out.println("Wrong guess !\n");
        //     }
        // }

        // if (wrongGuesses >= 6) {
        //     System.out.println(getHangmanArt(wrongGuesses));
        //     System.out.println("Game Over !");
        //     System.out.println("The word was " + word);
        // }

        // scanner.close();
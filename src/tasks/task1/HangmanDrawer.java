package tasks.task1;

class HangmanDrawer {
    public void draw(int lives) {
        switch (lives) {
            case 6 -> System.out.println("""
                      _______
                     |/      |
                     |      
                     |      
                     |       
                     |      
                     |
                     |_________
                    """);
            case 5 -> System.out.println("""
                      _______
                     |/      |
                     |      (_)
                     |      
                     |       
                     |      
                     |
                     |_________
                    """);
            case 4 -> System.out.println("""
                      _______
                     |/      |
                     |      (_)
                     |       |
                     |       |
                     |      
                     |
                     |_________
                    """);
            case 3 -> System.out.println("""
                      _______
                     |/      |
                     |      (_)
                     |      \\|
                     |       |
                     |      
                     |
                     |_________
                    """);
            case 2 -> System.out.println("""
                      _______
                     |/      |
                     |      (_)
                     |      \\|/
                     |       |
                     |      
                     |
                     |_________
                    """);
            case 1 -> System.out.println("""
                      _______
                     |/      |
                     |      (_)
                     |      \\|/
                     |       |
                     |      / 
                     |
                     |_________
                    """);
            case 0 -> System.out.println("""
                      _______
                     |/      |
                     |      (_)
                     |      \\|/
                     |       |
                     |      / \\
                     |
                     |_________
                    """);
        }
    }
}
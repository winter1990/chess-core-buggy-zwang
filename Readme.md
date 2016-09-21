###Chess Core... Now featuring Bugs!

This repo is meant as a tool to explore different aspects of a day in the life of Software Engineer in Test: finding bugs, fixing bugs, and writing tests. 

We assume you have at least passing knowledge of the game of chess, but no strategy is necessary for this project.  If you have little knowledge of chess, the Wikipedia article is an excellent reference:

http://en.wikipedia.org/wiki/Chess

# Your Goals
We've intentionally planted several bugs in this chess app. Your goal is to identify the bugs, write tests for them, and fix them.

Notes:
* Test coverage corresponding to these bugs has been removed or modified. Ideally a candidate would add tests, perhaps even before starting work to resolve the bug.
* Find bugs any way that comes naturally to you: examine existing test coverage and try to identify gaps, manually test the app, etc.
* This exercise is open-ended and you're encouraged to ask questions and communicate often with the problem administrator. The goal isn't to find every last bug necessarily, but to showcase the best of your abilities.

# Getting Started With The App
The initial state of the project provides very little; not much more than a basic structure for displaying a chess board via a CLI.  After you fork the directory, you can run the program via Maven:

```Shell
$ mvn compile exec:java
{{ Maven output deleted for brevity }}
Welcome to Chess!
Type 'help' for a list of commands.

    a   b   c   d   e   f   g   h  
  +---+---+---+---+---+---+---+---+
8 | R | N | B | Q | K | B | N | R | 8
  +---+---+---+---+---+---+---+---+
7 | P | P | P | P | P | P | P | P | 7
  +---+---+---+---+---+---+---+---+
6 |   |   |   |   |   |   |   |   | 6
  +---+---+---+---+---+---+---+---+
5 |   |   |   |   |   |   |   |   | 5
  +---+---+---+---+---+---+---+---+
4 |   |   |   |   |   |   |   |   | 4
  +---+---+---+---+---+---+---+---+
3 |   |   |   |   |   |   |   |   | 3
  +---+---+---+---+---+---+---+---+
2 | p | p | p | p | p | p | p | p | 2
  +---+---+---+---+---+---+---+---+
1 | r | n | b | q | k | b | n | r | 1
  +---+---+---+---+---+---+---+---+
    a   b   c   d   e   f   g   h  

White's Move
> help
Possible commands:
    'help'                       Show this menu
    'quit'                       Quit Chess
    'new'                        Create a new game
    'board'                      Show the chess board
    'list'                       List all possible moves
    'move <colrow> <colrow>'     Make a move
{{ Board redisplayed }}
> quit
Goodbye!
```

# Congrats!
All done? Congratulations! Please send us a Pull Request so we can review your work.
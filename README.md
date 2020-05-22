# Pacman with scoreboard and Input name
Note: Open game from NameFrame.java
- Name: Gunduzalp Dogrutekin
- Contact: gunduzalp.dogrutekin@iaau.edu.kg
- Computer Science Department of Ala-too International University.
- Final Project for CS-102

This Pacman game which inputs name is a class project. It uses the Model-View-Controller pattern to create a well-structured application that keeps track of game state, displays current game state, and reacts to user input.

![image](https://user-images.githubusercontent.com/65071516/82661258-7e15e380-9c4d-11ea-89bc-8ff833accfc1.png)


![Level 1](level1screen.png)

## Features
Implements most typical features of Pac-Man.Before entring the game user inputs their name then,the game opens. The user can press the arrow keys to dictate the direction that Pac-Man is moving, and he is chased by two ghosts that move randomly unless they are in the same row or column as Pac-Man, in which case they move towards him in the normal mode, or move away from him if he has recently eaten a big dot. Changes in the Model are driven by key and timer events. Current score, level, and Game Over/You Won! messages are displayed in Labels at the top of the window, which are updated continuously to reflect changes in the Model.After every level and after each deaths name and score is stored in scores.txt. So, that you can check your scores.

## Repo structure
```
├── README.md                 : Description of this repository
├── improvements.txt          : Reflections on bugs and imperfections remaining at the end of the project, to be improved in the future
├── pacman.iml                : IntelliJ module file
├── src                       : Project code and resource files
│   ├── finalPacman           : MVC java files and fxml layout file
│   ├── levels                : Text files containing level layout information (interpreted by the Model when initialized)
│   └── res                   : Image files (png and gif)
└── .gitignore                : Files and directories to be ignored by git


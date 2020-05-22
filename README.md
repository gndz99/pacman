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

## NameFrame class
The diagram of class. This class was coded to get the user's inputed name 

![image](https://user-images.githubusercontent.com/65071516/82664465-9983ed00-9c53-11ea-81de-16b3bc57b872.png)


## Controller class
Modified the class to use NameFrame class and also scores.txt.

## Repo structure
```
├── README.md                 : Description of this repository
├── level1 screen.png         :Screenshot of level one
├── pacman.iml                : IntelliJ module file
├── scores.txt                : Scores and name is stored
├── src                       : Project code and resource files
│   ├── levels                : Text files containing level layout information (interpreted by the Model when initialized)
│   ├── res                   : Image files (png and gif) 
|   └── finalPacman           : MVC java files and fxml layout file
│        ├── Contoller.java   : Game controlling code
|        ├── Main.java        : Main
|        ├── NameFrame.java   : Input user's name and open game 
|        ├── PacManModel.java : Pacman Model
|        ├── PacManView.java  : Pacman View
|        └── pacamn.fxml
|
└── .gitignore                : Files and directories to be ignored by git


## Orignal creater https://github.com/jbaskauf


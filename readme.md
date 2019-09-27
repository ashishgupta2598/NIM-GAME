To compile and Run the code compile the .java file and run it.Dont make changes with the folder "Nim Game". 

If you are using .jar file then kindly put "Nim game named folder" into F Drive of your PC otherwise the sticks will not dilspay. 

Follow Below for More information and working. Also visit .ppt and .pptx files.
# Glimpse of the Game
![oie_wlmQkGSDremD](https://user-images.githubusercontent.com/40520042/64757334-78f58600-d54f-11e9-9867-df15afe1c7fe.png)

## Introduction
Nim is a mathematical game of strategy in which two players take turns removing objects from distinct heaps. On each turn, a player must remove at least one object, and may remove any number of objects provided they all come from the same heap. The goal of the game is to be the player who removes the last object.
Our Game is designed to be played human vs Computer.
The Game is GUI is made with Java Swings.

## DESCRIPTION
We have a game in which we have 3 sets 
      SET A contains 5 sticks
      SET B contains 4 sticks
      SET C contains 3 sticks

  You have to pick the stick from one of the set .
  You can pick as many sticks as you want but at a
  time from only one set .
            Winner of the game will be the one who will pick
   up the last remaining  sticks.

  Either of the computer or user can start the game.
 
 ## HEURISTICS for Designing Computer Learning
 ### Case1:Winning Condition 
 Computer knows that whatever human player choose will make the human to lose
 
1.If in any  2  sets number of sticks are equal and the remaining set is empty then pick the number of sticks same as the other player or just follow the other player.

2.If there is  a pattern of 1 stick , 2 sticks , 3 sticks in the sets then do same as the point 1.

### case2:Achieve win condition/Case1
Now computer has to make movies that can bring computer to case1

1.Number of sticks are equal and the remaining set contains sticks that may or may not be equal to others then pick all the sticks from the remaining set.

2. If by picking up some sticks from any set we are getting a pattern of 1 stick , 2 sticks , 3 sticks then pick the suitable number of sticks from that set.





 
 
 
   
   











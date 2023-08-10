/*Assignment 3: Animal Hierarchy
Create an abstract class called "Animal" with the following abstract methods:
speak(): Outputs the sound that the animal makes.
move(): Describes how the animal moves.
Create concrete classes Dog, Cat, and Bird that inherit from the abstract class "Animal." Implement the required methods for each class.
Write a program to:
Create instances of Dog, Cat, and Bird.
Display the sound and movement of each animal.*/
abstract class Animal
  {
    abstract void speak();
    abstract void move();
  }
class Dog extends Animal
{
   void speak()
  {
    System.out.println("dog ")
  }
}
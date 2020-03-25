# Desing Principle Lab (25/03/2020)  

https://github.com/zedd-1983/singleOpenClosed

## Q1a
In terms of **Good Desing** the UserController class is violating the **single responsibility principle**. 
It should only have one functionality, yet it tries to expand it's functionality into user 
validation as well as the storage of the user. Instead it should focus only on creating the 
user from provided Json string and offload the additional functionality to support classes such 
as UserValidator and UserStorer. This would simplify the testing of the class as well as improve  
it's maintainability, robustness and extensibility while not sacrificing the functionality.

## Q1c
The advantages to the code after refactoring are that the code within the UserController class  
is smaller. It doesn't need to be modified if functionality needs to be added to validation or 
storage of users. Instead this can be done in their respective classes. The test still works  
indicating that the overall functionality of the class didn't change thus shouldn't affect any  
code where this class is used.

## Q2c
The code in the newly refactored classes is much easier to read. Extending from the Subscriber  
class makes the code in ISPSubscriber and PhoneSubsriber much simpler and creation of new 
types of subscribers this way would be much easier. This code also provided a level of security 
as the Subscriber class is locked down from any modifications by being abstract thus no instance 
of it can be created and used in any other way than inheriting from it and providing new specific
functionality.

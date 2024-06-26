# Writing Custom Classes

## Objectives

* Learn the basics of writing custom Java classes.  

## Background

A **class** serves as a blueprint for an object, which is a 'living' instance of the class. 

To create a class, you would use the `class` keyword followed by a unique name for the class as follows:

```java
class ClassName {

    //functionality here
}
```

> Many IDEs generate classes as `public` to avoid restrictions on usage. The keyword `public` is an access modifier and is beyond the scope of this article. Later in the lesson, when you generate the class, you should retain that modifier.  

In object-oriented programming we define classes to track state and model behavior. Typically we try to create a model of a real-world object or scenario by defining classes. 

## Guided Practice

In this activity, we'll guide you through modeling a generic toy ball. 

### Project Setup

Open your IDE (Eclipse), and select File > New > Java Project. 

Provide the name, Lab-Classes and click OK. 

(Select "Don't Create" if a window comes up asking to "Create a module-info.java" file.)

Right-click on the newly created project and select New > Class. 

Provide the class the name, Ball and click Finish. Your class should look like the following:

```java
public class Ball {

}
```
With the above, we have a basic class set up, but it doesn't do anything. 

We need to add state and behavior, but before we do, let's create a couple of Ball objects. 

### Creating Instances

To create an instance of a class, you simply use the `new` keyword followed by a call to a constructor. 

In the case of our Ball class, we can create an instance as follows:

```java
new Ball();
```

This will create a new instance of a Ball; an object. The above code isn't very useful, however, as we need to keep track of a reference to the object. Thus, we need to assign a new variable to our object. 

In this case we'll create a new _reference_ variable.

```java
Ball b1 = new Ball();
```

> A _reference_ variable is very similar to how you create a primitive variable. The only difference is that reference variables always refer to objects (instances of classes) whereas primitive variables refer to only primitives.

> The same rules as when naming primitive variables apply to naming reference variables.   

Let's create a `main()` method and declare a couple of reference variables to new instances. 

Your code should look like the following:

```java
public class Ball {
    public static void main(String[] args){
        Ball b1 = new Ball();
        Ball b2 = new Ball();
    }
}
```

The next thing we need to do is define some state for our Ball class. 

### Defining State

Since we are modeling a toy ball, let's think of some properties that a real ball has. Perhaps we want to track the size and color of a ball in our model. We can declare some variables to track those properties. 

Keeping it simple, let's declare an `String` variable named `size` and a `String` variable named `color` to track the size and color of a ball.

Your code should look like the following:

```java
public class Ball {
    String size;
    String color;

    ...
}
```

> It is a convention to define any properties at the top of the class and any methods below that.

Let's update our code (with comments added) in `main()` to provide initial values for the two Ball instances. 

```java
public class Ball {
    String size;
    String color;

    public static void main(String[] args){
        Ball b1 = new Ball();
        Ball b2 = new Ball();

        //declare initial state
        b1.size = "big";
        b1.color = "red";
        b2.size = "small";
        b2.color = "blue";
    }
}
```

Now our `Ball` class can keep track of its size and color. Next, we'll add some behavior.

### Defining Behavior

Behavior typically deals with an action of some sort. Perhaps in our model, we should represent how a toy ball can bounce. With this thought, we'll define a method to reflect this action that a ball can take. 

> A **method** is a group of code that can be executed by its label or name. Creating methods is beyond the scope of this lesson. It will be sufficient to simply know what a method is.

We can keep our method simple. Copy the following into your class file just above the `main` method.  

```java
public void bounce(){
    System.out.println("The " + size + " " + color + " ball is bouncing.");
}
```

This method displays a String to the console that prints the size and color of a ball. It arbitrarily says it is "bouncing" as well. 

Your code should now look like the following:

```java
public class Ball {
    String size;
    String color;

    public void bounce(){
        System.out.println("The " + size + " " + color + " ball is bouncing.");
    }

    public static void main(String[] args){
        Ball b1 = new Ball();
        Ball b2 = new Ball();

        //assign initial state to the Ball instances
        b1.size = "big";
        b1.color = "red";
        b2.size = "small";
        b2.color = "blue";
    }
}
```

#### Invoking Behavior

Lastly, add a couple of lines to invoke the method using the two reference variables. To invoke a method, you can use the **dot operator** with a reference variable. 

To invoke the `bounce()` method, you can use the following code:

```java
b1.bounce();
b2.bounce();
```

Add the above lines to your class inside of the `main()` method. Your class file should now look like the following (comments added):

```java
public class Ball {
    String size;
    String color;

    public void bounce(){
        System.out.println("The " + size + " " + color + " ball is bouncing.");
    }

    public static void main(String[] args){
        Ball b1 = new Ball();
        Ball b2 = new Ball();

        //assign initial state to the Ball instances
        b1.size = "big";
        b1.color = "red";
        b2.size = "small";
        b2.color = "blue";
        
        //invoke the bounce method
        b1.bounce();
        b2.bounce();
    }
}
```

Run the code and you'll see that each Ball instance correctly prints its state (size and color) by running the method `bounce()`. 

![](images/image-1.png)

To recap, we've done a few things here. 

We started by conceptualizing what a toy ball is and identified properties (size and color) and behavior (bounce) of a real-world ball. 

We then created a Ball class to model this toy ball:

1. We defined two String properties, size and color, as part of the state to track for a Ball. 
2. We defined behavior by using a single method called "bounce".
3. Within `main()`
    1. we used the `new` keyword to create instances of a Ball.
    2. we created two separate instances of the Ball class
    3. assigned values to their properties
    4. invoked their behavior by calling the `bounce()` method

We define programs to model real-world scenarios using objects. Within an object, you can track state and execute behavior by using the defined properties and methods.  

This concludes the lab.
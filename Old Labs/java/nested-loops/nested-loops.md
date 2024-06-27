# Nested Loops

## Objectives

* Create nested statements that utilize loops.

## Background

A nested statement is one that is defined inside the scope of another. Writing statements this way will create a limited context for variables and provides a logical container for operations.

For example, look at the following:

```java
for (int i = 0; i < 10; i++){
    for (int j = 0; j < 10; j++) {
        System.out.println("i + j = " + (i + j));
    }
}
```

Immediately after defining one for-loop we define another; a nested or inner for-loop. This inner loop will execute within the context of the outer loop. The number of times the `System.out.println` statement will execute is based on the condition statements in _both_ for-loops. How many times do you think it will run?

The answer is 100. This occurs because the inner loop is called 10 times for each iteration of the outer loop (which itself runs 10 times), thus 10 x 10 equals 100. 

## Writing Nested Looping Statements

A nested for-loop is a common scenario used when iterating over a collection or an array when you have to perform a set of operations upon it. It is also useful for iterating through two different sets of data and combining them in some operation.

Say, for example, you had to take two integer arrays with 10 elements each and needed to create a matrix of all combinations of multiplying the elements together. In a step-wise manner, you would write code to print the product of the first element in the first array and the first element in the second array. Then you would print the product of the first element in the first array with the second element in the second array. You would continue with this pattern until you've printed all combinations.

This would be tedious to write without some sort of loop (there are 100 possible combinations). Thus, we'll use a for-loop to iterate over the first array and a nested for-loop to iterate over the second and print the product of the elements.

We'll now guide you through writing a small project to demonstrate a nested for-loop. 

### Project Setup

1. Open your IDE (Eclipse), and select File > New > Java Project.
2. Provide the name, _Lab-NestedLoops_ and click **Finish**.
   a. If a module dialog appears asking to create a module, then click **Don't Create**. 
3. Right-click on the newly created project and select New > Class.
4. Provide the class the name, ProductPrinter and click Finish. 
5. Now edit the file so that it looks like the following:

```java
public class ProductPrinter{

    public static void main(String args[]){
        int[] arr1 = {2,4,6,8,10,12,14,16,18,20};
        int[] arr2 = {1,2,3,5,7,9,11,13,17,19};

        //iterate over the first set of numbers
        for (int i = 0; i < arr1.length; i++) {
            //iterate over the second set of numbers
            for (int j = 0; j < arr2.length; j++) {
                //print the product of the current elements from each set
                System.out.println(arr1[i] * arr2[j]);
            }
        }
    }
}
```

If you run the above code in your IDE, then you'll see the products of all possible combinations printed to the console.

So, let's take a further inspection at the code:

```java
public class ProductPrinter{

    public static void main(String args[]){
        int[] arr1 = {2,4,6,8,10,12,14,16,18,20};
        int[] arr2 = {1,2,3,5,7,9,11,13,17,19};
        ...
```

The first 5 lines are related to the setup of the problem. We define our class, `main` method and our initial arrays.

```java
for (int i = 0; i < arr1.length; i++) {
```
We then begin our first for-loop. We define it to start at zero and the condition being the variable `i` is less than the first array's `length`. 

>**Why did we start with 0?**
>
>Because array indexes start at zero. In this manner, we can use our variable, `i`, to keep track of which element we want to multiply. 

>**Why is our condition less than `arr1.length?`**
>
>We set the _condition statement_ to be less than the length to complete a full iteration through the array. The `.length` property will return the number of elements in the array. So we want to stop _1 less_ than the length. So we use _less than_ as our operation. 

```java
...
//iterate over the second set of numbers
for (int j = 0; j < arr2.length; j++) {
...
```

On the next line we begin our second for-loop. This time, it is defined _inside_ of our first for-loop. By creating a second for-loop, we can change the context of our program and define a new value to loop over while still having access to the outer loop's context. We define the variable `j` for the second loop and its range is from 0 to the second array's, `arr2` length property. 

```java
...
//print the product of the current elements from each set
System.out.println(arr1[i] * arr2[j]);
```

On the next line, we access the current element of each array. We use brackets to specify which index we want. For the first array, we use the variable `i`, since it counts from 0 (zero) to `arr1`'s length. For the second array, we use the variable `j`. We then print the product of those values to the console.



> **NOTE**: Alternatively, we could've stored the current elements in new variables and printed the product later as such:
> ```java
>     int element1 = arr1[i];
>     int element2 = arr2[j];
>            
>     System.out.println(element1 * element2);
>```

Using loops in this manner makes it easy to iterate over multiple sets of data and can reduce the number of lines of code that you write to repeat operations. 

This concludes the lab.
# Problem Set 03

You will be solving the given problems below.

### Problem 21
We're on the lookout for values that contain the same last digit.
You will be given two non-negative numbers to compare.

Tip: Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

Return true if both digits have the same last digit.

Example:
```java
compareLastDigit(7, 17) --> true
compareLastDigit(6, 17) --> false
compareLastDigit(3, 113) --> true
```
### Problem 22
A group of students is given an addition worksheet during class to compete against each other.
The main goal is the find the sum of all the given values; you will be given a set of two numbers.
The teacher decided to put a twist on the contest by providing one rule.

Return the sum of two int values; but if the values are the same then return double their sum.

Example:
```java
doubleTheSum(1, 2) --> 3
doubleTheSum(3, 2) --> 5
doubleTheSum(2, 2) --> 8
```
### Problem 23
Tom's favorite number is ten, and he is on the look-out for the value 10 or the sum 10 out of the values given to him.
Tom needs you to confirm if any of the values given have what he is looking for.

Return true if one value is 10 or return true if the sum of both values is 10.

Example:
```java
lookOut10(9, 10) --> true
lookOut10(9, 9) --> false
lookOut10(1, 9) --> true
```
### Problem 24
Every string needs to begin with "not", in order to do that you need to add "not" to the beginning of a provided string.
But if the string already begins with "not" we will leave it alone, no need to have a "not not".

Return a new string where "not" has been added to the front.

Tip: Use .equals() to compare 2 strings

Example:
```java
beginWithNot("candy") --> "not candy"
beginWithNot("x") --> "not x"
beginWithNot("not bad") --> "not bad"
```
### Problem 25
The most popular number today is 3. We need the first 3 characters of a string, and we need to make
3 copies of those 3 characters. The front of a string is considered those 3 characters. The front can
be less than 3, just need to provide whatever is there.

Return a new string which is 3 copies of the front of the string.

Example:
```java
popular3("Java") --> "JavJavJav"
popular3("Chocolate") --> "ChoChoCho"
popular3("abc") --> "abcabcabc"
```

### Problem 26
With the provided string, we need you to provide a new scrambled string.
Take the first two characters of the string or take whatever characters are present there.

Return the new string with the first 2 characters added at both the front and back of the original string.

Example:
```java
double22("kitten") --> "kikittenki"
double22("Ha") --> "HaHaHa"
double22("abc") --> "ababcab"
```
### Problem 27
We need to check if the given numbers are within the range 10...20 inclusive.
You are given 2 int values, return true if either number is in the range of 10...20.

Example:
```java
range1020(12, 99) --> true
range1020(21, 12) --> true
range1020(8, 99) --> false
```
### Problem 28
Starting at index 1, we need to see if the word "del" appears.
If "del" appears at that index then we need to delete the word "del".

Return a new string where "del" has been deleted if appeared at index 1;
return the string unchanged if "del" doesn't appear.

Example:
```java
deleteDel("adelbc") --> "abc"
deleteDel("adelHello") --> "aHello"
deleteDel("adedbc") --> "adedbc"
```
### Problem 29
Out of the given 3 int values, we need to find the max number.

Return the largest int value out of the given 3.

Example:
```java
maxNumber(1, 2, 3) --> 3
maxNumber(1, 3, 2) --> 3
maxNumber(3, 2, 1) --> 3
```
### Problem 30
Again, we are looking for numbers that are within the range 10...20 inclusive.
But this time we are looking for the max value within that range out of the 2 positive int values.

Return the larger value that is in the range 10...20,
or return 0 if neither number is in that range.

Example:
```java
larger1020(11, 19) --> 19
larger1020(19, 11) --> 19
larger1020(11, 9) --> 11
```
### Problem 31
Create the string to look like it's going up; like a hill. To do this we need to take the last 3 characters
and make them uppercase. Even if there's less than 3 characters, just make whatever is there uppercase.
Doing this allows the string to look like it's going up and down depending on if begins with uppercase or not.

Tip: str.toUpperCase() returns the uppercase version of a string

Return a new string where the last 3 characters are now in upper case.

Example:
```java
goingUp("Hello") --> "HeLLO"
goingUp("hi there") --> "hi thERE"
goingUp("hi") --> "HI"
```
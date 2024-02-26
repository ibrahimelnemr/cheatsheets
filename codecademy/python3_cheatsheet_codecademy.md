https://www.codecademy.com/learn/learn-python-3/modules/learn-python3-hello-world/cheatsheet

# Table of Contents


[Hello World](#hello-world)

[Control Flow](#control-flow)

[Lists](#lists)

[Loops](#loops)

[Functions](#functions)

[Code Challenges](#code-challenges)

[Strings](#strings)

[Modules](#modules)

[Dictionaries](#dictionaries)

[Files](#files)

[Classes](#classes)


# Hello World

## Comments
```python
# Comment on a single line

user = "JDoe" # Comment after code
```

## Arithmetic Operations

```python
# Arithmetic operations

result = 10 + 30
result = 40 - 10
result = 50 * 5
result = 16 / 4
result = 25 % 2
result = 5 ** 3
```

## Plus-Equals Operator
```python
# Plus-Equal Operator

counter = 0
counter += 10

# This is equivalent to

counter = 0
counter = counter + 10

# The operator will also perform string concatenation

message = "Part 1 of message "
message += "Part 2 of message"
```
## Variables
```python
# These are all valid variable names and assignment

user_name = "codey"
user_id = 100
verified = False

# A variable's value can be changed after assignment

points = 100
points = 120
```
## Modulo Operator %
```python
# Modulo operations

zero = 8 % 4

nonzero = 12 % 5
```
## Integers
```python
# Example integer numbers

chairs = 4
tables = 1
broken_chairs = -2
sofas = 0

# Non-integer numbers

lights = 2.5
left_overs = 0.0
```
## String Concatenation
```python
# String concatenation

first = "Hello "
second = "World"

result = first + second

long_result = first + second + "!"
```
## Strings
```python
user = "User Full Name"
game = 'Monopoly'

longer = "This string is broken up \
over multiple lines"
```

# Control Flow
## SyntaxError
```python
age = 7 + 5 = 4

File "<stdin>", line 1
SyntaxError: can't assign to operator
```
## elif Statement

```python
# elif Statement

pet_type = "fish"

if pet_type == "dog":
  print("You have a dog.")
elif pet_type == "cat":
  print("You have a cat.")
elif pet_type == "fish":
  # this is performed
  print("You have a fish")
else:
  print("Not sure!")
```
## or Operator

```python
True or True      # Evaluates to True
True or False     # Evaluates to True
False or False    # Evaluates to False
1 < 2 or 3 < 1    # Evaluates to True
3 < 1 or 1 > 6    # Evaluates to False
1 == 1 or 1 < 2   # Evaluates to True
```
## Equal Operator ==
```python
# Equal operator

if 'Yes' == 'Yes':
  # evaluates to True
  print('They are equal')

if (2 > 1) == (5 < 10):
  # evaluates to True
  print('Both expressions give the same result')

c = '2'
d = 2

if c == d:
  print('They are equal')
else:
  print('They are not equal')
```
## Not Equals Operator !=

```python

# Not Equals Operator

if "Yes" != "No":
  # evaluates to True
  print("They are NOT equal")

val1 = 10
val2 = 20

if val1 != val2:
  print("They are NOT equal")

if (10 > 1) != (10 > 1000):
  # True != False
  print("They are NOT equal")
```
## Comparison Operators

```python
a = 2
b = 3
a < b  # evaluates to True
a > b  # evaluates to False
a >= b # evaluates to False
a <= b # evaluates to True
a <= a # evaluates to True
```
## if Statement

```python
# if Statement

test_value = 100

if test_value > 1:
  # Expression evaluates to True
  print("This code is executed!")

if test_value > 1000:
  # Expression evaluates to False
  print("This code is NOT executed!")

print("Program continues at this point.")
```
## else Statement

```python
# else Statement

test_value = 50

if test_value < 1:
  print("Value is < 1")
else:
  print("Value is >= 1")

test_string = "VALID"

if test_string == "NOT_VALID":
  print("String equals NOT_VALID")
else:
  print("String equals something else!")
```
## and Operator
```python

True and True     # Evaluates to True
True and False    # Evaluates to False
False and False   # Evaluates to False
1 == 1 and 1 < 2  # Evaluates to True
1 < 2 and 3 < 1   # Evaluates to False
"Yes" and 100     # Evaluates to True
```
## Boolean Values

```python
is_true = True
is_false = False

print(type(is_true)) 
# will output: <class 'bool'>
```
## not Operator

```python
not True     # Evaluates to False
not False    # Evaluates to True
1 > 2        # Evaluates to False
not 1 > 2    # Evaluates to True
1 == 1       # Evaluates to True
not 1 == 1   # Evaluates to False
```

# Lists
## Lists
```python
primes = [2, 3, 5, 7, 11]
print(primes)

empty_list = []
```
## Adding Lists Together

```python
items = ['cake', 'cookie', 'bread']
total_items = items + ['biscuit', 'tart']
print(total_items)
# Result: ['cake', 'cookie', 'bread', 'biscuit', 'tart']
```
## Python Lists: Data Types
```python
numbers = [1, 2, 3, 4, 10]
names = ['Jenny', 'Sam', 'Alexis']
mixed = ['Jenny', 1, 2]
list_of_lists = [['a', 1], ['b', 2]]
```
## List Method .append()

```python
orders = ['daisies', 'periwinkle']
orders.append('tulips')
print(orders)
# Result: ['daisies', 'periwinkle', 'tulips']
```
## Zero-Indexing

```python
names = ['Roger', 'Rafael', 'Andy', 'Novak']
```
## List Indices

```python
berries = ["blueberry", "cranberry", "raspberry"]

berries[0]   # "blueberry"
berries[2]   # "raspberry"
```
## Negative List Indices

```python
soups = ['minestrone', 'lentil', 'pho', 'laksa']
soups[-1]   # 'laksa'
soups[-3:]  # 'lentil', 'pho', 'laksa'
soups[:-2]  # 'minestrone', 'lentil'
```
## Modifying 2D Lists

```python
# A 2D list of names and hobbies
class_name_hobbies = [["Jenny", "Breakdancing"], ["Alexus", "Photography"], ["Grace", "Soccer"]]

# The sublist of Jenny is at index 0. The hobby is at index 1 of the sublist. 
class_name_hobbies[0][1] = "Meditation"
print(class_name_hobbies)

# Output
# [["Jenny", "Meditation"], ["Alexus", "Photography"], ["Grace", "Soccer"]]
```
## Accessing 2D Lists

```python
# 2D list of people's heights
heights = [["Noelle", 61], ["Ali", 70], ["Sam", 67]]
# Access the sublist at index 0, and then access the 1st index of that sublist. 
noelles_height = heights[0][1] 
print(noelles_height)

# Output
# 61
```
## List Method .remove()

```python
# Create a list
shopping_line = ["Cole", "Kip", "Chris", "Sylvana", "Chris"]
 
# Removes the first occurance of "Chris"
shopping_line.remove("Chris")
print(shopping_line)

# Output
# ["Cole", "Kip", "Sylvana", "Chris"]
```
## List Method .count()

```python

backpack = ['pencil', 'pen', 'notebook', 'textbook', 'pen', 'highlighter', 'pen']
numPen = backpack.count('pen')

print(numPen)
# Output: 3
```
## Determining List Length with len()

```python
knapsack = [2, 4, 3, 7, 10]
size = len(knapsack)
print(size) 
# Output: 5
```
## List Method .sort()

```python
exampleList = [4, 2, 1, 3]
exampleList.sort()
print(exampleList)
# Output: [1, 2, 3, 4]
```
## List Slicing

```python
tools = ['pen', 'hammer', 'lever']
tools_slice = tools[1:3] # ['hammer', 'lever']
tools_slice[0] = 'nail'

# Original list is unaltered:
print(tools) # ['pen', 'hammer', 'lever']
```
## sorted() Function

```python
unsortedList = [4, 2, 1, 3]
sortedList = sorted(unsortedList)
print(sortedList)
# Output: [1, 2, 3, 4]

```
## List Method .insert()
```python
# Here is a list representing a line of people at a store
store_line = ["Karla", "Maxium", "Martim", "Isabella"]

# Here is how to insert "Vikor" after "Maxium" and before "Martim"
store_line.insert(2, "Vikor")

print(store_line) 
# Output: ['Karla', 'Maxium', 'Vikor', 'Martim', 'Isabella']

```
## List Method .pop()

```python
cs_topics = ["Python", "Data Structures", "Balloon Making", "Algorithms", "Clowns 101"]

# Pop the last element
removed_element = cs_topics.pop()

print(cs_topics)
print(removed_element)

# Output:
# ['Python', 'Data Structures', 'Balloon Making', 'Algorithms']
# 'Clowns 101'

# Pop the element "Baloon Making"
cs_topics.pop(2)
print(cs_topics)

# Output:
# ['Python', 'Data Structures', 'Algorithms']
```




# Loops
## break Keyword

```python
numbers = [0, 254, 2, -1, 3]

for num in numbers:
  if (num < 0):
    print("Negative number detected!")
    break
  print(num)
  
# 0
# 254
# 2
# Negative number detected!
```
## Python List Comprehension

```python
# List comprehension for the squares of all even numbers between 0 and 9
result = [x**2 for x in range(10) if x % 2 == 0]

print(result)
# [0, 4, 16, 36, 64]
```
## Python For Loop

```python
for <temporary variable> in <list variable>:
  <action statement>
  <action statement>
 
#each num in nums will be printed below
nums = [1,2,3,4,5]
for num in nums: 
  print(num)

```
## continue Keyword
```python

big_number_list = [1, 2, -1, 4, -5, 5, 2, -9]

# Print only positive numbers:
for i in big_number_list:
  if i < 0:
    continue
  print(i)
```
## Loops with range()
```python
# Print the numbers 0, 1, 2:
for i in range(3):
  print(i)

# Print "WARNING" 3 times:
for i in range(3):
  print("WARNING")
```
## while Loops
```python

# This loop will only run 1 time
hungry = True
while hungry:
  print("Time to eat!")
  hungry = False

# This loop will run 5 times
i = 1
while i < 6:
  print(i)
  i = i + 1
```
## Python Nested Loops

```python
groups = [["Jobs", "Gates"], ["Newton", "Euclid"], ["Einstein", "Feynman"]]

# This outer loop will iterate over each list in the groups list
for group in groups:
  # This inner loop will go through each name in each list
  for name in group:
    print(name)
```
# Functions
## Function Parameters

```python
def write_a_book(character, setting, special_skill):
  print(character + " is in " + 
        setting + " practicing her " + 
        special_skill)
```
## Multiple Parameters
```python
def ready_for_school(backpack, pencil_case):
  if (backpack == 'full' and pencil_case == 'full'):
    print ("I'm ready for school!")
```
## Functions

```python
# Define a function my_function() with parameter x

def my_function(x):
  return x + 1

# Invoke the function

print(my_function(2))      # Output: 3
print(my_function(3 + 5))  # Output: 9
```
## Function Indentation
```python
# Indentation is used to identify code blocks

def testfunction(number):
  # This code is part of testfunction
  print("Inside the testfunction")
  sum = 0
  for x in range(number):
    # More indentation because 'for' has a code block
    # but still part of he function
    sum += x
  return sum
print("This is not part of testfunction")
```
## Function Arguments
```python
def sales(grocery_store, item_on_sale, cost):
  print(grocery_store + " is selling " + item_on_sale + " for " + cost) 

sales("The Farmer’s Market", "toothpaste", "$1")
```
## Function Keyword Arguments

```python
def findvolume(length=1, width=1, depth=1):
  print("Length = " + str(length))
  print("Width = " + str(width))
  print("Depth = " + str(depth))
  return length * width * depth;

findvolume(1, 2, 3)
findvolume(length=5, depth=2, width=4)
findvolume(2, depth=3, width=4)
```
## Returning Multiple Values
Python functions are able to return multiple values using one return statement. All values that should be returned are listed after the return keyword and are separated by commas.

In the example, the function square_point() returns x_squared, y_squared, and z_squared.
```python
def square_point(x, y, z):
  x_squared = x * x
  y_squared = y * y
  z_squared = z * z
  # Return all three values:
  return x_squared, y_squared, z_squared

three_squared, four_squared, five_squared = square_point(3, 4, 5)
```
## The Scope of Variables

```python
a = 5

def f1():
  a = 2
  print(a)
  
print(a)   # Will print 5
f1()       # Will print 2
```
## Returning Value from Function

```python
def check_leap_year(year): 
  if year % 4 == 0:
    return str(year) + " is a leap year."
  else:
    return str(year) + " is not a leap year."

year_to_check = 2018
returned_value = check_leap_year(year_to_check)
print(returned_value) # 2018 is not a leap year.
```
## Global Variables

```python
a = "Hello"

def prints_a():
  print(a)
  
# will print "Hello"
prints_a()

```
## Parameters as Local Variables

```python
def my_function(value):
  print(value)   
  
# Pass the value 7 into the function
my_function(7) 

# Causes an error as `value` no longer exists
print(value) 
```

# Code Challenges
# Strings
## Python String .format()

The Python string method .format() replaces empty brace ({}) placeholders in the string with its arguments.

If keywords are specified within the placeholders, they are replaced with the corresponding named arguments to the method.


```python
msg1 = 'Fred scored {} out of {} points.'
msg1.format(3, 10)
# => 'Fred scored 3 out of 10 points.'

msg2 = 'Fred {verb} a {adjective} {noun}.'
msg2.format(adjective='fluffy', verb='tickled', noun='hamster')
# => 'Fred tickled a fluffy hamster.'
```
## String Method .lower()
```python
greeting = "Welcome To Chili's"

print(greeting.lower())
# Prints: welcome to chili's
```
## String Method .strip()

```python
text1 = '   apples and oranges   '
text1.strip()       # => 'apples and oranges'

text2 = '...+...lemons and limes...-...'

# Here we strip just the "." characters
text2.strip('.')    # => '+...lemons and limes...-'

# Here we strip both "." and "+" characters
text2.strip('.+')   # => 'lemons and limes...-'

# Here we strip ".", "+", and "-" characters
text2.strip('.+-')  # => 'lemons and limes'
```
## String Method .title()

```python
my_var = "dark knight"
print(my_var.title()) 

# Prints: Dark Knight
```
## String Method .split()

```python
text = "Silicon Valley"

print(text.split())     
# Prints: ['Silicon', 'Valley']

print(text.split('i'))  
# Prints: ['S', 'l', 'con Valley']
```
## Python string method .find()

```python
mountain_name = "Mount Kilimanjaro"
print(mountain_name.find("o")) # Prints 1 in the console.
```
## String replace

```python
fruit = "Strawberry"
print(fruit.replace('r', 'R'))

# StRawbeRRy
```
## String Method .upper()

```python
dinosaur = "T-Rex"

print(dinosaur.upper()) 
# Prints: T-REX
```
## String Method .join()

```python
x = "-".join(["Codecademy", "is", "awesome"])

print(x) 
# Prints: Codecademy-is-awesome
```
## Escaping Characters

```python
txt = "She said \"Never let go\"."
print(txt) # She said "Never let go".
```
## The in Syntax

```python
game = "Popular Nintendo Game: Mario Kart"

print("l" in game) # Prints: True
print("x" in game) # Prints: False
```
## Indexing and Slicing Strings

```python
str = 'yellow'
str[1]     # => 'e'
str[-1]    # => 'w'
str[4:6]   # => 'ow'
str[:4]    # => 'yell'
str[-3:]   # => 'low'
```
## Iterate String

```python
str = "hello"
for c in str:
  print(c)
  
# h
# e
# l
# l
# o
```
## Built-in Function len()

```python
length = len("Hello")
print(length)
# Output: 5

colors = ['red', 'yellow', 'green']
print(len(colors))
# Output: 3
```
## String Concatenation

```python
x = 'One fish, '
y = 'two fish.'

z = x + y

print(z)
# Output: One fish, two fish.
```

# Modules
## Date and Time in Python

```python
import datetime
feb_16_2019 = datetime.date(year=2019, month=2, day=16)
feb_16_2019 = datetime.date(2019, 2, 16)
print(feb_16_2019) #2019-02-16

time_13_48min_5sec = datetime.time(hour=13, minute=48, second=5)
time_13_48min_5sec = datetime.time(13, 48, 5)
print(time_13_48min_5sec) #13:48:05

timestamp= datetime.datetime(year=2019, month=2, day=16, hour=13, minute=48, second=5)
timestamp = datetime.datetime(2019, 2, 16, 13, 48, 5)
print (timestamp) #2019-01-02 13:48:05


```
## Aliasing with ‘as’ keyword

```python
# Aliasing matplotlib.pyplot as plt
from matplotlib import pyplot as plt
plt.plot(x, y)

# Aliasing calendar as c
import calendar as c
print(c.month_name[1])
```
## Import Python Modules

```python
# Three different ways to import modules:
# First way
import module
module.function()

# Second way
from module import function
function()

# Third way
from module import *
function()
```
## random.randint() and random.choice()

```python
# Returns a random integer N in a given range, such that start <= N <= end
# random.randint(start, end)
r1 = random.randint(0, 10)  
print(r1) # Random integer where 0 <= r1 <= 10

# Prints a random element from a sequence
seq = ["a", "b", "c", "d", "e"]
r2 = random.choice(seq)
print(r2) # Random element in the sequence
```
## Module importing

```python
# file1 content
# def f1_function():
#	  return "Hello World"

# file2
import file1

# Now we can use f1_function, because we imported file1
f1_function()
```


# Dictionaries
## Accessing and writing data in a Python dictionary

```python
my_dictionary = {"song": "Estranged", "artist": "Guns N' Roses"}
print(my_dictionary["song"])
my_dictionary["song"] = "Paradise City"
```
## Syntax of the Python dictionary

```python
roaster = {"q1": "Ashley", "q2": "Dolly"}
```
## Merging dictionaries with the .update() method in Python

```python
dict1 = {'color': 'blue', 'shape': 'circle'}
dict2 = {'color': 'red', 'number': 42}

dict1.update(dict2)

# dict1 is now {'color': 'red', 'shape': 'circle', 'number': 42}
```
## Dictionary value types

```python
dictionary = {
  1: 'hello', 
  'two': True, 
  '3': [1, 2, 3], 
  'Four': {'fun': 'addition'}, 
  5.0: 5.5
}
```
## Python dictionaries

```python
my_dictionary = {1: "L.A. Lakers", 2: "Houston Rockets"}
```
## Dictionary Key-Value Methods

```python

ex_dict = {"a": "anteater", "b": "bumblebee", "c": "cheetah"}

ex_dict.keys()
# dict_keys(["a","b","c"])

ex_dict.values()
# dict_values(["anteater", "bumblebee", "cheetah"])

ex_dict.items()
# dict_items([("a","anteater"),("b","bumblebee"),("c","cheetah")])
```
## get() Method for Dictionary

```python
# without default
{"name": "Victor"}.get("name")
# returns "Victor"

{"name": "Victor"}.get("nickname")
# returns None

# with default
{"name": "Victor"}.get("nickname", "nickname is not a key")
# returns "nickname is not a key"
```
## The .pop() Method for Dictionaries in Python

```python
famous_museums = {'Washington': 'Smithsonian Institution', 'Paris': 'Le Louvre', 'Athens': 'The Acropolis Museum'}
famous_museums.pop('Athens')
print(famous_museums) # {'Washington': 'Smithsonian Institution', 'Paris': 'Le Louvre'}
```


# Files
## Python File Object

```python
with open('somefile.txt') as file_object:
    print(file_object)
```
## Python Readline Method
To read only one line instead of multiple lines in a Python file, use the method .readline() on a file object that is returned from the open() function. Every subsequent .readline() will extract the next line in the file if it exists.

```python
with open('story.txt') as story_object:
  print(story_object.readline())
```
## Parsing JSON files to dictionary
JSON format is used to store key value pairs. Python’s json module allows reading such data format and parsing it to a dictionary. The json.load function takes a file object as an argument and returns the data in a dictionary format.


```python
# Use json.load with an opened file object to read the contents into a Python dictionary.

# Contents of file.json
# { 'userId': 10 }


import json
with open('file.json') as json_file:
  python_dict = json.load(json_file)
  
print(python_dict.get('userId'))
# Prints 10
```
## Python Append To File
Writing to an opened file with the 'w' flag overwrites all previous content in the file. To avoid this, we can append to a file instead. Use the 'a' flag as the second argument to open(). If a file doesn’t exist, it will be created for append mode.


```python
with open('shopping.txt', 'a') as shop:
  shop.write('Tomatoes, cucumbers, celery\n')
```
## Python Write To File
By default, a file when opened with open() is only for reading. A second argument 'r' is passed to it by default. To write to a file, first open the file with write permission via the 'w' argument. Then use the .write() method to write to the file. If the file already exists, all prior content will be overwritten.

```python
with open('diary.txt','w') as diary:
  diary.write('Special events for today')

```
## Python Readlines Method
Instead of reading the entire content of a file, you can read a single line at a time. Instead of .read() which returns a string, call .readlines() to return a list of strings, each representing an individual line in the file. Calling this code:


```python
with open('lines.txt') as file_object:
  file_data = file_object.readlines()
print(file_data)

```
## Class csv.DictWriter
In Python, the csv module implements classes to read and write tabular data in CSV format. It has a class DictWriter which operates like a regular writer but maps a dictionary onto output rows. The keys of the dictionary are column names while values are actual data.

The csv.DictWriter constructor takes two arguments. The first is the open file handler that the CSV is being written to. The second named parameter, fieldnames, is a list of field names that the CSV is going to handle.
```python
# An example of csv.DictWriter
import csv

with open('companies.csv', 'w') as csvfile:
  fieldnames = ['name', 'type']
  writer = csv.DictWriter(csvfile, fieldnames=fieldnames)
  writer.writeheader()
  writer.writerow({'name': 'Codecademy', 'type': 'Learning'})
  writer.writerow({'name': 'Google', 'type': 'Search'})

"""
After running the above code, companies.csv will contain the following information:

name,type
Codecademy,Learning
Google,Search
"""

```
## Python Read Method
After a file is opened with open() returning a file object, call the .read() method of the file object to return the entire file content as a Python string. Executing the following Python code:


```python
with open('mystery.txt') as text_file:
  text_data = text_file.read()
print(text_data)

```
# Classes
## Python repr method
The Python __repr__() method is used to tell Python what the string representation of the class should be. It can only have one parameter, self, and it should return a string.
```python
class Employee:
  def __init__(self, name):
    self.name = name

  def __repr__(self):
    return self.name

john = Employee('John')
print(john) # John
```
## Python class methods
In Python, methods are functions that are defined as part of a class. It is common practice that the first argument of any method that is part of a class is the actual object calling the method. This argument is usually called self.


```python
# Dog class
class Dog:
  # Method of the class
  def bark(self):
    print("Ham-Ham")

# Create a new instance
charlie = Dog()

# Call the method
charlie.bark()
# This will output "Ham-Ham"
```
## Instantiate Python Class

```python
class Car:
  "This is an empty class"
  pass

# Class Instantiation
ferrari = Car()
```
## Python Class Variables
In Python, class variables are defined outside of all methods and have the same value for every instance of the class.

Class variables are accessed with the instance.variable or class_name.variable syntaxes.


```python
class my_class:
  class_variable = "I am a Class Variable!"
  
x = my_class()
y = my_class()

print(x.class_variable) #I am a Class Variable!
print(y.class_variable) #I am a Class Variable!
```
## Python init method
In Python, the .__init__() method is used to initialize a newly created object. It is called every time the class is instantiated.


```python
class Animal:
  def __init__(self, voice):
    self.voice = voice

# When a class instance is created, the instance variable
# 'voice' is created and set to the input value.
cat = Animal('Meow')
print(cat.voice) # Output: Meow

dog = Animal('Woof') 
print(dog.voice) # Output: Woof
```
## Python type() function
The Python type() function returns the data type of the argument passed to it.


```python
a = 1
print(type(a)) # <class 'int'>

a = 1.1
print(type(a)) # <class 'float'>

a = 'b'
print(type(a)) # <class 'str'>

a = None
print(type(a)) # <class 'NoneType'>
```
## Python class
In Python, a class is a template for a data type. A class can be defined using the class keyword.


```python
# Defining a class
class Animal:
  def __init__(self, name, number_of_legs):
    self.name = name
    self.number_of_legs = number_of_legs
```
## Python dir() function

In Python, the built-in dir() function, without any argument, returns a list of all the attributes in the current scope.

With an object as argument, dir() tries to return all valid object attributes.
```python
class Employee:
  def __init__(self, name):
    self.name = name

  def print_name(self):
    print("Hi, I'm " + self.name)


print(dir())
# ['Employee', '__builtins__', '__doc__', '__file__', '__name__', '__package__', 'new_employee']

print(dir(Employee))
# ['__doc__', '__init__', '__module__', 'print_name']
```
## __main__ in Python

In Python, __main__ is an identifier used to reference the current file context. When a module is read from standard input, a script, or from an interactive prompt, its __name__ is set equal to __main__.

Suppose we create an instance of a class called CoolClass. Printing the type() of the instance will result in:

<class '__main__.CoolClass'>
This means that the class CoolClass was defined in the current script file.


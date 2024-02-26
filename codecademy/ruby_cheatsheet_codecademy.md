https://www.codecademy.com/learn/learn-ruby/modules/learn-ruby-introduction-to-ruby-u/cheatsheet

# Table of Contents

[Introduction to Ruby](#introduction-to-ruby)

[Control Flow in Ruby](#control-flow-in-ruby)

[Looping with Ruby](#looping-with-ruby)

[Arrays and Hashes](#arrays-and-hashes)

[Blocks and Sorting](#blocks-and-sorting)

[Hashes and Symbols](#hashes-and-symbols)

[Refactoring](#refactoring)

[Blocks, Procs, and Lambdas](#blocks-procs-and-lambdas)

[Object-Oriented Programming, Part I](#object-oriented-programming-part-i)

[Object-Oriented Programming, Part II](#object-oriented-programming-part-ii)

# Introduction to Ruby
## Ruby string interpolation
In Ruby, string interpolation is used to insert the result of Ruby code into a string.


```ruby
age = 30

print "Hi, my name is Cody, and I am #{age} years old"
# "Hi, my name is Cody, and I am 30 years old"
```
## Get user input in Ruby
In Ruby, we can get the user’s input using gets.chomp. gets is the method that is used to retrieve user input. Ruby automatically adds a new line after each bit of input, so chomp is used to remove that extra line.


```ruby
print "Type your name and press Enter: "
name = gets.chomp

puts "My name is #{name}!"
```
## Ruby Variables
In Ruby, a variable is a place to store values of almost any type including Integer, Boolean, String, Array, and Hashes.

Each variable has its own name which cannot begin with a capital letter or a number and we use the equal sign for assigning a value to that variable.

The variable declaration does not require that you mention a specific data type.

The following program declares my_var variable and assigns the value 48.
```ruby
my_var = 48 

```
## Put and print command
put and print commands can be used to display text in the console.


```ruby
print "Hello"
puts "This is written in a new line"
print "Still printing"
```
## Code comments in Ruby
Commenting code helps programmers write free text that is commonly used to explain the code written, or can even be used to add TODO’s to the code. There are two types of comments that can be written in Ruby:

Single line comments start with a #.
Multi line comments start with =begin and end with =end.
```ruby
# I am a single line comment.

=begin
I am a multi line comment. 
I can take as many lines as needed.
=end
```
## Numeric data types in Ruby
In Ruby, the Numeric data type represents numbers including integers and floats.


```ruby
# Integer value
x = 1

# Float value
y = 1.2
```
## Arithmetic operations in Ruby
In Ruby, we can use arithmetic operators to evaluate mathematical expressions. The most common Ruby arithmetic operators are addition (+), subtraction (-), division(/), multiplication(*), exponentiation(**) and modulo(%).


```ruby
print 1+3
# Addition: output 4

print 1-2
# Subtraction: output -1

print 9/3
# Division: output 3

print 2*3
# Multiplication: output 6

print 2**3
# Exponentiation: output 8

print 16%9
# Modulo: output 7
```
## Ruby Object Methods
In Ruby, methods are built-in abilities of objects. To access an object’s methods, you need to call it using a . and the method name.


```ruby
var = "codecademy"

# Method to get the length of a string
print var.length # 10

# Method to get the string reversed
print var.reverse # ymedacedoc

# Method to convert all letters to uppercase
print var.upcase # CODECADEMY
```
## Strings in Ruby
Strings in Ruby are a sequence of characters enclosed by single quotation marks (‘’) or double quotation marks (“”).


```ruby
# String 1
s1 = 'I am a single string!'

# String 2
s2 = "I am a double string!"
```
## Boolean Data Types in Ruby
In Ruby, in order to represent values of truth about specific statements, we use Boolean variables. Boolean variables values are either true or false.


```ruby
# Boolean true variable
year2019 = true

# Boolean false variable
year2018 = false

```
## Ruby .upcase and .downcase Methods
Ruby strings have an .upcase and a .downcase method used to change their case. .upcase returns a version of the string in all uppercase, and .downcase returns a version in all lowercase.
```ruby
puts "codecademy".upcase
# CODECADEMY

puts "Codecademy".downcase
# codecademy
```

# Control Flow in Ruby
## elsif Statements in Ruby
In Ruby, an elsif statement can be placed between if and else statements. It allows us to check for additional conditions.

More than one elsif can be placed between if and else.
```ruby
print "enter a number: "
num = gets.chomp
num =  num.to_i;

if num == 5
  print "number is 5"
elsif num == 10
  print "number is 10"
elsif num == 11
  print "number is 11"
else
  print "number is something other than 5, 10, or 11"
end
```
## Ruby not Operator
The ! (not) operator in Ruby flips a boolean value. If a value is true then applying ! to the value changes it to false and vice versa.


```ruby
data = true;

puts !data;

# Output: false
```
## Else statement in Ruby.
In Ruby, an if statement evaluates to either true or false. The code indented after the if portion is executed for true while the code indented after the else portion is executed for false.

```ruby
if number > 50 
  print "number is greater than 50"
else
  print "number is not greater than 50"	
end  
```
## Comparison operators in Ruby.

```ruby
a = 1;
b = 2;
c = 2;

puts a > b;
puts a < b;
puts b >= c;
puts a <= c;
puts b == c;

# Output: 
# false
# true
# true
# true
# true
```
## Or operator in Ruby.

```ruby

grade1 = 50
grade2 = 30
grade3 = 80

if grade1 > grade2 || grade1 > grade3
  puts "Grade 1 is not the lowest score!"
end
```
## if Statement in Ruby

An if statement in Ruby evaluates an expression, which returns either true or false. If the expression is true, Ruby executes the code block that follows the if whereas if the expression is false, Ruby returns nil.

In this example, the string "Your condition was true!" will print because the condition number == 10 is true.
```ruby
number = 10
if number == 10
  puts "Your condition was true!"
end

```
## And operator in Ruby.
&& is a logical operator in Ruby which evaluates to true only if both expressions on either side of && evaluates to true.


```ruby
if score1 > score2 && score1 > score3
  print "Score 1 is the greatest in value."
else
  print "Score 1 is not the greatest in value."
end

```
## Unless statement in Ruby.
An unless statement in Ruby is used to evaluate an expression. If the expression evaluates to false, then the code following unless is executed.


```ruby
#This construct requires a "number" variable to be less than 10 in order to execute:
print "Enter a number"
number = gets.to_i
unless number >= 10
  puts "number is less than 10."
end
```


# Looping with Ruby
## Ruby Assignment Operators

```ruby
a = 1;
a += 3;
puts a; # Output: 4

b = 4;
b -= 2;
puts b; # Output: 2

num = 12;
num *= 2;
puts num; # Output: 24

num /= 4;
puts num; # Output: 6

```
## Ruby each Method
To iterate over an array in Ruby, use the .each method. It is preferred over a for loop as it is guaranteed to iterate through each element of an array.


```ruby
data = [3, 6, 9, 12]

data.each do |num|
  puts "The number is: #{num}"
end

# Output:
# The number is: 3
# The number is: 6
# The number is: 9
# The number is: 12
```
## Ruby “next” Keyword
In Ruby, the next keyword is used within a loop to pass over certain elements and skip to the following iteration. It is useful for omitting elements that you do not wish to have iterated. next is followed by an if statement which defines which elements are to be skipped.


```ruby
for i in 1..10
  next if i % 2 == 0
  puts i
end

# In this example, the next 
# keyword along with a shorthand 
# if statement is used to skip 
# over the even numbers in the sequence.
  
# Output:
# 1
# 3 
# 5
# 7
# 9
```
## Ruby while Loop
Putting a block of code in a while loop in Ruby will cause the code to repeatedly run the code as long as its condition is true.

If the block of code doesn’t have a way for the condition to be changed to false, the while loop will continue forever and cause an error.


```ruby
i = 1

while i <= 3 do
  puts "Message number #{i}"
  i = i + 1
end

# Output:
# Message number 1
# Message number 2
# Message number 3

```
## Ruby times Method
To execute the same block of code a set a number of times in Ruby, use the times method.


```ruby
5.times { puts "Codecademy" }

# Output: 
# Codecademy
# Codecademy
# Codecademy
# Codecademy
# Codecademy
```
## Ruby Range
In ruby, a sequence of integers can be demonstrated by a range. The range can be divided into an inclusive range where the last integer in the sequence is included and an exclusive range where the last integer is excluded.


```ruby
# Inclusive
(3..5).each do |i|
  puts i
end
# Output:
# 3
# 4
# 5

# Exclusive
(3...5).each do |i|
  puts i
end
# Output
# 3
# 4
```
## Ruby loop
A loop method can be used to run a block of code repeatedly in Ruby. Either use curly braces ({}) or the do/end keyword combination to wrap the block of code that will be looped.


```ruby
num = 1
loop do
  puts "We are in the loop!"
  num += 1
  break if num > 3
end

puts "We have exited the loop!"

# Output
# We are in the loop!
# We are in the loop!
# We are in the loop!
# We have exited the loop!

```
## Ruby until Loop
Putting a block of code inside an until loop in Ruby will cause the code to run as long as its condition remains false. It’s only when the condition becomes true that the loop stops.

If the block of code doesn’t allow for a way for the condition to be changed to true then the loop will continue forever and it will cause an error.


```ruby
i = 1

until i == 4 do
  puts "Message number #{i}"
  i = i + 1
end

# Output
# Message number 1
# Message number 2
# Message number 3

```
## Ruby for Loop
A block of code can be repeated a set amount of times with the for loop in Ruby.


```ruby
for i in 1..3 do
  puts "Message number #{i}"
end

# Output
# Message number 1
# Message number 2
# Message number 3
```

# Arrays and Hashes
## Ruby Hash
In Ruby, a hash is a collection of key-value pairs.

A hash is denoted by a set of curly braces ({}) which contains key-value pairs separated by commas. Each value is assigned to a key using a hash rocket (=>). Calling the hash followed by a key name within brackets grabs the value associated with that key.


```ruby
profile = {
  "name" => "Magnus",
  "profession" => "chess player",
  "ranking" => 1,
  "grandmaster?" => true
}

# "name", "profession", "ranking", and "grandmaster?" are the keys. "Magnus", "chess player", 1 and true are the values.

puts profile["name"] # => Magnus
```
## Ruby Array
In Ruby, an array is an ordered collection of Ruby objects separated by commas and enclosed in []. An array can contain the same or different types of Ruby objects, such as Integers, Strings, Floats, etc. An array can also be empty.


```ruby
numbers = [1, 2, 3, 4, 5]
#An array of Integers

words = ["See", "Spot", "run"]
#An array of Strings

mixed = ["hello", 5, true, 3.0]
#An array with a String, Integer, Boolean, and Float

empty = []
#An empty array
```
## Ruby Hash New
In Ruby, a hash can be created through literal notation (because we are literally assigning what key=>value pairs we want in the hash) or by assigning a variable equal to Hash.new which generates a new, empty hash.


```ruby
#Creating a hash through literal notation:
lunch = {
  "protein" => "chicken",
  "greens" => "lettuce",
  "organic?" => true
}

#Creating a hash through Hash.new
lunch = Hash.new
puts lunch # => {}

```
## Ruby Hash Bracket Notation Adding Pairs
In Ruby, a new key-value pair can be added to a hash using bracket notation. The new key is bracketed after the name of the hash and then the value is assigned after the equals sign.


```ruby
#Bracket notation applies to any hash, regardless of how it was initialized
teammates = Hash.new
teammates["forward"] = "Messi"

salary = {
  "starting" => 40000
}
salary["mid-level"] = 60000
```
## Ruby Multidimensional Arrays
In Ruby, arrays can be nested within one another representing multi dimensional arrays. An array can hold another array as if it was like any other Ruby object, such as an Integer or a String.


```ruby
multi_array = [[0,1,2,3],[4.5, true, "hi"]]

# Accessing the array at index 1
puts multi_array[1] # => [4.5, true, "hi"]

# Accessing the element at index 0 within the array at index 1
puts multi_array[1][0] # => 4.5
```
## Ruby Array Index
In Ruby, each item inside of an array is at a numbered position called an index. The first item is at index 0, the second item is at index 1, and so on. We can access the ith element of an array by putting the index in square brackets after invoking the array’s name; this is known as access by index


```ruby
example = ["Car", "Boar", 45, 9.9, true]

#For an array named `example`, you can retrieve an item of a particular index by referencing its index.

puts example[2] # => 45
puts example[0] # => Car
```
## Ruby Method .Each
In Ruby, the .each method is used to iterate over arrays and hashes. This allows each element in an array and each key-value pair in a hash to be iterated.


```ruby
#In this example, the each method iterates over every color in the colors array and prints it to the console.

colors = ["red", "blue", "green", "yellow"]

colors.each { |color| puts color }
#Output
#red
#blue
#green
#yellow

#When iterating over hashes, two placeholder variables are needed to represent each key/value pair.

polygons = {
  "pentagon" => 5,
  "hexagon" => 6,
  "nonagon" => 9
}

polygons.each do |shape, sides|
  puts "A #{shape} has #{sides} sides."
end
#Output
#A pentagon has 5 sides.
#A hexagon has 6 sides.
#A nonagon has 9 sides.

```
## Ruby Hash Bracket Notation Value
In Ruby, the values in a hash can be accessed using bracket notation. After the hash name, type the key in square brackets in order to access the value.


```ruby
my_love = {
  "dog" => "Keanu",
  "breed" => "Shiba Inu",
  "age_in_years" => 1,
}

puts my_love["breed"] # => Shiba Inu
```


# Blocks and Sorting
## Ruby Combined Comparison Operator
In Ruby, the combined comparison operator, <=>, also known as the spaceship operator is used to compare two objects. It returns 0 if the first operand equals the second, 1 if the first operand is greater than the second, and -1 if the first operand is less than the second.


```ruby
puts "Keanu" <=> "Adrianna" # The first letters of each word are compared in ASCII order and since "K" comes after "A", 1 is printed.

puts 1 <=> 2 # -1

puts 3 <=> 3 # 0

#<=> can also be used inside of a block and to sort values in descending order:
my_array = [3, 0, 8, 7, 1, 6, 5, 9, 4]
my_array.sort! { |first_num, second_num| second_num <=> first_num }
print my_array
#Output => [9, 8, 7, 6, 5, 4, 3, 1, 0]


```
## Ruby Method Splat
In a Ruby method, a splat (*) operator is used to indicate that a parameter can have an unknown number of arguments.


```ruby
#The * preceding the parameter "clubs" allows for multiple arguments to be passed into the method when you actually call it.
def extra_curriculars(*clubs)
  clubs.each { |club| puts "After school, I'm involved with #{club}" }
end

extra_curriculars("chess club", "gymnastics", "anime club", "library services")

#Output
#After school, I'm involved with chess club
#After school, I'm involved with gymnastics
#After school, I'm involved with anime club
#After school, I'm involved with library services
```
## Ruby Block Parameter
In Ruby, a method can take a block as a parameter.

Passing a block to a method is a great way of abstracting certain tasks from the method and defining those tasks when we call the method.
```ruby
# The block, {|i| puts i}, is passed the current array item each time it is evaluated. This block prints the item. 
[1, 2, 3, 4, 5].each { |i| puts i }
```
## Ruby Return
In Ruby, the return keyword is used to pass back a value from a method.


```ruby
def generous_tip(bill)
  return bill * (0.25)
end

generous_tip(100) # 25

#In this example, the generous_tip method is returning the product of bill and 0.25. In order to see that value, a "puts" or "print" can be added before the method call.
```
## Ruby Sort Method
In Ruby, the .sort array method is used to sort items in an array in ascending order (least to greatest).


```ruby
my_array = [3, 4, 8, 7, 1, 6, 5, 9, 2]
my_array.sort!
#Attaching an ! to the end of .sort or any other Ruby method modifies the original array.
print my_array
# => [1, 2, 3, 4, 5, 6, 7, 8, 9]
#If you didn't use !, print my_array returns the original array.

```
## Ruby Method Parameters & Arguments
In Ruby, parameters are placeholders for real values or arguments passed into a method when it is called. When calling a method that requires parameters, arguments (ie. real values) must be passed in for those parameters.


```ruby
def square(num) # num is the parameter
  puts num ** 2
end

square(5) #5 is the argument
#Output => 25
```
## Ruby method
A Ruby method is a reusable section of code written to execute a certain task. It is defined with the def keyword, followed by a method name, a method body, and ends with the end keyword:


```ruby
def greeting
  puts "Hello world!"
end

#In this example, the first line or header contains the keyword "def" and the method name. puts "Hello world!" is within the body of the method, which describes the certain task that the method carries out. It is also indented two spaces by convention. Following the body, the method ends with the end keyword.
```
## Ruby Block
In Ruby, a block is a section of code defined within the keywords do and end or with curly braces {}. This is usually preceded by an integer followed by .times to indicate how many times the code is to be executed.


```ruby
2.times do
  puts "I'm a code block!"
end  

#Output
#I'm a code block!
#I'm a code block!

3.times { puts "So am I!" }

#Output
#"So am I!"
#"So am I!"
#"So am I!"
```

# Hashes and Symbols
## Ruby Symbols
In Ruby, symbols are immutable names primarily used as hash keys or for referencing method names.


```ruby
my_bologna = {
  :first_name => "Oscar",
  :second_name => "Meyer",
  :slices => 12
}

puts my_bologna[:second_name] # => Meyer

#Symbols must be valid Ruby variable names and always start with a colon (:).


```
## Ruby Hashes, Symbols, & Values
In Ruby hashes, key symbols and their values can be defined in either of two ways, using a => or : to separate symbol keys from values.


```ruby
my_progress = {
  :program => "Codecademy",
  :language => "Ruby",
  :enthusiastic? => true 
}
#Key symbols and their values can be defined with a =>, also known as a hash rocket.

my_progress = {
  program: "Codecademy",
  language: "Ruby",
  enthusiastic?: true 
}
#Key symbols and their values can also be defined with the colon (:) at the end of the symbol followed by its value.

```
## Ruby .select Method
In Ruby, the .select method can be used to grab specific values from a hash that meet a certain criteria.


```ruby
olympic_trials = {
  Sally: 9.58,
  John: 9.69,
  Bob: 14.91
}

olympic_trials.select { |name, time| time <  10.05 }
#The example above returns {:Sally=>9.58, :John=>9.69} since Sally and John are the only keys whose values meet the time < 10.05 criteria.

```
## Ruby .each_key & .each_value
In Ruby, the .each_key and .each_value methods are used to iterate over only the keys or only the values in a hash.

```ruby
eren_jaeger = {
  age: 15,
  enemy: "titans",
  branch: "Survey Corps"
}

eren_jaeger.each_key { |key| puts key }
#Output:
#age
#enemy
#branch

eren_jaeger.each_value { |value| puts value }
#Output:
#15
#titans
#Survey Corps
```

# Refactoring
## Ruby Case Statement
In Ruby, a case statement is a more concise alternative to an if/else statement that contains many conditions.


```ruby
tv_show = "Bob's Burgers"

case tv_show
  when "Archer"
    puts "I don't like the voice of Archer."
  when "Bob's Burgers"
    puts "I love the voice of Bob Belcher."
  else
    puts "I don't know who voices this cartoon."
end

# => I love the voice of Bob Belcher.

#In this example, a case statement is used to check for multiple possible values of tv_show. Since tv_show is "Bob's Burgers", the second when is evaluated to true. If none of the conditions were met, Ruby would evaluate the else statement.
```
## Ruby .respond_to?
In Ruby, .respond_to? takes a symbol representing a method name and returns true if that method can be called on the object and false otherwise.


```ruby
puts "A".respond_to?(:push)
# => false
# Here, the following Ruby code will return false since .push can’t be called on a String object.

puts "A".respond_to?(:next)
# => true
# Here, however, the following Ruby code will return true since .next can be called on a String object. Calling .next on the letter “A” would return the letter “”.
```
## Ruby Short-Circuit Evaluation
When Ruby evaluates expressions containing boolean operators, it uses short-circuit evaluation. With ||, if the expression on the left evaluates to true, it will return true. Otherwise, it will check if the expression on the right evaluates to true. If so, the expression returns true; otherwise, it will return false.

With &&, both the expression on the left and the expression on the right have to evaluate to true in order to return true. If either expression is false, it will return false


```ruby
a = true
b = false
c = true

puts a || b
#Output => true
puts b || a
#Output => true
puts a && c
#Output => true 
puts a && b
#Output => false
```
## Ruby Ternary Operator
In Ruby, a ternary operator is a more concise alternative to an if/else. It consists of a conditional, followed by ? and an expression to be evaluated if the conditional is true, and then : and an expression to evaluate if the conditional is false.


```ruby
tacos_eaten = 12

puts tacos_eaten >= 5 ? "Sir, you've had enough!" : "Keep eating tacos!"

# => Sir, you've had enough!
```
## Ruby .upto and .downto Methods
In Ruby, the .upto and .downto methods are used to iterate over a specific range of values.


```ruby
"B".upto("F") { |letter| print letter, " " }
# => B C D E F

5.downto(0) { |num| print num, " " }
# => 5 4 3 2 1 0

#In both examples, Ruby iterates over specified ranges using the initial value, a .downto or .upto method, and a final value. Each element is passed into the block following the .upto or .downto method.
```
## Ruby Conditional Assignment Operator
In Ruby, a conditional assignment operator (||=) assigns a real value to a variable only when its current value is false or nil. Otherwise, Ruby keeps its original value.


```ruby
boyfriend = nil

boyfriend ||= "Jimmy Jr."

boyfriend ||= "Josh"

puts boyfriend
# => "Jimmy Jr."

# In this example, since the original value of boyfriend is set to nil which is nothing, Ruby assigns it a value of "Jimmy Jr." on the following line. Once boyfriend holds this real value, another reassignment is overlooked by Ruby and the previous value holds.
```
## Ruby .push Method Alternative
In Ruby, an alternative to the .push method is the concatenation operator << which can be used to add an element to the end of an array or a string.


```ruby
array = [1, 2, 3]
array << 4
print array
#Output => [1, 2, 3, 4]

puts "Hello," << " welcome to Codecademy."
#Output => Hello, welcome to Codecademy.
```
## Ruby “if” Statement Short Expression
In Ruby, the if statement can be expressed in a single line in the case of a short expression. This single line would consist of an expression followed by the if keyword and finally an expression that evaluates to either true or false.


```ruby
num = 6

if num % 2 == 0
  puts "This number is even!"
end

#Refactored, this can be stated in a single line as demonstrated below:
puts "This number is even!" if num % 2 == 0

```
## Ruby Implicit Return
In Ruby, the return keyword in a method can be omitted making it an implicit return, in which Ruby automatically returns the result of the last evaluated expression.


```ruby
def product(x,y)
  x * y
end

product(5, 4)
# => 20
#In this example, Ruby evaluates the product method and returns 20 even though the return keyword was omitted.
```

# Blocks, Procs, and Lambdas
## Ruby .call Method
In Ruby, a proc and a lambda can be called directly using the .call method.


```ruby
proc_test = Proc.new { puts "I am the proc method!" }
lambda_test = lambda { puts "I am the lambda method!"}

proc_test.call # => I am the proc method!
lambda_test.call # => I am the lambda method!

#The following code would result in "I am the proc method!" and "I am the lambda method!" printed to the console respectively, once the proc, proc_test, and the lambda, lambda_test, are called.
```
## Ruby lambda
In Ruby, a lambda is an object similar to a proc. Unlike a proc, a lambda requires a specific number of arguments passed to it, and it returns to its calling method rather than returning immediately.


```ruby
def proc_demo_method
  proc_demo = Proc.new { return "Only I print!" }
  proc_demo.call
  "But what about me?" # Never reached
end

puts proc_demo_method 
# Output 
# Only I print!

# (Notice that the proc breaks out of the method when it returns the value.)

def lambda_demo_method
  lambda_demo = lambda { return "Will I print?" }
  lambda_demo.call
  "Sorry - it's me that's printed."
end

puts lambda_demo_method
# Output
# Sorry - it's me that's printed.

# (Notice that the lambda returns back to the method in order to complete it.)
```
## Ruby .collect Method
In Ruby, the .collect array method takes a block and applies the expression in the block to every element of an array.


```ruby
first_arr = [3, 4, 5]
second_arr = first_arr.collect { |num| num * 5 }

print second_arr #Output => [15, 20, 25]

# In this example, the .collect method is used to multiply each number within first_arr by 5. The outcome is then saved inside of the second_arr variable and printed to the console. The original first_arr is left unchanged.
```
## Ruby yield Keyword
In Ruby, the yield keyword is used to transfer control from a method to a block and then back to the method once executed.


```ruby
def yield_test
  puts "I'm inside the method."
  yield
  puts "I'm also inside the method."
end

yield_test { puts ">>> I'm butting into the method!" }
#Output
# I'm inside the method.
# >>> I'm butting into the method.
# I'm also inside the method.
```
## Ruby proc
In Ruby, a proc is an instance of the Proc class and is similar to a block. As opposed to a block, a proc is a Ruby object which can be stored in a variable and therefore reused many times throughout a program.

```ruby
square = Proc.new { |x| x ** 2 }
# A proc is defined by calling Proc.new followed by a block.

[2, 4, 6].collect!(&square)
# When passing a proc to a method, an & is used to convert the proc into a block.

puts [2, 4, 6].collect!(&square)
# => [4, 16, 36]
```

# Object-Oriented Programming, Part I
## Ruby Class Variables
In Ruby, class variables are attached to the class in which they are declared. A class variable should be declared with two @ symbols preceding it.


```ruby
class Child
  @@children = 0
  def initialize(name, birth_year)
    @name = name
    @birth_year = birth_year
    @@children +=1
  end

  def self.children_added
    return @@children
  end

end

naomi = Child.new("Naomi", 2006)
bertha = Child.new("Bertha", 2008)

puts Child.children_added # => 2
```
## Ruby .new Method
In Ruby, a new class instance can be created by calling the .new method of the class. Arguments to the class’ initialize method can be passed in to the .new call.


```ruby
class Fighter
  def initialize(name, style, division, age)
    @name = name
    @style = style
    @division = division
    @age = age
  end
end

conor = Fighter.new("Conor", "mixed martial arts", "Welterweight", 31)
```
## Ruby Instance Variable
In Ruby, the @ symbol is used to signify an instance variable. Instance variables hold a value specific to each instance of that class, not to all members of the class itself.

```ruby
class Student
  def initialize(name, grade)
    @name = name
    @grade = grade
  end
end

# In this example, name and grade are the instance variables.
```
## Ruby initialize Method
In a Ruby class, an initialize method is used to generate new instances of the class. It is usually the first method of a class.
```ruby
class Person
  def initialize
    # this code runs when a new instance is created
  end
end

#Every time Person.new is called, the initialize method of the Person class is called.
```
## Ruby Class
A Ruby class is used to organize and model objects with similar attributes and methods.

```ruby
class NewClass
  # code for this class 
end


# A basic class definition consists of the class keyword, the name of the class in CamelCase (with the first letter capitalized) format, and an end keyword.
```
## Ruby super Keyword
Ruby’s built-in super keyword is used to directly access the attributes or methods of a superclass. This means a class with super will inherit the attributes or methods of a superclass.


```ruby
class Trip
  def initialize(duration, price)
    @duration = duration
    @price = price
  end
end


class Cruise < Trip
  def initialize(duration, price)
    super
  end
end

spain_backpacking = Trip.new(14, 800.00)
carnival = Cruise.new(7, 2400.00)

#In this example, the Cruise class inherits from the Trip class and all of its attributes, including duration and price, are carried over with the super keyword.
```
## Ruby attr_reader attr_writer Methods
In Ruby, attr_reader and attr_writer are methods used to read and write variables, respectively.


```ruby
class Student
  attr_reader :name
  attr_writer :name
  def initialize(name)
    @name = name
  end
end
#In this example, Ruby is able to both read and write the @name instance variable since it was passed to attr_reader and attr_writer as a symbol.

top_student = Student.new("Jyothi")
puts top_student.name # => Jyothi
#In classes with attr_reader, instance variables can be accessed using . notation

puts top_student.name # => Jyothi
top_student.name = "Anika"
puts top_student.name # => Anika
#In classes with attr_writer, instance variables can be reassigned using . notation

```


# Object-Oriented Programming, Part II
## Ruby namespace
In Ruby, the term namespace refers to a module the contains a group of related objects. An example of a Ruby namespace is the Math module.

```ruby
#To retrieve a constant from the Math module, the scope resolution operator (::), should be used.

puts Math::PI
# => 3.141592653589793

#In this example, Ruby is targetting the PI constant from the Math module using the scope resolution operator, (::), and printing its value to the console.
```
## Ruby require Keyword
In Ruby, the require keyword is used to fetch a certain module which isn’t yet presented in the interpreter. It is best practice to place this at the beginning of your code.

```ruby
require 'date'

puts Date.today
# => 2020-04-16
```
## Ruby Module
In Ruby, a module contains a set of methods, constants, or classes which can be accessed with the . operator similarly to classes . Unlike classes, it is impossible to create instances of a Ruby module.

```ruby
#A Ruby module can be created using the module keyword followed by the module name written in CapitalizedCamelCase format finalized with an end.

module MyPizza
  FAVE_TOPPING = "Buffalo Chicken"
end
#In this example, myPizza is a module that holds a constant, FAVE_TOPPING, set equal to the string, Buffalo Chicken.
```
## Ruby attr_accessor Method
In Ruby, attr_accessor, used to make a variable both readable and writeable, is a shortcut to attr_reader and attr_writer.


```ruby
class CollegeStudent
  attr_reader :dorm
  attr_accessor :major

  def initialize(dorm, major)
    @dorm = dorm
    @major = major
  end
end

#In this example, Ruby is able to only read the @dorm instance variable but both read and write the @major instance variable since it was passed to the attr_accessor method.
```

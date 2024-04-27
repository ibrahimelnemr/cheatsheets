```java
// Variable Declaration
// Declaring variables in various data types (int, float, string, boolean)
int my_integer=10;float my_float=3.14f;String my_string="Hello, World!";boolean my_boolean=true;

// Assigning values to variables
int my_variable=42;

// Initializing variables
int x=5;String y="John";

// Declaring multiple variables in a single line
int a=5,b=10,c=15;

// Using constants
final double PI=3.14159;final double GRAVITY=9.8;

// Variable scope (local vs global)
int global_var=10;

void my_function(){int local_var=20;System.out.println(global_var); // Accessing global variable
System.out.println(local_var); // Accessing local variable
}

// Variable naming conventions
String my_variable_name="Java";String snake_case="Preferred naming convention";String camelCase="Not preferred";

// Implicit vs explicit declaration
int my_variable=10; // Implicit declaration
int my_variable=10; // Explicit declaration

// Type inference if statically typed
int my_variable=10; // Inferred as int
float my_variable=3.14f; // Inferred as float
```

```java
// Printing Output
// Printing a single variable
String name="John";System.out.println(name);

// Printing multiple variables
int age=30;System.out.println(name+" "+age);

// Formatting output
System.out.println("Hello, "+name+"! You are "+age+" years old.");System.out.printf("Hello, %s! You are %d years old.%n",name,age);

// Printing special characters
System.out.println("This is a new line.\nThis is a tab:\t.");```

```java
// String methods
// String concatenation
String str1="Hello";String str2="World";String result=str1+" "+str2;

// String slicing
String s="Hello World";System.out.println(s.substring(0,5));

// Searching within strings
String s="Hello World";System.out.println(s.contains("World"));

// Replacing substrings
String s="Hello World";s=s.replace("Hello","Hi");

// Converting case
String s="hello world";System.out.println(s.toUpperCase());System.out.println(s.toLowerCase());

// Stripping whitespace
String s="  Hello World  ";System.out.println(s.strip());

// Splitting and joining strings
String s="apple,banana,orange";String[]items=s.split(",");System.out.println(Arrays.toString(items));String s=String.join("-",items);System.out.println(s);

// Checking for substring existence
String s="Hello World";System.out.println(s.startsWith("Hello"));System.out.println(s.endsWith("World"));

// String formatting
String name="Alice";int age=30;System.out.printf("Name: %s, Age: %d%n",name,age);System.out.println(String.format("Name: %s, Age: %d",name,age));

// String manipulation with regular expressions
import java.util.regex.Matcher;
import java.util.regex.Pattern;

String s="Hello 123";Pattern pattern=Pattern.compile("\\d+");Matcher matcher=pattern.matcher(s);while(matcher.find()){System.out.println(matcher.group());}```

```java
// Conditional statements & Control flow & Loops
// if / else statements
int x=10;if(x>0){System.out.println("Positive");}else if(x<0){System.out.println("Negative");}else{System.out.println("Zero");}

// while loops
int i=0;while(i<5){System.out.println(i);i++;}

// for loops
for(int i=0;i<5;i++){System.out.println(i);}

// Loop control statements (break, continue)
for(int i=0;i<10;i++){if(i==3){continue;}if(i==8){break;}System.out.println(i);}

// Nested loops
for(int i=0;i<3;i++){for(int j=0;j<2;j++){System.out.println(i+" "+j);}}

// Looping through iterable objects (lists, arrays, dictionaries, etc.)
int[]myArray={1,2,3,4,5};for(int item:myArray){System.out.println(item);}

// Iterating over ranges
for(int i=1;i<=5;i++){System.out.println(i);}

// Infinite loops and how to handle them
while(true){
// do something
break; // breaking to avoid infinite loop
}```

```java
// Lists / Arrays
// Creating lists/arrays
int[]myArray={1,2,3,4,5};

// Accessing elements by index
System.out.println(myArray[0]);

// Modifying elements
myArray[0]=10;

// Slicing lists/arrays
for(int i=1;i<3;i++){System.out.println(myArray[i]);}

// Concatenating lists/arrays
int[]newArray={6,7,8};int[]combinedArray=new int[myArray.length+newArray.length];System.arraycopy(myArray,0,combinedArray,0,myArray.length);System.arraycopy(newArray,0,combinedArray,myArray.length,newArray.length);

// List/array comprehension
// Java does not have list/array comprehension like Python

// Sorting lists/arrays
Arrays.sort(myArray);

// Reversing lists/arrays
for(int i=myArray.length-1;i>=0;i--){System.out.println(myArray[i]);}

// Finding elements in lists/arrays
for(int item:myArray){if(item==3){System.out.println("Element found");break;}}

// Removing elements from lists/arrays
int[]tempArray=new int[myArray.length-1];int index=0;for(int i=0;i<myArray.length;i++){if(myArray[i]!=3){tempArray[index++]=myArray[i];}}myArray=tempArray;```

```java
// Dictionaries / Maps
// Creating dictionaries/maps
import java.util.HashMap;HashMap<String,String>myMap=new HashMap<>();

// Accessing elements by key
myMap.put("key1","value1");System.out.println(myMap.get("key1"));

// Modifying elements
myMap.put("key3","value3");

// Checking for key existence
System.out.println(myMap.containsKey("key1"));

// Dictionary/map comprehension
// Java does not have dictionary/map comprehension like Python

// Iterating over keys
for(String key:myMap.keySet()){System.out.println(key);}

// Iterating over values
for(String value:myMap.values()){System.out.println(value);}

// Iterating over key-value pairs
for(String key:myMap.keySet()){System.out.println(key+": "+myMap.get(key));}

// Sorting dictionaries/maps
// Java HashMap does not guarantee order
```

```java
// Sets
// Creating sets
import java.util.HashSet;HashSet<Integer>mySet=new HashSet<>();

// Adding elements to sets
mySet.add(1);

// Removing elements from sets
mySet.remove(3);

// Checking for element existence
if(mySet.contains(2)){System.out.println("Element found");}

// Set operations (union, intersection, difference, symmetric difference)
HashSet<Integer>set1=new HashSet<>();set1.add(1);set1.add(2);set1.add(3);HashSet<Integer>set2=new HashSet<>();set2.add(3);set2.add(4);set2.add(5);HashSet<Integer>unionSet=new HashSet<>(set1);unionSet.addAll(set2);HashSet<Integer>intersectionSet=new HashSet<>(set1);intersectionSet.retainAll(set2);HashSet<Integer>differenceSet=new HashSet<>(set1);differenceSet.removeAll(set2);HashSet<Integer>symmetricDifferenceSet=new HashSet<>(set1);symmetricDifferenceSet.addAll(set2);symmetricDifferenceSet.removeAll(intersectionSet);

// Set comprehension
// Java does not have set comprehension like Python

// Converting lists/arrays to sets and vice versa
HashSet<Integer>setFromList=new HashSet<>(Arrays.asList(1,2,3));ArrayList<Integer>listFromSet=new ArrayList<>(mySet);

// Iterating over sets
for(int item:mySet){System.out.println(item);}

// Checking for subsets and supersets
HashSet<Integer>subset=new HashSet<>();subset.add(1);subset.add(2);if(subset.containsAll(mySet)){System.out.println("Subset found");}HashSet<Integer>superset=new HashSet<>(Arrays.asList(1,2,3));if(mySet.containsAll(superset)){System.out.println("Superset found");}```

```java
// Exceptions / try/catch
// Handling exceptions with try/catch blocks
try{int result=10/0;}catch(ArithmeticException e){System.out.println("Cannot divide by zero");}

// Catching specific exceptions
try{int result=10/0;}catch(ArithmeticException e){System.out.println("Cannot divide by zero");}catch(Exception e){System.out.println("An error occurred");}

// Raising exceptions
int x=-1;if(x<0){throw new IllegalArgumentException("x cannot be negative");}

// Cleaning up with finally block
try{int result=10/0;}catch(ArithmeticException e){System.out.println("Cannot divide by zero");}finally{System.out.println("Cleanup code here");}

// Exception chaining
try{int result=10/0;}catch(ArithmeticException e){throw new IllegalArgumentException("Custom error message",e);}```

```java
// Functions
// Defining functions
void greet(){System.out.println("Hello, World!");}

// Function arguments (positional, keyword, default values)
void greet(String name,String message){System.out.println(message+", "+name+"!");}

// Returning values from functions
int add(int x,int y){return x+y;}

// Function overloading (if supported)
// Java does not support function overloading like some other languages

// Lambda functions
// Java does not have lambda functions like Python

// Recursion
int factorial(int n){if(n==0){return 1;}else{return n*factorial(n-1);}}

// Generators and iterators
// Java does not have generators and iterators like Python

// Decorators
// Java does not have decorators like Python

// Higher-order functions
void myFunction(Runnable func){func.run();}

void greet(){System.out.println("Hello, World!");}

myFunction(this::greet);

// Function documentation and comments
/**
 * This function adds two numbers.
 *
 * @param x The first number.
 * @param y The second number.
 * @return The sum of x and y.
 */
int add(int x,int y){return x+y;}```

```java

// OOP
// Class creation syntax
class MyClass {
    }

    // Creating instances of a class
    MyClass obj = new MyClass();

    // Class attributes vs instance attributes
    class MyClass {
        static String classAttribute = "Class Attribute";
        String instanceAttribute;
    }

    MyClass obj1 = new MyClass();
    MyClass obj2 = new MyClass();obj1.instanceAttribute="Instance Attribute";

    // Constructor method (init method)
    class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    // Instance methods vs static methods vs class methods
    class MyClass {
        void instanceMethod() {
            System.out.println("Instance Method");
        }

        static void staticMethod() {
            System.out.println("Static Method");
        }

        void classMethod() {
            System.out.println("Class Method");
        }
    }

    // Encapsulation (public vs private members)
    class MyClass {
        public String publicMember = "Public Member";
        private String privateMember = "Private Member";

        public String getPrivateMember() {
            return privateMember;
        }
    }

    // Inheritance
    class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Dog extends Animal {
        void sound() {
            System.out.println("Dog barks");
        }
    }

    // Polymorphism (method overriding, method overloading)
    class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Dog extends Animal {
        void sound() {
            System.out.println("Dog barks");
        }
    }

    void makeSound(Animal animal) {
        animal.sound();
    }

makeSound(new Animal());  // Output: Animal makes a sound
makeSound(new Dog());     // Output: Dog barks

// Composition vs inheritance
class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    Engine engine = new Engine();

    void start() {
        engine.start();
    }
}

// Abstract classes/interfaces (if supported by the language)
abstract class Shape {
    abstract double area();
}

class Square extends Shape {
    double side;

    public Square(double side) {
        this.side = side;
    }

    double area() {
        return side * side;
    }
}
```

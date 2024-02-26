https://www.codecademy.com/learn/learn-intermediate-swift/modules/swift-enumerations/cheatsheet

# Table of Contents


[Enumerations](#enumerations)

[Optionals](#optionals)

[Closures](#closures)

[Properties and Access Control](#properties-and-access-control)

# Enumerations
## Defining an Enumeration

```swift
enum Day {
  case monday
  case tuesday
  case wednesday
  case thursday
  case friday
  case saturday
  case sunday
}

let casualWorkday: Day = .friday
```
## Switch Statements
Switch statements are used to determine the case of an enumeration. When switching on an enumeration, all cases must be addressed if a default is not provided. Switching on enumerations can also access the associated values of a case.


```swift
enum Dessert {
    case cake(flavor: String)
    case vanillaIceCream(scoops: Int)
    case brownie
}

let customerOrder: Dessert = .cake(flavor: "Red Velvet")

switch customerOrder {
  case let .cake(flavor):
  	print("You ordered a \(flavor) cake")
  case let .vanillaIceCream(scoopCount):
  	print("You ordered \(scoopCount) scoops of vanilla ice cream")
  case .brownie: 
  	print("You ordered a brownie")
}

// Prints: "You ordered a Red Velvet cake"
```
## CaseIterable
Add conformance to the CaseIterable protocol to access an allCases property that returns an array of all the cases of an enumeration.


```swift
enum Season: CaseIterable {
    case winter
    case spring
    case summer
    case fall
}

for season in Season.allCases {
    print(season)
}
```
## Raw Values
Enumerations can have a raw value associated with each case by adding : RawValueType after the enumeration name. A String, Character, Int, Double, or Float can be assigned as a raw value. Enumerations with a raw value can be instantiated using the init(rawValue:). Instances of enumerations with a raw value have a rawValue property.


```swift
enum Grade: Character {
  case pass = "P"
  case fail = "F"
}

let mathTest = Grade.pass
print(mathTest.rawValue) // Prints "P"
```
## Associated Values
Each case in an enumeration can have a value associated with it. Enumerations can have a raw value or cases with associated values, but not both.


```swift
enum Dessert {
    case cake(flavor: String)
    case vanillaIceCream(scoops: Int)
    case brownie
}

let customerOrder: Dessert = .cake(flavor: "Red Velvet")
```
## Instance Methods
Just like classes and structures, enumerations can have instance methods. If an instance method changes the value of the enumeration, it needs to be marked as mutating.


```swift
enum Traffic {
  case light
  case medium
  case heavy
  
  mutating func reportAccident() {
    self = .heavy
  }
}

var currentTraffic: Traffic = .light
currentTraffic.reportAccident() // currentTraffic is now .heavy
```
## Computed Properties
An enumeration can have computed properties defined within its declaration. Enumerations cannot contain stored properties.


```swift
enum ShirtSize: String {
  case small = "S"
  case medium = "M"
  case large = "L"
  case extraLarge = "XL"
  
	var description: String {
    return "This shirt size is \(self.rawValue)"
  }
}
```


# Optionals
## Optional Types
Optionals types are declared with a ? after the type name. Optionals either contain a value or nil which represents the absence of a value.


```swift
var email: String? = nil
email = "codey@codecademy.com"

```
## Force Unwrapping Optionals
The ! operator force unwraps an optional. If the underlying value is not nil, it can then be used. If the underlying value is nil, then the program will crash.


```swift
var name: String? = "Codey"
var email: String? = nil

print("The user's name is \(userName!)") // Prints "The user's name is Codey"
print("The user's email is \(userEmail!)") // Crashes!
```
## Optional Binding
Safely unwrap optionals by using an if let statement to bind the optional to a new variable. If the optional is nil, then the code in the else block will run.


```swift
var name: String? = "Codey"
var email: String? = nil

if let name = name {
  print("The user's name is \(name)")
} else {
  print("No name available")
}

if let unwrappedEmail = email {
  print("The user's email is \(unwrappedEmail)")
} else {
  print("No email available")
}

// Prints:
// "The user's name is Codey"
// No email available
```
## Multiple Optional Bindings
Multiple optionals can be bound in the same if let statement, separating each binding with “,”. if let statements can also check to see if a boolean expression evaluates to true.


```swift
var name: String? = "Codey"
var email: String? = "codey@codecademy.com"

if let name = name, let email = email, email.contains("@") {
  print("Welcome to Codecademy \(name)!  Your email address is \(email)")
} else {
  print("Name is nil, email is nil, or the email is invalid")
}

// Prints "Welcome to Codecademy Codey!  Your email address is codey@codecademy.com"
```
## Guard Statements
A guard block is another way to write a conditional in Swift. All guard statements must have an else block that exits the current scope if the boolean expression is false. If the guard statement is true, the code below continues executing. Optionals can be bound in a guard block using the guard let syntax.


```swift
var name: String? = "Codey"
var email: String? = "codey@codecademy.com"

func displayMessageIfValid() {
  guard let name = name, let email = email, email.contains("@") else {
    return
  }
  print("Welcome \(name)!  Your email is \(email)")
}

displayMessageIfValid()
// Prints: "Welcome Codey!  Your email is codey@codecademy.com"
```
## Nil-Coalescing Operator
The nil-coalescing operator ?? unwraps an optional value and provides a default if the optional is nil.


```swift
var email: String? = nil
print("Welcome!  Your email is \(email ?? "unknown").")

// Prints: "Welcome!  Your email is unknown."
```
## Optionals and Functions
Functions can take in optional types and return optional types. A function should return nil when it isn’t able to return a sensible instance of the requested type.


```swift
func getFirstInitial(from name: String?) -> String? {
  return name?.first
}
```

# Closures
## Defining a Closure
Closures are self-contained blocks of functionality. Just like functions, closures take in arguments, execute instructions, and return a value or Void.


```swift
let displayWelcome = { () -> Void in
  print("Hello World!")
}

displayWelcome() // Prints: "Hello World"
```
## Inputs and Outputs
Closures can accept inputs and return a value. Unlike functions, closures cannot have argument labels, only internal argument names.


```swift
let multiply = { (a: Int, b: Int) -> Int in
  return a * b
}

print(multiply(4,3)) // Prints: 12
```
## Passing Closures to Functions
Closures can be passed as arguments into functions. Passing closures to functions allows for specification about how the function should operate.


```swift
func combine(_ a: Int, _ b: Int, using combiner: (Int, Int) -> Int) -> Int {
  return combiner(a,b)
}

let add = { (a: Int, b: Int) -> Int in
  return a + b
}

let multiply = { (a: Int, b: Int) -> Int in
  return a * b
}

print(combine(2,5, using: add)) // Prints: 7
print(combine(2,5, using: multiply)) // Prints: 10
```
## Trailing Closure Syntax
If a function’s last argument is a closure, the function can be called using trailing closure syntax. Omit the last argument from the method call and close the parentheses. Then, define the closure immediately after the parentheses are closed.


```swift
func combine(_ a: Int, _ b: Int, using combiner: (Int, Int) -> Int) -> Int {
  return combiner(a,b)
}

let sum = combine(2,5) { (a: Int, b: Int) -> Int in
  return a + b
}

print(sum) // Prints: 7
```
## Shorthand Argument Names
When defining a closure, the arguments in parentheses, return type, and the keyword in can be omitted in exchange for shorthand argument labels. $0 refers to the first argument and $1 refers to the second argument.


```swift
func combine(_ a: Int, _ b: Int, using combiner: (Int, Int) -> Int) -> Int {
  return combiner(a,b)
}

let sum = combine(2,5) { $0 + $1 }

print(sum) // Prints: 7
```
## Common Higher-order Functions
A higher-order function is a function that takes another function as an argument. The Swift standard library provides a number of useful higher-order methods. The most commonly used are filter, map, reduce, and sorted.


```swift
let scores = [4,10,3,7,5]

let evenScores = scores.filter { $0 % 2 == 0 }
print(evenScores) // Prints: [4,10]
let doubledScores = scores.map { $0 * 2 }
print(doubledScores) // Prints: [8, 20, 6, 14, 10]
let sumOfScores = scores.reduce(0) { $0 + $1 }
print(sumOfScores) // Prints: 29
let sortedScores = scores.sorted { $0 < $1 }
print(sortedScores) // Prints: [3, 4, 5, 7, 10]
```
## Escaping Closures
A closure escapes a function when it’s called after the function returns. This can happen when the closure is assigned to a variable. Escaping closures must be marked with the @escaping tag in a function signature.


```swift
struct TextSaver {
  var saveAction: (String) -> Void = { print("Saving '\($0)' to disk") }

  mutating func setSaveAction(to newAction: @escaping (String) -> Void) {
    saveAction = newAction
  }
}

var saver = TextSaver()
saver.saveAction("Hello World!") 
// Prints: Saving 'Hello World!' to disk
saver.setSaveAction(to: { print("Saving '\($0)' to the cloud") })
saver.saveAction("Hello World!") 
// Prints: Saving 'Hello World!' to the cloud
```
## Capturing Values
Closures can capture values from their surrounding scope. When a closure captures a value, it keeps track of it and can manipulate the value even if the original function returns.


```swift
func makeCountingPrinter(for str: String) -> () -> Void {
  var printCount = 0
  func strPrinter() -> Void {
    printCount += 1
    print("\(str) print count: \(printCount)")
  }
  return strPrinter
}

let printHello = makeCountingPrinter(for: "Hello!")
let printGoodbye = makeCountingPrinter(for: "Goodbye!")

printHello() // Prints: Hello! print count: 1
printHello() // Prints: Hello! print count: 2
printGoodbye() // Prints: Goodbye! print count: 1
printHello() // Prints: Hello! print count: 3
printGoodbye() // Prints: Goodbye! print count: 2
```

# Properties and Access Control
## Access Levels
Swift provides several different levels of access. From least restrictive to most restrictive they are:

open / public
internal
fileprivate
private

```swift
// public structures can be accessed in other modules
public struct User { 
  // internal is the default level of access control
	let name: String 
  // fileprivate methods can only be accessed inside of the file they're declared in
  fileprivate func incrementVisitCount() {
    visitCount += 1
  }
  // private properties can only be accessed inside their structure's definition
  private let visitCount = 0
}
```
## Private Properties and Methods
Mark methods and properties as private to prevent them from being accessed outside of the structure, class, or enumeration’s definition.


```swift
struct User {
  let name: String
  init(name: String) {
    self.name = name
    uploadNewUser()
  }
  private func uploadNewUser() {
    print("Uploading the new user...")
  }
}
```
## Read-only Computed Properties
Read-only computed properties can be accessed, but not assigned to a new value. To define a read-only computed property, either use the get keyword without a set keyword, or omit keywords entirely.


```swift
struct Room {
  let width: Double
  let height: Double
  var squareFeet: Double {
    return width * height
  }
  var description: String {
    get {
      return "This room is \(width) x \(height)"
    }
  }
}
```
## Property Observers
Property observers execute code whenever a property is changed. The willSet property observer is triggered right before the property is changed and creates a newValue variable within the block’s scope. The didSet property observer is triggered right after the property is changed and creates an oldValue within the block’s scope.


```swift
struct Employee {
  var hourlyWage = 15 {
    willSet {
      print("The hourly wage is about to be changed from \(hourlyWage) to \(newValue)")
    }
    didSet {
      print("The hourly wage has been changed from \(oldValue) to \(hourlyWage)")
    }
  }
}

var codey = Employee()
codey.hourlyWage = 20

// Prints:
// The hourly wage is about to be changed from 15 to 20
// The hourly wage has been changed from 15 to 20
```
## Private Setters
Properties marked as private(set) can be accessed from outside the scope of its structure, but only assigned within it. This allows the setter to be more restrictive than the getter.


```swift
struct User {
	private(set) var name: String
  mutating func updateName(to newName: String) {
  	if newName != "" {
    	name = newName
    }
  }
}

var currentUser = User(name: "codey")
currentUser.updateName(to: "Codey")
print(currentUser.name)
// currentUser.name = "Bob" // This line doesn't compile because the 'name' setter is inaccessible


```
## Static Properties and Methods
The static keyword is used to declare type methods and properties. These are accessed from the type itself rather than an instance.


```swift
struct User {
  static var allUsers = [User]()
  let id: Int
  init(id: Int) {
    self.id = id
    User.allUsers.append(self)
  }
}

let userOne = User(id: 1)
let userTwo = User(id: 2)
let userThree = User(id: 3)

print(User.allUsers) // Prints: [User(id: 1), User(id: 2), User(id: 3)]
```

## Extensions

The extension keyword is used to continue defining an existing class, structure, or enumeration from anywhere in a codebase. Extensions can have new methods, internal types, and computed properties, but can’t contain new stored properties.
```swift
struct User {
  let name: String
}

extension User {
  var description: String {
    return "This is a user named \(name)"
  }
}
```

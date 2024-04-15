
[Resources](#resources)

[SwiftUI Cheatsheet](#swiftui-cheatsheet)

[Playgrounds - Get Started with Apps](#playgrounds---get-started-with-apps)

[Playgrounds - Keep Going with Apps](#playgrounds---keep-going-with-apps)

# Resources

https://github.com/SimpleBoilerplates/SwiftUI-Cheat-Sheet



# SwiftUI Cheatsheet

## Hello World

```swift
import SwiftUI
struct ContentView: View {
    var body: some View {
        Text("Hello, world")
    }
}
```

# Playgrounds - Get Started with Apps

# Playgrounds - Keep Going with Apps

## Using a Conditional Modifier

```swift
import SwiftUI

struct ConditionalCircle: View {
    @State var isOn = false
    
    var body: some View {
        VStack {

            Circle()
                .frame(maxHeight: 200)
                .foregroundColor( isOn ? .purple : .mint)
                .shadow(color: isOn ? .indigo : .orange, radius: 20)
                .scaleEffect(isOn ? 1 : 0.75)
                .animation(.default, value: isOn)
            Button("Press Me") {
                isOn.toggle()
            }
        }
    }
}
```

## Built In Views

```swift
import SwiftUI
//#-learning-code-snippet(toggleExperiment)


struct Bindings: View {

    @State var isOn = false
    @State var color = Color.primary
    
    var body: some View {
        VStack {

            Toggle("Press Me", isOn: $isOn)
            
            ColorPicker("Pick", selection: $color)
            
            Image(systemName: isOn ? "battery.100" : "battery.25")
                .font(.system(size: 150))
                .foregroundColor(color)
            
            Text("test text")
                .font(.largeTitle)
                .foregroundColor(color)
                .padding()
            
        }
        .padding()
    }
}
```

## Practice with Built in views

```swift
import SwiftUI

struct SlidingRectangle: View {
    @State var sliderAmount: Double = 0
    
    var body: some View {
        VStack {
            Slider(value: $sliderAmount)
            Rectangle()
                .frame(width: sliderAmount * 300)
                .foregroundColor(.blue)
        }
        .padding()

    }
}
```

## Navigating in SwiftUI

## Sharing Data Between Views

## Create a New View to Share data

## Add and delete creatures

## Add a CreatureDetail view

```swift
import SwiftUI

struct ContentView: View {
    var body: some View {

    }
}
```
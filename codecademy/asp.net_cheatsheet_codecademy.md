https://www.codecademy.com/learn/learn-asp-net/modules/asp-net-databases/cheatsheet

# Table of Contents

[ASP.NET: Razor Syntax](#aspnet-razor-syntax)

[ASP.NET: Page Models](#aspnet-page-models)

[ASP.NET: Databases](#aspnet-databases)

[ASP.NET: Middleware](#aspnet-middleware)

[ASP.NET: Dependency Injection](#aspnet-dependency-injection)

# ASP.NET: Razor Syntax
## Razor Syntax
Razor Syntax allows you to embed code (C#) into page views through the use of a few keywords (such as “@”), and then have the C# code be processed and converted at runtime to HTML. In other words, rather than coding static HTML syntax in the page view, a user can code in the view in C# and have the Razor engine convert the C# code into HTML at runtime, creating a dynamically generated HTML web page.

```csharp
@page
@model IndexModel
<h2>Welcome</h2>

<ul>
  @for (int i = 0; i < 3; i++)
  {
    <li>@i</li>
  }
</ul>
```
## The @page Directive
In a Razor view page (.cshtml), the @page directive indicates that the file is a Razor Page.

In order for the page to be treated as a Razor Page, and have ASP.NET parse the view syntax with the Razor engine, the directive @page should be added at the top of the file.

There can be empty space before the @page directive, but there cannot be any other characters, even an empty code block.


```csharp
@page
@model IndexModel

<h1>Welcome to my Razor Page</h1>
<p>Title: @Model.Title</p>
```
## The @model Directive
The page model class, i.e. the data and methods that hold the functionality associated with a view page, is made available to the view page via the @model directive.

By specifying the model in the view page, Razor exposes a Model property for accessing the model passed to the view page. We can then access properties and functions from that model by using the keyword Model or render its property values on the browser by prefixing the property names with @Model, e.g. @Model.PropertyName.

```csharp
@page
@model PersonModel

// Rendering the value of FirstName in PersonModel
<p>@Model.FirstName</p>

<ul>
  // Accessing the value of FavoriteFoods in PersonModel
  @foreach (var food in Model.FavoriteFoods)
  {
    <li>@food</li>
  }
</ul>
```
## Razor Markup
Razor pages use the @ symbol to transition from HTML to C#. C# expressions are evaluated and then rendered in the HTML output. You can use Razor syntax under the following conditions:

Anything immediately following the @ is assumed to be C# code.

Code blocks must appear within @{ ... } brackets.

A single line of code that uses spaces should be surrounded by parentheses, ( ).
```csharp
@page
@model PersonModel

// Using the `@` symbol:
<h1>My name is @Model.FirstName and I am @Model.Age years old </h1>

// Using a code block:
@{
  var greet = "Hey threre!";
  var name = "John";
  <h1>@greet I'm @name!</h1>
}

// Using parentheses:
<p>Last week this time: @(DateTime.Now - TimeSpan.FromDays(7))</p>

```
## Razor Conditionals
Conditionals in Razor code can be written pretty much the same way you would in regular C# code. The only exception is to prefix the keyword if with the @ symbol. Afterward, any else or else if conditions doesn’t need to be preprended with the @ symbol.


```csharp
// if-else if-else statment:
@{ var time = 9; }

@if (time < 10) 
{
  <p>Good morning, the time is: @time</p>
} 
else if (time < 20) 
{
  <p>Good day, the time is: @time</p>
}
else 
{
  <p>Good evening, the time is: @time</p>
}

```
## Razor Switch Statements
In Razor Pages, a switch statement begins with the @ symbol followed by the keyword switch. The condition is then written in parentheses and finally the switch cases are written within curly brackets, {}.

```csharp
@{ string day = "Monday"; }
@switch (day)
{
  case "Saturday":
    <p>Today is Saturday</p>
    break;
  case "Sunday":
    <p>Today is Sunday</p>
    break;
  default:
    <p>Today is @day... Looking forward to the weekend</p>
    break;
}
```
## Razor For Loops
In Razor Pages, a for loop is prepended by the @ symbol followed by a set of conditions wrapped in parentheses. The @ symbol must be used when referring to C# code.

```csharp
@{
  List<string> avengers = new List<string>()
  {
    "Spiderman",
    "Iron Man",
    "Hulk",
    "Thor",
  };
}


<h1>The Avengers Are:</h1>

@for (int i = 0; i < @avengers.Count; i++)
{
  <p>@avengers[i]</p>
}
```
## Razor Foreach Loops
In Razor Pages, a foreach loop is prepended by the @ symbol followed by a set of conditions wrapped in parentheses. Within the conditions, we can create a variable that will be used when rendering its value on the browser.


```csharp
@{
  List<string> avengers = new List<string>()
  {
    "Spiderman",
    "Iron Man",
    "Hulk",
    "Thor",
  };
}


<h1>The Avengers Are:</h1>

@foreach (var avenger in avengers)
{
    <p>@avenger</p>
}
```
## Razor While Loops
A while loop repeats the execution of a sequence of statements as long as a set of conditions is true, once the condition becomes false we break out of the loop.

When writing a while loop, we must prepend the keyword while with the @ symbol and write the condition within parentheses.


```csharp
@{ int i = 0; }

@while (i < 5)
{
  <p>@i</p>
  i++;
}
```
## Razor View Data
In Razor Pages, you can use the ViewData property to pass data from a Page Model to its corresponding view page, as well as share it with the layout, and any partial views.

ViewData is a dictionary that can contain key-value pairs where each key must be a string. The values can be accessed in the view page using the @ symbol.

A huge benefit of using ViewData comes when working with layout pages. We can easily pass information from each individual view page such as the title, into the layout by storing it in the ViewData dictionary in a view page:

@{ ViewData["Title"] = "Homepage" }

We can then access it in the layout like so: ViewData["Title"]. This way, we don’t need to hardcode certain information on each individual view page.


```csharp
// Page Model: Index.cshtml.cs
public class IndexModel : PageModel
{
  public void OnGet()
  {
    ViewData["Message"] = "Welcome to my page!";
    ViewData["Date"] = DateTime.Now();
  }
}

// View Page: Index.cshtml
@page
@model IndexModel

<h1>@ViewData["Message"]</h1>
<h2>Today is: @ViewData["Date"]</h2>
```
## Razor Shared Layouts
In Razor Pages, you can reduce code duplication by sharing layouts between view pages. A default layout is set up for your application in the _Layout.cshtml file located in Pages/Shared/.

Inside the _Layout.cshtml file there is a method call: RenderBody(). This method specifies the point at which the content from the view page is rendered relative to the layout defined.

If you want your view page to use a specific Layout page you can define it at the top by specifying the filename without the file extension: @{ Layout = "LayoutPage" }
```csharp
// Layout: _LayoutExample.cshtml
<body>
    ...
<div class="container body-content">
  @RenderBody() 
  <footer>
    <p>@DateTime.Now.Year - My ASP.NET Application</p>
  </footer>
</div>
</body>

// View Page: Example.cshtml
@page
@model ExampleModel

@{ Layout = "_LayoutExample" }

<h1>This content will appear where @RenderBody is called!</h1>
```
## Razor Tag Helpers
In Razor Pages, Tag Helpers change and enhance existing HTML elements by adding specific attributes to them. The elements they target are based on the element name, the attribute name, or the parent tag.

ASP.NET provides us with numerous built-in Tag Helpers that can be used for common tasks - such as creating forms, links, loading assets, and more.

```csharp
// Page Model: Example.cshtml.cs
public class ExampleModel : PageModel
{
  public string Language { get; set; }

  public List<SelectListItem> Languages { get; } = new List<SelectListItem>
  {
    new SelectListItem { Value = "C#", Text = "C#" },
    new SelectListItem { Value = "Javascript", Text = "Javascript" },
    new SelectListItem { Value = "Ruby", Text = "Ruby"  },
  };
}

// View Page: Example.cshtml
<h1>Select your favorite language!</h1>
<form method="post">
  // asp-for:  The name of the specified model property.
  // asp-items: A collection of SelectListItemoptions that appear in the select list.
  <select asp-for="Language" asp-items="Model.Languages"></select>
  <br />
  <button type="submit">Register</button>
</form>


// HTML Rendered:
<form method="post">
  <select id="Language" name="Language">
    <option value="C#">C#</option>
    <option value="Javascript">Javascript</option>
    <option value="Ruby">Ruby</option>
    <br>
  </select>
  <button type="submit">Register</button>
</form>
```
## Razor View Start File
When creating a template with ASP.NET, a ViewStart.cshtml file is automatically generated under the /Pages folder.

The ViewStart.cshtml file is generally used to define the layout for the website but can be used to define common view code that you want to execute at the start of each View’s rendering. The generated file contains code to set up the main layout for the application.

```csharp
// ViewStart.cshtml
@{
  Layout: "_Layout"
}

```
## Razor Partials
Partial views are an effective way of breaking up large views into smaller components and reduce complexity. A partial consists of fragments of HTML and server-side code to be included in any number of pages or layouts.

We can use the Partial Tag Helper, <partial>, in order to render a partial’s content in a view page.


```csharp
// _MyPartial.cshtml
<form method="post">
  <input type="email" name="emailaddress"> 
  <input type="submit">
</form>

// Example.cshtml
<h1> Welcome to my page! </h1>
<h2> Fill out the form below to subscribe!:</h2>
<partial name="_MyPartial" />
```
## Razor View Imports
The _ViewImports.cshtml file is automatically generated under /Pages when we create a template with ASP.NET.

Just like the _ViewStart.cshtml file, _ViewImports.cshtml is invoked for all your view pages before they are rendered.

The purpose of the file is to write common directives that our view pages need. ASP.NET currently supports a few directives that can be added such as: @namespace, @using, @addTagHelpers, and @inject amongst a few other ones. Instead of having to add them individually to each page, we can place the directives here and they’ll be available globally throughout the application.
```csharp
// _ViewImports.cshtml
@using YourProject
@namespace YourProject.Pages
@addTagHelper *, Microsoft.AspNetCore.Mvc.TagHelpers
```

# ASP.NET: Page Models
## asp-for

The asp-for attribute is used to connect an `<input>` element to a page model property.

The above example would be connected to a Username property in the page model:


```csharp
public class IndexModel : PageModel
{
  [BindProperty]
  public string Username { get; set; }
}
```
In the rendered HTML, attributes like type, id, and name will be added to the `<input>` tag:

```csharp
Enter a username:
<input type="text" id="Username" name="Username" >
```
```csharp
<!-- In .cshtml file -->
Enter a username: <input asp-for="Username" />
```
## URLs in Razor Pages

In a default Razor Pages application, each view page’s URL route is its path minus .cshtml.



## OnGet() & OnGetAsync()
When a page model receives a GET request, its OnGet() or OnGetAsync() method is invoked. This typically happens when a user navigates to the page model’s corresponding view page.

A page model must have either OnGet() or OnGetAsync(). It cannot have both.

```csharp
public class ZooModel : PageModel
{
  public string FavoriteAnimal { get; set; }

  // Sets FavoriteAnimal when page is requested
  public void OnGet()
  {
    FavoriteAnimal = "Hippo";
  }
}
```
## OnPost() & OnPostAsync()

When a page model receives a POST request, its OnPost() or OnPostAsync() method is invoked. This typically happens when a user submits a form on the page model’s corresponding view page.

A page model must have either OnPost() or OnPostAsync(). It cannot have both.
```csharp

public class IndexModel : PageModel
{
  public string Message { get; set; }

  public void OnPost()
  {
    Message = "OnPost() called!";
  }
}
```
## Void Handler Methods
In a page model, synchronous handler methods like OnGet() and OnPost() that have no return statement will have a return type of void.

This results in the current page being rendered in response to every request.


```csharp
public class IndexModel : PageModel
{
  public string Username { get; set; }

  public void OnGet()
  { 
    Username = "n/a";
  }

  public void OnPost(string username)
  {  
    Username = username;
  }
}
```
## Task Handler Methods
In a page model, asynchronous handler methods like OnGetAsync() and OnPostAsync() that have no return statement will have a return type of Task.

This results in the current page being rendered in response to every request.


```csharp
public class IndexModel : PageModel
{
  public string Users { get; set; }
  private UserContext _context { get; set; }

  public IndexModel(UserContext context)
  {
    _context = context;
  }

  // Task return type
  public async Task OnGetAsync()
  { 
    Users = await _context.Users.ToListAsync();
  }

  // Task return type
  public async Task OnPostAsync(string username)
  {  
    _context.Users.Add(username);
    await _context.SaveChangesAsync();
  }
}
```
## Handler Method Parameters
Page model handler methods, like OnGet(), OnGetAsync(), OnPost(), and OnPostAsync(), can access an incoming HTTP request’s query string via its own method parameters.

The name of the method parameter(s) must match (case-insensitive) the name(s) in the query string.
```csharp
// Example GET request
// https://localhost:8000/Songs?id=1
public async Task OnGetAsync(int id)
{ 
  // id is 1
}

// Example POST request
// https://localhost:8000/Songs?songName=Say%20It%20Loud
public async Task OnPostAsync(string songName)
{  
  // songName is "Say It Loud"
}
```
## Model Binding
In model binding, a page model retrieves data from an HTTP request, converts the data to .NET types, and updates the corresponding model properties. It is enabled with the [BindProperty] attribute.

```csharp
public class IndexModel : PageModel
{
  [BindProperty]
  public string Username { get; set; }
  
  [BindProperty]
  public bool IsActive { get; set; }
  
  // Example POST
  // https://localhost:8000?username=muhammad&IsActive=true
  public void OnPost()
  {
    // Username is "muhammad"
    // IsActive is true
  }
}
```
## Append URL Parameters

In Razor view pages (.cshtml files), the @page directive can be used to add parameters to a page’s route.

The parameter(s) must be in between curly braces { } after @page.
Constraints, like int or alpha, can be added using colons :.
A parameter can be marked optional using a question mark ?.
Imagine the below code is from Book.cshtml. Instead of /Book, the new route could be /Book/0 or Book/1 or Book/2 etc.:
```csharp
@page "{id:int}"
```
Imagine the below code is from House.cshtml. The new route could be /House or House/small or House/big etc.:

```csharp
@page "{size?}"

```
Imagine the below code is from Song.cshtml. Instead of /Song, the new route would be /Song or Song/0 or Song/1 etc.:


```csharp
@page "{song:int?}"

```
```csharp
@page {param}

```
## asp-route-{value}
The asp-route-{value} attribute is used in <a> elements to add additional information to a URL route.

{value} typically matches a property in a page model.
The provided value will be added as a route segment or a query string, depending on how the route is defined.
If the above <a> tag is in a .cshtml file, it would be rendered as this HTML:


```csharp
<a href="localhost:8000/About?name=Joanne">About Joanne</a>
```
However, if the About page has a route parameter, like @page {name}, then the same tag would be rendered as this HTML:


```csharp
<a href="localhost:8000/About/Joanne">About Joanne</a>
```
```csharp
<a asp-page="About" asp-route-name="Joanne">About Joanne</a>
```

## Default Responses
In page models, a handler method with no return statement will respond to HTTP requests by sending back the associated page.

In the above example, IndexModel is associated with Index.cshtml. Neither OnGet() nor OnPostAsync() have return statements, so they both return Index.cshtml.


```csharp
public class IndexModel : PageModel
{
  // Sends Index.cshtml
  public void OnGet()
  { }

  // Sends Index.cshtml
  public void OnPost()
  {  }
}
```
## Page()
To return the view page associated with a page model, use Page() in the page model’s handler methods.

This happens implicitly if the handler method has a void return type
If a handler method calls Page(), its return type is typically IActionResult or Task<IActionResult> (although others exist).

```csharp
public class AboutModel : PageModel
{
  // Sends About.cshtml
  public IActionResult OnGet()
  {
    return Page();
  }
}
```
## NotFound()

To send a “Status 404 Not Found” response, use NotFound() in the page model’s handler methods.

If a handler method calls NotFound(), its return type is typically IActionResult or Task<IActionResult> (although others exist).

```csharp
public class EditModel : PageModel
{
  public async Task<IActionResult> OnGetAsync(int? id)
  {
    if (id == null)
    {
      return NotFound();
    }
    
    // do something with id here
    
    return Page();
  }
}
```
## RedirectToPage()

To redirect users to a different Razor page within the application, use RedirectToPage() in the page model’s handler methods.

If a handler method calls RedirectToPage(), its return type is typically IActionResult or Task<IActionResult> (although others exist).
The string argument passed to this method is a file path. "/Index" is a relative path and "./Index" is an absolute path.

```csharp
public class IndexModel : PageModel
{
  // Sends Privacy.cshtml
  public IActionResult OnPost()
  {
    return RedirectToPage("./Privacy");
  }
}

```
## Append URL Segments

In Razor view pages (.cshtml files), the @page directive can be used to add segments to a page’s default route. Use this feature by typing a string after @page.

For example, imagine the below code is from About.cshtml. Instead of /About, the new route would be /About/Me:


```csharp
@page "Me"
```
```csharp
@page "segment"
```

# ASP.NET: Databases
## Database Model
Entity Framework uses C# classes to define the database model. This is an in-memory representation of data stored in a database table. Several model classes combine to form the schema for the database.

Each property maps to a column in a database table. The bottom line in the example shows a type of Continent which implies a relationship to another table.

```csharp
using System;

public class Country
{
  public string ID { get; set; }
  public string ContinentID { get; set; }
  public string Name { get; set; }
  public int? Population { get; set; }
  public int? Area { get; set; }
  public DateTime? UnitedNationsDate { get; set; }
        
  public Continent Continent { get; set; }
}
```
## Database Context
The Entity Framework database context is a C# class that provides connectivity to an external database for an application. It relies on the Microsoft.EntityFrameworkCore library to define the DB context which maps model entities to database tables and columns.

The DbContextOptions are injected into the context class via the constructor. The options allow configuration changes per environment so the Development DB is used while coding and testing but the Production DB would be referenced for real work.

The DbSet is an in-memory representation of a table or view which has a number of member methods that can return a List<T> of records or a single record.

```csharp
using Microsoft.EntityFrameworkCore;

public class CountryContext : DbContext
{
  public CountryContext(DbContextOptions<CountryContext> options)
      : base(options)
  {
  }

  public DbSet<Country> Countries { get; set; }
  public DbSet<Continent> Continents { get; set; }

  protected override void OnModelCreating(ModelBuilder modelBuilder)
  {
    modelBuilder.Entity<Country>().ToTable("Country");
    modelBuilder.Entity<Continent>().ToTable("Continent");
  }
}
```
## DbSet Type
The Entity Framework type DbSet represents a database table in memory. It is typically used with a <T> qualifier. The type, or T, is one of your database model classes. The ModelBuilder binds each database table entity to a corresponding DbSet.

DbSet has a number of member methods that can return a List<T> of records or a single record.


```csharp
using Microsoft.EntityFrameworkCore;

public class CountryContext : DbContext
{
  public CountryContext(DbContextOptions<CountryContext> options)
      : base(options)
  {
  }

  public DbSet<Country> Countries { get; set; }
  public DbSet<Continent> Continents { get; set; }

  protected override void OnModelCreating(ModelBuilder modelBuilder)
  {
    modelBuilder.Entity<Country>().ToTable("Country");
    modelBuilder.Entity<Continent>().ToTable("Continent");
  }
}
```
## Entity Framework Configuration

In ASP.NET Core, a database may be connected to a web app using Entity Framework. There are four common steps for any setup:

Define one or more database model classes and annotate them
Define a database context class that uses DbSet to map entities to tables
Define a database connection string in appsettings.json
Add the Entity Framework service in Startup.ConfigureServices()

## Database Connection String
The Entity Framework context depends on a database connection string that identifies a physical database connection. It is typically stored in appsettings.json. You can define multiple connection strings for different environments like Development, Test, or Production.

Each database product has specific requirements for the syntax of the connection string. This might contain the database name, user name, password, and other options.


```csharp
{
  "ConnectionStrings": {
    "CountryContext": "Data Source=Country.db"
  }
}
```
## Creating the Schema
Entity Framework provides command-line tools that help manage the connected database. Use these commands in the bash shell or Windows command prompt to create an initial database file and schema. This will read the context class and evaluate each database model represented by a DbSet. The SQL syntax necessary to create all schema objects is then generated and executed.


```bash
dotnet ef migrations add InitialCreate
dotnet ef database update
```
## Saving Changes
The Entity Framework context DbSet member provides the Attach() method to update an existing record, the Add() method to insert a new record, and the Remove() method to delete an existing record. Any combination of multiple records can batched before saving.

Use the EF context SaveChanges() or SaveChangesAsync() methods to persist all inserted, updated, and deleted records to the database table.


```csharp
// Assuming Country is of type Country
// Assuming _context is of a type inheriting DbSet

public async Task<IActionResult> OnPostAsync(string id)
{
  // update
  _context.Attach(Country).State = EntityState.Modified;

  // insert
  await _context.Countries.AddAsync(Country);

  // delete
  Country Country = await _context.Countries.FindAsync(id);

  if (Country != null)
  {
    _context.Countries.Remove(Country);
  }

  // all three methods must be followed by savechanges
  await _context.SaveChangesAsync(); 
  
  return RedirectToPage("./Index");
}
```
## Deleting Records

The Entity Framework context DbSet member provides the Remove() method to delete an existing record from the in-memory representation of the database table. Any combination of multiple record deletions can be batched before saving.

Use the EF context SaveChanges() or SaveChangesAsync() methods to persist all deletions to the database table.


```csharp
// Assuming Country is of type Country
// Assuming _context is of a type inheriting DbSet

public async Task<IActionResult> OnPostAsync(string id)
{
  if (id == null)
  {
    return NotFound();
  }

  Country Country = await _context.Countries.FindAsync(id);

  if (Country != null)
  {
    _context.Countries.Remove(Country);
  }

  await _context.SaveChangesAsync(); 
  
  return RedirectToPage("./Index");
}
```
## LINQ Queries
The Entity Framework DbSet entities can manage complex queries using C# LINQ syntax. This is referenced from the System.Linq library.

All of the Where() and OrderBy() clauses are evaluated in the final statement that calls ToListAsync(). EF evaluates all options and generates a SQL SELECT statement with corresponding WHERE and ORDERBY clauses.
```csharp
using System.Linq;

var countries = from c in _context.Countries
          select c;

countries = countries.Where(c => c.Name.Contains("Russia"));

countries = countries.Where(c => c.ContinentID == 3);

countries = countries.OrderBy(c => c.Name);

List<Country> Countries = await countries.ToListAsync();
```
## DisplayNameFor Helper
The @Html.DisplayNameFor() tag helper is used to display the friendly name for a property in a database model. By default, this will match the property name. If a [Display(Name = "Code")] annotation is applied to the property in the model class, that string is used instead

```csharp
// Example database model
public class Continent
{
  [Display(Name = "Code")]
  public int ID { get; set; }
}
```
```csharp
<!-- In .cshtml file -->
<div>
  @Html.DisplayNameFor(model => model.Continent.ID)
</div>

<!-- Rendered HTML in browser -->
<div>
  Code
</div>
```
## Model Binding
In ASP.NET Core, model binding is a feature that simplifies capturing and storing data in a web app. The process of model binding includes retrieving data from various sources, converting them to collections of .NET types, and passing them to controllers/page models. Helpers and attributes are used to render HTML with the contents of bound page models. Client- and server-side validation scripts are used to ensure integrity during data entry.


## Adding Records
The Entity Framework context DbSet member provides the Add() and AddAsync() methods to insert a new record into the in-memory representation of the corresponding database table. A batch of multiple records can also be added in this fashion.

The record is passed from the browser in the <form> post back. In this case a Country member is declared with a [BindProperty] attribute so the entire record is passed back to the server.

Use the EF context SaveChanges() or SaveChangesAsync() methods to persist all new records to the database table.
```csharp
// Assuming Country is of type Country
// Assuming _context is of a type inheriting DbSet

public async Task<IActionResult> OnPostAsync(string id)
{
  if (!ModelState.IsValid)
  {
    return Page();
  }
  
  await _context.Countries.AddAsync(Country);

  await _context.SaveChangesAsync();
  
  return RedirectToPage("./Index");   
}

```
## Finding Records
The Entity Framework context DbSet member provides the Find() and FindAsync() methods to retrieve an existing record from the in-memory representation of the database table. Assign the result of this method to a local member in the page model.

This method generates the appropriate SQL syntax needed to access the record in the database table.
```csharp
// Assuming Country is of type Country
// Assuming _context is of a type inheriting DbSet

public async Task<IActionResult> OnGetAsync(string id)
{
  if (id == null)
  {
    return NotFound();
  }

  Country Country = await _context.Countries.FindAsync(id);
  
  return Page();
}
```
## Updating Records
The Entity Framework context DbSet member provides the Attach() method to update an existing record in the in-memory representation of the corresponding database table. A batch of multiple records can also be updated in this fashion.

The record is passed from the browser in the <form> post back. In this case a Country member is declared with a [BindProperty] attribute so the entire record is passed back to the server.

Use the EF context SaveChanges() or SaveChangesAsync() methods to persist all updated records to the database table.
```csharp
// Assuming Country is of type Country
// Assuming _context is of a type inheriting DbSet

public async Task<IActionResult> OnPostAsync(string id)
{
  if (!ModelState.IsValid)
  {
    return Page();
  }
  
  _context.Attach(Country).State = EntityState.Modified;

  await _context.SaveChangesAsync();
  
  return RedirectToPage("./Index");   
}
```
## Valid Model State
Entity Framework database models accept annotations that drive data validation at the property level. If you are using the asp-validation-for or asp-validation-summary HTML attributes, validation is handled client-side with JavaScript. The model is validated and the <form> post back won’t occur until that model is valid.

Sometimes the client-side validation will not be available so it is considered best practice to also validate the model server-side, inside the OnPostAsync() method. This example checks for ModelState.IsValid and returns the same page if it is false. This effectively keeps the user on the same page until their entries are valid.

If the model is valid, the insert, update, or delete can proceed followed by SaveChangesAsync() to persist the changes.
```csharp
public async Task<IActionResult> OnPostAsync()
{
  if (!ModelState.IsValid)
  {
    return Page();
  }

  _context.Continents.Add(Continent);

  await _context.SaveChangesAsync();

  return RedirectToPage("./Index");
}
```
## Select List Items Attribute

```html
<select asp-for="Country.ContinentID" asp-items="Model.Continents"></select>
```
The asp-items attribute in a `<select>` element generates `<option>` tags according to the model property specified. It works in conjunction with the asp-for attribute to display the matching option and set the underlying value on a change.

```csharp
using Microsoft.AspNetCore.Mvc.Rendering;

public SelectList Continents { get; set; }

public async Task<IActionResult> OnGetAsync(string id)
{
  Continents = new SelectList(_context.Continents, nameof(Continent.ID), nameof(Continent.Name));
}
```
The SelectList type is declared in the page model code and assigned to a new SelectList() where each record in Continents grabs the ID as the `<option>` value and Name as the `<option>` display text.

The included `<select>` in the example would render as this HTML:


```csharp
<select class="valid" id="Country_ContinentID" name="Country.ContinentID" aria-invalid="false">
  <option value="NA">North America</option>
  <option value="SA">South America</option>
  <option value="EU">Europe</option>
  <!-- etc -->
</select>

```
## Validation Attribute
The asp-for attribute in an `<input>` element will render HTML and JavaScript that handle the display and data entry for a field based on the model annotations. The JavaScript will set the valid flag on the field.

The asp-validation-for attribute in a `<span>` element will display any error message generated when the property annotations are not valid.

In this example, the `<span>` be rendered as this HTML:

```csharp
<span class="field-validation-valid" data-valmsg-for="Continent.Name" data-valmsg-replace="true"></span>
```
```html
<div>
  <label asp-for="Continent.Name"></label>
  <div>
    <input asp-for="Continent.Name" />
    <span asp-validation-for="Continent.Name"></span>
  </div>
</div>
```
## [Display] Attribute
The [Display] attribute specifies the caption for a label, textbox, or table heading.

Within a Razor Page, the @Html.DisplayForName() helper defaults to the property name unless the [Display] attribute overrides it. In this case, Continent is displayed instead of the more technical ContinentID.
```csharp
using System.ComponentModel.DataAnnotations;
    
public class Country
{
  [Display(Name = "Continent")]
  public string ContinentID { get; set; }
}
```
## [DisplayFormat] Attribute
The [DisplayFormat] attribute can explicitly apply a C# format string. The optional ApplyFormatInEditMode means the format should also apply in edit mode.

[DisplayFormat] is often used in combination with the [DataType] attribute. Together they determine the rendered HTML when using the @Html.DisplayFor() helper.
```csharp
using System.ComponentModel.DataAnnotations;
    
public class Country
{
  [DisplayFormat(DataFormatString = "{0:N0}", ApplyFormatInEditMode = true)]
  public int? Population { get; set; }
}
```
## [DataType] Attribute
The [DataType] attribute specifies a more specific data type than the database column type. In this case, the database table will use a DateTime column but the render logic will only show the date.

The @Html.DisplayFor() helper knows about types and will render a default format to match the type. In this case, the HTML5 browser date picker will appear when editing the field.
```csharp
using System.ComponentModel.DataAnnotations;
    
public class Country
{
  [DataType(DataType.Date)]
  [DisplayFormat(DataFormatString = "{0:yyyy-MM-dd}", ApplyFormatInEditMode = true)]
  public DateTime? UnitedNationsDate { get; set; }
}

```
## [Required] Attribute

The [Required] attribute can be applied to one or more properties in a database model class. EF will create a NOT NULL column in the database table for the property.

The client-side JavaScript validation scripts will ensure that a non-empty string or number is valid before posting the record from the browser on inserts and updates.
```csharp
using System.ComponentModel.DataAnnotations;
  
public class Country
{  
  [Required]
  public string Name { get; set; }
}
```
## [RegularExpression] Attribute

The [RegularExpression] attribute can apply detailed restrictions for data input. The match expression is evaluated during data entry and the result returns true or false. If false, the model state will not be valid and the optional ErrorMessage will display.

In a Razor page, the @Html.DisplayFor() helper only shows the data in the field. The asp-validation-for attribute on a `<span>` tag displays the ErrorMessage.
```csharp
using System.ComponentModel.DataAnnotations;
    
public class Country
{  
  [RegularExpression(@"[A-Z]+", ErrorMessage = "Only upper case characters are allowed.")]
  public string CountryCode { get; set; }
}
```
## [StringLength] Attribute

The [StringLength] attribute specifies the maximum length of characters that are allowed in a data field and optionally the minimum length. The model will not be flagged as valid if these restrictions are exceeded. In this case, the ContinentID must be exactly 2 characters in length.

In a Razor Page, the @Html.DisplayFor() helper only shows the data in the field. The client-side JavaScript validation scripts use the asp-validation-for attribute on a `<span>` tag to display a default error message.
```csharp
using System.ComponentModel.DataAnnotations;
    
public class Country
{
  [StringLength(2, MinimumLength = 2)]
  public string ContinentCode { get; set; }
}
```
## [Range] Attribute

The [Range] attribute specifies the minimum and maximum values in a data field. The model will not be flagged as valid if these restrictions are exceeded. In this case, Population must be greater than 0 and less than the big number!

In a Razor page, the @Html.DisplayFor() helper only shows the data in the field. The client-side JavaScript validation scripts use the asp-validation-for attribute on a `<span>` tag to display a default error message.


```csharp
using System.ComponentModel.DataAnnotations;
    
public class Country
{
  [Range(1, 10000000000)]
  public int? Population { get; set; }
}

```

# ASP.NET: Middleware
## Understanding ASP.NET Developer Exception Pages

UseDeveloperExceptionPage() is a method which provides an exception page specifically designed for developers. The method should be placed before any middleware components that are catching exceptions. Some of the information displayed includes the stack trace, any query string parameters, cookies, headers, and routing information.


## Understanding ASP.NET UseExceptionHandler Component
The UseExceptionHandler() component can be used in production environments to catch and log errors and route users to a general error page without exposing sensitive details about the application. The UseExceptionHandler() component has several overloads, but a simple way of using it is to pass in the name of the page (as a string) that should display if an exception is thrown.


```csharp

if (env.IsDevelopment()) 
  app.UseDeveloperExceptionPage();
else 
  app.UseExceptionHandler("/Error");

```
## Redirecting Requests with ASP.NET Middleware

The UseHttpsRedirection() method is the middleware component used to capture HTTP requests and redirect them to the more secure HTTPS protocol. Since the redirection is done in the app configuration, the user never even has to know the redirection occurred.


## Enabling ASP.NET Endpoints
UseRouting(), must be called to compare the HTTP request with the available endpoints and decide which is the best match. UseEndpoints() then calls MapRazorPages() with a lambda expression to register the endpoint, and then executes the selected delegate that matches our HTTP request.


```csharp
app.UseRouting();            
app.UseEndpoints(endpoints => {
  endpoints.MapRazorPages();
});
```
## Understanding the ASP.NET UseStaticFiles Component
Static files make up an important part of the application — they often contain HTML, CSS, and JavaScript code that controls how the application looks and behaves. The UseStaticFiles() method is available to ensure static file content is rendered alongside the HTML for our web applications.

## Understanding the ASP.NET UseAuthorization Component

The UseAuthorization() component checks the user’s request against their authorization status. If the authorization check passes, this component will pass the request to the next component in the pipeline. Otherwise, it will short-circuit the pipeline and either present the user with a login page or an error.


## Understanding ASP.NET middleware

Web applications use a series of components to route each HTTP request to its destination and then return an appropriate response to the user. This series of components is organized in a pipeline which is collectively known as middleware.


## Adding ASP.NET Middleware Components

The Configure() method is called from the Startup class. Configure() calls various app.UseX() methods to build the middleware pipeline.

## Ordering ASP.NET Middleware

Middleware components are called in sequence. The order in which components are called is very important and is determined by where the component appears in the Startup.Configure() method.

## Accessing Built-in ASP.NET Components
The IApplicationBuilder interface defines the built-in middleware methods. These methods are defined by using the format UseX() with X describing the action performed by the method.

```csharp
public void Configure(IApplicationBuilder app, IWebHostEnvironment env)
```
## Adding custom middleware components
The IApplicationBuilder interface provides a generic Use() method which can be used to process custom middleware components and call the next component in the pipeline. Multiple middleware components can be chained together with the Use() method, which accepts two parameters, the HTTP context and the next middleware component to be called.

```csharp
app.Use(async (context, next) => {
  await context.Response.WriteAsync("Custom middleware!"); 
  await next();         
});
```
## Adding terminal ASP.NET middleware
IApplicationBuilder.Run() is a terminal middleware component which begins returning the HTTP response. Run() can be added to the end of the request pipeline since any delegates after this component will not be executed.

```csharp
app.Run(async (context) => { 
  await context.Response.WriteAsync("Terminal middleware!");
});
```
## Understanding ASP.NET Nested Structure
Proper ordering of middleware components is important. The middleware request pipeline has a nested structure where each component can perform operations before and after the next component.


# ASP.NET: Dependency Injection
## Dependency Injection

When a service (dependency object) is created outside of its client (the object that depends on it) that service can be passed into, or injected, into the client, typically through the client’s constructor.

This process is called dependency injection, where services are not created by the clients that use (and depend on) them, but rather are created and managed in other code, and are injected into the client.


```csharp
//The client class that depends on a service
class Reviewer 
{
  public EmailSender _sender {get; set;}
  
  //EmailSender is injected into the Reviewer object
  public Reviewer(EmailSender sender)
  {
    _sender = sender;
  }
  public SendReview(string lesson, string comments)
  {
    _sender.SendReview(lesson, comments);
  }
}

//The dependency/service class
class EmailSender
{
  public SendReview(string lesson, string comments)
  {
    // Send an email with the Lesson and Comments
  }  
}

static void Main(string[] args)
{
  EmailSender sender = new EmailSender();
  
  //Injecting Sender into Reviewer
  Reviewer reviewer = new Reviewer(Sender).
    SendReview("Dependecy Injection", "Super helpful!");
}
```
## IoC Container

The IoC Container (Inversion of Control Container) is a framework that acts as the dependency injector. This allows the programmer to focus on using the service within the classes that depend on it, rather than managing the entire life cycle of the service.

The IoC Container does all of the following:

Registers services with a concrete implementation (a class)
Instantiating, or resolving, the service class to be injected into the client class
Injecting the service
Disposing of the service instance based on the registered settings


## Registering Services

Services are registered in the ConfigureServices() method of the Startup class in Startup.cs.

Once the services are registered, they are available for injection into client classes that use those services.

Services are registered using the AddTransient(), AddScoped(), and AddSingleton() methods. These methods dictate how the service’s life cycle is managed.

AddTransient - the service is created each time it’s requested from the IoC Container. This means that when more than one class uses the service, those classes will be injected with a fresh new instance of that service, even if it’s within the same request.

AddScoped - the service is created for each client request. If multiple classes use and are injected with the service within the same request, only one instance of that service is created and used throughout the request for those classes.

AddSingleton - the service is created once on the first time the service is requested and is instantiated for the lifetime of the application process.


```csharp
public void ConfigureServices(IServiceCollection services)
{
  services.AddRazorPages();
  
  services.AddTransient<ITransientService, TransientService>();
  services.AddScoped<IScopedService, ScopedService>();
  services.AddSingleton<ISingletonService, SingletonService>();
}
```
## AddDbContext
The AddDbContext<T>() method registers the framework-provided services that allow all page models to be injected with an instance of the T database context that will be used to access the application’s database.

When calling the AddDbContext<T>() method to register the application’s database context service, one must also pass in an instance of the DbContextOptions object that contains information such as the database provider type (UseSqlServer(), UseSqlite(), etc.), connection string (defined in appsettings.json), and other optional settings that defines the behavior of the context.

The AddDbContext<T>() method is called within Startup.ConfigureServices().

```csharp
public void ConfigureServices(IServiceCollection services)
{
  services.AddDbContext<MyAppContext>(options =>
    options.UseSqlServer(
      Configuration.GetConnectionString("MyAppContext")));
}
```
## Dependencies As Interfaces

In order to satisfy the Dependency Inversion Principle, injected services are typically referenced as interfaces. This allows the client class to use an implemented service whose behavior is well defined via its interface, and not have any knowledge or be concerned with the actual concrete class that implements that interface.

Any changes to the concrete class’s methods or properties would not require any modifications to the client class since it only knows of the interface and its well defined abstract methods.

```csharp
public class ReviewModel : PageModel
{
  // Notice IFormSender interface
  private readonly IFormSender _Sender;
  
  [BindProperty]
  public string Review {get;set;}
  
  [BindProperty]
  public int ProductID {get;set}
  
  // Notice IFormSender interface
  public ReviewModel(IFormSender sender)
  {
    _Sender = sender;
  }
  
  public async Task<IActionResult> OnPost()
  {
    await _Sender.SubmitReview(ProductID, Review);
    return RedirectToPage("/Index");
  }
}
```
## Dependency
When one object (Object A) references another object (Object B), using its properties and methods, it means that the first object (A) depends on the second (B), making the second object (B) a dependency.


```csharp
// Object A - the class that depends on Object B
class Reviewer 
{
  private EmailSender Sender = new EmailSender();  
  public SendReview(string lesson, string comments)
  {
    Sender.SendReview(lesson, comments);
  }
}

// Object B - the dependency
class EmailSender
{
  public SendReview(string lesson, string comments)
  {
    // Send an email with the Lesson and Comments
  }  
}

static void Main(string[] args)
{
  Reviewer reviewer = new Reviewer().
    SendReview("Dependecy Injection", "Learned a ton!");
}
```
## AddRazorPages()
Following the services.Add{ServiceName} naming convention, the AddRazorPages() method registers all the services required for the web app to function as a Razor Pages application.

AddRazorPages() is called within Startup.ConfigureServices().

If you’re curious and want to peek under the hood to see all the services that are registered within AddRazorPages(), you can find the code at dotnet/aspnetcore. Remember, it’s all open source!


```csharp
public void ConfigureServices(IServiceCollection services)
{
  services.AddRazorPages();
}
```
## DI and IOC Container

A built-in IoC Container (Inversion of Control Container) is provided with ASP.NET that implements all dependency injection functionality and allows the developer to implement structured code following the Dependency Inversion (DIP) and SOLID principles.

The IoC Container allows the developer to register services for injection in the Startup.ConfigureServices() method.

The IoC Container handles the lifecycles of services and lets the developer implement classes that use the registered services to perform work.
```csharp
//Registering the Service
public class Startup
{
  public void ConfigureServices(IServiceCollection services)
  {
    services.AddRazorPages();
    services.AddScoped<ISendService, SendService>();
  }
}

//Injecting the service
public class ReviewModel : PageModel
{
  private readonly ISendService _sender;
  public ReviewModel(ISendService sender)
  {
    _sender = sender;
  }
}
```

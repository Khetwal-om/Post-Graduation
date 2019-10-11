

1. __Inline__ CSS


```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CSS COLORS</title>
</head>
<body>

   <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Animi cupiditate deserunt dolorem doloremque ducimus esse facere facilis fugiat fugit harum libero nemo pariatur, placeat possimus quas quidem veritatis? Accusantium autem enim eum exercitationem fugit itaque iure laudantium nam nemo nisi odio perferendis quia quos sunt tempora vel veritatis, voluptate! Doloremque.</p>
    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Accusantium adipisci amet cum, deleniti dolores, earum et facilis fuga laboriosam maiores nam, nostrum odit quasi quibusdam reiciendis repellat tempore totam! Amet assumenda consectetur deserunt dolorum iste labore odio quod sed sit tenetur? Commodi, debitis earum facere ipsa ipsam maiores repudiandae voluptate!</p>
<p style="color: cadetblue">Lorem ipsum dolor sit amet, consectetur adipisicing elit. A ab, accusantium adipisci aperiam aut cum cupiditate deleniti excepturi expedita fuga fugiat fugit in inventore libero magnam modi mollitia necessitatibus nisi odio odit officia optio perferendis possimus quas quisquam quo ratione recusandae rerum similique suscipit tempora tenetur totam, ullam vero voluptatum!</p>
<p style="color: blue;">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aperiam autem blanditiis dignissimos ipsum libero odit perferendis reprehenderit soluta sunt. Ad at atque commodi consequuntur corporis cumque, laboriosam perferendis, perspiciatis quas quibusdam, sequi veniam. Ab assumenda dignissimos esse itaque labore maiores nesciunt, nobis quidem recusandae similique. Consequatur et harum id qui!</p>
</body>
</html>
```

2. __Internal CSS__

> cons : If we want same style for each and every html file
we will have to copy each line within style of each html file.

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CSS COLORS</title>
    <style>
        p{
            color: darkseagreen;
            background: orange;

        }
    </style>
</head>
<body>

   <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Animi cupiditate deserunt dolorem doloremque ducimus esse facere facilis fugiat fugit harum libero nemo pariatur, placeat possimus quas quidem veritatis? Accusantium autem enim eum exercitationem fugit itaque iure laudantium nam nemo nisi odio perferendis quia quos sunt tempora vel veritatis, voluptate! Doloremque.</p>
    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Accusantium adipisci amet cum, deleniti dolores, earum et facilis fuga laboriosam maiores nam, nostrum odit quasi quibusdam reiciendis repellat tempore totam! Amet assumenda consectetur deserunt dolorum iste labore odio quod sed sit tenetur? Commodi, debitis earum facere ipsa ipsam maiores repudiandae voluptate!</p>
<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. A ab, accusantium adipisci aperiam aut cum cupiditate deleniti excepturi expedita fuga fugiat fugit in inventore libero magnam modi mollitia necessitatibus nisi odio odit officia optio perferendis possimus quas quisquam quo ratione recusandae rerum similique suscipit tempora tenetur totam, ullam vero voluptatum!</p>
<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aperiam autem blanditiis dignissimos ipsum libero odit perferendis reprehenderit soluta sunt. Ad at atque commodi consequuntur corporis cumque, laboriosam perferendis, perspiciatis quas quibusdam, sequi veniam. Ab assumenda dignissimos esse itaque labore maiores nesciunt, nobis quidem recusandae similique. Consequatur et harum id qui!</p>
</body>
</html>
```


3. **External**

> Instead use 

```html
  <link rel="stylesheet" type="text/css" href="style.css">
```


4. __CSS SELECTORS__

selector | viz
------------ | ------------
Element selector  | h1{} 
Id selector  | #one{}
Class selector | .classname{}
Attribute selector | input[type="text"]
Pseudo Selector |  button:hover


5. Id selector example
     
     
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CSS COLORS</title>
    <style>
        #cyan{
            color: darkseagreen;
            background: orange;
            text-decoration-color: antiquewhite;

        }
    </style>
</head>
<body>

   <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Animi cupiditate deserunt dolorem doloremque ducimus esse facere facilis fugiat fugit harum libero nemo pariatur, placeat possimus quas quidem veritatis? Accusantium autem enim eum exercitationem fugit itaque iure laudantium nam nemo nisi odio perferendis quia quos sunt tempora vel veritatis, voluptate! Doloremque.</p>
    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Accusantium adipisci amet cum, deleniti dolores, earum et facilis fuga laboriosam maiores nam, nostrum odit quasi quibusdam reiciendis repellat tempore totam! Amet assumenda consectetur deserunt dolorum iste labore odio quod sed sit tenetur? Commodi, debitis earum facere ipsa ipsam maiores repudiandae voluptate!</p>
<p id="cyan">Lorem ipsum dolor sit amet, consectetur adipisicing elit. A ab, accusantium adipisci aperiam aut cum cupiditate deleniti excepturi expedita fuga fugiat fugit in inventore libero magnam modi mollitia necessitatibus nisi odio odit officia optio perferendis possimus quas quisquam quo ratione recusandae rerum similique suscipit tempora tenetur totam, ullam vero voluptatum!</p>
<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aperiam autem blanditiis dignissimos ipsum libero odit perferendis reprehenderit soluta sunt. Ad at atque commodi consequuntur corporis cumque, laboriosam perferendis, perspiciatis quas quibusdam, sequi veniam. Ab assumenda dignissimos esse itaque labore maiores nesciunt, nobis quidem recusandae similique. Consequatur et harum id qui!</p>
</body>
</html>
```
 
 
6. What if we want multiple paragraphs with same style
> use same ID but this is prohibited\
 Don't even write same style for all ,no code duplication should be there\
 Here come the __Class selector__\
 class can be **repeated** ID won't.

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CSS COLORS</title>
    <style>
        .green{
            color: darkseagreen;
            background: orange;
            text-decoration-color: antiquewhite;

        }
    </style>
</head>
<body>

   <p class="green">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Animi cupiditate deserunt dolorem doloremque ducimus esse facere facilis fugiat fugit harum libero nemo pariatur, placeat possimus quas quidem veritatis? Accusantium autem enim eum exercitationem fugit itaque iure laudantium nam nemo nisi odio perferendis quia quos sunt tempora vel veritatis, voluptate! Doloremque.</p>
    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Accusantium adipisci amet cum, deleniti dolores, earum et facilis fuga laboriosam maiores nam, nostrum odit quasi quibusdam reiciendis repellat tempore totam! Amet assumenda consectetur deserunt dolorum iste labore odio quod sed sit tenetur? Commodi, debitis earum facere ipsa ipsam maiores repudiandae voluptate!</p>
<p class="green">Lorem ipsum dolor sit amet, consectetur adipisicing elit. A ab, accusantium adipisci aperiam aut cum cupiditate deleniti excepturi expedita fuga fugiat fugit in inventore libero magnam modi mollitia necessitatibus nisi odio odit officia optio perferendis possimus quas quisquam quo ratione recusandae rerum similique suscipit tempora tenetur totam, ullam vero voluptatum!</p>
<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aperiam autem blanditiis dignissimos ipsum libero odit perferendis reprehenderit soluta sunt. Ad at atque commodi consequuntur corporis cumque, laboriosam perferendis, perspiciatis quas quibusdam, sequi veniam. Ab assumenda dignissimos esse itaque labore maiores nesciunt, nobis quidem recusandae similique. Consequatur et harum id qui!</p>
</body>
</html>
```

7. __Attribute Selector__


```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CSS COLORS</title>
    <style>
        input[type="text"]{
            background: cyan;
        }
        input[type="password"]
        {
        background: aquamarine;
        }
    </style>
</head>
<body>
    <form>
        <label>Name</label>
        <input type="text">
            <br>
        <label>Password</label>
        <input type="password">
        <br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
```


8. __Pseudo classes__ means this is special than any other.

> As soon as I open the page style is already applied. I want
some special events. viz hover 

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CSS COLORS</title>
    <style>
        input[type="text"]:focus{
            background: brown;
        }
        input[type="password"]
        {
            background: darkcyan;
        }

        input[type="password"]:hover
        {
            background: teal;
            color: antiquewhite;
        }

        input[type="submit"]:hover{
            background-color: lightsalmon;
        }

        input[type="submit"]:hover{
            background-color: darkorange;
        }
    </style>
</head>
<body>
    <form>
        <label>Name</label>
        <input type="text">
            <br>
        <label>Password</label>
        <input type="password">
        <br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
```



# Lecture 2  Login form 



---

```html

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CSS forms</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="bootstrap/css/font-awesome.min.css">
    <style>
        body{
            font-family: Arial, sans-serif,"Franklin Gothic Heavy";
            background-image: url("img/sunset.png");
            background-size: cover;
        }


        .form-div{
            border: 2px solid teal;
            border-radius: 15px;
            width: 400px;
            text-align: center;
            margin: 50px 20px 20px 20px;
            background-image: url("https://www.animatedimages.org/data/media/165/animated-football-and-soccer-image-0093.gif");
            background-size: cover;
            box-shadow: 0 0 15px lightsalmon;
        }

        /* this is h2 within div*/
        .form-div h2{
            color: lightsalmon;
        }


        input[type="text"],input[type="password"]
        {
            height: 30px;
            text-align: center;
            border-radius: 15px;
            margin: 7px;
        }

        input[type="text"]:focus,input[type="password"]:focus
        {
            outline: none;
            background-color: lightyellow;
        }

        input[type="submit"]
        {
            background-color: lightyellow;
            border-radius: 19px;
            font-size: 16px;
            padding: 8px 20px;
            margin: 5px 1px 25px 1px;
        }

        input[type="submit"]:hover
        {
            opacity: 0.8;
            cursor: pointer;
            box-shadow: 0 0 15px blanchedalmond;
        }



    </style>
</head>
<body>

    <!-- Login Form -->
    <div class="form-div">
        <h2>Login Here</h2>
        <form>
            <input type="text" placeholder="User Name">
            <br>
            <input type="password" placeholder="Password">
            <br>
            <input type="submit" value="Login">
        </form>
    </div>

</body>
</html>
```

---


# Lecture 3   table with css

---

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CSS TABLES</title>
    <style>
        body{
            font-family: "Comic Sans MS", sans-serif;
        }

        table,td,th{
            text-align: center;
            font-size: 20px;
            padding:10px;
        }

        table{
            width: 100%;
        }
        th{
            background-color: sandybrown;
            color:floralwhite;
        }

        tr:nth-child(even){
            background-color: teal;
            color: antiquewhite;
        }

        tr:nth-child(odd){
            background-color: lightsalmon;
            color: beige;
        }

        th,td{
            border-radius: 20px;
        }

        td:nth-child(even):hover{
            background-color: lightseagreen;
            cursor: pointer ;
        }

        td:nth-child(odd):hover{
            background-color: lightcoral;
        }

    </style>
</head>
<body>

    <!-- CUSTOM TABLE -->
    <table>
        <tr>
            <th>Emp Name</th>
            <th>Designation</th>
            <th>Company</th>
        </tr>
        <tr>
            <td>John Mayor</td>
            <td>Software Engineer</td>
            <td>Microsoft</td>
        </tr>
        <tr>
            <td>Alex Ben</td>
            <td>Software Engineer</td>
            <td>Google</td>
        </tr>
        <tr>
            <td>John</td>
            <td>Software Engineer</td>
            <td>Microsoft</td>
        </tr>
        <tr>
            <td>Alex Ben</td>
            <td>Software Engineer</td>
            <td>Google</td>
        </tr>
        <tr>
            <td>John</td>
            <td>Software Engineer</td>
            <td>Microsoft</td>
        </tr>
        <tr>
            <td>Alex Ben</td>
            <td>Software Engineer</td>
            <td>Google</td>
        </tr>
    </table>
</body>
</html>
```

---


#Lecture 4  Navbar using css

```html

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CSS Dropdown Navbar</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="bootstrap/css/font-awesome.min.css">
    <style>
        body{
            font-family: Arial, sans-serif;
            margin: 0;
        }

        nav{
            background-color: sandybrown;
            overflow: hidden;
        }

        nav ul{
            list-style-type: none;
            margin: 0;
            padding: 0;
        }

        nav ul li a{
            text-decoration: none;
            color:black;
            padding: 10px 25px;
            display: inline-block;
        }

        nav ul li a:hover{
            background-color: darksalmon;
        }

        nav ul li {
            float:left;  /*overflown bg color*/
        }

        .dropdown_list {
            background-color: lightpink;
            position:absolute;
            display: none;  /*to hide this ,should be displayed only when we hover over it*/
        }


        .dropdown_list a{
            display: block;
        }

        /*hover effect */

        .dropdown:hover .dropdown_list{
            display: block;
        }

    </style>
</head>
<body>

    <!-- Dropdown Navbar  ul=None if we want to remove *
     but doing it in CSS way   nav ul{} ul which is child of nav-->
    <nav>
        <ul>
            <li>
                <a href="#"><i class="fa fa-home"></i>Home</a>
            </li>
            <li class="dropdown">
                <a href="#"><i class="fa fa-newspaper-o"></i>News<i class="fa fa-caret-down"></i></a>
                <div class="dropdown_list">
                    <a href="#"><i class="fa fa-soccer-ball-o"></i>Sports</a>
                    <a href="#"><i class="fa fa-laptop"></i>Technology</a>
                    <a href="#"><i class="fa fa-image"></i> Arts</a>
                    <a href="#"><i class="fa fa-fire"></i> Others</a>
                </div>
            </li>
            <li>
                <a href="#"><i class="fa fa-address-book"></i>About Us</a>
            </li>
            <li>
                <a href="#"><i class="fa fa-phone"></i> Contact Us</a>
            </li>
            <li>
                <a href="#"><i class="fa fa-book"></i>Careers</a>
            </li>



            <li class="dropdown">
                <a href="#"><i class="fa fa-newspaper-o"></i>Courses<i class="fa fa-caret-down"></i></a>
                <div class="dropdown_list">
                    <a href="#"><i class="fa fa-bars"></i>Java</a>
                    <a href="#"><i class="fa fa-snapchat"></i>snapchat</a>
                    <a href="#"><i class="fa fa-image"></i> Arts</a>
                    <a href="#"><i class="fa fa-fire"></i> Others</a>
                </div>
            </li>

        </ul>
    </nav>

</body>
</html>
```


# Lecture 5    CSS buttons

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CSS Buttons</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="bootstrap/css/font-awesome.min.css">
    <style>
        body{
            font-family: "Comic Sans MS", sans-serif;
        }

        .btn{
            background-color: teal;
            color: whitesmoke;
            text-decoration: none;
            border: none;
            font-family: sans-serif;
            font-size: 19px;
            padding: 10px 20px;
            box-shadow: 0 0 5px darkcyan;
        }


        .btn:hover{
            opacity: 0.9;
            cursor: pointer;
        }

        /*outline button*/
        /*border will be white text color teal*/

        .btn-outline{
            color: teal;
            background-color: white;
            text-decoration: none;
            border: 1px solid teal;
            font-family: sans-serif;
            font-size: 19px;
            padding: 10px 20px;
            box-shadow: 0 0 5px darkcyan;
        }


        .bs-btn{
            color: white;
            text-decoration: none;
            font-family: Arial,sans-serif;
            font-size: 19px;
            padding: 10px 20px;
            border-radius: 50px;
            box-shadow: 0 0 5px lightgoldenrodyellow;
        }

        .primary{
            background-color: blueviolet;
        }
        .secondary{
            background-color: gray;
        }
        .warning{
            background-color: darkorange;
        }
        .danger{
            background-color: red;
        }

        .success{
            background-color: aquamarine;
        }



        .bs-btn-outline{

            text-decoration: none;
            font-family: Arial,sans-serif;
            font-size: 19px;
            padding: 10px 20px;
            border-radius: 50px;
            box-shadow: 0 0 5px lightgoldenrodyellow;
        }
        .outline-primary{
            border-color: blueviolet;
            color: blueviolet;
        }
        .outline-danger{
            border-color: red;
            color: red;
        }
        .outline-secondary{
            border-color: gray;
            color: gray;
        }
        .outline-success{
            border-color: teal;
            color: teal;
        }
        .outline-warning{
            border-color: orangered;
            color:orangered;
        }

        .outline-success:hover{
            background-color: teal;
            color:white;
        }

        .outline-warning:hover{
            background-color: red;
            color: white;
        }
        .outline-danger:hover{
            background-color: orangered;
            color:white;
        }
        .outline-secondary:hover{
            background-color: gray;
            color:white;
        }

    </style>
</head>
<body>


<!-- Simple Buttons -->
<h2>Simple Buttons</h2>
<div>
    <a href="#" class="btn">Link</a>
    <button class="btn">Button</button>
    <input class="btn" type="button" value="Input">
</div>


<!-- Simple Outline Buttons -->
<h2>Simple Outline Buttons</h2>
<div>
    <a href="#" class="btn-outline">Link</a>
    <button class="btn-outline">Button</button>
    <input class="btn-outline" type="button" value="Input">
</div>

<!-- Bootstrap Buttons -->
<h2>Bootstrap Buttons</h2>
<div>
    <button class="bs-btn primary">Primary</button>
    <button class="bs-btn secondary">Secondary</button>
    <button class="bs-btn success">Success</button>
    <button class="bs-btn warning">Warning</button>
    <button class="bs-btn danger">Danger</button>
</div>

<!-- Bootstrap Outline Buttons -->
<h2>Bootstrap Outline Buttons</h2>
<div>
    <button class="bs-btn-outline outline-primary">Primary</button>
    <button class="bs-btn-outline outline-secondary">Secondary</button>
    <button class="bs-btn-outline outline-success">Success</button>
    <button class="bs-btn-outline outline-warning">Warning</button>
    <button class="bs-btn-outline outline-danger">Danger</button>
</div>

</body>
</html>
```

# Box model

---

```html

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <STYLE>
        body{
            background: #eee;
        }
        #main-content{
            background-color: teal;
            width: 700px;
            margin: 0 auto;
            height: 500px;
            border-color: sandybrown;
            border-radius: 12px;
            padding: 20px;

        }

        .box{
            margin: 30px;
            padding: 30px;
            border:1px solid orange;
            width: 200px;
            height: 150px;
            float: left;
        }


        h1{
            text-align: center;
        }

    </STYLE>
</head>
<body>

    <div id="main-content">
        <h1>CSS Box Model</h1>

        <div class="box">This is the content</div>
        <div class="box">This is the content</div>
    </div>
</body>
</html>

```




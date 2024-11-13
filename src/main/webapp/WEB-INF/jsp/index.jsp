<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Note-Maker</title>

    <style>
        *{
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: "JetBrains Mono Medium", Courier, monospace;
        }
        nav{
            width:100%;
            height: 80px;
            background-color: goldenrod;
            display: flex;
            justify-content: center;
            align-items: center;
            padding: 2rem;
            font-size: 2rem;
        }

        .content{
            width:100%;
            height: 90vh;
            display: flex;
            justify-content: center;
            align-items: center;
            gap: 2rem;

        }

        .content a{
            text-decoration: none;
            color: black;
            border:3px solid black;
            padding: 1rem;
            border-radius: 10px;
            font-size: 2rem;
            font-weight: bold;
        }

        .content a:hover{
            background-color: goldenrod;
            color:white;
            border: 3px solid white;
        }
        h1{
            text-align: center;
            color:white;
        }
        sub{
            color:black;
            font-size: 1.7rem;
        }

    </style>

</head>
<body>
<nav>
    <h1>Welcome to Note Maker <sub>aka TO-DO List</sub></h1>
</nav>

<div class="content">
    <a href="create">Create Note</a>
    <a href="AllNotes">All Notes</a>
    <a href="update">Update Notes</a>
    <a href="delete">Delete Notes</a>
</div>
</body>
</html>
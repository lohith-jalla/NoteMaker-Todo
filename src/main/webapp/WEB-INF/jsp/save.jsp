<!DOCTYPE html>
<html>
<head>
    <title>Create New Note</title>
    <style>
        *{
            box-sizing: border-box;
            margin: 0;
            padding: 0;
            font-family: Arial, Helvetica, sans-serif;
            font-size: 1.2rem;
        }
        body{
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            background-color: white;
        }
        form{
            width: 30rem;
            height: 30rem;
            border: 1px solid black;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            background-color: gold;
            border-radius: 20px;
        }
        input{
            border: 1px solid black;
            padding:0.3rem;
            border-radius: 0.6rem;
        }
        textarea{
            border: 1px solid black;
            padding:0.7rem;
            border-radius: 0.6rem;
        }
        button{
            border: 1px solid black;
            padding:0.4rem;
            border-radius: 0.4rem;
            cursor: pointer;
        }
        button:hover{
            background-color: black;
            color:white;
        }
        a{
            color:black;
            margin-top:2rem;
        }
    </style>
</head>
<body>

<h2 style="font-size: 2rem">Create New Note</h2>

<form method="post">
    <label for="title">Title:</label>
    <input type="text" id="title" name="title" required /><br/><br/>

    <label for="content">Content:</label>
    <textarea id="content" name="content" required></textarea><br/><br/>

    <button type="submit">Create Note</button>

</form>
<a href="/index"><button>Back</button></a>


</body>
</html>

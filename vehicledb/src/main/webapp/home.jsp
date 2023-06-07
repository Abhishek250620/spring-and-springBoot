<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="addVehicle">
        <input type="text" name="vid" placeholder="Vehicle ID"><br>
        <input type="text" name="color" placeholder="Vehicle COLOR"><br>
        <input type="text" name="vname" placeholder="Vehicle NAME"><br>
        <input type="text" name="year" placeholder="Vehicle YEAR"><br>
        <input type="submit">
    </form><br>
    <h2>-----------Mention ID for Details------------------</h2>
    <form action="getById">
        <input type="text" name="vid" placeholder="Enter Vid">
        <input type="submit">
       
    </form>
    <h3>${value}</h3>

    <h2>-----------Mention Color for Details------------------</h2>
    <form action="getByColor">
        <input type="text" name="color" placeholder="Enter color">
        <input type="submit">
       
    </form>
    <h3>${value1}</h3>

    <h2>-----------Mention Year for Details------------------</h2>
    <form action="vehicleAfterTwenty">
        <input type="submit">
    </form>
    <h3>${value2}</h3>
</body>
</html>
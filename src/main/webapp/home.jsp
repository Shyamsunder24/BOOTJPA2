<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html  public "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Hello World JSP</title>
</head>
<body>
<h1> Add ALien</h1>
    <form action="addAlien">
        <input type="text" name="aid"><br>
        <input type="text" name="aname"><br>
        <input type="text" name="tech"><br>
        <input type="submit"><br>
    </form>
    <h1> Get Alien</h1>
    <form action="getAlien">
        <input type="text" name="aid"><br>
        <input type="submit"><br>
    </form>
    <h1> Update Alien</h1>
    <form action="updateAlien">
        <input type="text" name="aid"><br>
        <input type="text" name="aname"><br>
        <input type="text" name="tech"><br>
        <input type="submit"> <br>
    </form>
    <h1> Delete Alien</h1>
    <form action="deleteAlien">
        <input type="text" name="aid"><br>
        <input type="submit"> <br>
    </form>
    <h1> Find By Tech</h1>
    <form action="findBytech">
        <input type="text" name="aid"><br>
        <input type="submit"> <br>
    </form>
</body>
</html>
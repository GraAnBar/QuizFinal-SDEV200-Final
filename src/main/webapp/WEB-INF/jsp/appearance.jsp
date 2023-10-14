<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>Finals Test</title>
    </head>
    <body>
        <h1>We all must ${message} grade book</h1>
        
        <form action="./attendaceAccepted" method="GET">
            <p>Chris: <input type="checkbox" name="person1" value="first"> Check box if present<br>
            <p>Jill: <input type="checkbox" name="person2" value="second"> Check box if present<br>
            <p>Ashley: <input type="checkbox" name="person3" value="third"> Check box if present<br>
            <p>Leon: <input type="checkbox" name="person4" value="fourth"> Check box if present<br>
            <p><input type="reset" value="Clear"></p>
        </form>
        
        <p>Here are the list of <a href="./testers">students</a> that need to take it.</p>
        <p>If you are on that list, then go <a href="./tardy">here</a> to take your Final</P>
        <p>If you want to know your grade for the <a href="./finalGrade">Final</a></p>
        <p>Or you can go back to the <a href=".">home page</a></p>
    </body>
</html>

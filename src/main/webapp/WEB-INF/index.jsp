<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>The Code</title>
</head>
<body>
${note}
<h4>What is the code?</h4>
    <form action="/code" method="post">
        <input type="text" name="code">
        <input type="submit">
    </form>
</body>
</html>
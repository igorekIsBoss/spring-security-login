<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Registration form</title>
    </head>
    <body>
    <#--<input type="hidden" th:name="${_csrf.parameterName}" th:value="${_csrf.token}" />-->
    <form name="user" action="/login" method="post">
        Firstname: <input type="text" name="username" />	<br/>
        Password: <input type="text" name="password" />		<br/>
        <input type="submit" value="login" />
    </form>
    </body>
</html>
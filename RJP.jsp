<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>ユーザー登録</title>
</head>
<body>
    <h1>ユーザー登録</h1>
    <form method="post" action="RJPServlet"> 
        ユーザー名<input type="text" name="name"><br>
        好きなゲーム<input type="text" name="fav"><br>
        <input type="submit" value="登録" />
    </form>
</body>
</html>
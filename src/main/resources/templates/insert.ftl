<!DOCTYPE html>
<html lang="zh_CN">
<head>
    <meta charset="UTF-8">
    <title>添加</title>
    <base href="http://localhost:8080/templates">
</head>
<body>
<h1 align="center">插入</h1>
<form action="/user/insert" method="post">
<table align="center">
    <tr>
        <td>用户姓名</td>
        <td><input type="text" name="username" value="张三"></td>
    </tr>
    <tr>
        <td>用户性别</td>
        <td><input type="text" name="sex"></td>
    </tr>
    <tr>
        <td>用户地址</td>
        <td><input type="text" name="address"></td>
    </tr>
    <tr>
        <td>用户生日</td>
        <td><input type="date" name="birthday"></td>
    </tr>
    <tr>
        <td><input type="submit"></td>
    </tr>
</table>
</form>
<a href="/user/choice">返回</a>
</body>
</html>
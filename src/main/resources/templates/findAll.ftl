<!DOCTYPE html>
<html lang="zh_CN">
<head>
    <meta charset="UTF-8">
    <title>$Title$</title>
</head>
<body>
<#list list as user>
    <table border="2px" align="center">
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
<#--            <td>${user.birthday}</td>-->
            <td>${user.sex}</td>
<#--            <td>${user.address}</td>-->
            <td><button><a href="/ftl/update">修改</a></button></td>
        </tr>
    </table>
</#list>
<br>
<a href="/user/choice" >返回</a>
</body>
</html>
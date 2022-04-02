<!DOCTYPE html>
<html lang="zh_CN">
<head>
    <meta charset="UTF-8">
    <title>$Title$</title>
</head>
<body>
<#list list as user>
    <div>${user}</div><button><a href="/user/update" >修改</a></button>
</#list>
<br>
<a href="/user/choice" >返回</a>
</body>
</html>
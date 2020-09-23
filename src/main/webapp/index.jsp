<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="${locale}"/>
<fmt:setBundle basename="property.text"/>
<html>
<head>
    <title><fmt:message key="label.title"/></title>
</head>
<body>
<fmt:message key="label.welcome"/>
<form name="switchLocaleForm" method="post" action="controller">
    <input type="hidden" name="commandName" value="switch_locale_command">
    <button name="locale" value="ru_RU">rus</button>
    <button name="locale" value="en_US">en</button>
</form>
<hr/>
<fmt:message key="footer.copyright"/>
</body>
</html>

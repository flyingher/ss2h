<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>register</title>
</head>
<body>
	<s:form action="regAction">
		<s:textfield name="username" label="username"></s:textfield>
		<s:password name="password" label="password"></s:password>
		<s:textfield name="birthday" label="birthday"></s:textfield>
		<s:submit value="submit"></s:submit>
	</s:form>
</body>
</html>
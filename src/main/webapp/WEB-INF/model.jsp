<%@ page import="com.Minko.model.Model"%>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true"  isELIgnored="false" %>
model=${model}
<br>
model.list=${model.list}
<br>
foreach1=
<%
	Model model = (Model) request.getAttribute("model");
	for (String item : model.getList()) {
%>
<%=item%>
||
<%
	}
%>
<br>
foreach2=
<%
	model = (Model) request.getAttribute("model");
	for (String item : model.getList()) {
		pageContext.setAttribute("item", item);
%>
${item } ||
<%
	}
%>
<br>
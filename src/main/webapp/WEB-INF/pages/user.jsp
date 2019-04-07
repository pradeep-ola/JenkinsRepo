<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1 style="color:yellow; background-color:blue; text-align:center">MultiAction Controller Form</h1>

<h1 style=" background-color:green;text-align:center">

<form name="form" method="POST">
Sno:<input type="text" name="sno"><br>
Sname:<input type="text"  name="sname"><br>
Sadd:<input type="text" name="sadd"><br>

<button value="add" onclick="sendRequest(this.value)">Add</button>
<button value="modify" onclick="sendRequest(this.value)">Modify</button>
<button value="remove" onclick="sendRequest(this.value)">Remove</button>
<button value="show" onclick="sendRequest(this.value)">Show</button>
<br>

<%-- ${operation} :-is  Running Boom---------|||||----- --%>
</h1>

</form>
<h3 style="color:yellow; background-color:black; text-align:center" >
<c:if test= "${!empty operation }">
	${operation } => is performation operation
	</c:if>
	<c:if test= "${!empty cmdData }">
	${cmdData }
	</c:if>
</h3>
<script type="text/javascript">
	function sendRequest(cap) {
		if (cap=="add")
		{
			form.action="add.htm";
		}
		else if(cap=="modify")
		{
			form.action="modify.htm";
		}
		else if(cap=="remove")
		{
			form.action="remove.htm";
		}
		else if(cap=="show")
		{
			form.action="show.htm";	
		}
		else
		{
			form.action="invalid.htm";
		}
		form.submit();
	}
</script>

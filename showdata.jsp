<%@page import="com.example.model.Product"%>
<%@page import="java.util.List"%>
<table border="1">
<tr><td>ID</td><td>NAME</td><td>PRICE</td><td>DATE</td><td>CATEGORY</td></tr>
<div align="center">
<%
List<Product>list=(List<Product>)application.getAttribute("list");

if(list.size()>0){
	
	for(Product p:list){%>
		
		<tr><td><%=p.getId() %></td><td><%=p.getName() %></td><td><%=p.getPrice() %></td><td><%=p.getDates() %></td><td><%=p.getCategory()%></td></tr>
		
	<%}
	
}

%>

</div>
</table>
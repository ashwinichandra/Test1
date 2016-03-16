<%-- 
    Document   : index
    Created on : Mar 15, 2016, 9:25:00 PM
    Author     : ashwiniramachandra
--%>

<%@page import="java.util.List"%>
<%@page import="hibernate.CustomerHelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <%  CustomerHelper helper = new CustomerHelper();
            List list = helper.getCustomerNames();
            for(int i=0; i < list.size();i++)
                out.println(list.get(i));
                %>

    </body>
</html>

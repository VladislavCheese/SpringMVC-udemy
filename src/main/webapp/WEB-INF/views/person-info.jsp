<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>
    Person Information
</h2>
<form:form action = "save_person" modelAttribute="person">
    <form:hidden path = "peopleId"/>

    Name<form:input path="name"/>
    <br><br>
    Surname<form:input path="surname"/>
    <br><br>
    Department<form:input path="department"/>
    <br><br>
    Salary<form:input path="salary"/>
    <br><br>
    <input type = "submit", value="save">
</form:form>
</body>
</html>
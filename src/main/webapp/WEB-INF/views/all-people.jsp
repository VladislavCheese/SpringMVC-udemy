<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>
    All People
</h2>
<br>
<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Operations</th>
    </tr>
    <c:forEach var="person" items="${allPeople}">
        <c:url var="updateButton" value = "/update_info">
            <c:param name = "personId" value = "${person.peopleId}"/>
        </c:url>
        <c:url var="deleteButton" value = "/delete_person">
            <c:param name = "personId" value = "${person.peopleId}"/>
        </c:url>
        <tr>
        <td>%{person.name}</td>
        <td>%{person.surname}</td>
        <td>%{person.department}</td>
        <td>%{person.salary}</td>
        <td>
            <input type = "button" value = "Update"
            onclick="window.location.href = '${updateButton}'"/>

            <input type = "button" value = "Delete"
            onclick="window.location.href = '${deleteButton}'"/>
        </td>
        </tr>
    </c:forEach>
    <br>

</table>
<input type = "button" value = "add"
       onclick="window.location.href = 'add_new_person'"/>
</body>
</html>
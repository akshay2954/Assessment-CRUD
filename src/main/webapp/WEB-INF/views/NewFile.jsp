<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer List</title>
    <!-- Add your CSS link here -->
</head>
<body>
    <h2>Customer List</h2>
    <table>
        <!-- Table header -->
        <thead>
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <!-- Add more columns as needed -->
            </tr>
        </thead>
        <!-- Table body -->
        <tbody id="customerTableBody">
            <!-- Customer rows will be populated dynamically using JSP or JavaScript -->
            <c:forEach var="customer" items="${customerList}">
                <tr>
                    <td>${customer.id}</td>
                    <td>${customer.firstName}</td>
                    <td>${customer.lastName}</td>
                    <td>${customer.email}</td>
                    <!-- Add more columns as needed -->
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <button onclick="openAddCustomerForm()">Add Customer</button>
    <!-- Add your JS script here -->

    <!-- Example of including a JavaScript file -->
    <script type="text/javascript" src="<c:url value='/resources/js/your-script.js' />"></script>
</body>
</html>l>
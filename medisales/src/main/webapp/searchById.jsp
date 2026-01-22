<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Medicine Details</title>
    <style>
        table {
            border-collapse: collapse;
            width: 80%;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: center;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>

<h2>Search Medicine By ID</h2>

<form action="getMedicine">
    Enter Medicine ID:
    <input type="text" name="medicineId">
    <input type="submit" value="Search">
</form>

<br>

<!-- ❌ If no data -->
<c:if test="${not empty error}">
    <h3 style="color:red">${error}</h3>
</c:if>

<!-- ✅ If data found -->
<c:if test="${not empty medicine}">
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
            <th>Combination</th>
            <th>Expiry Date</th>
            <th>MG</th>
            <th>Actions</th>
        </tr>

        <tr>
            <td>${medicine.id}</td>
            <td>${medicine.medicineName}</td>
            <td>${medicine.price}</td>
            <td>${medicine.combination}</td>
            <td>${medicine.expDate}</td>
            <td>${medicine.mg}</td>
            <td>
                <a href="getMedicineInfo/${medicine.id}">Edit</a> |
                <a href="delete/${medicine.id}">Delete</a>
            </td>
        </tr>
    </table>
</c:if>

</body>
</html>

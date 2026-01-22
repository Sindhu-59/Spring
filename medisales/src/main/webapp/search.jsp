<c:if test="${not empty medicineList}">
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
        <th>Combination</th>
        <th>Exp Date</th>
        <th>MG</th>
        <th>Action</th>
    </tr>

    <c:forEach items="${medicineList}" var="m">
        <tr>
            <td>${m.id}</td>
            <td>${m.medicineName}</td>
            <td>${m.price}</td>
            <td>${m.combination}</td>
            <td>${m.expDate}</td>
            <td>${m.mg}</td>
            <td>
                <a href="getMedicineInfo/${m.id}">Edit</a> |
                <a href="delete/${m.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</c:if>

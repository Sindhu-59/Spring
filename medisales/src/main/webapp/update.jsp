<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html lang="en">
<body>
<h2>Medi Sales</h2>

<form action="<%= request.getContextPath() %>/updateMedicine" method="post">
Id:<input type="number" name="id" value="${medicineById.id}" ><br>
Medicine Name:<input type="text" name="medicineName" value="${medicineById.medicineName}" ><br>
Price:<input type="text" name="price" value="${medicineById.price}"><br>
Mg:<input type="text" name="mg" value="${medicineById.mg}"><br>
Combination:<input type="text" name="combination" value="${medicineById.combination}"><br>
ExpiryDate:<input type="text" name="expDate" value="${medicineById.expDate}"><br>
<input type="submit" value="send">
</form>
</body>
</html>

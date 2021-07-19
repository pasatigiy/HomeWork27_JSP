
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calc</title>

</head>
<body>
<jsp:include page="_header.jsp"/>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-sm-4">
            <form action="/calc" method="post">

                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Number 1</label>
                    <input type="number" name="num1" class="form-control" id="exampleInputPassword1" required>
                </div>
                <select name="operation" class="form-select" aria-label="Default select example" required>
                    <option  disabled>Open this select menu</option>
                    <option value="sum">Sum</option>

                </select>
                <div class="mb-3">
                    <label for="exampleInputPassword2" class="form-label">Number 1</label>
                    <input type="number" name="num2" class="form-control" id="exampleInputPassword2" required>
                </div>

                <button type="submit" class="btn btn-primary">Calc</button>
            </form>
            <%
            if (request.getAttribute("result") != null){
             %>
            <div class="alert alert-primary" role="alert">
                <p>${requestScope.result}</p>
            </div>
                <%
            }
            %>

        </div>
    </div>
</div>

</body>
</html>

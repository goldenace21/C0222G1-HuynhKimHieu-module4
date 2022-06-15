<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/15/2022
  Time: 11:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container my-5 mx auto">
    <form action="/save" method="get">
        <div class="col-lg-4 mx-auto">
            <center><h2>Sandwich condiments</h2></center>
            <div class="row my-4">
                <div class="col-lg-3 form-check form-switch">
                    <input name="condiment" value="Lettuce" class="form-check-input" type="checkbox" id="a">
                    <label class="form-check-label" for="a">Lettuce</label>
                </div>
                <div class="col-lg-3 form-check form-switch">
                    <input name="condiment" value="Tomato" class="form-check-input" type="checkbox" id="s">
                    <label class="form-check-label" for="s">Tomato</label>
                </div>
                <div class="col-lg-3 form-check form-switch">
                    <input name="condiment" value="Mustard" class="form-check-input" type="checkbox" id="d">
                    <label class="form-check-label" for="d">Mustard</label>
                </div>
                <div class="col-lg-3 form-check form-switch">
                    <input name="condiment" value="Sprouts" class="form-check-input" type="checkbox" id="c">
                    <label class="form-check-label" for="c">Sprouts</label>
                </div>
            </div>
            <div class="row my-4">
                <div style="width: 40%" class="mx-auto">
                    <input type="submit" class="mx-auto btn-check" id="btn-check">
                    <label class=" btn btn-primary" for="btn-check">Save sandwich</label>
                </div>
            </div>
        </div>
    </form>
</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
        integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
        integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
        crossorigin="anonymous"></script>
</html>

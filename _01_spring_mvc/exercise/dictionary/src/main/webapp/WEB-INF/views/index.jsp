<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/14/2022
  Time: 1:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>dictionary</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

  </head>
  <body>
  <div class="container mx-auto">
    <div class="col-lg-4 mx-auto my-5">
      <form action="/dictionary" method="post">
        <div class="mb-3">
          <center><h2>Dictionary</h2></center>
          <center><h5>vietnamese <-> english</h5></center>
          <label for="exampleInputEmail1" class="form-label">Word</label>
          <input value="${word}" name="word" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter word">
          <label class="form-label my-2"><small>result: ${result}</small></label>
        </div>
        <button type="submit" class="btn btn-primary">translate</button>
      </form>
    </div>
  </div>
  </body>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>

</html>

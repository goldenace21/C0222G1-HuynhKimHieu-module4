<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>
<div class="col-10 mx-auto">
    <div class="row">
        <h5 class="mx-auto mt-3">TỜ KHAI Y TẾ</h5>
    </div>
    <div class="row">
        <h6 class="mx-auto">ĐÂY LÀ TÀI LIỆU QUAN TRỌNG,THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ
            LIÊN LẠC KHI CẦN THIẾT ĐỂ PHÒNG CHỐNG DỊCH BỆNH TRUYỀN NHIỄM</h6>
    </div>
    <div class="row">
        <h6 class="mx-auto" style="color: red;">khuyến cáo: Khai báo thông tin sai là vi phạm pháp luật Việt Nam và có
            thể xử lý hình
            sự</h6>
    </div>
    <form:form modelAttribute="medical" action="/create" method="post">
        <div class="row mt-3">
            <p>Họ tên(ghi chữ IN HOA)<span style="color: red">(*)</span></p>
        </div>
        <div class="row">
            <form:input cssStyle="width: 100%" path="name"/>
        </div>
        <div class="row mt-3">
            <div class="col-4">
                <div class="row">
                    <p>Năm sinh<span style="color: red">(*)</span></p>
                </div>
                <div class="row">
                    <form:select cssStyle="width: 95%" path="birthday">
                        <form:options items="${listBirthDay}"></form:options>
                    </form:select>
                </div>
            </div>
            <div class="col-4">
                <div class="row">
                    <p>Giới tính<span style="color: red">(*)</span></p>
                </div>
                <div class="row">
                    <form:select cssStyle="width: 95%" path="gender">
                        <form:options items="${listGender}"></form:options>
                    </form:select>
                </div>
            </div>
            <div class="col-4">
                <div class="row">
                    <p>Quốc tịch<span style="color: red">(*)</span></p>
                </div>
                <div class="row">
                    <form:select cssStyle="width: 95%" path="nationality">
                        <form:options items="${listNationality}"></form:options>
                    </form:select>
                </div>
            </div>
        </div>
    </form:form>
</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF"
        crossorigin="anonymous"></script>
</html>
<%--private String name;--%>
<%--private String birthday;--%>
<%--private boolean gender;--%>
<%--private String nationality;--%>
<%--private String idNumber;--%>
<%--private String transport;--%>
<%--private String idTransport;--%>
<%--private String seats;--%>
<%--private String startDay;--%>
<%--private String endDay;--%>
<%--private String historyMove;--%>

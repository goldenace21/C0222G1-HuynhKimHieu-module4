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
        <div class="row mt-4">
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
                    <form:select cssStyle="width: 100%" path="nationality">
                        <form:options items="${listNationality}"></form:options>
                    </form:select>
                </div>
            </div>
        </div>
        <div class="row mt-4">
            <p>Số hộ chiếu CMND hoặc giấy thông hành hợp pháp khác<span style="color: red">(*)</span></p>
        </div>
        <div class="row">
            <form:input cssStyle="width: 100%" path="idNumber"/>
        </div>
        <div class="row mt-4">
            <p>Thông tin đi lại<span style="color: red">(*)</span></p>
        </div>
        <div class="row">
            <form:radiobuttons cssStyle="margin: 0 1em;" path="transport" items="${listTransport}"/>
        </div>
        <div class="row mt-4">
            <div class="col-6">
                <div class="row">
                    <p>Số hiệu phương tiện<span style="color: red">(*)</span></p>
                </div>
                <div class="row">
                    <form:input cssStyle="width: 95%" path="idTransport"/>
                </div>
            </div>
            <div class="col-6">
                <div class="row">
                    <p>Số ghế<span style="color: red">(*)</span></p>
                </div>
                <div class="row">
                    <form:input cssStyle="width: 100%" path="seats"/>
                </div>
            </div>
        </div>
        <div class="row mt-4">
            <div class="col-6">
                <div class="row">
                    <p>Ngày khởi hành<span style="color: red">(*)</span></p>
                </div>
                <div class="row">
                    <div class="col-4 p-0">
                        <form:select cssStyle="width: 90%" path="startDay">
                            <form:options items="${listStartDay}"></form:options>
                        </form:select>
                    </div>
                    <div class="col-4 p-0">
                        <form:select cssStyle="width: 90%" path="startMonth">
                            <form:options items="${listStartMonth}"></form:options>
                        </form:select>
                    </div>
                    <div class="col-4 p-0">
                        <form:select cssStyle="width: 90%" path="startYear">
                            <form:options items="${listStartYear}"></form:options>
                        </form:select>
                    </div>
                </div>
            </div>
            <div class="col-6">
                <div class="row">
                    <p>Ngày kết thúc<span style="color: red">(*)</span></p>
                </div>
                <div class="row">
                    <div class="col-4 p-0">
                        <form:select cssStyle="width: 90%" path="endDay">
                            <form:options items="${listEndDay}"></form:options>
                        </form:select>
                    </div>
                    <div class="col-4 p-0">
                        <form:select cssStyle="width: 90%" path="endMonth">
                            <form:options items="${listEndMonth}"></form:options>
                        </form:select>
                    </div>
                    <div class="col-4 p-0">
                        <form:select cssStyle="width: 90%" path="endYear">
                            <form:options items="${listEndYear}"></form:options>
                        </form:select>
                    </div>
                </div>
            </div>
        </div>
        <div class="row mt-4">
            <p>Trong vòng 14 ngày qua, Anh/chị có đến tỉnh/thành phố nào không<span style="color: red">(*)</span></p>
        </div>
        <div class="row">
            <form:textarea cssStyle="width: 100%" path="historyMove"/>
        </div>
        <center>
            <input class="mt-4" style="background: #17cc17; border-radius: 1em; border: none; color: #fff;"
                   type="submit"
                   value="Gửi tờ khai">
        </center>
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
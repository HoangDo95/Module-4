<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 15-Jul-22
  Time: 11:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3 class="col-lg-12 text-center align-content-center">TỜ KHAI Y TẾ</h3>
<h5>ĐÂY LÀ TÀI LIỆU QUAN TRỌNG ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN THIẾT ĐỂ PHÒNG CHỐNG DỊCH BỆNH TRUYỀN
    NHIỄM</h5>
<span class="text-danger"> Khuyến cáo : Khai báo thông tin sai là vi phạm pháp luật Việt Nam và có thể bị xử lý hình sự</span>

<div>
    <%--@elvariable id="declaration" type=""--%>
    <form:form action="/create" modelAttribute="declaration" method="post">
        <table class="table-primary col-lg-12">
            <tr class="col-lg-12">
                <label>Id <span class="text-danger"> (*)</span></label>
            </tr>

            <tr class="col-lg-12">
                <td class="col-lg-12"><form:input path="id"/></td>
            </tr>

            <tr class="col-lg-12">
                <td class="col-lg-12"><label>Họ tên(ghi chữ in hoa) <span class="text-danger">(*)</span></label></td>
            </tr>

            <tr class="col-lg-12">
                <td class="col-lg-12"><form:input path="name"/></td>
            </tr>

            <tr class="col-lg-12">
                <td class="col-lg-3">Năm sinh <span class="text-danger">(*)</span></td>
                <td class="col-lg-3">Giới tính <span class="text-danger">(*)</span></td>
                <td class="col-lg-3">Quốc tịch <span class="text-danger">(*)</span></td>
            </tr>

            <tr class="col-lg-12">
                <td class="col-lg-3">
                    <form:select path="birthYear" items="${birthdayList}"> </form:select>
                </td>
                <td class="col-lg-3">
                    <form:select path="gender" items="${genderList}"> </form:select>
                </td>
                <td class="col-lg-3">
                    <form:select path="national" items="${nalionalityList}"> </form:select>
                </td>
            </tr>

            <tr class="col-lg-12">
                <label for="idCard">Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp khác
                    <span class="text-danger">(*)</span>
                </label>
            </tr>

            <tr class="col-lg-12">
                <form:input path="idCard" id="idCrad" cssClass="col-lg-12"/>
            </tr>

            <tr class="col-lg-12">
                Thông tin đi lại <span class="text-danger">(*)</span>
            </tr>

            <tr class="col-lg-12">
                <form:radiobuttons path="transportType" items="${transportType}"/>
            </tr>


            <tr class="col-lg-12">
                <td class="col-lg-6"> Số hiệu phương tiện</td>
                <td class="col-lg-6">Số ghế</td>
            </tr>

            <tr class="col-lg-12">
                <td class="col-lg-6> <form:input path="transportId"/></td>
                           <td class=" col-lg-6><form:input path="seat"/></td>
            </tr>

            <tr class="col-lg-12">
                <td class="col-lg-6 ">Ngày khởi hành <span class="text-danger">(*)</span></td>
                <td class="col-lg-6">Ngày kết thúc <span class="text-danger">(*)</span></td>
            </tr>

            <tr class="col-lg-12">

                <td class="col-lg-6">
                    <form:select path="inputDay">
                        <form:options items="${inputDay}"></form:options>
                    </form:select>

                    <form:select path="inputMonth">
                        <form:options items="${inputMonth}"></form:options>
                    </form:select>

                    <form:select path="inputYear">
                        <form:options items="${inputYear}"></form:options>
                    </form:select>
                </td>

                <td class="col-lg-6">
                    <form:select path="outDay">
                        <form:options items="${outDay}"></form:options>
                    </form:select>

                    <form:select path="outMonth">
                        <form:options items="${outMonth}"></form:options>
                    </form:select>

                    <form:select path="outYear">
                        <form:options items="${outYear}"></form:options>
                    </form:select>
                </td>

            </tr>

            <tr class="col-lg-12">
                trong vòng 14 ngày qua , Anh/chị có đi đến tỉnh thành phố nào? <span class="text-danger">(*)</span>
            </tr>

            <tr class="col-lg-12">
                <form:input path="other"/>
            </tr>

            <tr>
                <button type="submit" class="bg-primary">Đăng kí</button>
            </tr>

        </table>
    </form:form>

</div>
</body>
</html>

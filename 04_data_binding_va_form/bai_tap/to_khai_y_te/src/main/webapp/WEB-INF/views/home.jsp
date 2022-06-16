<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" action="addMedical" modelAttribute="medical">
    <div>
        <h2> Tờ khai y tế </h2>
        <h4> Đây là tài liệu quan trọng, thông tin của anh/chị sẽ giúp cơ quan y tế liên hệ khi cần thiết để
            phòng chống dịch bệnh truyền nhiễm
        </h4>
        <h5> Khuyến cáo: Khai báo thông tin sai là vi phạm pháp luật Việt Nam và có thể xử lý hình sự</h5>
    </div>
    <div>
        <label> Họ tên </label>
        <form:input path="name"></form:input>
    </div>
    <div>
        <div>
            <label>Năm sinh </label>
            <form:select path="age">
                <form:options items="${listYear}"></form:options>
            </form:select>
        </div>
        <div>
            <label> Giới tính </label>
            <form:select path="gender">
                <form:options items="${listGender}"></form:options>
            </form:select>
        </div>
        <div>
            <label> Quốc tịch </label>
            <form:select path="languages">
                <form:options items="${listLanguages}"></form:options>
            </form:select>
        </div>
    </div>
    <div>
        <label> Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp khác </label>
        <form:input path="idCard"></form:input>
    </div>
    <div>
        <label> Thông tin đi lại: </label>
        <form:radiobutton path="travel" value="Tàu bay"></form:radiobutton> Tàu bay
        <form:radiobutton path="travel" value="Tàu thuyền"></form:radiobutton> Tàu thuyền
        <form:radiobutton path="travel" value="Ô tô"></form:radiobutton> Ô tô
        <form:radiobutton path="travel" value="Khác"></form:radiobutton> Khác (Ghi rõ)
    </div>
    <div>
        <div>
            <label> Số hiệu phương tiện </label>
            <form:input path="vehicleNumber"></form:input>
        </div>
        <div>
            <label> Số ghế</label>
            <form:input path="callNumber"></form:input>
        </div>
    </div>
    <div>
        <div>
            <label> Ngày khởi hành</label>
            <form:input path="startDay" type="date"></form:input>
        </div>
        <div>
            <label> Ngày kêt thúc</label>
            <form:input path="endDate" type="date"></form:input>
        </div>
    </div>
    <div>
        <label> Trong 14 ngày anh/chị có đi đến tỉnh/thành phố nào không?</label>
        <form:input path="status"></form:input>
    </div>
    <button value="submit">Gửi</button>
</form:form>
</body>
</html>

$(document).ready(function () {
    $("#createCustomer").on("click", function (event) {
        let id = $('#id').val();
        let name = $('#name').val();
        let gender = $('#gender').val();
        let id_card = $('#id_card').val();
        let phone = $('#phone').val();
        let email = $('#email').val();
        let address = $('#address').val();
        let idCustomerType = $('#customerType').val();
        let newCustomer = {
            id: id,
            name: name,
            gender: gender,
            id_card: id_card,
            phone: phone,
            email: email,
            address: address,
            status: 0,
            customerType: {
                id: idCustomerType
            }

        };
        $.ajax({
            type: "POST",
            url: `/customerRest/save`,
            data: JSON.stringify(newCustomer),
            success:successHandler ,

            error: function (){
                alert(" them that bai")
            }
        });
        //chặn sự kiện mặc định của thẻ
        event.preventDefault();
    });
})

function successHandler() {
    $.ajax({
        type: "GET",
        url: "/customerRest",
        success: function (data) {
            // hien thi danh sach o day
            let content = '';
            for (let i = 0; i < data.length; i++) {
                content += getCustomer(data[i]);
            }
            document.getElementById('listCustomer').innerHTML = content;

        }
    });
}

function getCustomer(customer) {
    return `
        <tr>
        <td> ${customer.id }</td>
        <td> ${customer.name }</td>
        <td> ${customer.birthday }</td>
        <td> ${customer.gender }</td>
        <td> ${customer.id_card }</td>
        <td> ${customer.phone }</td>
        <td> ${customer.email }</td>
        <td> ${customer.address }</td>
        <td> ${customer.status }</td>
        <td> ${customer.customerType.name }</td>
</tr>
    `;
}
$(document).ready(function () {
    //sư kiện nào thực hiện Ajax
    $("#buttonSearch").on("click",".search", function (event) {
        debugger
        let name = $('#nameSearch').val();
        $.ajax({
            type: "GET",
            url: `/customerRest/search/${name}`,
            success: function (data) {
                console.log(data)
                // hien thi danh sach o day
                let content = ``;
                for (let i = 0; i < data.length; i++) {
                    content += getCustomer(data[i]);
                }
                console.log(content)
                document.getElementById('tableCustomer').innerHTML = content;
            },
            error: function () {
                alert('Khong tim thay doi tuong')
            }
        });

        //chặn sự kiện mặc định của thẻ
        event.preventDefault();
    });
});



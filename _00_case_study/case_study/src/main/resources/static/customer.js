
function createCustomer() {
    let id = $('#id').val();
    let idCustomer = $('#idCustomer').val();
    let name = $('#name').val();
    let birthday = $('#birthday').val();
    let gender = $('#gender').val();
    let idCard = $('#idCard').val();
    let phoneNumber = $('#phoneNumber').val();
    let email = $('#email').val();
    let address = $('#address').val();
    let idType = $('#idType').val();
    let newCustomer = {
        id: id,
        idCustomer: idCustomer,
        name: name,
        birthday: birthday,
        gender: gender,
        idCard: idCard,
        phoneNumber: phoneNumber,
        email: email,
        address: address,
        deleteStatus: 0,
        customerType: {
            customerTypeId: idType
        }
    };
    $.ajax({
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        type: "POST",
        data: JSON.stringify(newCustomer),
        url: "/rest-customer",
        success: successHandler,
        error: function (e) {
            document.getElementById("idCustomer").value = e.responseJSON.idCustomer;
        }
    });
    event.preventDefault();
}

function successHandler() {
    $.ajax({
        type: "GET",
        url: "/rest-customer",
        success: function (data) {
            let content = '';
            for (let i = 0; i < data.content.length; i++) {
                content += getCustomer(data.content[i]);
            }
            document.getElementById('customer-list').innerHTML = content;
            document.getElementById("idCustomer").value = ""
            document.getElementById("name").value = ""
            document.getElementById("birthday").value = ""
            document.getElementById("idCard").value = ""
            document.getElementById("phoneNumber").value = ""
            document.getElementById("email").value = ""
            document.getElementById("address").value = ""
            $("#create").removeClass("in");
            $(".modal-backdrop").remove();
            $("#create").hide();


        }
    });
}

function getCustomer(customer) {
    return `<tr>
            <td>${customer.idCustomer}</td>
            <td>${customer.name}</td>
            <td>${customer.birthday}</td>
            <td>${customer.gender}</td>
            <td>${customer.idCard}</td>
            <td>${customer.phoneNumber}</td>
            <td>${customer.address}</td>
            <td>${customer.customerType.customerTypeName}</td>
            <td><button href="${customer.id}" type="button" class="btn btn-outline-info btn-sm editCustomer">update</button></td>
            <td><button data-id="${customer.id}" data-name="${customer.name}" onclick="info(this.getAttribute('data-id'),this.getAttribute('data-name'))" type="button" class="btn btn-outline-danger btn-sm" data-toggle="modal" data-target="#delete">delete</button>
            </td>`;
}

function searchCustomer() {
    debugger
    let name = $('#search-name').val();
    $.ajax({
        type: "GET",
        url: `/rest-customer`,
        data: jQuery.param({name: name}),
        success: function (data) {
            debugger
            let content = '';
            for (let i = 0; i < data.content.length; i++) {
                content += getCustomer(data.content[i]);
            }
            document.getElementById('customer-list').innerHTML = content;
        },
        error: function (data) {
        }
    });
}

$(document).ready(function () {
    $("#customer-list").on("click", ".editCustomer", function (event) {
        let a = $(this);
        let id = a.attr("href");
        $.ajax({
            type: "GET",
            url: `/rest-customer/${id}`,
            success: function (data) {
                debugger
                document.getElementById("id").value = data.id
                document.getElementById("idCustomer").value = data.idCustomer,
                document.getElementById("name").value = data.name,
                document.getElementById("birthday").value = data.birthday,
                document.getElementById("gender").value = data.gender,
                document.getElementById("idCard").value = data.idCard,
                document.getElementById("phoneNumber").value = data.phoneNumber,
                document.getElementById("email").value = data.email,
                document.getElementById("address").value = data.address,
                document.getElementById("idType").value = data.customerType.customerTypeId;

                $('#create').modal('show');
            }
        });
    });
})

function info(id, name) {
    console.log(name)
    document.getElementById("delete-id").value = id;
    document.getElementById("delete-name").innerHTML = name;
}
$(document).ready(function () {
    $("#delete").on("click", ".deleteCustomer", function (event) {
        let id = $('#delete-id').val();
        $.ajax({
            type: "DELETE",
            url: `/rest-customer/${id}`,
            success: function (data) {
                successHandler()
                $("#delete").removeClass("in");
                $(".modal-backdrop").remove();
                $("#delete").hide();
            }
        });
    });
})

function clearInput() {
    document.getElementById("id").value = ""
    document.getElementById("idCustomer").value = "",
    document.getElementById("name").value = "",
    document.getElementById("birthday").value = "",
    document.getElementById("idCard").value = "",
    document.getElementById("phoneNumber").value = "",
    document.getElementById("email").value = "",
    document.getElementById("address").value = ""
}




function createCustomer() {
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
        success: successHandler
    });
    event.preventDefault();
}

function successHandler() {
    $.ajax({
        type: "GET",
        url: "/rest-customer",
        success: function (data) {
            let content = '';
            for (let i = 0; i < data.length; i++) {
                content += getCustomer(data[i]);
            }
            document.getElementById('customer-list').innerHTML = content;
        }
    });
}

function getCustomer(customer) {
    return `<tr><td>${customer.idCustomer}</td>
            <td>${customer.name}</td>
            <td>${customer.birthday}</td>
            <td>${customer.gender}</td>
            <td>${customer.idCard}</td>
            <td>${customer.phoneNumber}</td>
            <td>${customer.address}</td>
            <td>${customer.customerType.name}</td>
            <td><a th:href="${customer.id}" class="editCustomer"><button type="button"  class="btn btn-outline-info btn-sm">update</button></a></td>
            <td><a th:href="${customer.id}" class="deleteCustomer"><button type="button" class="btn btn-outline-danger btn-sm">delete</button></a></td>`;
}

function searchCustomer() {
    debugger
    let name = $('#search-name').val();
    $.ajax({
        type: "GET",
        url: `/rest-customer/${name}`,
        success: function (data) {
            let content = '';
            for (let i = 0; i < data.length; i++) {
                content += getCustomer(data[i]);
            }
            document.getElementById('customer-list').innerHTML = content;
        },
        error: function (data) {
        }
    });
}

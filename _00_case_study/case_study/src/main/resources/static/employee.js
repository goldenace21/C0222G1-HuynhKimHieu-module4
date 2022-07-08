function createEmployee() {
    debugger
    let id = $('#id-create').val();
    let name = $('#name-create').val();
    let birthday = $('#birthday-create').val();
    let idCard = $('#id-card-create').val();
    let phone = $('#phone-create').val();
    let salary = $('#salary-create').val();
    let email = $('#email-create').val();
    let address = $('#address-create').val();
    let userName = $('#user-create').val();
    let positionId = $('#position-create').val();
    let divisionId = $('#division-create').val();
    let educationDegreeId = $('#educationDegree-create').val();
    let newEmployee = {
        id: id,
        name: name,
        birthday: birthday,
        idCard: idCard,
        phoneNumber: phone,
        salary: salary,
        email: email,
        address: address,
        deleteStatus: 0,
        user: {
            userName: userName
        },
        division: {
            divisionId: divisionId
        },
        position: {
            positionId: positionId
        },
        educationDegree: {
            educationDegreeId: educationDegreeId
        }
    };
    debugger
    console.log(newEmployee)
    $.ajax({
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        type: "POST",
        data: JSON.stringify(newEmployee),
        url: "/rest-employee",
        success: successHandler,
        error: function (e) {
            // document.getElementById("idCustomer").value = e.responseJSON.idCustomer;
        }
    });
    event.preventDefault();
}

function successHandler() {
    $.ajax({
        type: "GET",
        url: "/rest-employee",
        success: function (data) {
            let content = '';
            for (let i = 0; i < data.content.length; i++) {
                content += getEmployee(data.content[i]);
            }
            document.getElementById('employee-list').innerHTML = content;
            document.getElementById("id-create").value = ""
            document.getElementById("name-create").value = ""
            document.getElementById("phone-create").value = ""
            document.getElementById("birthday-create").value = ""
            document.getElementById("id-card-create").value = ""
            document.getElementById("salary-create").value = ""
            document.getElementById("email-create").value = ""
            document.getElementById("address-create").value = ""

            document.getElementById("id-update").value = ""
            document.getElementById("name-update").value =  "",
            document.getElementById("birthday-update").value =  "",
            document.getElementById("id-card-update").value =  "",
            document.getElementById("phone-update").value =  "",
            document.getElementById("salary-update").value = "",
            document.getElementById("email-update").value =  "",
            document.getElementById("address-update").value = "",
            document.getElementById("user-update").value = data.user.userName,
            document.getElementById("position-update").value = data.position.positionId;
            document.getElementById("division-update").value = data.division.divisionId;
            document.getElementById("educationDegree-update").value = data.educationDegree.educationDegreeId;

            $("#create").removeClass("in");
            $(".modal-backdrop").remove();
            $("#create").hide();
        }
    });
}

function getEmployee(employee) {
    return `<tr>
            <td>${employee.id}</td>
            <td>${employee.name}</td>
            <td>${employee.birthday}</td>
            <td>${employee.idCard}</td>
            <td>${employee.salary}</td>
            <td>${employee.email}</td>
            <td>${employee.address}</td>
            <td>${employee.division.divisionName}</td>
            <td>${employee.position.positionName}</td>
            <td>${employee.educationDegree.educationDegreeName}</td>
            <td><button data-id="${employee.id}" onclick="|update(this.getAttribute('data-id'))|" type="button" class="btn btn-outline-info btn-sm" data-toggle="modal" data-target="#update">update</button></td>
            <td><button data-id="${employee.id}" data-name="${employee.name}" onclick="|info(this.getAttribute('data-id'),this.getAttribute('data-name'))|" 
            type="button" class="btn btn-outline-danger btn-sm" data-toggle="modal" data-target="#delete">delete</button></td>
            </td>`;
}

function update(id) {
    $.ajax({
        type: "GET",
        url: `/rest-employee/${id}`,
        success: function (data) {
            document.getElementById("id-update").value = data.id
            document.getElementById("name-update").value = data.name,
            document.getElementById("birthday-update").value = data.birthday,
            document.getElementById("id-card-update").value = data.idCard,
            document.getElementById("phone-update").value = data.phoneNumber,
            document.getElementById("salary-update").value = data.salary,
            document.getElementById("email-update").value = data.email,
            document.getElementById("address-update").value = data.address,
            document.getElementById("user-update").value = data.user.userName,
            document.getElementById("position-update").value = data.position.positionId;
            document.getElementById("division-update").value = data.division.divisionId;
            document.getElementById("educationDegree-update").value = data.educationDegree.educationDegreeId;
        }
    });
}

function updateEmployee() {
    let id = $('#id-update').val();
    let name = $('#name-update').val();
    let birthday = $('#birthday-update').val();
    let idCard = $('#id-card-update').val();
    let phone = $('#phone-update').val();
    let salary = $('#salary-update').val();
    let email = $('#email-update').val();
    let address = $('#address-update').val();
    let userName = $('#user-update').val();
    let positionId = $('#position-update').val();
    let divisionId = $('#division-update').val();
    let educationDegreeId = $('#educationDegree-update').val();
    let newEmployee = {
        id: id,
        name: name,
        birthday: birthday,
        idCard: idCard,
        phoneNumber: phone,
        salary: salary,
        email: email,
        address: address,
        deleteStatus: 0,
        user: {
            userName: userName
        },
        division: {
            divisionId: divisionId
        },
        position: {
            positionId: positionId
        },
        educationDegree: {
            educationDegreeId: educationDegreeId
        }
    };
    $.ajax({
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        type: "POST",
        data: JSON.stringify(newEmployee),
        url: "/rest-employee",
        success: successHandler,

        error: function (e) {
            // document.getElementById("idCustomer").value = e.responseJSON.idCustomer;
        }
    });
    event.preventDefault();
}

$(document).ready(function () {
    $.ajax({
        type: "GET",
        dataType: "json",
        url: "http://localhost:8080/MunkaAppEE-war/rest/instituicao/findAll",
        success: function (data) {
            console.log("response:" + data);
            var htmlSelect = "";
            console.log(data);
            $.each(data, function (j, pdata) {
                htmlSelect += "<option value='" + pdata.idinstituicao + "'>" + pdata.nomeInstituicao + "</option>";
            });
            $("#cbEmpresa").append(htmlSelect);

        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log(' Error in processing! ' + textStatus);
        }
    });

});

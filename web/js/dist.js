function getVal() {
    var a = $('#textBox').val();
    $("#message1").html("");
    $("#message2").html("");
   // $(".listObjectShow").html("");
    $(".listObjectShow").remove();

    if (a == "") {
        $("#title").text("");
        $("#message1").html("Please fill the text field and lookup!!");
    } else {
        $.post('distServlet', {text: a}, function (responseJson) {
            //  $("ol").empty();
            if (responseJson.length) {
                $("#title").text($('#textBox').val());
                var totalrsult = 0;
                $.each(responseJson, function (index, value)
                {
                    totalrsult += 1;

                   if (value.wordType == "" || value.wordType == null) {
                        $('<p>', {
                            class: 'listObjectShow',
                             text: index + 1 + " " + value.wordType + ":: " + value.definition,
                            id: 'listObject' + index
                        }).appendTo('#result');
                    } 
                    else {
                        $('<p>', {
                            class: 'listObjectShow',
                             text: index + 1 + " (" + value.wordType + "):: " + value.definition,
                            id: 'listObject' + index
                        }).appendTo('#result');
                    } 

                });


            } else {
                $("#title").text(a);
                $("#message2").html("( sorry !! no result to display.. )");
            }
//            var i = 0;
//            $(".listObjectShow").each(function (i) {
//                if (i % 2 === 0) {
//                    $(this).css("background-color","red");
//                }
//                i++;
//            });

        });
    }

}

//--------------

//------------

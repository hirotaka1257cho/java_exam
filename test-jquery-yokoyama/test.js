'use strict';

$(function () {
    $('#btn2').on('click', function () {
        $('#name').css('color', 'red');
    });
});

$(function () {
    $('#btn3').on('click', function () {
        const val = $('#age').val();
        alert(val);
    })
})

$(function () {
    $('#btn4').on('click', function () {
        $(this).prop('disabled', true);
    });
});


$(function () {
    $('#select').on('change', function () {
        const val = $(this).val();

        $('#Java').hide();
        $('#JavaScript').hide();

        if (val === 'Java') {
            $('#Java').show();
        } else if (val === 'JavaScript') {
            $('#JavaScript').show();
        }
    });
});

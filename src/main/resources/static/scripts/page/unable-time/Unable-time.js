var schedule = new Array(14);
for (var i = 0; i < 14; i++) {
    schedule[i] = new Array(5);
}

function tableClick(element, period, week) {
    if (element.style.backgroundColor == 'rgb(241, 88, 102)') {
        element.style.backgroundColor = 'var(--color-light)';
        schedule[period][week] = 0;
    } else {
        element.style.backgroundColor = '#F15866';
        schedule[period][week] = 1;
    }
}


function sendPost(action) {
    let form = document.createElement('form');
    form.setAttribute('method', 'post');
    form.setAttribute('action', action);
    document.charset = "utf-8";

    let hiddenField = document.createElement('input');
    hiddenField.setAttribute('type', 'hidden');
    hiddenField.setAttribute('name', 'unable-time');
    hiddenField.setAttribute('value', schedule.toString());
    form.appendChild(hiddenField);

    document.body.appendChild(form);
    form.submit();
}
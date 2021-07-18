
var schedule = new Array(14);
for(var i=0;i<14;i++) {
    schedule[i] = new Array(5);
}
function tableClick(element, period, week) {
    if(element.style.backgroundColor == 'rgb(241, 88, 102)') {
        element.style.backgroundColor = 'var(--color-light)';
        schedule[period][week] = false;
    }else {
        element.style.backgroundColor = '#F15866';
        schedule[period][week] = true;
    }
}
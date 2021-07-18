var mySwiper = new Swiper('.swiper-container', {
// 슬라이드를 버튼으로 움직일 수 있습니다.
    navigation: {
        nextEl: '.swiper-button-next',
        prevEl: '.swiper-button-prev',
    },

// 현재 페이지를 나타내는 점이 생깁니다. 클릭하면 이동합니다.
    pagination: {
        el: '.swiper-pagination',
        type: 'bullets',
        clickable: true,
    },
});

let depart = ['컴퓨터공학', '소프트웨어공학', 'IT경영', '산업경영',
    '게임공학', '엔터테인먼트컴퓨팅', '기계공학', '기계설계공학',
    '메카트로닉스공학', '임베디드시스템', '산업디자인공학', '미디어디자인공학',
    '에너지·전기공학', '전자공학', '나노반도체공학', '신소재공학',
    '생명화학공학'];
let selectedDepart = null;

function selectDepart(element, seq) {
    if(selectedDepart != null) {
        document.querySelector('#depart' + selectedDepart)
             .style.backgroundColor = 'var(--color-light)';
    }
    document.querySelector('#inputDepart').value= depart[seq];
    selectedDepart = seq;
    element.style.backgroundColor = 'var(--color-middle)';

}

let selectedGrade = null;
function selectGrade(element, seq) {
    if(selectedGrade != null) {
        document.querySelector('#grade' + selectedGrade)
            .style.backgroundColor = 'var(--color-light)';
    }
    document.querySelector('#inputGrade').value = seq;
    selectedGrade = seq;
    element.style.backgroundColor = 'var(--color-middle)';

}

const frm = document.getElementById('frm');
const c1 = document.getElementsByClassName('c1');

// 1. 수정, 삭제, 답글 btn 클릭 시 변경
for(c of c1){
    c.addEventListener("click", function(){
        let url = this.getAttribute("data-url");
        
        if(url=='delete'){
            let result = window.confirm("정말로 삭제하시겠습니까?");
            
            if(!result){
                return;
            }
            frm.method='post';
        }
        frm.action=url;
        frm.submit();
    });
}
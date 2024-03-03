# 🍺 술담아 전통주 쇼핑몰 🥂 <br> 
<li>프로젝트 개요</li>
<li>개발 환경 및 도구</li>
<li>기능 구현</li>
<br>
<details>
  
<summary>접기/펼치기</summary>

  
교육원   : 구디아카데미


강  사   : 김대기 


과정명   : 클라우드 활용 자바개발자 양성과정


최종 Branch : master


</details>

# 📂 프로젝트 개요 <br>

<img src="https://github.com/kimseeun10/AnimalHospital/assets/137882823/d7f78552-7137-49be-9c57-beb0f10c7ebc" width="300px" height="200px"/> <br>

><p><strong>프로젝트</strong>: 술담아 전통주 쇼핑몰</p>
><p><strong>기획 및 제작</strong>: 김세은, 김동찬, 김민진, 김호진, 박채연 </p>
><p><strong>분류</strong>: 팀 프로젝트</p>
><p><strong>제작 기간</strong>: 2023-05-22 2023-11-22</p>
><p><strong>사용 기술</strong>: SPRING LEGACY</p> 
<br>

# 🛠 개발 환경 및 도구 <br>

![FRAMEWORK](https://img.shields.io/badge/framework-000000.svg?style=for-the-badge&logo=framework1&logoColor=white) ![Spring Legacy](https://img.shields.io/badge/spring-6DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) 

![LIBRARY](https://img.shields.io/badge/library-000000.svg?style=for-the-badge&logo=library&logoColor=white) ![JQuery](https://img.shields.io/badge/jquery-0769AD.svg?style=for-the-badge&logo=jquery&logoColor=white)

![IDE](https://img.shields.io/badge/ide-000000.svg?style=for-the-badge&logo=ide&logoColor=white) ![SpringToolSuite3](https://img.shields.io/badge/SpringToolSuite3-6DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) ![visualstudiocode](https://img.shields.io/badge/visualstudiocode-007ACC.svg?style=for-the-badge&logo=visualstudiocode&logoColor=white) ![dbeaver](https://img.shields.io/badge/dbeaver-382923.svg?style=for-the-badge&logo=dbeaver&logoColor=white) 

![LANGUAGE](https://img.shields.io/badge/language-000000.svg?style=for-the-badge&logo=language&logoColor=white) ![Java](https://img.shields.io/badge/java-FF0000.svg?style=for-the-badge&logo=java&logoColor=white) ![HTML5](https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white) ![CSS3](https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white) ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=for-the-badge&logo=javascript&logoColor=%23F7DF1E) 

![DB](https://img.shields.io/badge/DB-000000.svg?style=for-the-badge&logo=DB&logoColor=white) ![oracle](https://img.shields.io/badge/oracle-F80000.svg?style=for-the-badge&logo=oracle&logoColor=white)

![SERVER](https://img.shields.io/badge/SERVER-000000.svg?style=for-the-badge&logo=SERVER&logoColor=white) ![apachetomcat](https://img.shields.io/badge/apachetomcat-F8DC75.svg?style=for-the-badge&logo=apachetomcat&logoColor=white)

![OS](https://img.shields.io/badge/OS-000000.svg?style=for-the-badge&logo=OS&logoColor=white) ![windows](https://img.shields.io/badge/windows-0078D4.svg?style=for-the-badge&logo=windows&logoColor=white)

![HOSTING](https://img.shields.io/badge/HOSTING-000000.svg?style=for-the-badge&logo=HOSTING&logoColor=white) ![AWS](https://img.shields.io/badge/aws-232F3E.svg?style=for-the-badge&logo=amazonaws&logoColor=white)

![OTHER](https://img.shields.io/badge/OTHER-000000.svg?style=for-the-badge&logo=OTHER&logoColor=white) ![docker](https://img.shields.io/badge/docker-2496ED.svg?style=for-the-badge&logo=docker&logoColor=white) ![slack](https://img.shields.io/badge/slack-4A154B.svg?style=for-the-badge&logo=slack&logoColor=white) ![github](https://img.shields.io/badge/github-181717.svg?style=for-the-badge&logo=github&logoColor=white)

<br>

# 💁‍♀️ 내 담당 기능 <br>

- AWS EC-2 관리
- 공지사항 게시판 목록, 등록, 수정, 삭제, 목록 페이징 및 검색 기능
- 장바구니에 상품 추가, 수정, 삭제

<br>

# 💻 기능 구현 <br>

### 🛒 장바구니
<img src="https://github.com/kimseeun10/AnimalHospital/assets/137882823/832ccec5-17ce-4b42-b452-5e78e8f0e3d8" width="700px" height="500px"/>


- 상품 상세페이지에서 수량 선택 후 장바구니 버튼을 클릭하여 장바구니에 담을 수 있으며 장바구니에 동일한 상품을 담으면 수량만 추가될 수 있도록 “MERGE INTO” 를 사용한 sql문을 작성하였습니다.
- 상품을 장바구니에 담으면 장바구니에 담겼다는 창과 이동여부를 묻는 창이 뜹니다.

<br>
<img src="https://github.com/kimseeun10/AnimalHospital/assets/137882823/8e8a9654-42c0-4810-9049-0169e6427f74" width="700px" height="500px"/>


- 장바구니에 상품이 담겼을 때 상품의 정보와 결제 예정금액을 확인할 수 있습니다.
- 상품의 수량을 수정할 수 있으며 수정버튼을 통해 DB값 업데이트가 가능합니다.
- 체크박스가 선택된 상품들의 가격을 확인할 수 있고 선택된 상품만 주문이 가능합니다.
- 전체 삭제와 선택 삭제가 가능합니다.

---

### 📢 공지사항
<img src="https://github.com/kimseeun10/AnimalHospital/assets/137882823/e61ad718-5c6a-4b14-9be1-50f7646ae361" width="700px" height="500px"/>


- 공지사항 목록, 하단의 Add버튼과 상세페이지의 update, delete 버튼은 intercepter처리하여 관리자로 로그인 했을 때만 활성화 됩니다.
- 제목과 내용으로 검색이 가능합니다.
- 글 상세에서 수정, 삭제가 가능합니다.

<br>
<img src="https://github.com/kimseeun10/AnimalHospital/assets/137882823/98045dd8-8853-4514-adaf-70817a4225c1" width="700px" height="500px"/>


- 공지사항 게시글 등록 및 수정 시 summernote 에디터를 사용하여 글과 이미지를 등록할 수 있습니다.

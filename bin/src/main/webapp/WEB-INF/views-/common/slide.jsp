<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*
			 	"
%><%@ include file="/WEB-INF/views/common/env.jsp"
%>

<%-- 전체메뉴 --%>
<div id="allMenu" class="allmenu" style="" tabindex="0">
	<div id="mLnb">
		<%-- 비동기 ajax 처리 시 다음 주석처리 --%>
<%-- 		<%@ include file="/WEB-INF/jsp/common/slideMenuAjax.jsp" %> --%>
	</div>
	<% /* BI Renewal. 20190918. nobbyjin. - 닫기 버튼 위치 조정
	<button type="button" class="allmenuClose">전체 메뉴 닫기</button>
	*/ %>
</div>
<%--//전체메뉴 끝--%>

<script>
$(document).ready(function() {
    //기본 상단 GNB & 슬라이드 바 처리
    //common.gnb.init();
});
</script>
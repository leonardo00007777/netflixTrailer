<%-- <%@ page import="com.x62life.util.TextUtil" %> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/common/env.jsp"%>  
   <!-- ------------------------------------------------------------------------------------------------------------------------ -->
   <!--  JS   -->
   <!-- ------------------------------------------------------------------------------------------------------------------------ -->    
  <script src="<%=_libUrl %>jquery/jquery.min.js"></script>
  <script src="<%=_libUrl %>jquery/jquery-ui.min.js"></script>
  <script src="<%=_libUrl %>bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="<%=_libUrl %>swiper/swiper-bundle.min.js"></script>
  <script src="<%=_libUrl %>waypoints/jquery.waypoints.min.js"></script>  
  <script src="<%=_libUrl %>waypoints/shortcuts/sticky.min.js"></script>
  <script src="<%=_libUrl %>waypoints/shortcuts/inview.min.js"></script>
  <script src="<%=_libUrl %>circle-progress-master/jquery.circle-progress.js"></script>
  <script src="<%=_libUrl %>aos/aos.js"></script>  
  <script src="<%=_jsUrl %>ui.js"></script>
  <script src="<%=_jsUrl %>main/main.js"></script>     
  <script src="<%=_jsUrl %>ui-main.js"></script>     
            
  <script>
/*     $(function () {
      //팝업 & 탭 시연용 테스트 코드 입니다.
      //실제 개발시 사용하지 마시고 삭제해주세요
      var queryString = window.location.search;
      var urlParams = new URLSearchParams(queryString);
      if (urlParams.has('modalID')) {
        var modalSelector = "#" + urlParams.get('modalID');
        $(modalSelector).modal('show');
      }
      if (urlParams.has('tabID')) {
        var tabSelector = "#" + urlParams.get('tabID');
        $(tabSelector).tab('show');
      }
      //시연용 코드 끝
    }); //jQuery Ready */
  </script>


</body>
</html>

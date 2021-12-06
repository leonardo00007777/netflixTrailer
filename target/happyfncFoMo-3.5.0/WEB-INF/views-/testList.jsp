<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page session="false" %>
<html>
    <head>
        <title>게시판</title>
        <script type="text/javascript" src="http://code.jquery.com/jquery-1.11.3.js"></script>
        <script type="text/javascript">
            $(document).ready(function(){
            });
        </script>
        <style>
        	.mouseOverHighlight {
				   border-bottom: 1px solid blue;
				   cursor: pointer !important;
				   color: blue;
				   pointer-events: auto;
				}
        </style>
    </head>
    <body>
	    			<c:choose>
			        	<c:when test="${fn:length(testList) == 0}">
			            	<tr>
			            		<td colspan="4" align="center">
			            			조회결과가 없습니다.
			            		</td>
			            	</tr>
			           	</c:when>
			           	<c:otherwise>
			            	<c:forEach var="testList" items="${testList}" varStatus="status">
								<tr>
						    		<td align="center">${testList.id}</td>
						    		<td>
						    			<a name="subject" class="mouseOverHighlight" content_id="${testList.id}">${testList.subject}</a>
						    		</td>
						    	</tr>
						    </c:forEach>
			           	</c:otherwise> 
			    	</c:choose>
    </body>
</html>
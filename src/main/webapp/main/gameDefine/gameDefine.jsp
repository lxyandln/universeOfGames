<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set value="${pageContext.request.contextPath}" var="path"></c:set>
<script>

    $.ajax({
        type: "post",
        url: "${path}/gameDefine/selectGameDefineClassify",
        date: "defineType=1&page=1",
        dataType: "json",
        success: function (result) {
            alert("000000000000" + result);
        }
    });

</script>

<%--搜索条件--%>
<div class="container-fluid">


</div>


<table>

</table>
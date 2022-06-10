<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set value="${pageContext.request.contextPath}" var="path"></c:set>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>太虚之上</title>

    <link rel="stylesheet" href="${path}/boot/css/bootstrap.min.css">
    <link rel="stylesheet" href="${path}/jqgrid/css/jquery-ui.css">
    <%--引入bootstrap的核心css--%>
    <link rel="stylesheet" href="${path}/boot/css/bootstrap.css">
    <link rel="stylesheet" href="${path}/jqgrid/css/trirand/ui.jqgrid-bootstrap.css">
    <%--引入jquery的js--%>
    <script src="${path}/jquery/jquery-3.6.0.js"></script>
    <%--引入bootstrap的js--%>
    <script src="${path}/boot/js/bootstrap.min.js"></script>
    <%--jqgird的国际化js--%>
    <script src="${path}/jqgrid/js/trirand/i18n/grid.locale-cn.js"></script>
    <%--jqgird的js--%>
    <script src="${path}/jqgrid/js/trirand/jquery.jqGrid.min.js"></script>

    <script src="${path}/ajax/ajaxfileupload.js"></script>

</head>
<body>

<div class="container-fluid">

    <nav class="navbar navbar-default ">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">
                    太虚之上管理系统
                </a>
            </div>
            <ul class="nav navbar-nav navbar-right">
                <li>
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                       aria-haspopup="true" aria-expanded="false">
                        <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
                        <span>退出登录</span>
                    </a>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li>
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                       aria-expanded="false">
                        欢迎您：
                    </a>
                </li>
            </ul>
        </div>
    </nav>

    <div class="row">
        <%--菜单导航--%>
        <div class="col-md-2">
            <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">

                <div class="panel panel-default">
                    <div class="panel-heading" role="tab" id="headingZero">
                        <h4 class="panel-title">
                            <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion"
                               href="#collapseZero"
                               aria-expanded="false" aria-controls="collapseZero">
                                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
                                系统管理
                            </a>
                        </h4>
                    </div>
                    <div id="collapseZero" class="panel-collapse collapse" role="tabpanel"
                         aria-labelledby="headingZero">
                        <div class="panel-body">
                            版本信息
                        </div>
                    </div>
                </div>

                <div class="panel panel-default">
                    <div class="panel-heading" role="tab" id="headingOne">
                        <h4 class="panel-title">
                            <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion"
                               href="#collapseOne"
                               aria-expanded="false" aria-controls="collapseOne">
                                <span class="glyphicon glyphicon-user" aria-hidden="true"></span>
                                玩家管理
                            </a>
                        </h4>
                    </div>
                    <div id="collapseOne" class="panel-collapse collapse" role="tabpanel"
                         aria-labelledby="headingOne">
                        <div class="panel-body">
                            身份信息
                        </div>
                        <div class="panel-body">
                            角色信息
                        </div>
                    </div>
                </div>

                <div class="panel panel-default">
                    <div class="panel-heading" role="tab" id="headingTwo">
                        <h4 class="panel-title">
                            <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion"
                               href="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                                <span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span>
                                装备管理
                            </a>
                        </h4>
                    </div>
                    <div id="collapseTwo" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo">
                        <div class="panel-body">
                            武器信息
                        </div>
                        <div class="panel-body">
                            防具信息
                        </div>
                        <div class="panel-body">
                            装饰信息
                        </div>
                        <div class="panel-body">
                            徽章信息
                        </div>
                        <div class="panel-body">
                            称号信息
                        </div>
                        <div class="panel-body">
                            法宝信息
                        </div>
                    </div>
                </div>

                <div class="panel panel-default">
                    <div class="panel-heading" role="tab" id="headingThree">
                        <h4 class="panel-title">
                            <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion"
                               href="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                                <span class="glyphicon glyphicon-adjust" aria-hidden="true"></span>
                                灵宠管理
                            </a>
                        </h4>
                    </div>
                    <div id="collapseThree" class="panel-collapse collapse" role="tabpanel"
                         aria-labelledby="headingThree">
                        <div class="panel-body">
                            宠物信息
                        </div>
                        <div class="panel-body">
                            坐骑信息
                        </div>
                    </div>
                </div>

                <div class="panel panel-default">
                    <div class="panel-heading" role="tab" id="headingFour">
                        <h4 class="panel-title">
                            <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion"
                               href="#collapseFour" aria-expanded="false" aria-controls="collapseFour">
                                <span class="glyphicon glyphicon-book" aria-hidden="true"></span>
                                技能管理
                            </a>
                        </h4>
                    </div>
                    <div id="collapseFour" class="panel-collapse collapse" role="tabpanel"
                         aria-labelledby="headingFour">
                        <div class="panel-body">
                            技能信息
                        </div>
                        <div class="panel-body">
                            特技信息
                        </div>
                        <div class="panel-body">
                            特效信息
                        </div>
                    </div>
                </div>

                <div class="panel panel-default">
                    <div class="panel-heading" role="tab" id="headingFive">
                        <h4 class="panel-title">
                            <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion"
                               href="#collapseFive" aria-expanded="false" aria-controls="collapseFive">
                                <span class="glyphicon glyphicon-leaf" aria-hidden="true"></span>
                                配置管理
                            </a>
                        </h4>
                    </div>
                    <div id="collapseFive" class="panel-collapse collapse" role="tabpanel"
                         aria-labelledby="headingFive">
                        <div class="panel-body">
                            <a href="javascript:$('#showDiv').load('${path}/main/gameDefine/gameDefine.jsp')">
                                配置信息
                            </a>
                        </div>
                    </div>
                </div>

                <div class="panel panel-default">
                    <div class="panel-heading" role="tab" id="headingSix">
                        <h4 class="panel-title">
                            <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion"
                               href="#collapseSix" aria-expanded="false" aria-controls="collapseSix">
                                <span class="glyphicon glyphicon-search" aria-hidden="true"></span>
                                查询管理
                            </a>
                        </h4>
                    </div>
                    <div id="collapseSix" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingSix">
                        <div class="panel-body">
                            角色查询
                        </div>
                        <div class="panel-body">
                            装备查询
                        </div>
                        <div class="panel-body">
                            灵宠查询
                        </div>
                        <div class="panel-body">
                            技能查询
                        </div>
                        <div class="panel-body">
                            配置查询
                        </div>
                    </div>
                </div>
            </div>

        </div>

        <%--展示页面--%>
        <div id="showDiv" class="col-md-10">

        </div>
    </div>

    <nav class="navbar navbar-default navbar-fixed-bottom">
        <div class="container-fluid text-center">
            <div class="container-fluid text-center">
                <div class="progress">
                    <div class="progress-bar progress-bar-danger progress-bar-striped active" style="width: 33%">
                        <span class="sr-only">33% Complete (danger)</span>
                    </div>
                    <div class="progress-bar progress-bar-warning progress-bar-striped active" style="width: 34%">
                        <span class="sr-only">34% Complete (warning)</span>
                    </div>
                    <div class="progress-bar progress-bar-success progress-bar-striped active" style="width: 33%">
                        <span class="sr-only">33% Complete (success)</span>
                    </div>
                </div>
            </div>
        </div>
    </nav>

</div>

</body>
</html>


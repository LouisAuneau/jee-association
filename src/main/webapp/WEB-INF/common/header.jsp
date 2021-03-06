<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="imta.utils.Routes" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Jee-association</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-grid.min.css" />
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-reboot.min.css" />
    <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary" style="margin-bottom: 40px">
        <button class="navbar-toggler navbar-toggler-right"
                type="button"
                data-toggle="collapse"
                data-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent"
                aria-expanded="false"
                aria-label="Toggle navigation"
        >
            <span class="navbar-toggler-icon"></span>
        </button>
  		<a class="navbar-brand" href="<%=Routes.HOME.getRoutePath()%>">Associ'active</a>

  		<div class="collapse navbar-collapse" id="navbarSupportedContent">
    		<ul class="navbar-nav mr-auto mt-2 mt-lg-0">

				<c:choose>
                    <c:when test="${sessionType == 'LOGGED_IN_SESSION'}">

                        <c:choose>
                            <c:when test="${requestScope['javax.servlet.forward.request_uri'] != '/'
                                            && requestScope['javax.servlet.forward.request_uri'] != '/home'}">
                                <li class="nav-item">
                                    <a class="nav-link" href="<%=Routes.HOME.getRoutePath()%>">Accueil </a>
                                </li>
                            </c:when>
                            <c:otherwise>
                                <li class="nav-item active">
                                    <a class="nav-link" href="<%=Routes.HOME.getRoutePath()%>">Accueil <span class="sr-only">(current)</span></a>
                                </li>
                            </c:otherwise>
                        </c:choose>

                        <c:choose>
                            <c:when test="${requestScope['javax.servlet.forward.request_uri'] != '/catalogue'}">
                                <li class="nav-item">
                                    <a class="nav-link" href="<%=Routes.CATALOG.getRoutePath()%>">Catalogue </a>
                                </li>
                            </c:when>
                            <c:otherwise>
                                <li class="nav-item active">
                                    <a class="nav-link" href="<%=Routes.CATALOG.getRoutePath()%>">Catalogue <span class="sr-only">(current)</span></a>
                                </li>
                            </c:otherwise>
                        </c:choose>

                        <c:choose>
                            <c:when test="${requestScope['javax.servlet.forward.request_uri'] != '/commande'}">
                                <li class="nav-item">
                                    <a class="nav-link" href="<%=Routes.COMMAND.getRoutePath()%>">Commande </a>
                                </li>
                            </c:when>
                            <c:otherwise>
                                <li class="nav-item active">
                                    <a class="nav-link" href="<%=Routes.COMMAND.getRoutePath()%>">Commande <span class="sr-only">(current)</span></a>
                                </li>
                            </c:otherwise>
                        </c:choose>

                    </c:when>
                    <c:otherwise>

                        <c:choose>
                            <c:when test="${requestScope['javax.servlet.forward.request_uri'] != '/login'
                                                && requestScope['javax.servlet.forward.request_uri'] != '/home'}">
                                <li class="nav-item">
                                    <a class="nav-link" href="<%=Routes.LOGIN.getRoutePath()%>">Connexion </a>
                                </li>
                            </c:when>
                            <c:otherwise>
                                <li class="nav-item active">
                                    <a class="nav-link" href="<%=Routes.LOGIN.getRoutePath()%>">Connexion  <span class="sr-only">(current)</span></a>
                                </li>
                            </c:otherwise>
                        </c:choose>

                        <c:choose>
                            <c:when test="${requestScope['javax.servlet.forward.request_uri'] != '/register'}">
                                <li class="nav-item">
                                    <a class="nav-link" href="<%=Routes.REGISTER.getRoutePath()%>">Inscription </a>
                                </li>
                            </c:when>
                            <c:otherwise>
                                <li class="nav-item active">
                                    <a class="nav-link" href="<%=Routes.REGISTER.getRoutePath()%>">Inscription <span class="sr-only">(current)</span></a>
                                </li>
                            </c:otherwise>
                        </c:choose>

                    </c:otherwise>
                </c:choose>
    		</ul>

            <c:choose>
                <c:when test="${sessionType == 'LOGGED_IN_SESSION'}">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                ${username}
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                                <a class="dropdown-item" href="<%=Routes.LOGOUT.getRoutePath()%>">Déconnexion</a>
                            </div>
                        </li>
                    </ul>
                </c:when>
            </c:choose>


  		</div>

	</nav>
</body>
</html>
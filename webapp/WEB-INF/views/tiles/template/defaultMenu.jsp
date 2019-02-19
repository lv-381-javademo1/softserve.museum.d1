<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="${pageContext.request.contextPath}/">Home</a>
        </div>
        <c:if test="${role ne null && role == 'admin'}">
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li><a href="${pageContext.request.contextPath}/excursion">Excursion</a></li>
                <li><a href="${pageContext.request.contextPath}/exhibit">Exhibit</a></li>
                <li><a href="${pageContext.request.contextPath}/archive">Archive</a></li>
                <li><a href="${pageContext.request.contextPath}/hall">Hall</a></li>
                <li><a href="${pageContext.request.contextPath}/author">Author</a></li>
                <li><a href="${pageContext.request.contextPath}/bookedexcursion">Booked Excursion</a></li>
            </ul>

            <ul class="nav navbar-nav navbar-right">
                <li>
                    <a>
                        <span class="glyphicon glyphicon-user"></span> <c:out value='${adminName}'/>
                    </a>
                </li>
                <li><a href="${pageContext.request.contextPath}/logout"><span
                        class="glyphicon glyphicon-log-out"></span> Logout</a></li>
            </ul>

            </c:if>
            <c:if test="${role eq null}">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="${pageContext.request.contextPath}/login">
                            <span class="glyphicon glyphicon-log-in"></span> Login
                        </a>
                    </li>
                </ul>
            </c:if>>
        </div><!-- /.navbar-collapse -->


    </div><!-- /.container-fluid -->
</nav>
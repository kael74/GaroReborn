<%-- 
    Document   : Update
    Created on : 07/07/2017, 11:51:22 AM
    Author     : Computer
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../jdf/estilo.jspf" %>
        <title>JSP Page</title>
    </head>
    <body>
        <section class="full-width pageContent">
            <section class="full-width header-well">
                <div class="full-width header-well-icon">
                    <i class="zmdi zmdi-account"></i>
                </div>

            </section>


            <div class="mdl-tabs__panel is-active" id="tabNewAdmin">
                <div class="mdl-grid">
                    <div class="mdl-cell mdl-cell--4-col-phone mdl-cell--8-col-tablet mdl-cell--12-col-desktop">
                        <div class="full-width panel mdl-shadow--2dp">
                            <div class="full-width panel-tittle bg-primary text-center tittles">
                                Editar Producto
                            </div>
                            <c:forEach var="up" begin="0" items="${lista}">
                            <form method="post" action="upda">
                                <div class="full-width panel-content">

                                    <div class="mdl-grid">
                                        <div class="mdl-cell mdl-cell--4-col-phone mdl-cell--8-col-tablet mdl-cell--6-col-desktop">
                                            <h5 class="text-condensedLight">PRODUCTO</h5>

                                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                                                <input name="producto" class="mdl-textfield__input" value="<c:out value="${up.nombre}"/>" type="text" pattern="-?[A-Za-záéíóúÁÉÍÓÚ ]*(\.[0-9]+)?" id="NameAdmin">
                                                <label class="mdl-textfield__label" for="NameAdmin">Producto</label>
                                                <span class="mdl-textfield__error">Ingrese bien el Producto</span>
                                            </div>
                                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                                                <input name="marca" class="mdl-textfield__input" value="<c:out value="${up.marca}"/>" type="text" pattern="-?[A-Za-záéíóúÁÉÍÓÚ ]*(\.[0-9]+)?" id="LastNameAdmin">
                                                <label class="mdl-textfield__label" for="LastNameAdmin">MARCA</label>
                                                <span class="mdl-textfield__error">Ingrese bien la marca</span>
                                            </div>

                                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                                                <input name="precio" class="mdl-textfield__input" value="<c:out value="${up.precio}"/>" type="text" id="emailAdmin">
                                                <label class="mdl-textfield__label" for="emailAdmin">PRECIO</label>
                                                <span class="mdl-textfield__error">Precio Invalido</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <p class="text-center">
                                    <button class="mdl-button mdl-js-button mdl-button--fab mdl-js-ripple-effect mdl-button--colored bg-primary" id="btn-addAdmin">
                                        <i class="zmdi zmdi-plus"></i>
                                    </button>
                                </p>
                                <div class="mdl-tooltip"  >
                                    <input type="submit" name="boton" value="GUARDAR"/>
                                
                            </form>
                            </c:forEach>
                        </div>
                    </div>
                </div>
            </div>


        </div>
    </section>

</body>
</html>

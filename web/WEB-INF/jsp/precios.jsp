<%-- 
    Document   : listar
    Created on : 06/07/2017, 08:10:15 PM
    Author     : Computer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <section class="full-width container-notifications">
            <div class="full-width container-notifications-bg btn-Notification"></div>
            <section class="NotificationArea">
                <div class="full-width text-center NotificationArea-title tittles">Notifications <i class="zmdi zmdi-close btn-Notification"></i></div>
                <a href="#" class="Notification" id="notifation-unread-1">
                    <div class="Notification-icon"><i class="zmdi zmdi-accounts-alt bg-info"></i></div>
                    <div class="Notification-text">
                        <p>
                            <i class="zmdi zmdi-circle"></i>
                            <strong>New User Registration</strong> 
                            <br>
                            <small>Just Now</small>
                        </p>
                    </div>
                    <div class="mdl-tooltip mdl-tooltip--left" for="notifation-unread-1">Notification as UnRead</div> 
                </a>
                <a href="#" class="Notification" id="notifation-read-1">
                    <div class="Notification-icon"><i class="zmdi zmdi-cloud-download bg-primary"></i></div>
                    <div class="Notification-text">
                        <p>
                            <i class="zmdi zmdi-circle-o"></i>
                            <strong>New Updates</strong> 
                            <br>
                            <small>30 Mins Ago</small>
                        </p>
                    </div>
                    <div class="mdl-tooltip mdl-tooltip--left" for="notifation-read-1">Notification as Read</div>
                </a>
                <a href="#" class="Notification" id="notifation-unread-2">
                    <div class="Notification-icon"><i class="zmdi zmdi-upload bg-success"></i></div>
                    <div class="Notification-text">
                        <p>
                            <i class="zmdi zmdi-circle"></i>
                            <strong>Archive uploaded</strong> 
                            <br>
                            <small>31 Mins Ago</small>
                        </p>
                    </div>
                    <div class="mdl-tooltip mdl-tooltip--left" for="notifation-unread-2">Notification as UnRead</div>
                </a> 
                <a href="#" class="Notification" id="notifation-read-2">
                    <div class="Notification-icon"><i class="zmdi zmdi-mail-send bg-danger"></i></div>
                    <div class="Notification-text">
                        <p>
                            <i class="zmdi zmdi-circle-o"></i>
                            <strong>New Mail</strong> 
                            <br>
                            <small>37 Mins Ago</small>
                        </p>
                    </div>
                    <div class="mdl-tooltip mdl-tooltip--left" for="notifation-read-2">Notification as Read</div>
                </a>
                <a href="#" class="Notification" id="notifation-read-3">
                    <div class="Notification-icon"><i class="zmdi zmdi-folder bg-primary"></i></div>
                    <div class="Notification-text">
                        <p>
                            <i class="zmdi zmdi-circle-o"></i>
                            <strong>Folder delete</strong> 
                            <br>
                            <small>1 hours Ago</small>
                        </p>
                    </div>
                    <div class="mdl-tooltip mdl-tooltip--left" for="notifation-read-3">Notification as Read</div>
                </a>  
            </section>
        </section>
        <!-- navBar -->
        <div class="full-width navBar">
            <div class="full-width navBar-options">
                <i class="zmdi zmdi-more-vert btn-menu" id="btn-menu"></i>	
                <div class="mdl-tooltip" for="btn-menu">Menu</div>
                <nav class="navBar-options-list">
                    <ul class="list-unstyle">
                        <li class="btn-Notification" id="notifications">
                            <i class="zmdi zmdi-notifications"></i>
                            <!-- <i class="zmdi zmdi-notifications-active btn-Notification" id="notifications"></i> -->
                            <div class="mdl-tooltip" for="notifications">Notifications</div>
                        </li>
                        <li class="btn-exit" id="btn-exit">
                            <i class="zmdi zmdi-power"></i>
                            <div class="mdl-tooltip" for="btn-exit">Cerrar Sesion</div>
                        </li>
                        <li class="text-condensedLight noLink" ><small>Usuario</small></li>
                        <li class="noLink">
                            <figure>
                                <img src="assets/img/avatar-male.png" alt="Avatar" class="img-responsive">
                            </figure>
                        </li>
                    </ul>
                </nav>
            </div>
        </div>
        <!-- navLateral -->
        <section class="full-width navLateral">
            <div class="full-width navLateral-bg btn-menu"></div>
            <div class="full-width navLateral-body">
                <div class="full-width navLateral-body-logo text-center tittles">
                    <i class="zmdi zmdi-close btn-menu"></i> MENÚ 
                </div>
                <figure class="full-width" style="height: 77px;">
                    <div class="navLateral-body-cl">
                        <img src="assets/img/avatar-male.png" alt="Avatar" class="img-responsive">
                    </div>
                    <figcaption class="navLateral-body-cr hide-on-tablet">
                        <span>
                            Full Name Admin<br>
                            <small>Poner aqui rol</small>
                        </span>
                    </figcaption>
                </figure>
                <div class="full-width tittles navLateral-body-tittle-menu">
                    <i class="zmdi zmdi-desktop-mac"></i><span class="hide-on-tablet">&nbsp; OPCIONES</span>
                </div>
                <nav class="full-width">
                    <ul class="full-width list-unstyle menu-principal">
                        <li class="full-width">
                            <a href="home.html" class="full-width">
                                <div class="navLateral-body-cl">
                                    <i class="zmdi zmdi-view-dashboard"></i>
                                </div>
                                <div class="navLateral-body-cr hide-on-tablet">
                                    INICIO
                                </div>
                            </a>
                        </li>
                        <li class="full-width divider-menu-h"></li>
                        <li class="full-width">
                            <a href="#!" class="full-width btn-subMenu">
                                <div class="navLateral-body-cl">
                                    <i class="zmdi zmdi-case"></i>
                                </div>
                                <div class="navLateral-body-cr hide-on-tablet">
                                    ADMINISTRACION
                                </div>
                                <span class="zmdi zmdi-chevron-left"></span>
                            </a>
                            <ul class="full-width menu-principal sub-menu-options">
                                <li class="full-width">
                                    <a href="company.html" class="full-width">
                                        <div class="navLateral-body-cl">
                                            <i class="zmdi zmdi-balance"></i>
                                        </div>
                                        <div class="navLateral-body-cr hide-on-tablet">
                                            USUARIOS
                                        </div>
                                    </a>
                                </li>
                                <li class="full-width">
                                    <a href="providers.html" class="full-width">
                                        <div class="navLateral-body-cl">
                                            <i class="zmdi zmdi-truck"></i>
                                        </div>
                                        <div class="navLateral-body-cr hide-on-tablet">
                                            ADMINISTRADORES
                                        </div>
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <li class="full-width">
                            <a href="products.html" class="full-width">
                                <div class="navLateral-body-cl">
                                    <i class="zmdi zmdi-washing-machine"></i>
                                </div>
                                <div class="navLateral-body-cr hide-on-tablet">
                                    MERCADO
                                </div>
                            </a>
                        </li>
                        <li class="full-width divider-menu-h"></li>
                        <li class="full-width">
                        <li class="full-width divider-menu-h"></li>
                        <li class="full-width">
                            <a href="products.html" class="full-width">
                                <div class="navLateral-body-cl">
                                    <i class="zmdi zmdi-washing-machine"></i>
                                </div>
                                <div class="navLateral-body-cr hide-on-tablet">
                                    REGISTRAR PRODUCTO
                                </div>
                            </a>
                        </li>
                        <li class="full-width divider-menu-h"></li>
                        
                        <li class="full-width">
                            <a href="#!" class="full-width btn-subMenu">
                                <div class="navLateral-body-cl">
                                    <i class="zmdi zmdi-wrench"></i>
                                </div>
                                <div class="navLateral-body-cr hide-on-tablet">
                                    SETTINGS
                                </div>
                                <span class="zmdi zmdi-chevron-left"></span>
                            </a>
                            <ul class="full-width menu-principal sub-menu-options">
                                <li class="full-width">
                                    <a href="#!" class="full-width">
                                        <div class="navLateral-body-cl">
                                            <i class="zmdi zmdi-widgets"></i>
                                        </div>
                                        <div class="navLateral-body-cr hide-on-tablet">
                                            OPTION
                                        </div>
                                    </a>
                                </li>
                                <li class="full-width">
                                    <a href="#!" class="full-width">
                                        <div class="navLateral-body-cl">
                                            <i class="zmdi zmdi-widgets"></i>
                                        </div>
                                        <div class="navLateral-body-cr hide-on-tablet">
                                            OPTION
                                        </div>
                                    </a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </nav>
            </div>
        </section>
    </body>
</html>

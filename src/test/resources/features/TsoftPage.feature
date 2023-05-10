Feature: Pruebas relacionadas a TSOFT

	@TEST_XRAY1-42 @TESTPLAN_XRAY1-41
	Scenario: Entro en seccion "ADN TSOFT", entro al primer video que aparece y lo cierro
		Given Ingresar a la pagina de TSOFT
		When Clickeo la seccion de "ADN TSOFT"
		And Clickeo el primer video en pantalla
		Then Cierro el video con la 'X' en la parte superior derecha
	@TEST_XRAY1-43 @TESTPLAN_XRAY1-41
	Scenario: Colapsar lista en apartado "SOLUCIONES", elegir la opcion "BUSINESS SYSTEM TEAMS", y clickear la sección "Development Assessment"
		Given Ingresar a la pagina de TSOFT2
		When Colapsar lista en apartado "SOLUCIONES"
		And Clickeo la opcion "BUSINESS SYSTEM TEAMS"
		Then clickeo la seccion "Development Assessment"
	@TEST_XRAY1-44 @TESTPLAN_XRAY1-41
	Scenario: Entrar en la seccion "EVENTOS", clickear en el apartado "Biblioteca de webinars" la webinar "DevOps de alta performance", y clickear en el boton "Volver a Tsoft Inspiracion"
		Given Ingresar a la pagina de TSOFT3
		When Entro a la seccion "EVENTOS"
		And Clickeo dentro del apartado 'BIBLIOTECA DE WEBINARS' la webinar "DevOps de alta performance"
		Then Clickeo en el boton "Volver a Tsoft Inspiración"

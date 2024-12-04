package daviplata.nacional.iOS.pageObjects;

public class AdsPageObjects {

	public static final String TEXTO_POPUP_ADS = "//XCUIElementTypeStaticText[contains(@name, 'Necesita un adelanto de sueldo')]";
    public static final String BOTON_SABER_MAS = "//XCUIElementTypeStaticText[@name='Saber más']";
    public static final String BOTON_LO_VERE_LUEGO_POPUP_BENEFICIOS_TARJETA_DIGITAL = "";
    public static final String BOTON_TYC_BENEFICIOS = "//XCUIElementTypeTextView[contains(@value, 'Acepto las autorizaciones aquí descritas')]/following-sibling::XCUIElementTypeOther";
    public static final String TXT_BENEFICIOS_CARACTERISTICAS = "//XCUIElementTypeStaticText[@name='Beneficios y Características']";
    public static final String CAMPO_CIUDAD_EXPEDICION_DOCUMENTO = "//XCUIElementTypeTextField[@value='Seleccione una opción']"; 
    public static final String TXT_AUTORIZACIONES = "//XCUIElementTypeStaticText[@name='Autorizaciones']";
    public static final String TXT_RESULTADO = "//XCUIElementTypeStaticText[@name='Resultado']";
    public static final String TXT_AUTORIZADOR_CONTRATO = "//XCUIElementTypeStaticText[contains(@name, 'contrato de mi adelanto de sueldo')]";
    public static final String TXT_AUTORIZADOR_DEBITAR = "//XCUIElementTypeStaticText[@name='debitar automáticamente de mi DaviPlata']";
    public static final String TXT_AUTORIZADOR_DEBITAR_AUTOMATICO = "//XCUIElementTypeStaticText[@name='AUTORIZACIÓN DÉBITO AUTOMATICO']"; 
    public static final String TXT_AUTORIZADOR_PAGARE = "//XCUIElementTypeStaticText[contains(@name,'pagaré')]";
    public static final String TXT_AUTORIZADOR_PAGARE_DOCUMENTO = "//XCUIElementTypeStaticText[contains(@name, 'AUTORIZACIÓN PARA DILIGENCIAR EL DOCUMENTO')]";
    public static final String BTN_ACEPTAR = "//XCUIElementTypeStaticText[@name='Aceptar'] | //XCUIElementTypeButton[@name='Aceptar']";
    public static final String BTN_CANCELAR = "//XCUIElementTypeButton[@name='Cancelar']";
    public static final String POPUP_NO_ES_POSIBLE_YA_CUENTA_CON_ADS = "//XCUIElementTypeStaticText[contains(@name, 'En este momento no es posible hacer la consulta')] | //XCUIElementTypeStaticText[contains(@name, 'Usted ya cuenta con un Adelanto de Sueldo vigente')]";
    public static final String BTN_ATRAS = "//XCUIElementTypeImage[@name='Atrás']";
    public static final String BNT_SALIR_APP = "//XCUIElementTypeImage[@name='close']";
    public static final String OPCION_CIUDAD_EXPEDICION = "//XCUIElementTypeOther[contains(@name, 'Cuál es la ciudad de expedición')]/following-sibling::XCUIElementTypeStaticText";
    public static final String BTN_DONE = "//XCUIElementTypeButton[@name='Done']";
    public static final String CAMPO_PAIS_NACIMIENTO = "//XCUIElementTypeTextField[@value='Seleccionar opción']";
    public static final String CAMPO_CIUDAD_NACIMIENTO = "//XCUIElementTypeTextField[@value='Seleccionar opción']"; 
    public static final String OPCION_CIUDAD_NACIMIENTO = "(//XCUIElementTypeImage[@name='Editar'])[3]/following-sibling::XCUIElementTypeStaticText";
    public static final String POPUP_YA_HA_INICIADO_SOLICITUD = "//XCUIElementTypeStaticText[contains(@name, 'Usted ya ha iniciado una solicitud')]";
    public static final String POP_UP_RETOMAR_SOLICITUD_ADELANTO_SUELDO = "//XCUIElementTypeStaticText[contains(@name, 'Usted ya ha iniciado una solicitud')]"; 
    public static final String EQUIS_SALIR_APP_ADELANTO_SALDO = "";
    public static final String FORMULARIO_PANTALLA_INFORMACION_PERSONAL = "//XCUIElementTypeStaticText[contains(@name, 'Información')]";
    public static final String BOTON_ATRAS_ADS = "//XCUIElementTypeImage[@name='Atrás']"; 
    public static final String TEXTO_FECHA_EXPEDICION_DOCUMENTO = "//XCUIElementTypeStaticText[contains(@name, 'fecha de expedición de su documento')]";
    public static final String OPCION_COLOMBIA_CIUDAD_NACIMIENTO = "//XCUIElementTypeStaticText[@name='COLOMBIA']";
    public static final String CAMPO_CORREO_ELECTRONICO = "//XCUIElementTypeTextField[contains(@value, '@')]";
    public static final String DESPLEGABLE_DONDE_VIVE = "//XCUIElementTypeOther[@value='Seleccione']";
    public static final String TXT_ADELANTO_SALDO = "//XCUIElementTypeStaticText[@name='Adelanto de sueldo']";
    public static final String CAMPO_NUMERO_UNO_DIRECCION = "(//XCUIElementTypeStaticText[@name='#']/preceding-sibling::XCUIElementTypeTextField)[2]";
    public static final String CAMPO_NUMERO_DOS_DIRECCION = "//XCUIElementTypeStaticText[@name='#']/following-sibling::XCUIElementTypeTextField";
    public static final String CAMPO_NUMERO_TRES_DIRECCION = "//XCUIElementTypeStaticText[@name='-']/following-sibling::XCUIElementTypeTextField";
    public static final String CHECKOUT_DIRECCION_PRINCIPAL_SI = "(//XCUIElementTypeStaticText[@name='Si']/preceding-sibling::XCUIElementTypeOther)[12] | //XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[12]";
    public static final String TIPO_INMUEBLE = "//XCUIElementTypeTextField[@value='Opcional']";
    public static final String CIUDAD_DONDE_VIVE = "//XCUIElementTypeTextField[@value='Seleccionar opción']";
    public static final String OPCION_CIUDAD_RESIDENCIA = "//XCUIElementTypeOther[contains(@name, 'En qué ciudad')]/following-sibling::XCUIElementTypeStaticText";
    public static final String DESPLEGABLE_DONDE_TRABAJA = "//XCUIElementTypeOther[@value='Seleccione']";
    public static final String CAMPO_NUMERO_UNO_DIRECCION_TRABAJO = "//XCUIElementTypeStaticText[@name='#']/preceding-sibling::XCUIElementTypeTextField";
    public static final String CAMPO_NUMERO_DOS_DIRECCION_TRABAJI = "//XCUIElementTypeStaticText[@name='#']/following-sibling::XCUIElementTypeTextField";
    public static final String CAMPO_NUMERO_TRES_DIRECCION_TRABAJO = "//XCUIElementTypeStaticText[@name='-']/following-sibling::XCUIElementTypeTextField";
    public static final String CHECKOUT_SI_DIRECCION_PROPIA_DONDE_TRABAJA = "(//XCUIElementTypeStaticText[@name='Si']/preceding-sibling::XCUIElementTypeOther)[11] | //XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[12]";
    public static final String TIPO_INMUEBLE_DONDE_TRABAJA = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[14]/following-sibling::XCUIElementTypeTextField | //XCUIElementTypeTextField[@value='Opcional']";
    public static final String CIUDAD_DONDE_TRABAJA = "//XCUIElementTypeTextField[@value='Seleccionar opción']";
    public static final String CHECKOUT_NO_INGRESOS_MENSUALES = "(//XCUIElementTypeStaticText[@name='No']/preceding-sibling::XCUIElementTypeOther)[11]";
    public static final String CAMPO_GASTOS_AL_MES = "//XCUIElementTypeOther[contains(@name, 'Cuánto gasta al mes')]/following-sibling::XCUIElementTypeTextField";
    public static final String CAMPO_SUMA_LO_QUE_TIENE = "//XCUIElementTypeTextField[@value='Ingrese un valor']";
    public static final String FORMULARIO_PANTALLA_INFORMACION_LABORAL = "//XCUIElementTypeStaticText[contains(@name, 'Dónde trabaja')]";
    public static final String FORMULARIO_PANTALLA_INFORMACION_FINANCIERA = "//XCUIElementTypeStaticText[contains(@name, 'financiera')] | //*[contains(@name, 'expuesta')]";
    public static final String SUMA_LO_QUE_DEBE = "//XCUIElementTypeTextField[@value='Ingrese un valor']";
    public static final String CHECKOUT_NO_PRODUCTOS_MONEDA_EXTRANJERA = "(//XCUIElementTypeStaticText[@name='No']/preceding-sibling::XCUIElementTypeOther)[12]";
    public static final String TXT_USTED_HA_SIDO_O_FUE = "//XCUIElementTypeStaticText[contains(@name, 'Usted es actualmente o ha sido durante los últimos dos años')]";
    public static final String CHECKOUT_USTED_HA_SIDO_O_FUE = "((//XCUIElementTypeStaticText[@name='No'])[1]/preceding-sibling::XCUIElementTypeOther)[10]";
    public static final String CHECKOUT_PERSONA_EXPUESTA = "(//XCUIElementTypeStaticText[@name='Si']/preceding-sibling::XCUIElementTypeOther)[8]";
    public static final String TXT_PER_POL_EXPUESTA = "//XCUIElementTypeStaticText[contains(@name, 'Usted es una persona politicamente expuesta')]";
    public static final String CHECKOUT_CARGO_POLITICO = "((//XCUIElementTypeStaticText[@name='Si'])[2]/preceding-sibling::XCUIElementTypeOther)[12]";
    public static final String CHECKOUT_CARGO_POLITICO_NO = "((//XCUIElementTypeStaticText[@name= 'No'])[2]/preceding-sibling::XCUIElementTypeOther)[15]";
    public static final String TXT_FAMILIAR_PERSONA_CARACT_ANTERIORES = "//XCUIElementTypeStaticText[contains(@name, 'Usted es familiar de una persona con las características anteriores')]";
    public static final String CHECKOUT_FAMILIAR_PERSONA_CARACT_ANTERIORES_NO = "((//XCUIElementTypeStaticText[@name='No'])[3]/preceding-sibling::XCUIElementTypeOther)[19]";
    public static final String CHECKOUT_JUNTA_DIRECTIVA = "((//XCUIElementTypeStaticText[@name='No'])[3]/preceding-sibling::XCUIElementTypeOther)[19]";
    public static final String CHECKOUT_PERSONA_POLITICAMENTE_EXPUESTA = "((//XCUIElementTypeStaticText[@name='No'])[4]/preceding-sibling::XCUIElementTypeOther)[23]";
    public static final String CHECKOUT_PERSONA_POLITICAMENTE_EXPUESTA_SI = "((//XCUIElementTypeStaticText[@name='Si'])[4]/preceding-sibling::XCUIElementTypeOther)[20]";
    public static final String CHECKOUT_FAMILIAR = "((//XCUIElementTypeStaticText[@name='No'])[3]/preceding-sibling::XCUIElementTypeOther)[23]";
    public static final String CAMPO_QUE_CARGO_TIENE = "//XCUIElementTypeOther[contains(@name, 'Qué cargo tiene')]/following-sibling::XCUIElementTypeTextField";
    public static final String OPCION_CAMPO_QUE_CARGO_TIENE = "//XCUIElementTypeOther[contains(@name, 'Qué cargo tiene')]/following-sibling::XCUIElementTypeStaticText";
    public static final String FECHA_VINCULACION = "//XCUIElementTypeOther[contains(@name, 'Fecha de vinculación al cargo')]/following-sibling::XCUIElementTypeStaticText";
    public static final String FORMULARIO_PANTALLA_INFORMACION_TRIBUTARIA = "//XCUIElementTypeStaticText[contains(@name, 'Información tributaria')]";
    public static final String CHECKOUT_PAIS_RECIDENCIA = "((//XCUIElementTypeStaticText[@name='No'])[1]/preceding-sibling::XCUIElementTypeOther)[10]";
    public static final String CHECKOUT_NO_LEY_FACTA = "((//XCUIElementTypeStaticText[@name='No'])[2]/preceding-sibling::XCUIElementTypeOther)[14]";
    public static final String CHECKOUT_SI_LEY_FACTA = "((//XCUIElementTypeStaticText[@name='Si'])[2]/preceding-sibling::XCUIElementTypeOther)[12]";
    public static final String FORMULARIO_DECLARACIONES = "//XCUIElementTypeStaticText[contains(@name, 'Declaraciones')] | //XCUIElementTypeStaticText[contains(@name, 'Declaración')]";
    public static final String NOMBRE_DECLARACION_IMPUESTOS = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[7]/following-sibling::XCUIElementTypeTextField";
    public static final String DESPLEGABLE_CLASIFICACION_TRIBUTARIA = "//XCUIElementTypeOther[contains(@name, 'Cuál es su clasificación tributaria federal en Estados Unidos')]/following-sibling::XCUIElementTypeOther | //XCUIElementTypeOther[@value='Individuo/empresario por cuenta propia o LLC de un solo miembro']";
    public static final String OPCION_CLASIFICACION_TRIBUTARIA = "";
    public static final String CAMPO_DIRECCION_FACTA = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[10]/following-sibling::XCUIElementTypeTextField";
    public static final String CAMPO_CIUDAD = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[11]/following-sibling::XCUIElementTypeTextField";
    public static final String CAMPO_CODIGO_POSTAL = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[12]/following-sibling::XCUIElementTypeTextField";
    public static final String CAMPO_NUMERO_SEGURO_SOCIAL = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[13]/following-sibling::XCUIElementTypeTextField";
    public static final String CHECKOUT_OBJETIVO_ADELANTO = "//XCUIElementTypeStaticText[contains(@name, 'Declaro que el objetivo de mi Adelanto de Sueldo')]/preceding-sibling::XCUIElementTypeSwitch";
    public static final String CHECKOUT_ORIGEN_RECURSOS = "(//XCUIElementTypeStaticText[contains(@name, 'Declaro que el origen de mis recursos')]/preceding-sibling::XCUIElementTypeSwitch)[2]";
    public static final String CHECKOUT_NO_OBJETIVO_INVESTIGACIONES = "(//XCUIElementTypeStaticText[@name='No']/preceding-sibling::XCUIElementTypeOther)[11]";
    public static final String CHECKOUT_OBJETIVO_AUTORIZACIONES = "(//XCUIElementTypeStaticText[contains(@name, 'Declaro que he leído')]/preceding-sibling::XCUIElementTypeSwitch)[3]";
    public static final String TXT_VALOR_CUPO = "//XCUIElementTypeStaticText[contains(@name, 'El cupo de su Adelanto de Sueldo será de')]";
    public static final String CHECKOUT_AUTORIZADOR_CONTRATO = "//XCUIElementTypeOther[contains(@name, 'Acepto que conozco y estoy de acuerdo')]/preceding-sibling::XCUIElementTypeSwitch";
    public static final String CHECKOUT_AUTORIZADOR_DEBITAR_AUTOMATICO = "(//XCUIElementTypeOther[contains(@name, 'Autorizo a Davivienda para')]/preceding-sibling::XCUIElementTypeSwitch)[2]"; 
    public static final String CHECKOUT_AUTORIZADOR_PAGARE = "(//XCUIElementTypeOther[contains(@name, 'Declaro que he leído y acepto firmar el')]/preceding-sibling::XCUIElementTypeSwitch)[3]";
}
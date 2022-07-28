var parametres = msg.split("|");
var funcio = parametres[0];
var dni = parametres[1];

logger.info("----------------------")
logger.info("IN: " + parametres);
logger.info("IN: " + funcio);
logger.info("IN: " + dni);

var dbConn;
var result;
var driver = "oracle.jdbc.OracleDriver";
var address = "jdbc:oracle:thin:@<<IP>>:<<Port>>:<<nomBBDD>>";
var username = '<usuariBBDD>';
var password = '<contrasenyaBBDD>';

try {
	dbConn = DatabaseConnectionFactory.createDatabaseConnection(driver, address, username, password);
	logger.info("Executant query");
	result = dbConn.executeCachedQuery("SELECT  ci2200.CI22NOMBRE NOM, ci2200.CI22PRIAPEL COGNOM1, ci2200.CI22SEGAPEL COGNOM2, CI2200.CI22DNI DNI, CI2200.CI22FECNACIM DATA_NAIX, CI1000.CI10TIPOVIA TIPUS_VIA, CI1000.CI10NOMBREVIA NOM_VIA, CI1000.CI10NUMVIAINF NUM, CI1000.CI10BLOQUE BLOC, CI1000.CI10PORTAL PORTAL, CI1000.CI10PISO PIS, CI1000.CI10PUERTA PORTA, CI1000.CI10ESCALERA ESCALA, CI1000.CI07CODPOSTAL CODI_POSTAL, REPLACE(TRANSLATE(UPPER(ci1000.CI10TELEFONO), '+-.AÀÁBCDEÈÉFGHIÌÍJKLMNOÒÓPQRSTUÙÚVWXYZ', ' '), ' ', '') TEL1, REPLACE(TRANSLATE(UPPER(ci2200.CI22TFNOMOVIL), '-+.AÀÁBCDEÈÉFGHIÌÍJKLMNOÒÓPQRSTUÙÚVWXYZ', ' '), ' ', '') TEL2, ci2200.ci22DIREMAIL FROM CI.CI2200, CI.CI1000 WHERE     ci2200.ci21codpersona = ci1000.CI21CODPERSONA        AND ci1000.CI10INDDIRPRINC = -1        AND CI2200.CI22DNI = '" + dni + "'");

}catch(exp)
{ 
     logger.error(exp.message);
     try{dbConn.close();}catch(ignore){logger.info("Close Connection: "+ignore.message);}
} finally {
	if (dbConn) {
		dbConn.close();
	}
}
if (result.next()){
	logger.info("IN2: " + tmp);
	tmp['nom'] = result.getString(1);
	tmp['cognom1'] = result.getString(2);
	if (result.getString(3) != null){	tmp['cognom2'] = result.getString(3); }
	tmp['nif'] = result.getString(4);
	if (result.getString(5) != null){	tmp['dataNaixement'] = result.getString(5); }
	if (result.getString(6) != null){	tmp['tipusVia'] = result.getString(6); }
	if (result.getString(7) != null){	tmp['nomVia'] = result.getString(7); }
	if (result.getString(8) != null){	tmp['num'] = result.getString(8); }
	if (result.getString(9) != null){	tmp['bloc'] = result.getString(9); }
	if (result.getString(10) != null){	tmp['portal'] = result.getString(10); }
	if (result.getString(11) != null){	tmp['pis'] = result.getString(11); }
	if (result.getString(12) != null){	tmp['porta'] = result.getString(12); }
	if (result.getString(13) != null){	tmp['escala'] = result.getString(13); }
	if (result.getString(14) != null){	tmp['codiPostal'] = result.getString(14); }
	if (result.getString(15) != null){	tmp['tel1'] = result.getString(15); }
	if (result.getString(16) != null){	tmp['tel2'] = result.getString(16); }
	if (result.getString(17) != null){	tmp['email'] = result.getString(17); }
	logger.info("OUT2: " + tmp);
}else{
	logger.info("IN2: " + tmp);
	tmp['error'] = 'No s\'ha trobat el DNI al sistema';
	logger.info("OUT2: " + tmp);
}

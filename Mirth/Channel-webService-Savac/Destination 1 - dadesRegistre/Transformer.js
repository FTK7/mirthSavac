var parametres = msg.split("|");
var funcio = parametres[0];
var dni = parametres[1];

logger.info("----------------------")
logger.info("Transformer dadesRegistre")
logger.info("IN: " + parametres);
logger.info("IN: " + funcio);
logger.info("IN: " + dni);

var dbConn;
var result;
var driver = "oracle.jdbc.OracleDriver";
var address = "jdbc:oracle:thin:@<<IP>>:<<port>>:<<nomBBDD>>";
var username = '<<usuariBBDD>>';
var password = '<<contrasenyaBBDD>>';

try {
	dbConn = DatabaseConnectionFactory.createDatabaseConnection(driver, address, username, password);
	logger.info("Executant query");
	result = dbConn.executeCachedQuery("SELECT REPLACE(TRANSLATE(UPPER(ci1000.CI10TELEFONO), '+-.AÀÁBCDEÈÉFGHIÌÍJKLMNOÒÓPQRSTUÙÚVWXYZ', ' '), ' ', '') TEL, ci2200.ci22DIREMAIL FROM CI.CI2200,   CI.CI1000 WHERE ci2200.ci21codpersona = ci1000.CI21CODPERSONA AND ci1000.CI10INDDIRPRINC = -1 AND CI2200.CI22DNI = '" + dni + "'");

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
	var telf = result.getString(1); //get the first item in the results
	var correu = result.getString(2);
	logger.info(telf);
	logger.info(correu);
	
	logger.info("IN2: " + tmp);
	tmp['dni'] = dni;
	tmp['email'] = correu;
	tmp['mobil'] = telf;
	logger.info("OUT2: " + tmp);
}else{
	logger.info("IN2: " + tmp);
	tmp['error'] = 'No s\'ha trobat el DNI al sistema';
	logger.info("OUT2: " + tmp);
}

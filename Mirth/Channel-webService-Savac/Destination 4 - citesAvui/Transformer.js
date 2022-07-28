var parametres = msg.split("|");
var funcio = parametres[0];
var dni = parametres[1];

logger.info("----------------------")
logger.info("IN: " + parametres);
logger.info("IN: " + funcio);
logger.info("IN: " + dni);


logger.info("----------------------");
logger.info("citesAvui - Transformer");
logger.info("IN: " + msg);

var dbConn;
var result;
var driver = "oracle.jdbc.OracleDriver";
var address = "jdbc:oracle:thin:@<<IP>>:<<port>>:<<nomBD>>";
var username = '<<usuariBD>>';
var password = '<<contrasenyaBD>>';

try {
	dbConn = DatabaseConnectionFactory.createDatabaseConnection(driver, address, username, password);
	logger.info("Executant query");
	result = dbConn.executeCachedQuery("SELECT HORACITA, NH, TIS, DNI, NOMBRE, PRIMER_APELLIDO, SEGUNDO_APELLIDO, IDCITA, COD_RECURSO, DES_RECURSO, COD_TIPO_RECURSO, DES_TIPO_RECURSO, TIPO_ECONOMICO, ENTIDAD, COD_SERVICIO, DESC_SERVICIO,BLOQUEADO FROM INTGR.CITAS WHERE DNI = '" + dni + "'");

}catch(exp)
{ 
     logger.error(exp.message);
     try{dbConn.close();}catch(ignore){logger.info("Close Connection: "+ignore.message);}
} finally {
	if (dbConn) {
		dbConn.close();
	}
}
var resultSize = result.size();
msg = new XML('<llistaCites></llistaCites>');
logger.info("Nombre de resultats: " + resultSize);

if(resultSize>0){
	for(var i = 0;i<resultSize;i++){
		result.next();
		msg.appendChild(new XML('<cita><horaCita>'+result.getString(1)+'</horaCita><hc>'+result.getString(2)+'</hc><tis>'+result.getString(3)+'</tis><dni>'+result.getString(4)+'</dni><nom>'+result.getString(5)+'</nom><cognom1>'+result.getString(6)+'</cognom1><cognom2>'+result.getString(7)+'</cognom2><IDCita>'+result.getString(8)+'</IDCita><recursID>'+result.getString(9)+'</recursID><recurs>'+result.getString(10)+'</recurs><tipusRecursID>'+result.getString(11)+'</tipusRecursID><tipusRecurs>'+result.getString(12)+'</tipusRecurs><tipusEco>'+result.getString(13)+'</tipusEco><entitat>'+result.getString(14)+'</entitat><serveiID>'+result.getString(15)+'</serveiID><servei>'+result.getString(16)+'</servei><bloquejat>'+result.getString(17)+'</bloquejat></cita>'))
        }
}
logger.info("OUT: " + msg);

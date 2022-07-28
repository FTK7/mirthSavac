/*var parametres = msg.split("|");
var funcio = parametres[0];
var dni = parametres[1];

logger.info("----------------------")
logger.info("IN: " + parametres);
logger.info("IN: " + funcio);
logger.info("IN: " + dni);
*/

logger.info("----------------------");
logger.info("citesFutur - Transformer");
logger.info("IN: " + msg);

var dbConn;
var result;
var driver = "oracle.jdbc.OracleDriver";
var address = "jdbc:oracle:thin:@<<IP>>:<<port>>:<<nomBBDD>>";
var username = '<<UsuariBD>';
var password = '<<ContrasenyaBD>>';

try {
	dbConn = DatabaseConnectionFactory.createDatabaseConnection(driver, address, username, password);
	logger.info("Executant query");
	result = dbConn.executeCachedQuery("SELECT FECHACITA, HORACITA, NH, TIS, DNI, NOMBRE, PRIMER_APELLIDO, SEGUNDO_APELLIDO, IDCITA, COD_RECURSO, DES_RECURSO, COD_TIPO_RECURSO, DES_TIPO_RECURSO, TIPO_ECONOMICO, ENTIDAD, COD_SERVICIO, DESC_SERVICIO, BLOQUEADO FROM INTGR.CITAS_FUTURO");

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
		msg.appendChild(new XML('<cita><dataCita>'+result.getString(1)+'</dataCita><horaCita>'+result.getString(2)+'</horaCita><hc>'+result.getString(3)+'</hc><tis>'+result.getString(4)+'</tis><dni>'+result.getString(5)+'</dni><nom>'+result.getString(6)+'</nom><cognom1>'+result.getString(7)+'</cognom1><cognom2>'+result.getString(8)+'</cognom2><IDCita>'+result.getString(9)+'</IDCita><recursID>'+result.getString(10)+'</recursID><recurs>'+result.getString(11)+'</recurs><tipusRecursID>'+result.getString(12)+'</tipusRecursID><tipusRecurs>'+result.getString(13)+'</tipusRecurs><tipusEco>'+result.getString(14)+'</tipusEco><entitat>'+result.getString(15)+'</entitat><serveiID>'+result.getString(16)+'</serveiID><servei>'+result.getString(17)+'</servei><bloquejat>'+result.getString(18)+'</bloquejat></cita>'))
        }
}
logger.info("OUT: " + msg);

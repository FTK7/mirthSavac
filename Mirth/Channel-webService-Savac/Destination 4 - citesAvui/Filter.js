var parametres = msg.split("|");
var funcio = parametres[0];
var dni = parametres[1];

logger.info("PAR: " + parametres);
logger.info("FUN: " + funcio);
logger.info("DNI: " + dni);

if (funcio == 'citesAvui'){
	return true;
}else{
	return false;
}

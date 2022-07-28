logger.info('Return dadesRegistre');
responseMap.put('resposta', connectorMessage.getEncodedData());
logger.info(XmlUtil.prettyPrint(connectorMessage.getEncodedData()));
return connectorMessage.getEncodedData();

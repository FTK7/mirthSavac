logger.info('Return citesFutur');
responseMap.put('resposta', connectorMessage.getEncodedData());
logger.info(XmlUtil.prettyPrint(connectorMessage.getEncodedData()));
return connectorMessage.getEncodedData();

DROP TABLE IF EXISTS Ticket;

CREATE TABLE `Ticket` (
  `ItineraryID` int(11) NOT NULL AUTO_INCREMENT,
  `FechaSalida` date NOT NULL,
  `FechaLlegada` date NOT NULL,
  `ORIGEN` varchar(200) NOT NULL,
  `DESTINO` varchar(200) NOT NULL,
  `NOMBRE` varchar(200) NOT NULL,
  `EDAD` int(11) NOT NULL,
  `EQUIPAJE` char(1) NOT NULL,
  `PRECIO` decimal(18,2) NOT NULL,
  `HORASALIDA` time NOT NULL,
  `HORALLEGADA` time NOT NULL,
  PRIMARY KEY (`ItineraryID`)
);
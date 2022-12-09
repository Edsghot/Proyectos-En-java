-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.6.11


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema laboratorio
--

CREATE DATABASE IF NOT EXISTS laboratorio;
USE laboratorio;

--
-- Definition of table `clases`
--

DROP TABLE IF EXISTS `clases`;
CREATE TABLE `clases` (
  `idclases` varchar(45) NOT NULL,
  `idhorarios` varchar(45) NOT NULL,
  `idmateria` varchar(45) NOT NULL,
  `idlabaratorio` varchar(45) NOT NULL,
  `dia` varchar(45) NOT NULL,
  `asistencia` varchar(45) NOT NULL,
  PRIMARY KEY (`idclases`),
  KEY `FK_clases_1` (`idmateria`),
  CONSTRAINT `FK_clases_1` FOREIGN KEY (`idmateria`) REFERENCES `materia` (`idmateria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `clases`
--

/*!40000 ALTER TABLE `clases` DISABLE KEYS */;
/*!40000 ALTER TABLE `clases` ENABLE KEYS */;


--
-- Definition of table `equipospc`
--

DROP TABLE IF EXISTS `equipospc`;
CREATE TABLE `equipospc` (
  `idEquiposPC` varchar(45) NOT NULL,
  `Hardware` varchar(45) DEFAULT NULL,
  `Sotfware` varchar(45) DEFAULT NULL,
  `Estatus` varchar(45) NOT NULL,
  `Clave_PC` varchar(45) NOT NULL,
  PRIMARY KEY (`idEquiposPC`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `equipospc`
--

/*!40000 ALTER TABLE `equipospc` DISABLE KEYS */;
INSERT INTO `equipospc` (`idEquiposPC`,`Hardware`,`Sotfware`,`Estatus`,`Clave_PC`) VALUES 
 ('1',NULL,NULL,'Disponible','LDS01'),
 ('10',NULL,NULL,'Disponible ','LDS10'),
 ('100',NULL,NULL,'Disponible ','LSO16'),
 ('101',NULL,NULL,'Disponible ','LSO17'),
 ('102',NULL,NULL,'Disponible ','LSO18'),
 ('103',NULL,NULL,'Disponible ','LSO19'),
 ('104',NULL,NULL,'Disponible ','LSO20'),
 ('105',NULL,NULL,'Disponible ','LSO21'),
 ('106',NULL,NULL,'Disponible ','LSO22'),
 ('107',NULL,NULL,'Disponible ','LSO23'),
 ('108',NULL,NULL,'Disponible ','LSO24'),
 ('109',NULL,NULL,'Disponible ','LSO25'),
 ('11',NULL,NULL,'Disponible ','LDS11'),
 ('110',NULL,NULL,'Disponible ','LSO26'),
 ('111',NULL,NULL,'Disponible ','LSO27'),
 ('112',NULL,NULL,'Disponible ','LSO28'),
 ('113',NULL,NULL,'Disponible ','LSO29'),
 ('114',NULL,NULL,'Disponible ','LSO30'),
 ('115',NULL,NULL,'Disponible ','LSO31'),
 ('116',NULL,NULL,'Disponible ','LSO32'),
 ('117',NULL,NULL,'Disponible ','LDM01'),
 ('118',NULL,NULL,'Disponible ','LDM02'),
 ('119',NULL,NULL,'Disponible ','LDM03'),
 ('12',NULL,NULL,'Disponible ','LDS12'),
 ('120',NULL,NULL,'Disponible ','LDM04'),
 ('121',NULL,NULL,'Disponible ','LDM05'),
 ('122',NULL,NULL,'Disponible ','LDM06'),
 ('123',NULL,NULL,'Disponible ','LDM07'),
 ('124',NULL,NULL,'Disponible ','LDM08'),
 ('125',NULL,NULL,'Disponible ','LDM09'),
 ('126',NULL,NULL,'Disponible ','LDM10'),
 ('127',NULL,NULL,'Disponible ','LDM11'),
 ('128',NULL,NULL,'Disponible ','LDM12'),
 ('129',NULL,NULL,'Disponible ','LDM13'),
 ('13',NULL,NULL,'Disponible ','LDS13'),
 ('130',NULL,NULL,'Disponible ','LDM14'),
 ('131',NULL,NULL,'Disponible ','LDM15'),
 ('132',NULL,NULL,'Disponible ','LDM16'),
 ('133',NULL,NULL,'Disponible ','LDM17'),
 ('134',NULL,NULL,'Disponible ','LDM18'),
 ('135',NULL,NULL,'Disponible ','LDM19'),
 ('136',NULL,NULL,'Disponible ','LDM20'),
 ('137',NULL,NULL,'Disponible ','LDM21'),
 ('138',NULL,NULL,'Disponible ','LDM22'),
 ('139',NULL,NULL,'Disponible ','LDM23'),
 ('14',NULL,NULL,'Disponible ','LDS14'),
 ('140',NULL,NULL,'Disponible ','LDM24'),
 ('141',NULL,NULL,'Disponible ','LDM25'),
 ('142',NULL,NULL,'Disponible ','LDM26'),
 ('143',NULL,NULL,'Disponible ','LDM27'),
 ('144',NULL,NULL,'Disponible ','LDM28'),
 ('145',NULL,NULL,'Disponible ','LDM29'),
 ('146',NULL,NULL,'Disponible ','LDM30'),
 ('15',NULL,NULL,'Disponible ','LDS15'),
 ('16',NULL,NULL,'Disponible ','LDS16'),
 ('17',NULL,NULL,'Disponible ','LDS17'),
 ('18',NULL,NULL,'Disponible ','LDS18'),
 ('19',NULL,NULL,'Disponible ','LDS19'),
 ('2',NULL,NULL,'Disponible','LDS02'),
 ('20',NULL,NULL,'Disponible ','LDS20'),
 ('21',NULL,NULL,'Disponible ','LAS01'),
 ('22',NULL,NULL,'Disponible ','LAS02'),
 ('23',NULL,NULL,'Disponible ','LAS03'),
 ('24',NULL,NULL,'Disponible ','LAS04'),
 ('25',NULL,NULL,'Disponible ','LAS05'),
 ('26',NULL,NULL,'Disponible ','LAS06'),
 ('27',NULL,NULL,'Disponible ','LAS07'),
 ('28',NULL,NULL,'Disponible ','LAS08'),
 ('29',NULL,NULL,'Disponible ','LAS09'),
 ('3',NULL,NULL,'Disponible ','LDS03'),
 ('30',NULL,NULL,'Disponible ','LAS10'),
 ('31',NULL,NULL,'Disponible ','LAS11'),
 ('32',NULL,NULL,'Disponible ','LAS12'),
 ('33',NULL,NULL,'Disponible ','LAS13'),
 ('34',NULL,NULL,'Disponible ','LAS14'),
 ('35',NULL,NULL,'Disponible ','LAS15'),
 ('36',NULL,NULL,'Disponible ','LAS16'),
 ('37',NULL,NULL,'Disponible ','LAS17'),
 ('38',NULL,NULL,'Disponible ','LAS18'),
 ('39',NULL,NULL,'Disponible ','LAS19'),
 ('4',NULL,NULL,'Disponible ','LDS04'),
 ('40',NULL,NULL,'Disponible ','LAS20'),
 ('41',NULL,NULL,'Disponible ','LAS21'),
 ('42',NULL,NULL,'Disponible ','LAS22'),
 ('43',NULL,NULL,'Disponible ','LAS23'),
 ('44',NULL,NULL,'Disponible ','LAS24'),
 ('45',NULL,NULL,'Disponible ','LAS25'),
 ('46',NULL,NULL,'Disponible ','LAS26'),
 ('47',NULL,NULL,'Disponible ','LAS27'),
 ('48',NULL,NULL,'Disponible ','LAS28'),
 ('49',NULL,NULL,'Disponible ','LAS29'),
 ('5',NULL,NULL,'Disponible ','LDS05'),
 ('50',NULL,NULL,'Disponible ','LAS30'),
 ('51',NULL,NULL,'Disponible ','LAS31'),
 ('52',NULL,NULL,'Disponible ','LAS32'),
 ('53',NULL,NULL,'Disponible ','LPG01'),
 ('54',NULL,NULL,'Disponible ','LPG02'),
 ('55',NULL,NULL,'Disponible ','LPG03'),
 ('56',NULL,NULL,'Disponible ','LPG04'),
 ('57',NULL,NULL,'Disponible ','LPG05'),
 ('58',NULL,NULL,'Disponible ','LPG06'),
 ('59',NULL,NULL,'Disponible ','LPG07'),
 ('6',NULL,NULL,'Disponible ','LDS06'),
 ('60',NULL,NULL,'Disponible ','LPG08'),
 ('61',NULL,NULL,'Disponible ','LPG09'),
 ('62',NULL,NULL,'Disponible ','LPG10'),
 ('63',NULL,NULL,'Disponible ','LPG11'),
 ('64',NULL,NULL,'Disponible ','LPG12'),
 ('65',NULL,NULL,'Disponible ','LPG13'),
 ('66',NULL,NULL,'Disponible ','LPG14'),
 ('67',NULL,NULL,'Disponible ','LPG15'),
 ('68',NULL,NULL,'Disponible ','LPG16'),
 ('69',NULL,NULL,'Disponible ','LPG17'),
 ('7',NULL,NULL,'Disponible ','LDS07'),
 ('70',NULL,NULL,'Disponible ','LPG18'),
 ('71',NULL,NULL,'Disponible ','LPG20'),
 ('72',NULL,NULL,'Disponible ','LPG21'),
 ('73',NULL,NULL,'Disponible ','LPG22'),
 ('74',NULL,NULL,'Disponible ','LPG23'),
 ('75',NULL,NULL,'Disponible ','LPG24'),
 ('76',NULL,NULL,'Disponible ','LPG25'),
 ('77',NULL,NULL,'Disponible ','LPG26'),
 ('78',NULL,NULL,'Disponible ','LPG27'),
 ('79',NULL,NULL,'Disponible ','LPG28'),
 ('8',NULL,NULL,'Disponible ','LDS08'),
 ('80',NULL,NULL,'Disponible ','LPG29'),
 ('81',NULL,NULL,'Disponible ','LPG30'),
 ('82',NULL,NULL,'Disponible ','LPG31'),
 ('83',NULL,NULL,'Disponible ','LPG32'),
 ('84',NULL,NULL,'Disponible ','LSO01'),
 ('85',NULL,NULL,'Disponible ','LSO02'),
 ('86',NULL,NULL,'Disponible ','LSO03'),
 ('87',NULL,NULL,'Disponible ','LSO04'),
 ('88',NULL,NULL,'Disponible ','LSO05'),
 ('89',NULL,NULL,'Disponible ','LSO06'),
 ('9',NULL,NULL,'Disponible ','LDS09'),
 ('90',NULL,NULL,'Disponible ','LSO07'),
 ('91',NULL,NULL,'Disponible ','LSO08'),
 ('92',NULL,NULL,'Disponible ','LSO09'),
 ('93',NULL,NULL,'Disponible ','LSO09'),
 ('94',NULL,NULL,'Disponible ','LSO10'),
 ('95',NULL,NULL,'Disponible ','LSO11'),
 ('96',NULL,NULL,'Disponible ','LSO12'),
 ('97',NULL,NULL,'Disponible ','LSO13'),
 ('98',NULL,NULL,'Disponible ','LSO14'),
 ('99',NULL,NULL,'Disponible ','LSO15');
/*!40000 ALTER TABLE `equipospc` ENABLE KEYS */;


--
-- Definition of table `horarios`
--

DROP TABLE IF EXISTS `horarios`;
CREATE TABLE `horarios` (
  `idhorarios` varchar(45) NOT NULL,
  `idmateria` varchar(45) NOT NULL,
  `idlaboratorio` varchar(45) NOT NULL,
  `dia` varchar(45) NOT NULL,
  `horas` varchar(45) NOT NULL,
  PRIMARY KEY (`idhorarios`),
  KEY `FK_horarios_1` (`idmateria`),
  KEY `FK_horarios_2` (`idlaboratorio`),
  CONSTRAINT `FK_horarios_1` FOREIGN KEY (`idmateria`) REFERENCES `materia` (`idmateria`),
  CONSTRAINT `FK_horarios_2` FOREIGN KEY (`idlaboratorio`) REFERENCES `laboratorio` (`idLaboratorio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `horarios`
--

/*!40000 ALTER TABLE `horarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `horarios` ENABLE KEYS */;


--
-- Definition of table `laboratorio`
--

DROP TABLE IF EXISTS `laboratorio`;
CREATE TABLE `laboratorio` (
  `idLaboratorio` varchar(45) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Estatus` varchar(45) NOT NULL,
  PRIMARY KEY (`idLaboratorio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `laboratorio`
--

/*!40000 ALTER TABLE `laboratorio` DISABLE KEYS */;
/*!40000 ALTER TABLE `laboratorio` ENABLE KEYS */;


--
-- Definition of table `mantenimiento`
--

DROP TABLE IF EXISTS `mantenimiento`;
CREATE TABLE `mantenimiento` (
  `idMantenimiento` varchar(45) NOT NULL,
  `idEquiposPC` varchar(45) NOT NULL,
  `idUsuarios` varchar(45) NOT NULL,
  `FechaM_I` varchar(45) NOT NULL,
  `FechaM_F` varchar(45) NOT NULL,
  PRIMARY KEY (`idMantenimiento`),
  KEY `FK_mantenimiento_1` (`idEquiposPC`),
  KEY `FK_mantenimiento_2` (`idUsuarios`),
  CONSTRAINT `FK_mantenimiento_1` FOREIGN KEY (`idEquiposPC`) REFERENCES `equipospc` (`idEquiposPC`),
  CONSTRAINT `FK_mantenimiento_2` FOREIGN KEY (`idUsuarios`) REFERENCES `usuarios` (`idUsuarios`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `mantenimiento`
--

/*!40000 ALTER TABLE `mantenimiento` DISABLE KEYS */;
/*!40000 ALTER TABLE `mantenimiento` ENABLE KEYS */;


--
-- Definition of table `materia`
--

DROP TABLE IF EXISTS `materia`;
CREATE TABLE `materia` (
  `idmateria` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `idusuarios` varchar(45) NOT NULL,
  `idperiodos` varchar(45) NOT NULL,
  PRIMARY KEY (`idmateria`),
  KEY `FK_materia_1` (`idusuarios`),
  KEY `FK_materia_2` (`idperiodos`),
  CONSTRAINT `FK_materia_1` FOREIGN KEY (`idusuarios`) REFERENCES `usuarios` (`idUsuarios`),
  CONSTRAINT `FK_materia_2` FOREIGN KEY (`idperiodos`) REFERENCES `periodos` (`idPeriodos`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `materia`
--

/*!40000 ALTER TABLE `materia` DISABLE KEYS */;
/*!40000 ALTER TABLE `materia` ENABLE KEYS */;


--
-- Definition of table `observaciones`
--

DROP TABLE IF EXISTS `observaciones`;
CREATE TABLE `observaciones` (
  `idobservaciones` varchar(45) NOT NULL,
  `idequipospc` varchar(45) NOT NULL,
  `idusuarios` varchar(45) NOT NULL,
  `fecha_o` varchar(45) NOT NULL,
  `observacion` varchar(45) NOT NULL,
  `estatus` varchar(45) NOT NULL,
  PRIMARY KEY (`idobservaciones`),
  KEY `FK_observaciones_1` (`idequipospc`),
  KEY `FK_observaciones_2` (`idusuarios`),
  CONSTRAINT `FK_observaciones_1` FOREIGN KEY (`idequipospc`) REFERENCES `equipospc` (`idEquiposPC`),
  CONSTRAINT `FK_observaciones_2` FOREIGN KEY (`idusuarios`) REFERENCES `usuarios` (`idUsuarios`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `observaciones`
--

/*!40000 ALTER TABLE `observaciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `observaciones` ENABLE KEYS */;


--
-- Definition of table `periodos`
--

DROP TABLE IF EXISTS `periodos`;
CREATE TABLE `periodos` (
  `idPeriodos` varchar(45) NOT NULL,
  `Clave` varchar(45) NOT NULL,
  `Periodo` varchar(45) NOT NULL,
  PRIMARY KEY (`idPeriodos`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `periodos`
--

/*!40000 ALTER TABLE `periodos` DISABLE KEYS */;
/*!40000 ALTER TABLE `periodos` ENABLE KEYS */;


--
-- Definition of table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE `usuarios` (
  `idUsuarios` varchar(45) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Contraseña` varchar(45) NOT NULL,
  `Rol` varchar(45) NOT NULL,
  PRIMARY KEY (`idUsuarios`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `usuarios`
--

/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

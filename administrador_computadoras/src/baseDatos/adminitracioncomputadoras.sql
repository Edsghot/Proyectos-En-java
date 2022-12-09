-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-12-2022 a las 23:35:19
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.0.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `adminitracioncomputadoras`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clases`
--

CREATE TABLE `clases` (
  `ID_Clases` varchar(45) NOT NULL,
  `ID_Materias` varchar(45) NOT NULL,
  `ID_Laboratorios` varchar(45) NOT NULL,
  `Dia` varchar(45) NOT NULL,
  `Asistencia` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clases`
--

INSERT INTO `clases` (`ID_Clases`, `ID_Materias`, `ID_Laboratorios`, `Dia`, `Asistencia`) VALUES
('03', '03', '03', 'Jueves', 'presente');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipospc`
--

CREATE TABLE `equipospc` (
  `ID_EquiposPC` varchar(45) NOT NULL,
  `Hadware` varchar(45) DEFAULT NULL,
  `Software` varchar(45) NOT NULL,
  `Estatus` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `equipospc`
--

INSERT INTO `equipospc` (`ID_EquiposPC`, `Hadware`, `Software`, `Estatus`) VALUES
('001', 'core i8', 'openSource', 'ocupado'),
('002', 'core i9', 'openSource', 'mantenimiento'),
('003', 'core i5', 'openSource', 'disponible'),
('03', 'corei3', 'opensource', 'ocupado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `horarios`
--

CREATE TABLE `horarios` (
  `ID_Horarios` varchar(45) NOT NULL,
  `ID_Materias` varchar(45) NOT NULL,
  `ID_Laboratorios` varchar(45) NOT NULL,
  `Dia` varchar(45) NOT NULL,
  `Asistencia` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `horarios`
--

INSERT INTO `horarios` (`ID_Horarios`, `ID_Materias`, `ID_Laboratorios`, `Dia`, `Asistencia`) VALUES
('03', '03', '03', 'jueves', '2:00 pm');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `laboratorio`
--

CREATE TABLE `laboratorio` (
  `ID_Laboratorio` varchar(45) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Estatus` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `laboratorio`
--

INSERT INTO `laboratorio` (`ID_Laboratorio`, `Nombre`, `Estatus`) VALUES
('001', 'Laboratorio de Dispositivos Moviles', 'disponible'),
('002', 'Laboratorio de Programacion General', 'disponible'),
('003', 'Laboratorio de Sistemas Operativos', 'disponible'),
('004', 'Laboratorio de Desarrollo de software', 'disponible'),
('005', 'Laboratorio de Administrador de Servidores', 'disponible'),
('03', 'LAB01', 'activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mantenimientos`
--

CREATE TABLE `mantenimientos` (
  `ID_Mantenimientos` varchar(45) NOT NULL,
  `ID_EquiposPC` varchar(45) NOT NULL,
  `ID_Usuarios` varchar(45) NOT NULL,
  `FechaM_I` varchar(45) NOT NULL,
  `FechaM_F` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `mantenimientos`
--

INSERT INTO `mantenimientos` (`ID_Mantenimientos`, `ID_EquiposPC`, `ID_Usuarios`, `FechaM_I`, `FechaM_F`) VALUES
('03', '03', '03', '09/12/2022', '25/12/2022');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materias`
--

CREATE TABLE `materias` (
  `ID_Materias` varchar(45) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `ID_Usuarios` varchar(45) NOT NULL,
  `ID_Periodos` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `materias`
--

INSERT INTO `materias` (`ID_Materias`, `Nombre`, `ID_Usuarios`, `ID_Periodos`) VALUES
('03', 'Programacion', '03', '03');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `observaciones`
--

CREATE TABLE `observaciones` (
  `ID_Observaciones` varchar(45) NOT NULL,
  `ID_EquiposPC` varchar(45) NOT NULL,
  `ID_Usuarios` varchar(45) NOT NULL,
  `Fecha_O` varchar(45) NOT NULL,
  `Observacion` varchar(45) NOT NULL,
  `Estatus` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `observaciones`
--

INSERT INTO `observaciones` (`ID_Observaciones`, `ID_EquiposPC`, `ID_Usuarios`, `Fecha_O`, `Observacion`, `Estatus`) VALUES
('03', '03', '03', '12/12/2022', 'fallo el monitor', 'inactivo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `periodos`
--

CREATE TABLE `periodos` (
  `ID_Periodos` varchar(45) NOT NULL,
  `Clave` varchar(45) NOT NULL,
  `Periodo` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `periodos`
--

INSERT INTO `periodos` (`ID_Periodos`, `Clave`, `Periodo`) VALUES
('03', 'er43·', 'ad');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservaciones`
--

CREATE TABLE `reservaciones` (
  `Id_Reserva` varchar(45) NOT NULL,
  `Id_laboratorio` varchar(45) NOT NULL,
  `Id_equipo` varchar(45) NOT NULL,
  `Descripcion` varchar(45) NOT NULL,
  `avisos` varchar(80) NOT NULL,
  `estatus` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `reservaciones`
--

INSERT INTO `reservaciones` (`Id_Reserva`, `Id_laboratorio`, `Id_equipo`, `Descripcion`, `avisos`, `estatus`) VALUES
('001', '03', '002', 'daxsa', 'axsaas', 'ocupado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `ID_Usuarios` varchar(45) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Contrasena` varchar(45) NOT NULL,
  `Rol` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`ID_Usuarios`, `Nombre`, `Contrasena`, `Rol`) VALUES
('01', 'Erick', 'popo', 'alumno'),
('02', 'luis321', 'luis321', 'alumno'),
('03', 'Jheizon', 'contra321', 'maestro'),
('admi', 'juan', '123456', 'administrador');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clases`
--
ALTER TABLE `clases`
  ADD PRIMARY KEY (`ID_Clases`),
  ADD KEY `FK_Materias_Clases` (`ID_Materias`),
  ADD KEY `FK_Laboratorio_Clases` (`ID_Laboratorios`);

--
-- Indices de la tabla `equipospc`
--
ALTER TABLE `equipospc`
  ADD PRIMARY KEY (`ID_EquiposPC`);

--
-- Indices de la tabla `horarios`
--
ALTER TABLE `horarios`
  ADD PRIMARY KEY (`ID_Horarios`),
  ADD KEY `FK_Materias_Horarios` (`ID_Materias`),
  ADD KEY `FK_Laboratorio_Horarios` (`ID_Laboratorios`);

--
-- Indices de la tabla `laboratorio`
--
ALTER TABLE `laboratorio`
  ADD PRIMARY KEY (`ID_Laboratorio`);

--
-- Indices de la tabla `mantenimientos`
--
ALTER TABLE `mantenimientos`
  ADD PRIMARY KEY (`ID_Mantenimientos`),
  ADD KEY `FK_EquiposPC_Mantenimientos` (`ID_EquiposPC`),
  ADD KEY `FK_Usuarios_Mantenimientos` (`ID_Usuarios`);

--
-- Indices de la tabla `materias`
--
ALTER TABLE `materias`
  ADD PRIMARY KEY (`ID_Materias`),
  ADD KEY `FK_Usuarios_Materias` (`ID_Usuarios`),
  ADD KEY `FK_Periodos_Materias` (`ID_Periodos`);

--
-- Indices de la tabla `observaciones`
--
ALTER TABLE `observaciones`
  ADD PRIMARY KEY (`ID_Observaciones`),
  ADD KEY `FK_EquiposPC_Observaciones` (`ID_EquiposPC`),
  ADD KEY `FK_Usuarios_Observacion` (`ID_Usuarios`);

--
-- Indices de la tabla `periodos`
--
ALTER TABLE `periodos`
  ADD PRIMARY KEY (`ID_Periodos`);

--
-- Indices de la tabla `reservaciones`
--
ALTER TABLE `reservaciones`
  ADD PRIMARY KEY (`Id_Reserva`(10));

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`ID_Usuarios`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `clases`
--
ALTER TABLE `clases`
  ADD CONSTRAINT `FK_Laboratorio_Clases` FOREIGN KEY (`ID_Laboratorios`) REFERENCES `laboratorio` (`ID_Laboratorio`),
  ADD CONSTRAINT `FK_Materias_Clases` FOREIGN KEY (`ID_Materias`) REFERENCES `materias` (`ID_Materias`);

--
-- Filtros para la tabla `horarios`
--
ALTER TABLE `horarios`
  ADD CONSTRAINT `FK_Laboratorio_Horarios` FOREIGN KEY (`ID_Laboratorios`) REFERENCES `laboratorio` (`ID_Laboratorio`),
  ADD CONSTRAINT `FK_Materias_Horarios` FOREIGN KEY (`ID_Materias`) REFERENCES `materias` (`ID_Materias`);

--
-- Filtros para la tabla `mantenimientos`
--
ALTER TABLE `mantenimientos`
  ADD CONSTRAINT `FK_EquiposPC_Mantenimientos` FOREIGN KEY (`ID_EquiposPC`) REFERENCES `equipospc` (`ID_EquiposPC`),
  ADD CONSTRAINT `FK_Usuarios_Mantenimientos` FOREIGN KEY (`ID_Usuarios`) REFERENCES `usuarios` (`ID_Usuarios`);

--
-- Filtros para la tabla `materias`
--
ALTER TABLE `materias`
  ADD CONSTRAINT `FK_Periodos_Materias` FOREIGN KEY (`ID_Periodos`) REFERENCES `periodos` (`ID_Periodos`),
  ADD CONSTRAINT `FK_Usuarios_Materias` FOREIGN KEY (`ID_Usuarios`) REFERENCES `usuarios` (`ID_Usuarios`);

--
-- Filtros para la tabla `observaciones`
--
ALTER TABLE `observaciones`
  ADD CONSTRAINT `FK_EquiposPC_Observaciones` FOREIGN KEY (`ID_EquiposPC`) REFERENCES `equipospc` (`ID_EquiposPC`),
  ADD CONSTRAINT `FK_Usuarios_Observacion` FOREIGN KEY (`ID_Usuarios`) REFERENCES `usuarios` (`ID_Usuarios`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

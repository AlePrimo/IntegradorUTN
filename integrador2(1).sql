-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-11-2023 a las 02:51:36
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `integrador2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `estado` bit(1) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `cuit` bigint(20) NOT NULL,
  `apellido` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `razonSocial` varchar(255) NOT NULL,
  `telefono` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`estado`, `idCliente`, `cuit`, `apellido`, `email`, `nombre`, `razonSocial`, `telefono`) VALUES
(b'1', 1, 321445298, 'Parna', 'parna@hotmail.com', 'Juan Carlos', 'Pelucas Perez', '152223689'),
(b'1', 3, 12452873, 'Garcia', 'garcia@gmail.com', 'Claudio', 'Taller Garcia', '114528963');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habilidad`
--

CREATE TABLE `habilidad` (
  `estado` bit(1) NOT NULL,
  `idHabilidad` int(11) NOT NULL,
  `idTecnico` int(11) NOT NULL,
  `especialidad` enum('WINDOWS','MACOS','LINUX','ANDROID','TANGO','SAP') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `habilidad`
--

INSERT INTO `habilidad` (`estado`, `idHabilidad`, `idTecnico`, `especialidad`) VALUES
(b'1', 1, 1, 'WINDOWS');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `incidente`
--

CREATE TABLE `incidente` (
  `fechaResolucion` date NOT NULL,
  `idCliente` int(11) NOT NULL,
  `idIncidente` int(11) NOT NULL,
  `idTecnico` int(11) NOT NULL,
  `idTipoProblema` int(11) NOT NULL,
  `resuelto` bit(1) NOT NULL,
  `consideraciones` varchar(255) NOT NULL,
  `descripcion` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `incidente`
--

INSERT INTO `incidente` (`fechaResolucion`, `idCliente`, `idIncidente`, `idTecnico`, `idTipoProblema`, `resuelto`, `consideraciones`, `descripcion`) VALUES
('2023-03-05', 1, 1, 1, 1, b'1', 'Se soluciono el problema sin novedades', 'LLamaron de Pelucas Perez, por problemas con linux, se envio a Cocho Lopez');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `serviciocontratado`
--

CREATE TABLE `serviciocontratado` (
  `estado` bit(1) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `idServicio` int(11) NOT NULL,
  `especialidad` enum('WINDOWS','MACOS','LINUX','ANDROID','TANGO','SAP') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `serviciocontratado`
--

INSERT INTO `serviciocontratado` (`estado`, `idCliente`, `idServicio`, `especialidad`) VALUES
(b'1', 1, 1, 'LINUX');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tecnico`
--

CREATE TABLE `tecnico` (
  `disponible` bit(1) NOT NULL,
  `estado` bit(1) NOT NULL,
  `idTecnico` int(11) NOT NULL,
  `nroLegajo` int(11) NOT NULL,
  `apellido` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `telefono` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tecnico`
--

INSERT INTO `tecnico` (`disponible`, `estado`, `idTecnico`, `nroLegajo`, `apellido`, `email`, `nombre`, `telefono`) VALUES
(b'1', b'1', 1, 1221456, 'Lopez', 'cocho@gmail.com', 'Cocho', '114578964');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipoproblema`
--

CREATE TABLE `tipoproblema` (
  `idTipoProblema` int(11) NOT NULL,
  `tiempoEstimado` int(11) NOT NULL,
  `tiempoMaximo` int(11) NOT NULL,
  `detalleProblema` varchar(255) NOT NULL,
  `especialidad` enum('WINDOWS','MACOS','LINUX','ANDROID','TANGO','SAP') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tipoproblema`
--

INSERT INTO `tipoproblema` (`idTipoProblema`, `tiempoEstimado`, `tiempoMaximo`, `detalleProblema`, `especialidad`) VALUES
(1, 2, 3, 'No anda linux', 'LINUX');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`),
  ADD UNIQUE KEY `UK_as537scmvws7al2fgsv91u4aj` (`cuit`),
  ADD UNIQUE KEY `UK_6alo8doli8mi9yvea2qnlsytu` (`razonSocial`);

--
-- Indices de la tabla `habilidad`
--
ALTER TABLE `habilidad`
  ADD PRIMARY KEY (`idHabilidad`),
  ADD KEY `FKt4pru8c9yd8t8t9dt1y2hh8p` (`idTecnico`);

--
-- Indices de la tabla `incidente`
--
ALTER TABLE `incidente`
  ADD PRIMARY KEY (`idIncidente`),
  ADD KEY `FK8ywm8uullm7q7if11c271cwsv` (`idCliente`),
  ADD KEY `FK29kxtrg82w4q5s0mm4imngda6` (`idTecnico`),
  ADD KEY `FK6259g2k441dfx63lqm30ja2kw` (`idTipoProblema`);

--
-- Indices de la tabla `serviciocontratado`
--
ALTER TABLE `serviciocontratado`
  ADD PRIMARY KEY (`idServicio`),
  ADD KEY `FKl89sr36n581hh6ryur6j2pj7u` (`idCliente`);

--
-- Indices de la tabla `tecnico`
--
ALTER TABLE `tecnico`
  ADD PRIMARY KEY (`idTecnico`),
  ADD UNIQUE KEY `UK_d2q6m7m1imrmnphvcl30jlc0g` (`nroLegajo`),
  ADD UNIQUE KEY `UK_abgjgppc7qtaf1euio3pl39h8` (`email`),
  ADD UNIQUE KEY `UK_7jx2mvi2443dnff5ntvvmeu4w` (`telefono`);

--
-- Indices de la tabla `tipoproblema`
--
ALTER TABLE `tipoproblema`
  ADD PRIMARY KEY (`idTipoProblema`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `habilidad`
--
ALTER TABLE `habilidad`
  MODIFY `idHabilidad` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `incidente`
--
ALTER TABLE `incidente`
  MODIFY `idIncidente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `serviciocontratado`
--
ALTER TABLE `serviciocontratado`
  MODIFY `idServicio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `tecnico`
--
ALTER TABLE `tecnico`
  MODIFY `idTecnico` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `tipoproblema`
--
ALTER TABLE `tipoproblema`
  MODIFY `idTipoProblema` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `habilidad`
--
ALTER TABLE `habilidad`
  ADD CONSTRAINT `FKt4pru8c9yd8t8t9dt1y2hh8p` FOREIGN KEY (`idTecnico`) REFERENCES `tecnico` (`idTecnico`);

--
-- Filtros para la tabla `incidente`
--
ALTER TABLE `incidente`
  ADD CONSTRAINT `FK29kxtrg82w4q5s0mm4imngda6` FOREIGN KEY (`idTecnico`) REFERENCES `tecnico` (`idTecnico`),
  ADD CONSTRAINT `FK6259g2k441dfx63lqm30ja2kw` FOREIGN KEY (`idTipoProblema`) REFERENCES `tipoproblema` (`idTipoProblema`),
  ADD CONSTRAINT `FK8ywm8uullm7q7if11c271cwsv` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`);

--
-- Filtros para la tabla `serviciocontratado`
--
ALTER TABLE `serviciocontratado`
  ADD CONSTRAINT `FKl89sr36n581hh6ryur6j2pj7u` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

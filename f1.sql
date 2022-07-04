-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 04, 2022 at 02:25 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `f1`
--
CREATE DATABASE IF NOT EXISTS `f1` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `f1`;

-- --------------------------------------------------------

--
-- Table structure for table `drivers`
--

CREATE TABLE `drivers` (
  `id` int(11) NOT NULL,
  `team` int(11) NOT NULL,
  `driver_name` varchar(24) NOT NULL,
  `image` varchar(256) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `drivers`
--

INSERT INTO `drivers` (`id`, `team`, `driver_name`, `image`) VALUES
(1, 1, 'Fernando Alonso', 'https://www.formula1.com/content/fom-website/en/drivers/fernando-alonso/_jcr_content/image.img.1920.medium.jpg/1647334212592.jpg'),
(2, 1, 'Esteban Ocon', 'https://www.formula1.com/content/fom-website/en/drivers/esteban-ocon/_jcr_content/image.img.1920.medium.jpg/1647334188097.jpg'),
(3, 2, 'Charles Leclerc', 'https://www.formula1.com/content/fom-website/en/drivers/charles-leclerc/_jcr_content/image.img.1920.medium.jpg/1646818893219.jpg'),
(4, 2, 'Carlos Sainz', 'https://www.formula1.com/content/fom-website/en/drivers/carlos-sainz/_jcr_content/image.img.1920.medium.jpg/1646818866749.jpg'),
(6, 3, 'Max Verstappen', 'https://www.formula1.com/content/fom-website/en/drivers/max-verstappen/_jcr_content/image.img.1920.medium.jpg/1646819045507.jpg'),
(7, 3, 'Sergio Perez', 'https://www.formula1.com/content/fom-website/en/drivers/sergio-perez/_jcr_content/image.img.1920.medium.jpg/1646819228700.jpg'),
(8, 4, 'Lewis Hamilton', 'https://www.formula1.com/content/fom-website/en/drivers/lewis-hamilton/_jcr_content/image.img.1920.medium.jpg/1647334259839.jpg'),
(9, 4, 'George Russell', 'https://www.formula1.com/content/fom-website/en/drivers/george-russell/_jcr_content/image.img.1920.medium.jpg/1646750994602.jpg'),
(10, 5, 'Daniel Ricciardo', 'https://www.formula1.com/content/fom-website/en/drivers/daniel-ricciardo/_jcr_content/image.img.1920.medium.jpg/1646818924510.jpg'),
(11, 5, 'Lando Norris', 'https://www.formula1.com/content/fom-website/en/drivers/lando-norris/_jcr_content/image.img.1920.medium.jpg/1646819013197.jpg'),
(12, 6, 'Valtteri Bottas', 'https://www.formula1.com/content/fom-website/en/drivers/valtteri-bottas/_jcr_content/image.img.1920.medium.jpg/1646819266274.jpg'),
(13, 6, 'Zhou Guanyu', 'https://www.formula1.com/content/fom-website/en/drivers/guanyu-zhou/_jcr_content/image.img.1920.medium.jpg/1646818979975.jpg'),
(14, 7, 'Pierre Gasly', 'https://www.formula1.com/content/fom-website/en/drivers/pierre-gasly/_jcr_content/image.img.1920.medium.jpg/1646819179303.jpg'),
(15, 7, 'Yuki Tsunoda', 'https://www.formula1.com/content/fom-website/en/drivers/yuki-tsunoda/_jcr_content/image.img.1920.medium.jpg/1648134405786.jpg'),
(16, 8, 'Mick Schumacher', 'https://www.formula1.com/content/fom-website/en/drivers/mick-schumacher/_jcr_content/image.img.1920.medium.jpg/1647334235171.jpg'),
(17, 8, 'Kevin Magnussen', 'https://www.formula1.com/content/fom-website/en/drivers/kevin-magnussen/_jcr_content/image.img.1920.medium.jpg/1647447969295.jpg'),
(18, 9, 'Sebastian Vettel', 'https://www.formula1.com/content/fom-website/en/drivers/sebastian-vettel/_jcr_content/image.img.1920.medium.jpg/1646818813887.jpg'),
(19, 9, 'Lance Stroll', 'https://www.formula1.com/content/fom-website/en/drivers/lance-stroll/_jcr_content/image.img.1920.medium.jpg/1648135171947.jpg'),
(20, 10, 'Nicholas Latifi', 'https://www.formula1.com/content/fom-website/en/drivers/nicholas-latifi/_jcr_content/image.img.1920.medium.jpg/1646819118069.jpg'),
(21, 10, 'Alexander Albon', 'https://www.formula1.com/content/fom-website/en/drivers/alexander-albon/_jcr_content/image.img.1920.medium.jpg/1646750995556.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `history`
--

CREATE TABLE `history` (
  `selection` varchar(32) NOT NULL,
  `timestamp` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `history`
--

INSERT INTO `history` (`selection`, `timestamp`) VALUES
('Alpine', 'Mon Jul 04 15:04:47 GMT 03:00 20'),
('Mercedes', 'Mon Jul 04 15:04:50 GMT 03:00 20'),
('Alfa Romeo', 'Mon Jul 04 15:05:56 GMT 03:00 20'),
('Aston Martin', 'Mon Jul 04 15:06:00 GMT 03:00 20'),
('Fernando Alonso', 'Mon Jul 04 15:06:04 GMT 03:00 20'),
('Sergio Perez', 'Mon Jul 04 15:06:06 GMT 03:00 20'),
('Daniel Ricciardo', 'Mon Jul 04 15:06:08 GMT 03:00 20'),
('Alpine', 'Mon Jul 04 15:17:08 GMT 03:00 20'),
('Fernando Alonso', 'Mon Jul 04 15:17:12 GMT 03:00 20'),
('Red Bull Racing', 'Mon Jul 04 15:20:03 GMT 03:00 20'),
('McLaren', 'Mon Jul 04 15:20:09 GMT 03:00 20'),
('Fernando Alonso', 'Mon Jul 04 15:20:16 GMT 03:00 20'),
('Lando Norris', 'Mon Jul 04 15:20:23 GMT 03:00 20');

-- --------------------------------------------------------

--
-- Table structure for table `teams`
--

CREATE TABLE `teams` (
  `id` int(10) NOT NULL,
  `team_name` varchar(24) NOT NULL,
  `image` varchar(256) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teams`
--

INSERT INTO `teams` (`id`, `team_name`, `image`) VALUES
(1, 'Alpine', 'https://www.newsauto.gr/wp-content/uploads/2022/02/220221214727_AlpineF1A522.jpg'),
(2, 'Ferrari', 'https://www.4troxoi.gr/wp-content/uploads/2022/03/Formula-1-F1-Ferrari.jpg'),
(3, 'Red Bull Racing', 'https://img.redbull.com/images/c_limit,w_1500,h_1000,f_auto,q_auto/redbullcom/2022/2/9/eazf6gmyetldc24fjf3f/red-bull-racing-launch'),
(4, 'Mercedes', 'https://www.4troxoi.gr/wp-content/uploads/2022/02/Mercedes-F1-4.jpg'),
(5, 'McLaren', 'https://www.formula1.com/content/fom-website/en/teams/McLaren/_jcr_content/image16x9.img.1536.high.jpg'),
(6, 'Alfa Romeo', 'https://www.formula1.com/content/dam/fom-website/manual/Misc/2022manual/WinterFebruary/AlfaRomeoLaunch/C42_Front_Dynamic_ZHO_8000x6000_300DPI.jpg'),
(7, 'AlphaTauri', 'https://sasatimes.com/wp-content/uploads/2022/04/VW-F1-Introduction-What-about-Audi-and-AlphaTauri.jpg'),
(8, 'Haas F1 Team', 'https://cdn-1.motorsport.com/images/amp/254X99M0/s6/formula-1-haas-f1-team-launch--2.jpg'),
(9, 'Aston Martin', 'https://www.newsauto.gr/wp-content/uploads/2021/03/210303173941_aston-martin-amr21-launch-a1000x600.jpg'),
(10, 'Williams', 'https://www.formula1.com/content/dam/fom-website/manual/Misc/2022manual/WinterFebruary/Williams/Williams-Racing-FW44---Image-5.jpg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `drivers`
--
ALTER TABLE `drivers`
  ADD PRIMARY KEY (`id`),
  ADD KEY `team_member` (`team`);

--
-- Indexes for table `teams`
--
ALTER TABLE `teams`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `drivers`
--
ALTER TABLE `drivers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `teams`
--
ALTER TABLE `teams`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `drivers`
--
ALTER TABLE `drivers`
  ADD CONSTRAINT `team_member` FOREIGN KEY (`team`) REFERENCES `teams` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

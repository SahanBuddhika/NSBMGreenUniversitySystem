-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 23, 2018 at 05:37 AM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `nsbmstudentenrollmentsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `instructers`
--

CREATE TABLE `instructers` (
  `lectureid` varchar(10) NOT NULL,
  `firstname` varchar(30) NOT NULL,
  `lastname` varchar(30) NOT NULL,
  `nationalid` varchar(12) NOT NULL,
  `age` int(5) NOT NULL,
  `email` varchar(30) NOT NULL,
  `faculty` varchar(30) NOT NULL,
  `qualification` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `lectures`
--

CREATE TABLE `lectures` (
  `lectureid` varchar(10) NOT NULL,
  `firstname` varchar(30) NOT NULL,
  `lastname` varchar(30) NOT NULL,
  `nationalid` varchar(20) NOT NULL,
  `age` int(5) NOT NULL,
  `email` varchar(30) NOT NULL,
  `faculty` varchar(30) NOT NULL,
  `qualification` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lectures`
--

INSERT INTO `lectures` (`lectureid`, `firstname`, `lastname`, `nationalid`, `age`, `email`, `faculty`, `qualification`) VALUES
('1', 'sahan', 'buddhika', '940670845v', 24, 'sassassa', 'Faculty Of Computer Science', 'sas'),
('L1', 'kamal', 'prasad', '940670845v', 25, 'sahan.bu.1994@gmail.com', 'Faculty Of Management', 'dsadadadadadacc');

-- --------------------------------------------------------

--
-- Table structure for table `postergraduateassignments`
--

CREATE TABLE `postergraduateassignments` (
  `studentid` varchar(10) NOT NULL,
  `subjectcode` varchar(10) NOT NULL,
  `inclassass1` varchar(30) NOT NULL,
  `inclassass2` varchar(30) NOT NULL,
  `inclassass3` varchar(30) NOT NULL,
  `inclassass4` varchar(30) NOT NULL,
  `takehomeass1` varchar(30) NOT NULL,
  `takehomeass2` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `postergraduateassignments`
--

INSERT INTO `postergraduateassignments` (`studentid`, `subjectcode`, `inclassass1`, `inclassass2`, `inclassass3`, `inclassass4`, `takehomeass1`, `takehomeass2`) VALUES
('U001', 'U001', 'A', 'A-', 'B', 'C+', 'A+', 'A+');

-- --------------------------------------------------------

--
-- Table structure for table `postergraduateresults`
--

CREATE TABLE `postergraduateresults` (
  `studentid` varchar(10) NOT NULL,
  `courseid` varchar(10) NOT NULL,
  `sub1` varchar(30) NOT NULL,
  `sub2` varchar(30) NOT NULL,
  `sub3` varchar(30) NOT NULL,
  `sub4` varchar(30) NOT NULL,
  `sub5` varchar(30) NOT NULL,
  `sub6` varchar(30) NOT NULL,
  `sub1re` varchar(30) NOT NULL,
  `sub2re` varchar(30) NOT NULL,
  `sub3re` varchar(30) NOT NULL,
  `sub4re` varchar(30) NOT NULL,
  `sub5re` varchar(30) NOT NULL,
  `sub6re` varchar(30) NOT NULL,
  `gpa` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `postergraduatestudents`
--

CREATE TABLE `postergraduatestudents` (
  `studentid` varchar(5) NOT NULL,
  `firstname` varchar(20) NOT NULL,
  `lastname` varchar(20) NOT NULL,
  `age` int(3) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `emailaddress` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `phonenumber` varchar(12) NOT NULL,
  `yearofregistration` int(5) NOT NULL,
  `qualificationtypes` varchar(60) NOT NULL,
  `institution` varchar(30) NOT NULL,
  `yearofcompletion` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `postergraduatestudents`
--

INSERT INTO `postergraduatestudents` (`studentid`, `firstname`, `lastname`, `age`, `gender`, `emailaddress`, `address`, `phonenumber`, `yearofregistration`, `qualificationtypes`, `institution`, `yearofcompletion`) VALUES
('P003', 'ruwn', 'indrajith', 23, 'Male', 'ruwan@gmail.com', 'mapalagama,\ngalle', '0771768145', 2018, 'ghjgjhgu', 'nibm', 2012);

-- --------------------------------------------------------

--
-- Table structure for table `postergraduatestudentscourseregistration`
--

CREATE TABLE `postergraduatestudentscourseregistration` (
  `studentid` varchar(6) NOT NULL,
  `faculty` varchar(50) NOT NULL,
  `yearOfReg` int(5) NOT NULL,
  `mainSub1` varchar(30) NOT NULL,
  `mainSubID1` varchar(10) NOT NULL,
  `mainSub1Payment` int(5) NOT NULL,
  `mainSub2` varchar(30) NOT NULL,
  `mainSubID2` varchar(10) NOT NULL,
  `mainSub2Payment` int(5) NOT NULL,
  `chooseSub1` varchar(30) NOT NULL,
  `chooseSubID1` varchar(10) NOT NULL,
  `chooseSub1Payment` int(5) NOT NULL,
  `chooseSub2` varchar(30) NOT NULL,
  `chooseSubID2` varchar(10) NOT NULL,
  `chooseSub2Payment` int(5) NOT NULL,
  `chooseSub3` varchar(30) NOT NULL,
  `chooseSub3ID` varchar(10) NOT NULL,
  `chooseSub3Payment` int(5) NOT NULL,
  `chooseSub4` varchar(30) NOT NULL,
  `chooseSub4ID` varchar(10) NOT NULL,
  `chooseSub4Payment` int(5) NOT NULL,
  `courseId` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `postergraduatestudentscourseregistration`
--

INSERT INTO `postergraduatestudentscourseregistration` (`studentid`, `faculty`, `yearOfReg`, `mainSub1`, `mainSubID1`, `mainSub1Payment`, `mainSub2`, `mainSubID2`, `mainSub2Payment`, `chooseSub1`, `chooseSubID1`, `chooseSub1Payment`, `chooseSub2`, `chooseSubID2`, `chooseSub2Payment`, `chooseSub3`, `chooseSub3ID`, `chooseSub3Payment`, `chooseSub4`, `chooseSub4ID`, `chooseSub4Payment`, `courseId`) VALUES
('P001', 'School Of Computing', 2018, 'Java', 'SCS 1024', 1000, 'C/C++', 'SCS 1025', 2000, 'Software Testing', 'SCS 1026', 1000, 'Wireless Sensor Network', 'SCS 1027', 1000, 'Web Design', 'SCS 1028', 1000, 'Mahine Learning', 'SCS 1029', 1000, 'PC31'),
('P002', 'School Of Business', 2018, 'Financial Account', 'SCS 1072', 1000, 'Cooperative Finance', 'SCS 1073', 1000, 'Environment Studies', 'SCS 1074', 1000, 'Supply chain management', 'SCS 1075', 1000, 'Business Law', 'SCS 1076', 1000, 'Economics', 'SCS 1077', 1000, 'PB31');

-- --------------------------------------------------------

--
-- Table structure for table `undergraduateassignments`
--

CREATE TABLE `undergraduateassignments` (
  `studentid` varchar(10) NOT NULL,
  `subjectcode` varchar(10) NOT NULL,
  `inclassass1` varchar(30) NOT NULL,
  `inclassass2` varchar(30) NOT NULL,
  `inclassass3` varchar(30) NOT NULL,
  `inclassass4` varchar(30) NOT NULL,
  `takehomeass1` varchar(30) NOT NULL,
  `takehomeass2` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `undergraduateassignments`
--

INSERT INTO `undergraduateassignments` (`studentid`, `subjectcode`, `inclassass1`, `inclassass2`, `inclassass3`, `inclassass4`, `takehomeass1`, `takehomeass2`) VALUES
('U001', 'SCS 1030', 'B', 'A-', 'A+', 'B+', 'C+', 'C');

-- --------------------------------------------------------

--
-- Table structure for table `undergraduateresults`
--

CREATE TABLE `undergraduateresults` (
  `studentid` varchar(10) NOT NULL,
  `courseid` varchar(10) NOT NULL,
  `sub1` varchar(30) NOT NULL,
  `sub2` varchar(30) NOT NULL,
  `sub3` varchar(30) NOT NULL,
  `sub4` varchar(30) NOT NULL,
  `sub5` varchar(30) NOT NULL,
  `sub6` varchar(30) NOT NULL,
  `sub1re` varchar(30) NOT NULL,
  `sub2re` varchar(30) NOT NULL,
  `sub3re` varchar(30) NOT NULL,
  `sub4re` varchar(30) NOT NULL,
  `sub5re` varchar(30) NOT NULL,
  `sub6re` varchar(30) NOT NULL,
  `gpa` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `undergraduateresults`
--

INSERT INTO `undergraduateresults` (`studentid`, `courseid`, `sub1`, `sub2`, `sub3`, `sub4`, `sub5`, `sub6`, `sub1re`, `sub2re`, `sub3re`, `sub4re`, `sub5re`, `sub6re`, `gpa`) VALUES
('U001', 'UC42', 'Artificial Inteligent', 'Racket', 'Discrete Maths', 'Java', 'Python', 'Computer Security', 'A-', 'C', 'C+', 'B+', 'A+', 'B+', '3.033');

-- --------------------------------------------------------

--
-- Table structure for table `undergraduatestudents`
--

CREATE TABLE `undergraduatestudents` (
  `studentid` varchar(5) NOT NULL,
  `firstname` varchar(15) NOT NULL,
  `lastname` varchar(15) NOT NULL,
  `age` int(3) NOT NULL,
  `gender` varchar(5) NOT NULL,
  `emailaddress` varchar(40) NOT NULL,
  `address` varchar(50) NOT NULL,
  `phonenumber` varchar(12) NOT NULL,
  `yearofregistration` int(4) NOT NULL,
  `alresults` varchar(50) NOT NULL,
  `districtrank` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `undergraduatestudents`
--

INSERT INTO `undergraduatestudents` (`studentid`, `firstname`, `lastname`, `age`, `gender`, `emailaddress`, `address`, `phonenumber`, `yearofregistration`, `alresults`, `districtrank`) VALUES
('U001', 'kamal', 'perera', 25, 'Male', 'safadqeq', 'dqdqdqdq', '6798798787', 2018, 'dqdqxX', 25);

-- --------------------------------------------------------

--
-- Table structure for table `undergraduatestudentscourseregistration`
--

CREATE TABLE `undergraduatestudentscourseregistration` (
  `studentid` varchar(6) NOT NULL,
  `faculty` varchar(50) NOT NULL,
  `yearOfReg` int(5) NOT NULL,
  `mainSub1` varchar(30) NOT NULL,
  `mainSubID1` varchar(10) NOT NULL,
  `mainSub1Payment` int(5) NOT NULL,
  `mainSub2` varchar(30) NOT NULL,
  `mainSubID2` varchar(10) NOT NULL,
  `mainSub2Payment` int(5) NOT NULL,
  `chooseSub1` varchar(30) NOT NULL,
  `chooseSubID1` varchar(10) NOT NULL,
  `chooseSub1Payment` int(5) NOT NULL,
  `chooseSub2` varchar(30) NOT NULL,
  `chooseSubID2` varchar(10) NOT NULL,
  `chooseSub2Payment` int(5) NOT NULL,
  `chooseSub3` varchar(30) NOT NULL,
  `chooseSub3ID` varchar(10) NOT NULL,
  `chooseSub3Payment` int(5) NOT NULL,
  `chooseSub4` varchar(30) NOT NULL,
  `chooseSub4ID` varchar(10) NOT NULL,
  `chooseSub4Payment` int(5) NOT NULL,
  `courseId` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `undergraduatestudentscourseregistration`
--

INSERT INTO `undergraduatestudentscourseregistration` (`studentid`, `faculty`, `yearOfReg`, `mainSub1`, `mainSubID1`, `mainSub1Payment`, `mainSub2`, `mainSubID2`, `mainSub2Payment`, `chooseSub1`, `chooseSubID1`, `chooseSub1Payment`, `chooseSub2`, `chooseSubID2`, `chooseSub2Payment`, `chooseSub3`, `chooseSub3ID`, `chooseSub3Payment`, `chooseSub4`, `chooseSub4ID`, `chooseSub4Payment`, `courseId`) VALUES
('U001', 'School Of Computing', 2018, 'Artificial Inteligent', 'SCS 1041', 1000, 'Racket', 'SCS 1042', 1000, 'Discrete Maths', 'SCS 1091', 2000, 'Java', 'SCS 1044', 2000, 'Python', 'SCS 1045', 3000, 'Computer Security', 'SCS 1046', 1000, 'UC42');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `instructers`
--
ALTER TABLE `instructers`
  ADD PRIMARY KEY (`lectureid`);

--
-- Indexes for table `lectures`
--
ALTER TABLE `lectures`
  ADD PRIMARY KEY (`lectureid`);

--
-- Indexes for table `postergraduateassignments`
--
ALTER TABLE `postergraduateassignments`
  ADD PRIMARY KEY (`studentid`);

--
-- Indexes for table `postergraduateresults`
--
ALTER TABLE `postergraduateresults`
  ADD PRIMARY KEY (`studentid`);

--
-- Indexes for table `postergraduatestudents`
--
ALTER TABLE `postergraduatestudents`
  ADD PRIMARY KEY (`studentid`);

--
-- Indexes for table `postergraduatestudentscourseregistration`
--
ALTER TABLE `postergraduatestudentscourseregistration`
  ADD PRIMARY KEY (`studentid`);

--
-- Indexes for table `undergraduateassignments`
--
ALTER TABLE `undergraduateassignments`
  ADD PRIMARY KEY (`studentid`);

--
-- Indexes for table `undergraduateresults`
--
ALTER TABLE `undergraduateresults`
  ADD PRIMARY KEY (`studentid`);

--
-- Indexes for table `undergraduatestudents`
--
ALTER TABLE `undergraduatestudents`
  ADD PRIMARY KEY (`studentid`);

--
-- Indexes for table `undergraduatestudentscourseregistration`
--
ALTER TABLE `undergraduatestudentscourseregistration`
  ADD PRIMARY KEY (`studentid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

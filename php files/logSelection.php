<?php
	$data = array();
	$selection = $_GET["selection"];
	$timestamp = $_GET["timestamp"];

	$host="localhost";
	$uname="root";
	$pass="";
	$dbname="f1";
	
	$dbh = mysqli_connect($host,$uname,$pass) or die("cannot connect");
	mysqli_select_db($dbh, $dbname);
			
	$sql = "INSERT into history values('" . $selection . "','" . $timestamp . "')";
	echo $sql;
	mysqli_query($dbh, $sql);
	mysqli_close($dbh);


?>
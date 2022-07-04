<?php
    $data = array();

    $host="localhost";
	$uname="root";
	$pass="";
	$dbname="f1";
	
	$dbh = mysqli_connect($host,$uname,$pass) or die("cannot connect");
	mysqli_select_db($dbh, $dbname);

    $sql = "SELECT * FROM teams";
    $result = mysqli_query($dbh, $sql);
    while ($row = mysqli_fetch_array($result)) { 
		$nested_data = array();
		$nested_data['name']= $row['team_name'];
		$nested_data['image']= $row['image'];
		$data[$row['id']] = $nested_data;
	}

    header("Content-Type: application/json");
	echo json_encode($data);
	mysqli_close($dbh);
?>
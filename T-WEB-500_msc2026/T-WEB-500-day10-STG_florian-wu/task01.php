<?php
    // When called, the PHP script must echo a JSON object containing name as key and the input as
    // value.
    if (isset($_GET['name'])) {
        $name = $_GET['name'];
        $response = array('name' => $name);
        header('Content-Type: JSON data');
        echo json_encode($response);
    }
    else {
        header("BAD request");
        echo json_encode(array('error' => 'Name parameter is missing.'));
    }
?>

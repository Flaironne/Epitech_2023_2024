<?php
    // In your PHP script, check the email address validity.
    // In case of an error or if the email address is not valid, change the HTTP status code to 400
    $data = file_get_contents('php://input');
    $data = json_decode($data, true);
    $email = $data["email"];
    if (filter_var($email, FILTER_VALIDATE_EMAIL)) {
        $response = array('email' => $email);
        header('Content-Type: JSON data');
        echo json_encode($response);
    }
    else {
        header("BAD request");
        echo json_encode(array('error' => 'Name parameter is missing.'));
    }
?>

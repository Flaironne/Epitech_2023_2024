<?php
    function get_shortest(array $myArray){ //argument array of string
        $myShortest = NULL;
        $count = 1000;
        for ($i = 0; $i < count($myArray); $i++) {
            if(gettype($myArray[$i]=="string")){
                if ($count>strlen($myArray[$i])){
                    $count = strlen($myArray[$i]);
                    $myShortest = $myArray[$i];
                }
            }
        }
        return $myShortest;
    }
?>
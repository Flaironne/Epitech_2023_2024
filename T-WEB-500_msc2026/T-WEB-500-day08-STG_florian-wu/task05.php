<?php
    function calc_average(array $myArray){ //argument array of numbers
        $somme = 0;
        for ($i = 0; $i <count($myArray); $i++) {
            $somme += $myArray[$i];
        }
        return round($somme/count($myArray), $precision = 1);
        // return round(array_sum($myArray)/count($myArray),$precision = 1);
    }
?>

<?php
    function sequence($height) {
        if ($height<0){
            return 0;
        }
        $height +=1;
        $sequence = ["1"];
    
        for ($i = 1; $i < $height; $i++) {
            $currentTerm = $sequence[$i - 1];
            $nextTerm = "";
            $count = 1;
    
            for ($j = 1; $j < strlen($currentTerm); $j++) {
                if ($currentTerm[$j] == $currentTerm[$j - 1]) {
                    $count++;
                } else {
                    $nextTerm .= $count . $currentTerm[$j - 1];
                    $count = 1;
                }
            }
    
            $nextTerm .= $count . $currentTerm[strlen($currentTerm) - 1];
            array_push($sequence, $nextTerm);
        }
    
        foreach ($sequence as $index => $term) {
            echo "$term\n";
        }
    }
?>
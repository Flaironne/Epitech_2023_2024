<?php
    function dog_bark(int $woof_nb){
        if($woof_nb>=1){
            for ($i = 0; $i <= $woof_nb-2; $i++) {
                echo "woof ";
            }
            echo "woof\n";
        }
        else{
            echo "\n";
        }
    }
?>

<?php
    function render_body(string $mystr){
        $Myreturnvar = NULL;
        if($mystr == "home" or $mystr == "php" or $mystr == "sql"){
            $Myreturnvar = file_get_contents($mystr.".html");
         }
        else{
            $Myreturnvar = "<p>Unknown page</p>";
        }
        return $Myreturnvar;
    }
?>
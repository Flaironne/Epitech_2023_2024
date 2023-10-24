<?php
    function dynamic_body(){
        $Myreturnvar = NULL;

        if(htmlspecialchars($_GET["page"]) == "home" or htmlspecialchars($_GET["page"]) == "php" or htmlspecialchars($_GET["page"]) == "sql"){
            $Myreturnvar = file_get_contents(htmlspecialchars($_GET["page"]).'.html');
         }
        else{
            $Myreturnvar = "<p>Unknown page</p>";
        }
        return $Myreturnvar;
    }
?>
<?php
    function whoami(){            
        $age = $_POST["age"];
        $name = $_POST["name"];
        if($name!=NULL and $age!=NULL and is_numeric($age)){
            echo "Hi, my name is $name and I'm $age years old.";
            
        }
        else if($name == NULL and $age!=NULL and is_numeric($age)){
            echo "Hi, I have no name and I'm $age years old.";
        }
        else if($name != NULL and ($age==NULL or !is_numeric($age))){
            echo "Hi, my name is $name.";
        }
        else{
            echo "Hi, I have no name.";
        }
        echo "\n";
    }
?>
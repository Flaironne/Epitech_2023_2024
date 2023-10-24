<?php
    
    function form_is_submitted(){
        return isset($_POST['submit']);
    }

    function whoami(){
        $age = $_POST["age"];
        $name = $_POST["name"];
        $curriculumOptions = $_POST["curriculum"];
        $curriculum = [
            "pge" => "PGE (Programme Grande Ecole)",
            "msc" => "MSc Pro",
            "coding" => "Coding Academy",
            "wac" => "Web@cademie",
            "" => "",
        ];
        $myStringCur = " I'm a student of $curriculum[$curriculumOptions].";
        if($name!=NULL and $age!=NULL and is_numeric($age)){
            if(isset($curriculum) and $curriculum[$curriculumOptions] != ""){
                echo "Hi, my name is $name and I'm $age years old.".$myStringCur;
            }
            else{
                echo "Hi, my name is $name and I'm $age years old.";
            }
        }
        else if($name == NULL and $age!=NULL and is_numeric($age)){
            if(isset($curriculum) and $curriculum[$curriculumOptions] != ""){
                echo "Hi, I have no name and I'm $age years old.".$myStringCur;
            }
            else{
                echo "Hi, I have no name and I'm $age years old.";
            }
        }
        else if($name != NULL and ($age==NULL or !is_numeric($age))){
            if(isset($curriculum) and $curriculum[$curriculumOptions] != ""){
                echo "Hi, my name is $name.".$myStringCur;
            }
            else{
                echo "Hi, my name is $name.";
            }
        }
        else{   
            if(isset($curriculum) and $curriculum[$curriculumOptions] != ""){
                echo "Hi, I have no name.".$myStringCur;
            }
            else{
                echo "Hi, I have no name.";
            }
        }
        echo "\n";
    }
?>
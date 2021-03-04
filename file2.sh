awk 'BEGIN{FS=";";}
{
    coun=0
    if($3=="Programmer"||$3=="PROGRAMMER"||$3=="programmer"){
        print $2","$3","$4","$4*12;
        coun=coun+1;
    } 
}
END{
    if(coun==0){
        print "No Programmer Found"
    }
}' file.txt

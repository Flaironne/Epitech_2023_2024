module.exports = {range}
 
function range(start,end,step=1){

    if (step==0){
        var MyArray = [start];
    }
    else if (start<=end && step>0){
        var MyArray = [start];
        for(start = start+step;start<=end;start=start+step){
            MyArray = MyArray.concat(start);
        }
    }
    else if (start>=end && step<0){
        var MyArray = [start];
        for(start = start+step;start>=end;start=start+step){
            MyArray = MyArray.concat(start);
        }
    }
    else{
        var MyArray = [start];
    }
   
    return MyArray;
}

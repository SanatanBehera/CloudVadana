var arr = [12, 10, 15, 11, 14, 13, 16];
SortByDescending(arr);
console.log(arr);
function SortByDescending(array){
    for (var i = 0; i< array.length-1; i++) {
       for (var j = 0; j < array.length-1-i; j++) {
        if(array[j]<array[j+1]){
        var temp = array[j];
        array[j]=array[j+1];
        array[j+1]= temp;
        }
    }
}
return array
}
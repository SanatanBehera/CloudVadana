function reverseWord(str){
    var i=0;
    var j=0;
    var revstr="";
    var arr=str.split('');
    while( i< arr.length ){
        while (i<arr.length && arr[i]!=' ')i++;
        var k=i-1;
        var temp="";
        while (k>=j){
            temp +=arr[k];
            k--;
        }
        revstr+=temp;
        if (i<arr.length)revstr+=" ";
        i++;
        j=i;
    }
    console.log(revstr);
}
var str = "The quick brown fox";
console.log(reverseWord(str))

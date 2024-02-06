void main (){
    int a = 19;

    while (a-- > 0){
        System.out.print((a == 13) ? "\n" : (a ==8)? "\n": (a == 4) ? "\n": (a == 1) ? "\n" : "* ");
    }
}

/* my test
        * * * * *
        * * * *
        * * *
        * *
        *
*/
import java.lang.*;
// Program 003 - Non-Primitve DataType
class Container{
    int x;
    int y;
}
class nonPrimitive {
    public static void main(String[] args){
        Container c = new Container();
        c.x = 10;
        c.y = 20;
        System.out.println(c.x + c.y);
    }
}

/* the below code also works...

import java.lang.*;
// Program 003 - Non-Primitve DataType
class nonPrimitive {
    public static void main(String[] args){
        Container c = new Container();
        c.x = 10;
        c.y = 20;
        System.out.println(c.x + c.y);
    }
}
class Container{
    int x;
    int y;
}

this also returns the output 30... */
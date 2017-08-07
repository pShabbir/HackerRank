import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Dm {

    public static void main(String[] args) {
        // /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // Scanner obj=new Scanner(System.in);
        // int i=obj.nextInt();
        // int j=obj.nextInt();
        // double k=obj.nextDouble();
        // int count=0;
        // for(int h=i;h<=j;h++){
        //     if(isBeautiful(h,k))
        //         count++;
        // }
        // System.out.println(count);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //  Scanner obj=new Scanner(System.in);
        //  int n=obj.nextInt();
        //  int count=0;
        //  int h=5;
        //  for(int i=0;i<n;i++){
        //      int g=(int)Math.floor(h/2);
        //      count += g;
        //      h=(int)(Math.floor(h/2))*3;
         //
        //       //System.out.println(h);
        //  }
        //  System.out.println(count);
        String s="""356482915 23167419
        451000315
        341412510
        224995586
        912613952
        12088571
        24593177
        209207945
        1421171
        322431896
        152767145
        234779840
        14079968
        668351307
        50816217
        446464716
        232462965
        520102552
        249181119
        16818687
        29572966
        38054950
        86347186
        528549694
        35218700
        653475672
        81216570
        39939909
        454236599
        224303380
        268041810
        80215093
        279040333
        19987623
        172258741
        22935815
        473529348
        273624716
        148738026
        187302334
        403896662
        34060912
        564344149
        189985625
        9303470
        46682750
        13379478
        311735804
        89964345
        524127470
        301770162
        203077434
        4757107
        33228013
        67232320
        263818543
        23605223
        370818922
        414966374
        135528113
        449631384
        277230817
        196898441
        264250012
        675086575
        487388881
        12186119
        420497214
        582403971
        23009174
        324802349
        10196989
        14006773
        18100032
        49197637
        56594284
        319601869
        26948613
        180624794
        27323922
        45149208
        29772117
        4069445
        10560852
        199724231
        311703177
        498578670
        511849442
        545055264
        325683722
        347953430
        201445285
        45226169
        2125399
        118682453
        505114917
        225005040
        397155580
        432374225""";
        String[] d=s.split("\\n");
        System.out.println(d[0]);
    }

    // static boolean isBeautiful(int s,double z){
    //     StringBuilder sq=new StringBuilder(s+"");
    //     sq.reverse();
    //     int k=Integer.parseInt(new String(sq));
    //
    //     double o=Math.abs(k-s)%z;
    //     if(o==0)
    //       return true;
    //     else
    //       return false;
    //
    // }
}

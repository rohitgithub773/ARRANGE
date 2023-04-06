import java.util.*;
class Arrange
{
    int a[];int n=0;
    int c[];
    String s=" ";
  public  int check(int x)
    {
        String p="";
        p=p+x;;int k=0;
        StringTokenizer st=new StringTokenizer(s);
        while(st.hasMoreTokens())
        {
            String c=st.nextToken();
            if(p.equals(c))
            k=1;
        }
        if(k==1)
        return 1;
        else return 0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("INPUT:");
        System.out.println("ENTER SIZE:");
        n=sc.nextInt();
        a=new int[n];
        c=new int[n];
        System.out.println("ENTER ELEMENTS:");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
    }
    void main()
    {
        input();
        int mid=n/2;
        int x=mid+1;int y=mid-1;Arrays.sort(a);
        System.out.println("OUTPUT:ELEMENTS ARRANGED AS GIVEN");
        for(int i=0;i<n;i++)
        {
            int t=a[0];
              if(check(t)==1)
              continue;
            
            for(int j=0;j<n;j++)
            {
        
                if(check(a[j])==1)
                continue;
                
                if(a[j]>t)
                {
                    t=a[j];
                }
            }
            if(i==0)
            {
            c[mid]=t;
            s=s+t+" ";
            continue;
        }
        if(i%2==0)
        {
            c[x]=t;
            x++;
            s=s+t+" ";
        }
        else
        {
            c[y]=t;
            y--;s=s+t+" ";
        }
        t=0;
    }
        System.out.println("s;"+s);
        for(int i=0;i<n;i++)
        System.out.print(c[i]+"\t");
        
    }
}
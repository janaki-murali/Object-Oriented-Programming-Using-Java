class string1
{
    char[] str;
    int i;
    void input(char a[])
    {
        a={'M','A','L','A','Y','L','A','M'};
    }
    string1(char a[])
    {
        str=a;
    }
    int length()
    {
        for (i=0;str[i]!='\0';i++);
        return i;
    }
    int palindrome()
    {
        int s=0,e;
        e=i-1;
        while(e>s)
        {
            if (str[s]!=str[e])
            {
                return 0;
            }
            s=s+1;
            e=e-1;
        }
        return 1;
    }
}
public class Palindrome 
{
    public static void main(String[] args)
    {
        int len;
        char[] s={'M','A','L','A','Y','A','L','A','M','\0'};
        string1 s1;
        s1=new string1(s);
        len=s1.length();
        System.out.println("Length="+len);
        if (s1.palindrome()==1)
        {
            System.out.println("The given string is palindrome");
        }
        else
        {
            System.out.println("The given string is NOT palindrome");
        }
    }     
}

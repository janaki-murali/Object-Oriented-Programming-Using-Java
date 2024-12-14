class string2
{
    char[] str;
    char ch;
    int i;
    string2(char a[],char c)       
    {
        str=a;
        ch=c;
    }
    int length()
    {
        for (i=0;str[i]!='\0';i++);
        return i;
    }
    int frequency()
    {
        int count=0,j=0;
        while (str[j]!='\0')
        {
            if (str[j]==ch)
            {
                count=count+1;
            }
        }
        j=j+1;
        return count;
    }
}
public class FrequencyOfCharacter
{
    public static void main(String[] args)
    {
        char[] s={'J','A','N','A','K','I','\0'};
        string2 s2;
        char c='A';       
        s2=new string2(s,c);     
        int freq;
        freq=s2.frequency();
        System.out.println("Frequency="+freq);
    }
}

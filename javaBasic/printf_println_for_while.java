public class printf_println_for_while
{
    public static void main(String[] args)
    {
        System.out.println("[* 피라미드]");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                    if(i>=j)
                        System.out.println('*');
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("[for 구구단]");
        for(int i=1;i<10;i++)
        {
            for(int j=1;j<10;j++)
                System.out.printf("%d x %d = %d", i, j, i*j);
            System.out.println();
        }
        // printf <-> println
        // % 사용가능 <-> % 사용 x, 변수와 문자열을 '+' 로 이어줄 수 있음, 자동 줄바꿈

        System.out.println("[while 구구단]");
        int i = 0;
        while(i<10)
        {
            int j = 2;
            while(j<10)
            {
                System.out.printf("%d x %d = %-4d", i,j,i*j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
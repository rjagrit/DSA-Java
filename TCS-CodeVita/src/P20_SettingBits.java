public class P20_SettingBits
{
    public static void main(String[] args) {
        int res = bitsetter(24,0);
        System.out.println(res);
    }

    public static int bitsetter(int num, int bit){
        return num | (1<<bit);
    }
}

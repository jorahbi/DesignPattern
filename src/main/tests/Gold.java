import java.util.Arrays;

/**
 * 动规入门
 * N 金矿 5
 * W 工人 10
 * G 黄金       [400, 500, 200, 300, 350]
 * P 金矿用工量 [5, 5, 3, 4, 3]
 *
 * 4，10人矿最优
 * 4个矿10人，
 * MAX(F(4, 10), F(4, 10 - P[4]) + G[4])
 *
 * 边界
 * N = 1 , W > P[0]  F(N, W) = G[0]
 * N = 1 , W < P[0]  F(N, W) = 0
 *
 * 这题建模后得到的方程组如下:
 * F(n,w) = 0    (n<=1, w<p[0]);
 * F(n,w) = g[0]     (n==1, w>=p[0]);
 * F(n,w) = F(n-1,w)    (n>1, w<p[n-1])
 * F(n,w) = max(F(n-1,w),  F(n-1,w-p[n-1])+g[n-1])    (n>1, w>=p[n-1])
 */
public class Gold {

    public static void main(String[] args){
        //黄金数量
        int[] g = new int[]{400, 500, 200, 300, 350};
        //金矿用工量
        int[] p = new int[]{5, 5, 3, 4, 3};
        gold(5, 10, g, p);
    }

    public static int gold(int n, int w, int[] g, int[] p)
    {
        int col = w + 1;
        int[] preResult = new int[col];
        int[] result = new int[col];

        for (int i = 0; i < col; i++){
            if(i < p[0]){
                preResult[i] = 0;
            }else {
                preResult[i] = g[0];
            }
            System.out.print(preResult[i] + "  ");
        }
        System.out.print(" \r\n");
        for(int i = 1; i < n; i++){
            for(int j = 0; j < col; j++){
                if(j < p[i]){
                    result[j] = preResult[j];
                }else{
                    result[j] = Math.max(preResult[j], preResult[j - p[i]] + g[i]);
                }
                System.out.print(result[j] + "  ");
            }
            //preResult = result;
            for (int j = 0; j < col; j++) { //更新上一行的值,为下一轮递推做准备
                preResult[j] = result[j];
            }
            System.out.print("\r\n");
        }
        return result[w];
    }
}

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class TextDemo3 {

    //牛客网公共祖先
//    public int getLCA(int a, int b) {
//        // write code here
//        if(a == b) return a;
//        while(a != b) {
//            if(a > b) {
//                a = a / 2;
//            } else {
//                b = b / 2;
//            }
//        }
//        return a;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];
        int eNum = sc.nextInt();
        if(eNum > 2 && eNum % 2 == 0) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for(int i = 2;i <= eNum; i++) {
                boolean f = true;
                for(int j = 2; j < i; j++) {
                    if(i % j == 0) {
                        f = false;
                        break;
                    }
                }
                if(f) list.add(i);
            }
            int min = eNum;
            for(int k = 0; k < list.size(); k++) {
                int ret = list.get(k);
                int tmp = eNum - ret;
                if(list.contains(tmp)) {
                    int ans = Math.abs(tmp - ret);
                    if(ans < min && ret <= tmp) {
                        min = ans;
                        arr[0] = ret;
                        arr[1] = tmp;
                    }
                }
            }
        }
        for(int x : arr) {
            System.out.println(x);
        }
//        int[] arr = {0,1,2,3,4,5,6,7};
//        System.out.println(getSub(arr));

//        for (int x:arr) {
//            System.out.println(x);
//            break;
//        }

//        Scanner sc = new Scanner(System.in);
//        int b = sc.nextByte();
//        StringBuilder sb = new StringBuilder();
//        while(b != 0) {
//            int tmp = b % 2;
//            sb.append(tmp);
//            b /= 2;
//        }
//        int i = 0;
//        String s = Integer.toBinaryString(b);
//        int max = 0;
//        while(i < s.length()) {
//            if(s.charAt(i) == '1') {
//                int count = 0;
//                while(i < s.length() && s.charAt(i) == '1') {
//                    count++;
//                    i++;
//                }
//                max = Math.max(max,count);
//            }
//            i++;
//        }
//        int max = 0;
//        while(b != 0) {
//            int count = 0;
//            while((b & 1) == 1) {
//                count++;
//                b = b>>1;
//            }
//            max = Math.max(max,count);
//        }
//        System.out.println(max);
    }
}

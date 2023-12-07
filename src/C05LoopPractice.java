public class C05LoopPractice {
    public static void main(String[] args) {

////        짝수의 합 계산하기
////        1~20까지 짝수의 합
//        int sum = 0;
//        for(int i=1; i <=20 ; i++){
//            if(i%2 != 0){
//                continue;
//            }
//            sum = sum + i; // sum += i;
//        }
//        System.out.println(sum);
//
////        숫자 뒤집기
//        int num = 1234;
//        int answer = 0;
//        while(true){
//            int temp = num % 10;
//            answer = answer * 10 + temp;
//            num /= 10;
//            if (num == 0){
//                break;
//            }
//        }
//        System.out.println(answer);
//
//            최대공약수 구하기
//            int a = 24;
//            int b = 36;
//            int num = a > b ? b : a;
//            int maxNum = 0;
//            for(int i=1; i<=num; i++){
//                if(a%i ==0 && b%i==0){
//                    maxNum=i;
//                }
//            }
//            System.out.println(maxNum);
//            int minNum = (a * b)/maxNum;
//            System.out.println(minNum);

////        라벨문 활용1
////        target이 matrix의 i,j번째 배열에 있는지 출력
////        target을 찾으면 반복문 전체 종료
//        int[][] matrix =  {{1,2,3,4},{5,6,7},{8,9},{10,11,12,13,14}};
//        int target = 11;
//        loop1:
//        for(int i =0; i< matrix.length; i++){
//            loop2:
//            for(int j =0; j < matrix[i].length; j++){
//                if(matrix[i][j] == target){
//                    System.out.println(i+ "," + j + "번째에 있습니다."+ matrix[i][j]);
//                    break loop1;
//                }
//            }
//        }

////        약수 찾기
////        1~20 숫자가 있을때 이중에 약수가 5개 이상인 숫자중에 가장작은 값을 구하시오
////        불필요한 추가 반복문 -> 라벨문
//
//        l1 :
//        for(int i=1; i<=20; i++){
//            int answer = 0;
//            int count = 0;
//            for(int j=1; j<=i; j++){
//                if(i % j == 0){
//                    count++;
//                }
//                if(count==5) {
//                    break l1;
//                }
//                }
//            }


    }
}

package C12ClassLecture;

import java.util.*;

public class C1207RecurCombiPermu {
    static int answer =0;
    static int temp_sum =0;

    public static void main(String[] args) {
//        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
//        List<List<Integer>> combination_list = new ArrayList<>();
//        List<Integer> temp =new ArrayList<>();
////        for(int i=0; i<myList.size()-1; i++){
////            temp.add(myList.get(i));
////            for(int j= i+1; j<myList.size(); j++){
////               temp.add(myList.get(j));
////               combination_list.add(new ArrayList<>(temp));
////               temp.remove(temp.size()-1);
////            }
////            temp.remove(0);
////        }
//        조합
//        combination(0, myList, combination_list, temp, 3);
//        System.out.println(combination_list);

        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<List<Integer>> permutation_list = new ArrayList<>();
        List<Integer> temp =new ArrayList<>();
        boolean[] visited = new boolean[myList.size()];


//        순열
        permutation(myList, permutation_list, temp,visited , 2);
        System.out.println(permutation_list);

//        합계가 6이상인 2개 순열만 add
        permutation_sum(myList, permutation_list, temp,visited , 2 ,6 ,temp_sum);
        System.out.println(permutation_list);

//        합계가 6개 이상인 모든 순령 add
        permutation_sum_add(myList, permutation_list, temp,visited ,6 ,temp_sum);
        System.out.println(permutation_list);

//        3개 순열에서 합계가 가장 큰 값을 구하기
        permutation_sum_max(myList, permutation_list, visited , 3, temp_sum,0);
        System.out.println(answer);
    }



//    순열
    static void permutation(List<Integer> list, List<List<Integer>> p_list, List<Integer> temp,  boolean[]  visited, int n){
        if(temp.size() == n){
            p_list.add(new ArrayList<>(temp));
            return;
        }
        for(int i= 0; i<list.size();i++){
            if(visited[i] == false) {
                visited[i] = true;
                temp.add(list.get(i));
                permutation(list, p_list ,temp,visited, n);
                temp.remove(temp.size()-1);
                visited[i] = false;
            }
        }
    }


    static void permutation_sum_add(List<Integer> list, List<List<Integer>> p_list, List<Integer> temp,  boolean[]  visited, int sum, int temp_sum){
        if(sum <= temp_sum){
                p_list.add(new ArrayList<>(temp));
        }
        for(int i= 0; i<list.size();i++){
            if(visited[i] == false) {
                visited[i] = true;
                temp.add(list.get(i));
                temp_sum += list.get(i);
                permutation_sum_add(list, p_list ,temp,visited, sum, temp_sum);
                temp.remove(temp.size()-1);
                temp_sum -= list.get(i);
                visited[i] = false;
            }
        }

    }

//       n개의 합이 특정갑 이상인 순열 구하기
    static void permutation_sum(List<Integer> list, List<List<Integer>> p_list, List<Integer> temp,  boolean[]  visited, int n,int sum, int temp_sum){
        if(temp.size() == n && sum <= temp_sum){
            p_list.add(new ArrayList<>(temp));
            return;
        }
        for(int i= 0; i<list.size();i++){
            if(visited[i] == false) {
                visited[i] = true;
                temp.add(list.get(i));
                temp_sum += list.get(i);
                permutation_sum(list, p_list ,temp,visited, n, sum, temp_sum);
                temp.remove(temp.size()-1);
                temp_sum -= list.get(i);
                visited[i] = false;
            }
        }
    }


    static void permutation_sum_max(List<Integer> list, List<List<Integer>> p_list, boolean[] visited, int n, int temp_sum, int count){
        if(count == n){
            if(answer < temp_sum){
                answer = temp_sum;
            }
            return;
        }
        for(int i= 0; i<list.size();i++){
            if(visited[i] == false) {
                visited[i] = true;
                temp_sum += list.get(i);
                permutation_sum_max(list, p_list ,visited, n, temp_sum ,count+1);
                temp_sum -= list.get(i);
                visited[i] = false;
            }
        }
    }



//
//      조합
//    static void combination(int index, List<Integer> list, List<List<Integer>> c_list, List<Integer> temp, int n){
//        if(temp.size() == n){
//            c_list.add(new ArrayList<>(temp));
//            return;
//        }
//        for(int i=index; i<list.size();i++){
//            temp.add(list.get(i));
//            combination(i+1, list, c_list,temp, n);
//            temp.remove(temp.size()-1);
//        }
//    }

}

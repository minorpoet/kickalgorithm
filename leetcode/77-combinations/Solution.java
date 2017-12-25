package algrithm.combinations;

import java.util.List;
import java.util.ArrayList;

public class Solution{
    private List<List<Integer>> result;

    public List<List<Integer>> combine(int n, int k){
        result = new ArrayList<List<Integer>>();
        if(n <= 0 || k <= 0 || k > n)
            return result;

        List<Integer> combine = new ArrayList<>();
        findCombination(n, k, 1, combine);
        return result;
    }

    // ���C(n,k) ��ǰ�Ѿ��ҵ�����ϴ洢��combine�У� ��Ҫ��start��ʼ�����µ�Ԫ�أ�
    // ����ÿ�������û��˳��ģ����Բ���Ҫ������start֮ǰ��Ԫ�أ���Ϊstart֮ǰԪ�ص���������Ѿ��������
    private void findCombination(int n, int k, int start, List<Integer> combine){
        if(combine.size() == k){
            result.add(new ArrayList(combine));
            return;
        }
        
        //for(int i = start; i <= n; i++){

        // �ݹ�����֦�Ż���ȥ������Ҫ�ĵݹ�
        // ��ϳ���Ϊk��[i...n]�����ٻ���Ҫ k - combine.size()����λ
        // ��ôΪ��֤�������㹻��Ԫ����䵽�����i�ķ�ΧΪ�� i + (k-combine.size) + 1 <= n �� i < n - (k-combine.size()) + 1
        // + 1 ����Ϊ[i...n] ��Ϊ������ startѡȡ1, n=4,k=2 combine.size()=1ʱ 1 <= 4 -(2-1)�Ļ�iֻ�ܵ�3����ʵi���Ե�4��
        for(int i = start; i <= n-(k-combine.size()) + 1; i++){
            combine.add(i);
            findCombination(n,k, i+1 ,combine);
            combine.remove(combine.size() - 1); // �Ƴ��ռӽ�ȥ��Ԫ��
        }
    }
}
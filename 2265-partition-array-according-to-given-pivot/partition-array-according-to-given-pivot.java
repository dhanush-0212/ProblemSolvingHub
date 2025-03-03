class Solution {
    public int[] pivotArray(int[] arr, int pivot) {
        List<Integer> small=new ArrayList<>();
        List<Integer> large=new ArrayList<>();
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<pivot){small.add(arr[i]);}
            if(arr[i]>pivot){large.add(arr[i]);}
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==pivot){
                small.add(arr[i]);
            }
        }
        small.addAll(large);
        int i=0;
        for(int num:small){
            ans[i++]=num;
        }
        return ans;
    }
}
class pair{
    int start;
    int end;
    pair(int start,int end){
        this.start=start;
        this.end=end;
    }
}
class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        pair[] arr=new pair[start.length];
       
        for(int i=0;i<start.length;i++){
            arr[i]=new pair(start[i],end[i]);
        }
        Arrays.sort(arr,(a,b)->Integer.compare(a.end, b.end));
        int freetime=arr[0].end,cnt=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i].start>freetime){
                cnt+=1;
                freetime=arr[i].end;
            }
        }
        return cnt;
    }
}

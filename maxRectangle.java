class Solution {
    public int maxArea(int M[][], int n, int m) {
        // add code here.
        int currRow[]=M[0];
        int maxAns=MaxHis(currRow);
        for(int i=1;i<n;i++){
            for(int j=0;j<M[0].length;j++){
                if(M[i][j]==1)currRow[j]=currRow[j]+1;
                else currRow[j]=0;
            }
            maxAns=Math.max(maxAns,MaxHis(currRow));
        }
        return maxAns;
    }
    public int MaxHis(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int rightMin[]=new int[n];
        int x=n-1;
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&arr[st.peek()]>=arr[i])st.pop();
            rightMin[x--]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        
        int leftMin[]=new int[n];
        st=new Stack<>();
        int c=0;
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&arr[st.peek()]>=arr[i])st.pop();
            leftMin[c++]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        int ans=0;
        int width[]=new int[n];
        for(int i=0;i<n;i++){
            width[i]=rightMin[i]-leftMin[i]-1;
            ans=Math.max(ans,width[i]*arr[i]);
        }
        return ans;
    }
}

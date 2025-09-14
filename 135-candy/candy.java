class Solution {
    public int candy(int[] r) {
  int count=0;

int [] first=new int[r.length];
int [] sec=new int[r.length];
  first[0]=1;
  for(int i=0;i<r.length-1;i++){
if(r[i+1]>r[i]){
first[i+1]=first[i]+1;
}
else{
    first[i+1]=1;
}
  }
sec[r.length-1]=1;
for(int i=r.length-1;i>0;i--){
    if(r[i]<r[i-1]){
sec[i-1]=sec[i]+1;
    }
    else{
        sec[i-1]=1;
    }
}
    for(int i=0;i<r.length;i++){
   count=count+Math.max(first[i],sec[i]);
   
    }
 return count;   }
}
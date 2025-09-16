class Solution {
    public int romanToInt(String s) {
        int count  = 0;
        Map<Character,Integer> m = new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        for(int i=s.length()-1;i>=0;){
            int val=0;
            if((i>0 && s.charAt(i-1)=='I' && s.charAt(i)=='V') || (i>0 && s.charAt(i-1)=='I' && s.charAt(i)=='X')){
                val=m.get(s.charAt(i))-m.get(s.charAt(i-1));
                i=i-2;
            }

            else if((i>0 && s.charAt(i-1)=='X' && s.charAt(i)=='L') || (i>0 && s.charAt(i-1)=='X' && s.charAt(i)=='C')){
                val=m.get(s.charAt(i))-m.get(s.charAt(i-1));
                i=i-2;
            }
            else if((i>0 && s.charAt(i-1)=='C' && s.charAt(i)=='D') || (i>0 && s.charAt(i-1)=='C' && s.charAt(i)=='M')){
                val=m.get(s.charAt(i))-m.get(s.charAt(i-1));
                i=i-2;
            }else{
                val=m.get(s.charAt(i));
                i=i-1;
            }
            count+=val;
        }
        return count;
    }
}
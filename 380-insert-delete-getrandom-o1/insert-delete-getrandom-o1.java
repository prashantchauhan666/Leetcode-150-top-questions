class RandomizedSet {
    private HashMap<Integer,Integer> map=new HashMap<>();
    ArrayList<Integer> list=new ArrayList<>();

    public RandomizedSet() {
        map.clear();
        list.clear();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        else{
            map.put(val,list.size());
            list.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {  // let list is 3 4 5 6 7 and val=4 with idx 1;
        if(!map.containsKey(val)) return false;
        else{
            int idxOfVal=map.get(val);// idxOfVal = 1
            // Swap list with last idx.     3 4 5 6 7 
            int temp=list.get(list.size()-1); // temp = 7;
            list.set(list.size()-1,val); // 3 4 5 6 4 
            list.set(idxOfVal,temp);     // 3 7 5 6 4 

            list.remove(list.size()-1);  //4->1 5->2 idx=3;
            map.put(temp,idxOfVal);
            map.remove(val);
            return true;
        }
    }
    
    public int getRandom() {
        int randomIdx = (int)(Math.random() * list.size());
        return list.get(randomIdx);
    }
}


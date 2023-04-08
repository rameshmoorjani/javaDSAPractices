class SolutionRomanList {

    public static void main(String[] args) {
        SolutionRomanList solutionRomanList = new SolutionRomanList();

        solutionRomanList.romanToInt("III");
    }
    public int romanToInt(String s) {

        int res = 0,idx = 0 ;
        while(idx<s.length()){
            RomanList cur  = RomanList.valueOf(s.substring(idx,idx+1));
            if(idx<s.length()-1){
                RomanList next = RomanList.valueOf(s.substring(idx+1,idx+2));
                if(next != null && cur.getValue() < next.getValue()){
                    res += next.getValue()-cur.getValue();
                    idx += 2;
                    continue;
                }
            }
            res += cur.getValue();
            idx += 1;
        }
        return res;


    }


}

enum RomanList{


    I(1),V(5),X(10),L(50),C(100),D(500),M(1000);

    private int statusValue;

    private RomanList (int statusValue) {
        this. statusValue = statusValue;
    }

    public Integer getValue(){
        return this.statusValue;
    }

}
class Core2Web{
    public static void main(String[] args){
        int n=6;
        int i=n;
        if(n%2==0){
            while(i>=1){
                System.out.println(i);
                i--;
            }
        }
        else{
            while(i>=1){
                System.out.println(i);
                i-=2;
            }
        }
    }
}
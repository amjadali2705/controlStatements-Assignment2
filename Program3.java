class Core2Web{
    public static void main(String[] args){
        int n=942111423;
        int count=0;
        while(n!=0){
            n=n/10;
            count++;    
        }
        System.out.println("Count of digits = "+count);
    }
}
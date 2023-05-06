class Core2Web{
    public static void main(String[] args){
        int fact=1;
        int n=6;
        int i=1;
        while(i<=n){
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
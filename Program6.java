class Core2Web{
    public static void main(String[] args){
        int i=1;
        int sum=0;
        int mult=1;
        while(i<=10){
            if(i%2==0){
                sum+=i;
            }
            else{
                mult*=i;
            }
            i++;
        }
        System.out.println("Sum of even numbers between 1 to 10 = "+sum);
        System.out.println("Multiplication of odd numbers between 1 to 10 = "+mult);
    }
}
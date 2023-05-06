class Core2Web{
    public static void main(String[] args){
        int day=7;
        while(day>=0){
            if(day==0){
                System.out.println(day+" days Assignment is Overdue");
                break;
            }
            System.out.println(day+" days remaining");
            day--;
        }
    }
}
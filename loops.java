import java.util.*;;
public class loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // for(int count=0; count<10;count=count+1){
        //     System.out.println("hello world");
        // }
        // print the numbers frome 0 to 10 using for loop
        // for (int i=0;i<11; i++) {
        //     System.out.println(i);
            
        // }
        // int i=0;
        // while(i<11){
        //     System.out.println(i);
        //     i++;
        // }
        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i<11);
        // int sum=0;
        // print the sum of first n natural numbers n=4
        // for(i=1; i<=4; i++){
        //      sum+=i;
        //     // i+=i;
        // }
        // System.out.println(sum);
        // print the table fo a number enter by user
        // System.out.println("Enter the value of n:");
        // int n=sc.nextInt();
        // for(int i=1; i<=11; i++){
        //     System.out.println(i*n);
        // }
        // print all even numbers till n
        // int n=sc.nextInt();
        // for(int i=1;i<=n; i++){
        //     if(i % 2==0){
        //         System.out.println("even number is :"+i);
        //     }else{
        //         System.out.println("odd number is :"+i);
        //     }
        //     }
        // System.out.println("Enter the value of i:");
        // int i=sc.nextInt();
        // do{
        //     System.out.println("Enter the value of n :");
        //     int n=sc.nextInt();
        //     if(n==1){
        //         System.out.println("Enter the value of Marks :");
        //         int marks=sc.nextInt();
        //         if(marks>=90){
        //           System.out.println("This is good");
        //         }else if(marks>=60){
        //             System.out.println("This is also good");

        //         }else if(marks>=0){
        //             System.out.println("This is good as well");
        //         }else{
        //             System.out.println("Fail");
        //         }

        //     }else{
                
        //        sc.close();
        //     }
        // }while(i!=0);
        // check entered number is prime or not ?
        System.out.println("Enter the value of n :");
        int n=sc.nextInt();
        int count=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;//1=>1,2=>1,3=>2
            }
        }
        if(count==2){
            System.out.println(n+" Prime number");
        }else{
            System.out.println(n+"Not  Prime number");
        }
        
    }
    
}
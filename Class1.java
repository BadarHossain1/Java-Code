class Class1{
    public static void main(String[] args) {
        // for(int i = 0; i<4; i++){
        //     for(int j = 0; j<i ; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i = 4; i>0; i--){
        //     for(int j = 0; j<i ; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // int n = 5;

        // for(int i = 1; i<=5;i++){
        //     for(int j = i; j<=n-1; j++){
        //         System.out.print(" ");
        //     }

        //     for(int k = 1; k<=i*2-1; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

       
        // for(char i = 'A'; i<='D'; i++){
        //     for(int j = 'A' ; j<=i; j++){
                
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }

        int num = 1;
        for(int i = 1; i<=4; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(num++);
            }

            System.out.println();
        }


    }
}
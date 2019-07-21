public class Main{
    public static void main(String[] args){

        String input;
        int inp;
        int computer;
        java.util.Scanner scan = new java.util.Scanner(System.in);

        System.out.println("this is janken program.");
        System.out.println("1: stone");
        System.out.println("2: scisors");
        System.out.println("3: paper");
        System.out.println("q: STOP PROGRAM");
        System.out.println("");

        while(true){

            System.out.println("janken!!");
            System.out.print("input your hand... >> ");

            // 入力の受け取り
            input = scan.nextLine();
            System.out.println(input);

            if(input.equals("q")){
                break;
            }

            // 入力が1, 2, 3以外である．
            if(input.equals("1")==false && input.equals("2")==false && input.equals("3")==false){
                continue;
            }

            // 入力をint型へ変換
            inp = Integer.parseInt(input);

            // コンピュータの手
            computer = new java.util.Random().nextInt(3) + 1;
            System.out.println(computer);
            
            if(inp == computer){
                System.out.println("aiko!");
                continue;
            }

            // 自分が勝つ
            if(inp + computer == 3 && Math.max(inp, computer) == computer){
                System.out.println("Your win!");
                continue;
            }
            if(inp + computer == 5 && Math.max(inp, computer) == computer){
                System.out.println("Your win!");
                continue;
            }
            if(inp + computer == 4 && Math.max(inp, computer) == inp){
                System.out.println("Your win!");
                continue;
            }

            // 相手が勝つ
            System.out.println("Your lost...");

        }
    }
}